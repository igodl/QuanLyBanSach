/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BUS.PhieuNhapBUS.arrayList_PhieuNhap;
import BUS.SachBUS;
import DTO.ChiTietPhieuNhapDTO;
import DTO.PhieuNhapDTO;
import DTO.SachDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;

/**
 *
 * @author Ha
 */
public class ChiTietPhieuNhapDAO {

    public ConnectionDatabase connection;

    public ChiTietPhieuNhapDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();

    }
        public ArrayList<ChiTietPhieuNhapDTO> dataChiTietPhieuNhapOfDatabase() throws SQLException {
        ArrayList<ChiTietPhieuNhapDTO> data = new ArrayList<ChiTietPhieuNhapDTO>();
        String query = "SELECT * FROM `chitietphieunhap`";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    ChiTietPhieuNhapDTO chiTietPhieuNhap=new ChiTietPhieuNhapDTO();
                    
                    chiTietPhieuNhap.setMaPhieuNhap(rs.getInt(1));
                    chiTietPhieuNhap.setMaSach(rs.getInt(2));
                    chiTietPhieuNhap.setSoLuong(rs.getInt(3));
                    chiTietPhieuNhap.setDonGiaNhap(rs.getInt(4));
                    
                    data.add(chiTietPhieuNhap);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Chi Tiet Phieu Nhap tu Database thất bại");
            System.out.println(e);
        }

        return data;

    }

    public void addChiTietPhieuNhapChoDatabse(TableModel modelGioHang) {
        try {
            SachBUS sachBus = new SachBUS();
            String queryMaHoaDon = new String();
            PhieuNhapDTO phieuNhap = new PhieuNhapDTO();
            int maSach=0;
            
            phieuNhap.setMaPhieuNhap(arrayList_PhieuNhap.get(arrayList_PhieuNhap.size() - 1).getMaPhieuNhap());

            for (int i = 0; i < modelGioHang.getRowCount(); i++) {
                
                
                String donGiaString = sachBus.removeThousandSeparators(String.valueOf(modelGioHang.getValueAt(i, 7)));
                
                if(sachBus.timMaSach((String)modelGioHang.getValueAt(i, 0),(String)modelGioHang.getValueAt(i, 1),(String)modelGioHang.getValueAt(i, 2),(String)modelGioHang.getValueAt(i, 3),(String)modelGioHang.getValueAt(i, 4),(String)modelGioHang.getValueAt(i,5)) != 0)
                    maSach=sachBus.timMaSach((String)modelGioHang.getValueAt(i, 0),(String)modelGioHang.getValueAt(i, 1),(String)modelGioHang.getValueAt(i, 2),(String)modelGioHang.getValueAt(i, 3),(String)modelGioHang.getValueAt(i, 4),(String)modelGioHang.getValueAt(i,5));
                
                int soLuong = Integer.parseInt((String)modelGioHang.getValueAt(i, 6));
                int donGia = Integer.parseInt(donGiaString);

                String query ="INSERT INTO `chitietphieunhap`(`MaPhieuNhap`, `MaSach`, `SoLuong`, `DonGiaNhap`) VALUES ('"+phieuNhap.getMaPhieuNhap()+"','"+maSach+"','"+soLuong+"','"+donGia+"')";

                connection.getStatement().executeUpdate(query);

            }           

        } catch (Exception e) {
            System.out.println("Thêm Chi Tiết Phieu Nhap vào Database thất bại");
            System.out.println(e);
        }
    }
        
}
