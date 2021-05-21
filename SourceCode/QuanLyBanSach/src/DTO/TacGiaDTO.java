/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ha
 */
public class TacGiaDTO {
    int maTacGia;
    String hoLotTacGia,tenTacGia;

    public String getHoLotTacGia() {
        return hoLotTacGia;
    }

    public void setHoLotTacGia(String hoLotTacGia) {
        this.hoLotTacGia = hoLotTacGia;
    }
    
    public TacGiaDTO()
    {
        
    }

    public TacGiaDTO(int maTacGia, String tenTacGia) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
    }

    public int getMaTacGia() {
        return maTacGia;
    }

    
    public void setMaTacGia(int maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }    
    
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    
    
}
