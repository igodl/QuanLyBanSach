/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.KhachHangBUS;
import static BUS.KhachHangBUS.arrayList_KhachHang;
import DTO.KhachHangDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ha
 */
public class KhachHangDAO {

    ConnectionDatabase connection;

    public KhachHangDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<KhachHangDTO> dataKhachHangOfDatabase() throws SQLException {
        ArrayList<KhachHangDTO> data = new ArrayList<KhachHangDTO>();
        String query = "SELECT * FROM `account` WHERE PhanQuyen='Khách hàng'";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    KhachHangDTO khachHang = new KhachHangDTO();

                    khachHang.setId(rs.getInt(1));
                    khachHang.setUser(rs.getString(2));
                    khachHang.setPass(rs.getString(3));
                    khachHang.setHoLot(rs.getString(4));
                    khachHang.setTen(rs.getString(5));
                    khachHang.setNgaySinh(rs.getString(6));
                    khachHang.setGioiTinh(rs.getString(7));
                    khachHang.setSoDienThoai(rs.getString(8));
                    khachHang.setTinhTrangHoatDong(rs.getString(10));

                    data.add(khachHang);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Khach Hang tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public void updateThongTinKhachHang() {

        try {
            for (int i = 0; i < arrayList_KhachHang.size(); i++) {
                KhachHangDTO khachHang = arrayList_KhachHang.get(i);
                if (idHienHanh == khachHang.getId()) {
                    String query ="UPDATE `account` SET `Pass`='"+khachHang.getPass()+"',`HoLot`='"+khachHang.getHoLot()+"',`Tên`='"+khachHang.getTen()+"',`NgaySinh`='"+khachHang.getNgaySinh()+"',`GioiTinh`='"+khachHang.getGioiTinh()+"',`SoDienThoai`='"+khachHang.getSoDienThoai()+"' WHERE Id ="+idHienHanh;
                    connection.getStatement().executeUpdate(query);
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Update thong tin Khach Hang vao Database that bai");
            System.out.println(e);
        }
    }
}
