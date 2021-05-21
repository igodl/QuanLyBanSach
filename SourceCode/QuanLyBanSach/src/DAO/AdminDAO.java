/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BUS.KhachHangBUS.arrayList_KhachHang;
import static BUS.NhanVienBUS.arrayList_NhanVien;
import static BUS.SachBUS.arrayList_Sach;
import DTO.AdminDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.SachDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ha
 */
public class AdminDAO {

    public ConnectionDatabase connection;

    public AdminDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();

    }

    public ArrayList<AdminDTO> dataAdminOfDatabase() throws SQLException {
        ArrayList<AdminDTO> data = new ArrayList<AdminDTO>();
        String query = "select * from account where PhanQuyen = 'Admin' and TinhTrangHoatDong='1'";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    AdminDTO admin = new AdminDTO();

                    admin.setId(rs.getInt(1));
                    admin.setUser(rs.getString(2));
                    admin.setPass(rs.getString(3));
                    admin.setHoLot(rs.getString(4));
                    admin.setTen(rs.getString(5));
                    admin.setNgaySinh(rs.getString(6));
                    admin.setGioiTinh(rs.getString(7));
                    admin.setSoDienThoai(rs.getString(8));
         
                    data.add(admin);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Admin tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public void themNhanVienVaoDatabase() {
        try {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(arrayList_NhanVien.size() - 1);

            String query = "INSERT INTO `account`( `User`, `Pass`, `HoLot`, `Tên`, `NgaySinh`, `GioiTinh`, `SoDienThoai`, `PhanQuyen`,`TinhTrangHoatDong`) VALUES ('" + nhanVien.getUser() + "','" + nhanVien.getPass() + "','" + nhanVien.getHoLot() + "','" + nhanVien.getTen() + "','" + nhanVien.getNgaySinh() + "','" + nhanVien.getGioiTinh() + "','" + nhanVien.getSoDienThoai() + "','Nhân viên','"+nhanVien.getTinhTrangHoatDong()+"')";

            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Thêm Nhân Viên vào Database thất bại");
            System.out.println(e);
        }
    }
    
    public void themKhachHangVaoDatabase() {
        try {
            KhachHangDTO khachHang = arrayList_KhachHang.get(arrayList_KhachHang.size() - 1);

            String query = "INSERT INTO `account`( `User`, `Pass`, `HoLot`, `Tên`, `NgaySinh`, `GioiTinh`, `SoDienThoai`, `PhanQuyen`,`TinhTrangHoatDong`) VALUES ('" + khachHang.getUser() + "','" + khachHang.getPass() + "','" + khachHang.getHoLot() + "','" + khachHang.getTen() + "','" + khachHang.getNgaySinh() + "','" + khachHang.getGioiTinh() + "','" + khachHang.getSoDienThoai() + "','Khách hàng','"+khachHang.getTinhTrangHoatDong()+"')";

            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Thêm Khách Hàng vào Database thất bại");
            System.out.println(e);
        }
    }

    public void suaNhanVienTrenDatabase(int row) {
        try {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(row);
            String query = "UPDATE `account` SET `Pass`='" + nhanVien.getPass() + "',`HoLot`='" + nhanVien.getHoLot() + "',`Tên`='" + nhanVien.getTen() + "',`NgaySinh`='" + nhanVien.getNgaySinh() + "',`GioiTinh`='" + nhanVien.getGioiTinh() + "',`SoDienThoai`='" + nhanVien.getSoDienThoai() +"',`TinhTrangHoatDong`='" + nhanVien.getTinhTrangHoatDong() + "' WHERE Id=" + nhanVien.getId();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Sửa thông tin Nhân Viên vào Database không thành công");
            System.out.println(e);
        }
    }
    
    public void suaKhachHangTrenDatabase(int row) {
        try {
            KhachHangDTO khachHang = arrayList_KhachHang.get(row);
            String query = "UPDATE `account` SET `Pass`='" + khachHang.getPass() + "',`HoLot`='" + khachHang.getHoLot() + "',`Tên`='" + khachHang.getTen() + "',`NgaySinh`='" + khachHang.getNgaySinh() + "',`GioiTinh`='" + khachHang.getGioiTinh() + "',`SoDienThoai`='" + khachHang.getSoDienThoai() +"',`TinhTrangHoatDong`='" + khachHang.getTinhTrangHoatDong() + "' WHERE Id=" + khachHang.getId();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Sửa thông tin Nhân Viên vào Database không thành công");
            System.out.println(e);
        }
    }

    public void xoaNhanVienTrenDatabase(int row) {
        try {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(row);

            String query = "UPDATE `account` SET `TinhTrangHoatDong`='0' WHERE Id=" + nhanVien.getId();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Xóa Nhân Viên trên Database thất bại");
            System.out.println(e);
        }
    }
    
    public void xoaSachTrenDatabase(int row) {
        try {
            SachDTO sach = arrayList_Sach.get(row);

            String query ="UPDATE `sanphamsach` SET `TinhTrang`='Ngưng bán' WHERE MaSach="+sach.getMaSach();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Xóa Sách trên Database thất bại");
            System.out.println(e);
        }
    }
    
    public void xoaKhachHangTrenDatabase(int row) {
        try {
            KhachHangDTO khachHang = arrayList_KhachHang.get(row);

            String query = "UPDATE `account` SET `TinhTrangHoatDong`='0' WHERE Id=" + khachHang.getId();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Xóa Khách hàng trên Database thất bại");
            System.out.println(e);
        }
    }
    
    
    public void suaSachTrenDatabase(SachDTO sach)
    {
        try {        
            String query="UPDATE `sanphamsach` SET `TenSach`='"+sach.getTenSach()+"',`MaLoai`="+sach.getMaLoai()+",`MaTacGia`="+sach.getMaTacGia()+",`SoLuong`="+sach.getSoLuong()+",`DonGia`="+sach.getDonGia()+",`MaNXB`="+sach.getmaNXB()+",`NgayXuatBan`='"+sach.getNgayXuatBan()+"',`TinhTrang`='"+sach.getTinhTrang()+"' WHERE MaSach="+sach.getMaSach();
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Sửa sách trên Database thất bại");
        }
    }
    
    
}
