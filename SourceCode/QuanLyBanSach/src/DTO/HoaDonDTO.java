/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ha
 */
public class HoaDonDTO {
    int maHoaDon,maKhachHang,maNhanVien,tongTien;
    String ngayMua,tinhTrang;
    
    public HoaDonDTO()
    {
        
    }

    public HoaDonDTO(int maHoaDon, int maKhachHang, int maNhanVien, int tongTien, String ngayMua,String tinhTrang) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.tongTien = tongTien;
        this.ngayMua = ngayMua;
        this.tinhTrang=tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String trinhTrang) {
        this.tinhTrang = trinhTrang;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
    
    
}
