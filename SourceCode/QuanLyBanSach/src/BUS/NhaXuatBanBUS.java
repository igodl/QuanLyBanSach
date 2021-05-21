/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaXuatBanDAO;
import DTO.NhaXuatBanDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class NhaXuatBanBUS {

    public static ArrayList<NhaXuatBanDTO> arrayList_NhaXuatBan = new ArrayList<NhaXuatBanDTO>();

    public NhaXuatBanBUS() {

    }

    public void docDuLieuNhaXuatBan() throws SQLException {
        NhaXuatBanDAO data = new NhaXuatBanDAO();
     
            arrayList_NhaXuatBan = data.dataNhaXuatBanOfDatabase();
        
    }

    public int timMaNhaXuatBan(String txNhaXuatBan1) {
        int maNhaXuatBan = 0;

        for (int i = 0; i < arrayList_NhaXuatBan.size(); i++) {
            NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(i);

            if (nhaXuatBan.getTenNhaXuatBan().equals(txNhaXuatBan1)) {
                return nhaXuatBan.getmaNXB();
            }
        }

        return maNhaXuatBan;
    }
    
    public DefaultTableModel hienThiNhaXuatBan()
    {
        DefaultTableModel model=new DefaultTableModel(new String[]{"Mã nhà xuất bản","Tên nhà xuất bản"},0);
    
        for (int i = 0; i < arrayList_NhaXuatBan.size(); i++) {
            NhaXuatBanDTO nhaXuatBanDTO=arrayList_NhaXuatBan.get(i);
            
            Vector record=new Vector();
            
            record.add(nhaXuatBanDTO.getmaNXB());
            record.add(nhaXuatBanDTO.getTenNhaXuatBan());
            
            model.addRow(record);
        }
    
        return model;
    }

}
