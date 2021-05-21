/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BUS.NhanVienBUS.arrayList_NhanVien;
import DTO.NhanVienDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Ha
 */
public class NhanVienDAO {

    public ConnectionDatabase connection;

    public NhanVienDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<NhanVienDTO> dataNhanVienOfDatabase() throws SQLException {
        ArrayList<NhanVienDTO> data = new ArrayList<NhanVienDTO>();
        String query = new String();
        query = "select * from account where PhanQuyen = 'Nhân viên'";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    NhanVienDTO nhanVien = new NhanVienDTO();

                    nhanVien.setId(rs.getInt(1));
                    nhanVien.setUser(rs.getString(2));
                    nhanVien.setPass(rs.getString(3));
                    nhanVien.setHoLot(rs.getString(4));
                    nhanVien.setTen(rs.getString(5));
                    nhanVien.setNgaySinh(rs.getString(6));
                    nhanVien.setGioiTinh(rs.getString(7));
                    nhanVien.setSoDienThoai(rs.getString(8));
                    nhanVien.setTinhTrangHoatDong(rs.getString(10));

                    data.add(nhanVien);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Nhan Vien tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public void updateThongTinNhanVien() {

        try {
            for (int i = 0; i < arrayList_NhanVien.size(); i++) {
                NhanVienDTO nhanVien = arrayList_NhanVien.get(i);
                if (idHienHanh == nhanVien.getId()) {
                    String query = "UPDATE `account` SET `Pass`='" + nhanVien.getPass() + "',`HoLot`='" + nhanVien.getHoLot() + "',`Tên`='" + nhanVien.getTen() + "',`NgaySinh`='" + nhanVien.getNgaySinh() + "',`GioiTinh`='" + nhanVien.getGioiTinh() + "',`SoDienThoai`='" + nhanVien.getSoDienThoai() + "' WHERE Id =" + idHienHanh;
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
