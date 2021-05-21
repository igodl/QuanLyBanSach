/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.TacGiaBUS;
import DTO.SachDTO;
import DTO.TacGiaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ha
 */
public class TacGiaDAO {

    ConnectionDatabase connection;

    public TacGiaDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<TacGiaDTO> dataTacGiaOfDatabase() throws SQLException {
        ArrayList<TacGiaDTO> data = new ArrayList<TacGiaDTO>();
        String query = "select * from tacgia";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    TacGiaDTO tacGia = new TacGiaDTO();

                    tacGia.setMaTacGia(rs.getInt(1));
                    tacGia.setHoLotTacGia(rs.getString(2));
                    tacGia.setTenTacGia(rs.getString(3));

                    data.add(tacGia);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Tac Gia tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }
    
    public void themTacGia(SachDTO sach,String hoTacGia,String tenTacGia) throws SQLException {
        TacGiaBUS tacGiaBus=new TacGiaBUS();
        
        if(tacGiaBus.timMaTacGia(hoTacGia,tenTacGia) == 0)
        {
            String query="INSERT INTO `tacgia`(`HoLotTacGia`, `TenTacGia`) VALUES ('"+hoTacGia+"','"+tenTacGia+"')";
            connection.getStatement().executeUpdate(query);
            
            ResultSet rs=connection.getStatement().executeQuery("SELECT MaTacGia FROM `tacgia` ORDER BY MaTacGia");
            
            while(rs.next())
                sach.setMaTacGia(rs.getInt(1));
        }
        else
            sach.setMaTacGia(tacGiaBus.timMaTacGia(hoTacGia,tenTacGia));
    }

}
