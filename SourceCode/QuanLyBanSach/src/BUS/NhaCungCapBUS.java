/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Ha
 */
public class NhaCungCapBUS {

    public static ArrayList<NhaCungCapDTO> arrayList_NhaCungCap = new ArrayList<NhaCungCapDTO>();

    public NhaCungCapBUS() {

    }

    public void docDuLieuNhaCungCap() throws SQLException{
        NhaCungCapDAO data = new NhaCungCapDAO();

        arrayList_NhaCungCap = data.dataNhaCungCapOfDatabase();

    }
    
     public int timMaNCC(JComboBox cbNhaCungCap)
    {
        int maNCC=0;
        
        for(int i=0;i<arrayList_NhaCungCap.size();i++)
        {
            NhaCungCapDTO nhaCungCapDto=arrayList_NhaCungCap.get(i);
            
            if(nhaCungCapDto.getTenNCC().equals(cbNhaCungCap.getSelectedItem()))
            {
                return  nhaCungCapDto.getMaNCC();
            }
        }
        
        return maNCC;
    }

}
