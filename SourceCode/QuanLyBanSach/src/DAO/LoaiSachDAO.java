/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.LoaiSachBUS;
import BUS.SachBUS;
import DTO.LoaiSachDTO;
import DTO.SachDTO;
import static GUI.MainFrameGUI.cbLoaiSach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ha
 */
public class LoaiSachDAO {

    ConnectionDatabase connection;

    public LoaiSachDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<LoaiSachDTO> dataLoaiSachOfDatabase() throws SQLException {
        ArrayList<LoaiSachDTO> data = new ArrayList<LoaiSachDTO>();
        String query = "select * from loaisach";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    LoaiSachDTO loaiSach = new LoaiSachDTO();

                    loaiSach.setMaLoai(rs.getInt(1));
                    loaiSach.setTenLoai(rs.getString(2));

                    data.add(loaiSach);
                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu LoaiSach tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public int maLoaiSachMoiDatabase() {
        int maLoaiMoi = 0;
        try {
            String query = "SELECT MaLoai FROM loaisach ORDER BY MaLoai";
            ResultSet rs = connection.getStatement().executeQuery(query);

            while (rs.next()) {
                maLoaiMoi = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Lay ma loai sach moi that bai");
            System.out.println(e);
        }

        return maLoaiMoi + 1;
    }

    public void themLoaiSach(SachDTO sach, String tenLoaiSach) throws SQLException {
        LoaiSachBUS loaiSachBus = new LoaiSachBUS();

        if (loaiSachBus.timMaLoaiSach(tenLoaiSach) == 0) {
            String query = "INSERT INTO `loaisach`(`TenLoai`) VALUES ('" + tenLoaiSach + "')";
            connection.getStatement().executeUpdate(query);

            ResultSet rs = connection.getStatement().executeQuery("SELECT MaLoai FROM `loaisach` ORDER BY MaLoai");

            while (rs.next()) {
                sach.setMaLoai(rs.getInt(1)); //lay duoc MaLoai cuoi cung cua bang LoaiSach,co the dung rs.last()
            }

        } else {
            sach.setMaLoai(loaiSachBus.timMaLoaiSach(tenLoaiSach));
        }
    }

}
