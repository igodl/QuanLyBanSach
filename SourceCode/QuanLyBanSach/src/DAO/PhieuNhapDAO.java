/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.PhieuNhapBUS;
import static BUS.PhieuNhapBUS.arrayList_PhieuNhap;
import DTO.PhieuNhapDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ha
 */
public class PhieuNhapDAO {

    public ConnectionDatabase connection;

    public PhieuNhapDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<PhieuNhapDTO> dataPhieuNhapOfDatabase() throws SQLException {
        ArrayList<PhieuNhapDTO> data = new ArrayList<PhieuNhapDTO>();
        String query = "SELECT * FROM `phieunhap`";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    PhieuNhapDTO phieuNhap = new PhieuNhapDTO();

                    phieuNhap.setMaPhieuNhap(rs.getInt(1));
                    phieuNhap.setMaNhanVien(rs.getInt(2));
                    phieuNhap.setNgayNhap(rs.getString(3));
                    phieuNhap.setMaNCC(rs.getInt(4));
                    phieuNhap.setTongTien(rs.getInt(5));

                    data.add(phieuNhap);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Phieu Nhap tu Database thất bại");
            System.out.println(e);
        }

        return data;

    }

    public int maPhieuNhapMoiNhat() throws SQLException {
        int maPhieuNhap = 0;
        String query = "SELECT MaPhieuNhap FROM `phieunhap` ORDER BY MaPhieuNhap";
        ResultSet rs = connection.getStatement().executeQuery(query); 

        while (rs.next()) {
            maPhieuNhap = rs.getInt(1); 
        }

        return maPhieuNhap;
    }

        public void addPhieuNhapChoDataBase() throws SQLException {
        try {          
            PhieuNhapDTO phieuNhap = arrayList_PhieuNhap.get(arrayList_PhieuNhap.size() - 1);
            String query = "INSERT INTO `phieunhap`( `MaNhanVien`, `NgayNhap`, `MaNCC`, `TongTien`) VALUES ('"+phieuNhap.getMaNhanVien()+"','"+phieuNhap.getNgayNhap()+"','"+phieuNhap.getMaNCC()+"','"+phieuNhap.getTongTien()+"')";

            connection.getStatement().executeUpdate(query);

        } catch (Exception e) {
            System.out.println("Thêm phieu nhap vào Database thất bại");
            System.out.println(e);
        }

    }

}
