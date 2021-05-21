/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BUS.HoaDonBUS.arrayList_HoaDon;
import BUS.SachBUS;
import DTO.HoaDonDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Ha
 */
public class HoaDonDAO {

    public ConnectionDatabase connection;

    public HoaDonDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ConnectionDatabase getConnection() {
        return connection;
    }
    
    public ArrayList<HoaDonDTO> dataHoaDonALLOfDatabase() throws SQLException {
        ArrayList<HoaDonDTO> data = new ArrayList<HoaDonDTO>();
        String query = "SELECT * FROM `hoadon`";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    HoaDonDTO hoaDon = new HoaDonDTO();

                    hoaDon.setMaHoaDon(rs.getInt(1));
                    hoaDon.setMaKhachHang(rs.getInt(2));
                    hoaDon.setMaNhanVien(rs.getInt(3));
                    hoaDon.setNgayMua(rs.getString(4));
                    hoaDon.setTongTien(rs.getInt(5));
                    hoaDon.setTinhTrang(rs.getString(6));

                    data.add(hoaDon);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Hoa Don ALL tu Database thất bại");
            System.out.println(e);
        }

        return data;

    }

    public ArrayList<HoaDonDTO> dataHoaDonKhachHangOfDatabase() throws SQLException {
        ArrayList<HoaDonDTO> data = new ArrayList<HoaDonDTO>();
        String query = "select * from hoadon where MaKhachHang =" + idHienHanh;
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    HoaDonDTO hoaDon = new HoaDonDTO();

                    hoaDon.setMaHoaDon(rs.getInt(1));
                    hoaDon.setMaKhachHang(rs.getInt(2));
                    hoaDon.setMaNhanVien(rs.getInt(3));
                    hoaDon.setNgayMua(rs.getString(4));
                    hoaDon.setTongTien(rs.getInt(5));
                    hoaDon.setTinhTrang(rs.getString(6));

                    data.add(hoaDon);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Hoa Don khách hàng tu Database thất bại");
            System.out.println(e);
        }

        return data;

    }

    public void addHoaDonChoDataBase() throws SQLException {
        try {
            SachBUS sachBus = new SachBUS();
            HoaDonDTO hoaDon = arrayList_HoaDon.get(arrayList_HoaDon.size() - 1);
            String query = "INSERT INTO `hoadon`(`MaKhachHang`, `MaNhanVien`, `NgayMua`, `TongTien`, `TinhTrang`) VALUES ('" + hoaDon.getMaKhachHang() + "','" + hoaDon.getMaNhanVien() + "','" + hoaDon.getNgayMua() + "','" + hoaDon.getTongTien() + "','" + hoaDon.getTinhTrang() + "')";

            connection.getStatement().executeUpdate(query);

        } catch (Exception e) {
            System.out.println("Thêm hóa đơn vào Database thất bại");
            System.out.println(e);
        }

    }

    public int maHoaDonMoiNhat() throws SQLException {
        int maHoaDon = 0;
        String query = "SELECT MaHoaDon FROM hoadon ORDER BY MaHoaDon ASC";
        ResultSet rs =connection.getStatement().executeQuery(query); //dat dong nay truoc "hoaDonDao.addHoaDonChoDataBase(txThanhTien)" loi sml

        while (rs.next()) { 
            maHoaDon=rs.getInt(1); //lay ma hoa don moi nhat tu databsae
        }

        return maHoaDon;
    }
    
    public void capNhatXuLyHoaDon(int maHoaDon)
    {
        try {
            String query="UPDATE `hoadon` SET `MaNhanVien`='"+idHienHanh+"',`TinhTrang`='Đã vận chuyển' WHERE MaHoaDon = "+maHoaDon+"";
            connection.getStatement().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Xu ly hoa don that bai");
            System.out.println(e);
        }
    }

}
