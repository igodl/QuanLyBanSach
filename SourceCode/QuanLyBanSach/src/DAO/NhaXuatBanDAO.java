/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.NhaXuatBanBUS;
import DTO.NhaXuatBanDTO;
import DTO.SachDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ha
 */
public class NhaXuatBanDAO {
    ConnectionDatabase connection;
    
    public NhaXuatBanDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }
    
    public ArrayList<NhaXuatBanDTO> dataNhaXuatBanOfDatabase() throws SQLException {
        ArrayList<NhaXuatBanDTO> data = new ArrayList<NhaXuatBanDTO>();
        String query = "select * from nhaxuatban";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    NhaXuatBanDTO nhaXuatBan = new NhaXuatBanDTO();

                    nhaXuatBan.setmaNXB(rs.getInt(1));
                    nhaXuatBan.setTenNhaXuatBan(rs.getString(2));
                    nhaXuatBan.setDiaChi(rs.getString(3));
                    nhaXuatBan.setSoDienThoai(rs.getString(4));
                    
                    data.add(nhaXuatBan);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Sach tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }
    
     public void themNhaXuatBan(SachDTO sach,String tenNhaXuatBan) throws SQLException {
        NhaXuatBanBUS nhaXuatBanBus=new NhaXuatBanBUS();
        
        if(nhaXuatBanBus.timMaNhaXuatBan(tenNhaXuatBan) == 0)
        {
            String query="INSERT INTO `nhaxuatban`(`TenNXB`, `DiaChi`, `SoDienThoai`) VALUES ('"+tenNhaXuatBan+"','Chưa cập nhật','Chưa cập nhật')";
            connection.getStatement().executeUpdate(query);
            
            ResultSet rs=connection.getStatement().executeQuery("SELECT MaNXB FROM `nhaxuatban` ORDER BY MaNXB");
            
            while(rs.next())
                sach.setMaNXB(rs.getInt(1));
        }
        else
            sach.setMaNXB(nhaXuatBanBus.timMaNhaXuatBan(tenNhaXuatBan));
    }
       
    
}
