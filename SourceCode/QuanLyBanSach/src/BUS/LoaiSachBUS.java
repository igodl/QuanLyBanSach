/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiSachDAO;
import DTO.LoaiSachDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class LoaiSachBUS {

    public static ArrayList<LoaiSachDTO> arrayList_LoaiSach = new ArrayList<LoaiSachDTO>();

    public LoaiSachBUS() {

    }

    public void docDuLieuLoaiSach() throws SQLException {
        LoaiSachDAO data = new LoaiSachDAO();
       
            arrayList_LoaiSach = data.dataLoaiSachOfDatabase();
        
    }
    
    public int timMaLoaiSach(String txLoaiSach) {
        int maLoai = 0;
        txLoaiSach=txLoaiSach.toLowerCase();
        
        for (int i = 0; i < arrayList_LoaiSach.size(); i++) {
            LoaiSachDTO loaiSach = arrayList_LoaiSach.get(i);

            String tenLoaiSach=loaiSach.getTenLoai().toLowerCase();
            if (tenLoaiSach.equals(txLoaiSach)) {
                return loaiSach.getMaLoai();
            }
        }

        return maLoai;
    }
    
    public int timMaLoaiSachKhachHang(String txLoaiSach)
    {
        int maLoai = 0;
        txLoaiSach=txLoaiSach.toLowerCase();
        
        for (int i = 0; i < arrayList_LoaiSach.size(); i++) {
            LoaiSachDTO loaiSach = arrayList_LoaiSach.get(i);

            String tenLoaiSach=loaiSach.getTenLoai().toLowerCase();
            if (tenLoaiSach.indexOf(txLoaiSach) != -1) {
                return loaiSach.getMaLoai();
            }
        }

        return maLoai;
    }

    public DefaultTableModel hienThiLoaiSach()
    {
        DefaultTableModel model=new DefaultTableModel(new String[]{"Mã loại","Tên loại"},0);
        
        for(int i=0;i<arrayList_LoaiSach.size();i++)
        {
            LoaiSachDTO loaiSach=arrayList_LoaiSach.get(i);
            
            Vector record=new Vector();
            
            record.add(loaiSach.getMaLoai());
            record.add(loaiSach.getTenLoai());
            
            model.addRow(record);
        }
        
        return model;
    }
   
}
