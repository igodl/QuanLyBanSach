/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ha
 */
public class NhaCungCapDAO {

    public ConnectionDatabase connection;

    public NhaCungCapDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<NhaCungCapDTO> dataNhaCungCapOfDatabase() throws SQLException {
        ArrayList<NhaCungCapDTO> data = new ArrayList<NhaCungCapDTO>();
        String query = "SELECT * FROM `nhacungcap`";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    NhaCungCapDTO nhaCungCap = new NhaCungCapDTO();

                    nhaCungCap.setMaNCC(rs.getInt(1));
                    nhaCungCap.setTenNCC(rs.getString(2));
                    
                    data.add(nhaCungCap);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Nha Cung Cap tu Database thất bại");
            System.out.println(e);
        }

        return data;

    }

}
