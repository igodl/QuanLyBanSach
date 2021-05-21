/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.TacGiaDAO;
import DTO.TacGiaDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class TacGiaBUS {

    public static ArrayList<TacGiaDTO> arrayList_TacGia = new ArrayList<TacGiaDTO>();

    public TacGiaBUS() {

    }

    public void docDuLieuTacGia() throws SQLException {
        TacGiaDAO data = new TacGiaDAO();

        arrayList_TacGia = data.dataTacGiaOfDatabase();

    }

    public int timMaTacGia(String txHoLotTacGia,String tenTacGia) {
        int maTacGia = 0;
        String tenDayDuTemp=txHoLotTacGia+" "+tenTacGia;
        
        
        for (int i = 0; i < arrayList_TacGia.size(); i++) {

            TacGiaDTO tacGia = arrayList_TacGia.get(i);
            String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();

            if (tenDayDuTemp.equals(tenDayDu)) {
                return tacGia.getMaTacGia();
            }
        }

        return maTacGia;
    }
    
    public int timMaTacGiaKhachHang(String tenTacGia) {
        int maTacGia = 0;
        tenTacGia=tenTacGia.toLowerCase();
        
        for (int i = 0; i < arrayList_TacGia.size(); i++) {

            TacGiaDTO tacGia = arrayList_TacGia.get(i);
            String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();
            tenDayDu=tenDayDu.toLowerCase();
            
            if (tenDayDu.indexOf(tenTacGia) != -1) {
                return tacGia.getMaTacGia();
            }
        }

        return maTacGia;
    }
    
    public DefaultTableModel hienThiTacGia()
    {
        DefaultTableModel model=new DefaultTableModel(new String []{"Mã tác giả","Họ lót tác giả","Tên tác giả"},0);
    
        for(int i=0;i<arrayList_TacGia.size();i++)
        {
            TacGiaDTO tacGia=arrayList_TacGia.get(i);
            
            Vector record=new Vector();
            
            record.add(tacGia.getMaTacGia());
            record.add(tacGia.getHoLotTacGia());
            record.add(tacGia.getTenTacGia());
            
            model.addRow(record);
        }
        
        return model;
    }
}
