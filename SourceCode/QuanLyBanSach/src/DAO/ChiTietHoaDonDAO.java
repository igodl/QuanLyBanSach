/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.HoaDonBUS;
import static BUS.HoaDonBUS.arrayList_HoaDon;
import static BUS.HoaDonBUS.arrayList_HoaDonALL;
import BUS.SachBUS;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class ChiTietHoaDonDAO {

    ConnectionDatabase connection;

    public ChiTietHoaDonDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }
    
    public ArrayList<ChiTietHoaDonDTO> dataChiTietHoaDonALLOfDatabase() throws SQLException {
        ArrayList<ChiTietHoaDonDTO> data = new ArrayList<ChiTietHoaDonDTO>();

        try {
            if (connection.getStatement() != null) {
                for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
                    int maHoaDon = arrayList_HoaDonALL.get(i).getMaHoaDon();
                    String query = "SELECT chitiethoadon.MaHoaDon,chitiethoadon.MaSach,sanphamsach.TenSach,chitiethoadon.SoLuong,chitiethoadon.DonGia,chitiethoadon.ThanhTien,chitiethoadon.GhiChu FROM sanphamsach,chitiethoadon WHERE chitiethoadon.MaSach = sanphamsach.MaSach and chitiethoadon.MaHoaDon = "+maHoaDon+"";
                    ResultSet rs = connection.getStatement().executeQuery(query);

                    while (rs.next()) {
                        ChiTietHoaDonDTO chiTietHoaDon = new ChiTietHoaDonDTO();

                        chiTietHoaDon.setMaHoaDon(rs.getInt(1));
                        chiTietHoaDon.setMaSach(rs.getInt(2));
                        chiTietHoaDon.setTenSach(rs.getString(3));
                        chiTietHoaDon.setSoLuong(rs.getInt(4));
                        chiTietHoaDon.setDonGia(rs.getInt(5));
                        chiTietHoaDon.setThanhTien(rs.getInt(6));
                        chiTietHoaDon.setGhiChu(rs.getString(7));

                        data.add(chiTietHoaDon);

                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Chi Tiet Hoa Don ALL tu Database thất bại");
            System.out.println(e);
        }

        return data;
    }

    public ArrayList<ChiTietHoaDonDTO> dataChiTietHoaDonOfDatabase() throws SQLException {
        ArrayList<ChiTietHoaDonDTO> data = new ArrayList<ChiTietHoaDonDTO>();

        try {
            if (connection.getStatement() != null) {
                for (int i = 0; i < arrayList_HoaDon.size(); i++) {
                    int maHoaDon = arrayList_HoaDon.get(i).getMaHoaDon();
                    String query = "SELECT chitiethoadon.MaHoaDon,chitiethoadon.MaSach,sanphamsach.TenSach,chitiethoadon.SoLuong,chitiethoadon.DonGia,chitiethoadon.ThanhTien,chitiethoadon.GhiChu FROM sanphamsach,chitiethoadon WHERE chitiethoadon.MaSach = sanphamsach.MaSach and chitiethoadon.MaHoaDon = "+maHoaDon+"";
                    ResultSet rs = connection.getStatement().executeQuery(query);

                    while (rs.next()) {
                        ChiTietHoaDonDTO chiTietHoaDon = new ChiTietHoaDonDTO();

                        chiTietHoaDon.setMaHoaDon(rs.getInt(1));
                        chiTietHoaDon.setMaSach(rs.getInt(2));
                        chiTietHoaDon.setTenSach(rs.getString(3));
                        chiTietHoaDon.setSoLuong(rs.getInt(4));
                        chiTietHoaDon.setDonGia(rs.getInt(5));
                        chiTietHoaDon.setThanhTien(rs.getInt(6));
                        chiTietHoaDon.setGhiChu(rs.getString(7));

                        data.add(chiTietHoaDon);

                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Chi Tiet Hoa Don tu Database thất bại");
            System.out.println(e);
        }

        return data;
    }

    public void addChiTietHoaDonChoDatabse(DefaultTableModel modelGioHang) {
        try {
            SachBUS sachBus = new SachBUS();
            String queryMaHoaDon = new String();
            HoaDonDTO hoaDon = new HoaDonDTO();

            hoaDon.setMaHoaDon(arrayList_HoaDon.get(arrayList_HoaDon.size() - 1).getMaHoaDon());

            for (int i = 0; i < modelGioHang.getRowCount(); i++) {
                String maSach = String.valueOf(modelGioHang.getValueAt(i, 0));

                String soLuongString = sachBus.removeThousandSeparators(String.valueOf(modelGioHang.getValueAt(i, 6)));
                String donGiaString = sachBus.removeThousandSeparators(String.valueOf(modelGioHang.getValueAt(i, 7)));

                int soLuong = Integer.parseInt(soLuongString);
                int donGia = Integer.parseInt(donGiaString);
                int thanhTien = soLuong * donGia;
                int maHoaDon = hoaDon.getMaHoaDon();

                String query = new String();
                query += "INSERT INTO chitiethoadon VALUES ('" + maHoaDon + "',"
                        + "'" + maSach + "',"
                        + "'" + soLuong + "',"
                        + "'" + donGia + "',"
                        + "'" + thanhTien + "',"
                        + "'')";

                connection.getStatement().executeUpdate(query);

            }           

        } catch (Exception e) {
            System.out.println("Thêm Chi Tiết Hóa Đơn vào Database thất bại");
            System.out.println(e);
        }
    }

}
