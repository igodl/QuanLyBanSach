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
public class NhaXuatBanDTO {
    int maNXB;
    String tenNXB;
    String diaChi;
    String soDienThoai;

    public NhaXuatBanDTO()
    {
        
    }
    
    public NhaXuatBanDTO(int mNXB, String tenNhaXuatBan, String diaChi, String soDienThoai) {
        this.maNXB = mNXB;
        this.tenNXB = tenNhaXuatBan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getmaNXB() {
        return maNXB;
    }

    public void setmaNXB(int mNXB) {
        this.maNXB = mNXB;
    }

    public String getTenNhaXuatBan() {
        return tenNXB;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNXB = tenNhaXuatBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    
    
}
