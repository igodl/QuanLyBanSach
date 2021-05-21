/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.ChiTietHoaDonBUS.arrayList_ChiTietHoaDon;
import DAO.HoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import static GUI.LoginGUI.idHienHanh;
import GUI.MainFrameGUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class HoaDonBUS {
    
    public static ArrayList<HoaDonDTO> arrayList_HoaDon = new ArrayList<HoaDonDTO>();
    public static ArrayList<HoaDonDTO> arrayList_HoaDonALL = new ArrayList<HoaDonDTO>();
    
    public HoaDonBUS() {
        
    }
    
    public void docDuLieuHoaDonALL() throws SQLException {
        HoaDonDAO data = new HoaDonDAO();
        
        arrayList_HoaDonALL = data.dataHoaDonALLOfDatabase();
        
    }
    
    public void docDuLieuHoaDonKhachHang() throws SQLException {
        HoaDonDAO data = new HoaDonDAO();
        ArrayList<HoaDonDTO> arrayListTemp = data.dataHoaDonKhachHangOfDatabase();
        arrayList_HoaDon = arrayListTemp;
        
    }
    
    public DefaultTableModel hienThiHoaDon(ArrayList<HoaDonDTO> arrayList) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList.size(); i++) {
            HoaDonDTO hoaDon = arrayList.get(i);
            
            Vector record = new Vector();
            
            record.add(hoaDon.getMaHoaDon());
            record.add(hoaDon.getMaKhachHang());
            record.add(hoaDon.getMaNhanVien());
            record.add(hoaDon.getNgayMua());
            record.add(String.format("%,d", hoaDon.getTongTien()));
            record.add((hoaDon.getTinhTrang()));
            
            model.addRow(record);
        }
        
        return model;
    }
    
    public String formatStringdd(Date ngay) {
        DateFormat dinhDang = new SimpleDateFormat("dd-MM-yyyy");
        String strNgayBan = dinhDang.format(ngay);
        
        return strNgayBan;
    }
    
    public String formatStringyyyy(Date ngay) {
        DateFormat dinhDang = new SimpleDateFormat("yyyy-MM-dd");
        String strNgayBan = dinhDang.format(ngay);
        
        return strNgayBan;
    }
    
    public void thanhToanHoaDon(JTextField txThanhTien) throws SQLException {
        HoaDonDAO hoaDonDao = new HoaDonDAO();
        HoaDonDTO hoaDonDto = new HoaDonDTO();
        SachBUS sachBus = new SachBUS();
        
        Date ngayban = Calendar.getInstance().getTime();
        String strNgayBan = formatStringyyyy(ngayban);
        
        hoaDonDto.setMaHoaDon(hoaDonDao.maHoaDonMoiNhat() + 1);
        hoaDonDto.setMaKhachHang(idHienHanh);
        hoaDonDto.setMaNhanVien(0);
        hoaDonDto.setTongTien(Integer.parseInt(sachBus.removeThousandSeparators(txThanhTien.getText())));
        hoaDonDto.setNgayMua(strNgayBan);
        hoaDonDto.setTinhTrang("Chưa vận chuyển");
        
        arrayList_HoaDon.add(hoaDonDto);
        hoaDonDao.addHoaDonChoDataBase(); // add vào database

    }
    
    private void addKetQuaTimVaoModel(HoaDonDTO hoaDon, DefaultTableModel model) {
        Vector record = new Vector();
        
        record.add(hoaDon.getMaHoaDon());
        record.add(hoaDon.getMaKhachHang());
        record.add(hoaDon.getMaNhanVien());
        record.add(hoaDon.getNgayMua());
        record.add(String.format("%,d", hoaDon.getTongTien()));
        record.add(hoaDon.getTinhTrang());
        
        model.addRow(record);
    }
    
    public DefaultTableModel timMaHoaDon(int maHoaDon) {
        boolean check = false;
        DefaultTableModel modelQuanLyHoaDon = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);
            
            if (maHoaDon ==hoaDon.getMaHoaDon()) {
                addKetQuaTimVaoModel(hoaDon, modelQuanLyHoaDon);
                check = true;
            }
        }
        
        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }
        
        return modelQuanLyHoaDon;
    }
    
    public DefaultTableModel timMaKhachHang(int maKhachHang) {
        boolean check = false;
        DefaultTableModel modelQuanLyHoaDon = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);
            
            if (maKhachHang==hoaDon.getMaKhachHang()) {
                addKetQuaTimVaoModel(hoaDon, modelQuanLyHoaDon);
                check = true;
            }
        }
        
        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }
        
        return modelQuanLyHoaDon;
    }
    
    public DefaultTableModel timMaNhanVien(int maNhanVien) {
        boolean check = false;
        DefaultTableModel modelQuanLyHoaDon = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);
            
            if (maNhanVien==hoaDon.getMaNhanVien()) {
                addKetQuaTimVaoModel(hoaDon, modelQuanLyHoaDon);
                check = true;
            }
        }
        
        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }
        
        return modelQuanLyHoaDon;
    }
    
    public void timKiem(JComboBox cbTimKiem, JTable tableQuanLyHoaDon, JTextField txTimKiem) {
        switch ((int) cbTimKiem.getSelectedIndex()) {
            case 0: {
                tableQuanLyHoaDon.setModel(timMaHoaDon(Integer.parseInt(txTimKiem.getText())));
                break;
            }
            case 1: {
                tableQuanLyHoaDon.setModel(timMaKhachHang(Integer.parseInt(txTimKiem.getText())));
                break;
            }
            case 2: {
                tableQuanLyHoaDon.setModel(timMaNhanVien(Integer.parseInt(txTimKiem.getText())));
                break;
            }
            default: {
                break;
            }
        }
    }
    
    public DefaultTableModel timHoaDonChuaXuLy() {
        DefaultTableModel modelQuanLyHoaDon = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);
            
            if (hoaDon.getTinhTrang().equals("Chưa vận chuyển")) {
                addKetQuaTimVaoModel(hoaDon, modelQuanLyHoaDon);
            }
        }
        
        return modelQuanLyHoaDon;
    }
    
    public DefaultTableModel timHoaDonDaXuLy() {
        DefaultTableModel modelQuanLyHoaDon = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        
        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);
            
            if (hoaDon.getTinhTrang().equals("Đã vận chuyển")) {
                addKetQuaTimVaoModel(hoaDon, modelQuanLyHoaDon);
            }
        }
        
        return modelQuanLyHoaDon;
    }
    
    public void xuLyHoaDon(int maHoaDon)
    {
        HoaDonDAO hoaDonDao=new HoaDonDAO();
        
        hoaDonDao.capNhatXuLyHoaDon(maHoaDon);
        
    }
}
