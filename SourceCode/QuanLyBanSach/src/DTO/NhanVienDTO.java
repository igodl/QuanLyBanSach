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
public class NhanVienDTO{
    int id;
    String user,pass,hoLot,ten,ngaySinh,gioiTinh,soDienThoai,tinhTrangHoatDong;

    public String getTinhTrangHoatDong() {
        return tinhTrangHoatDong;
    }

    public void setTinhTrangHoatDong(String tinhTrangHoatDong) {
        this.tinhTrangHoatDong = tinhTrangHoatDong;
    }

    public String getHoLot() {
        return hoLot;
    }


    public void setHoLot(String hoLot) {
        this.hoLot = hoLot;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public NhanVienDTO()
    {
        
    }

    public NhanVienDTO(int id, String user, String pass, String ten) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    
    
    
}
