/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.LoaiSachBUS.arrayList_LoaiSach;
import static BUS.NhaXuatBanBUS.arrayList_NhaXuatBan;
import static BUS.TacGiaBUS.arrayList_TacGia;
import DAO.LoaiSachDAO;
import DAO.NhaXuatBanDAO;
import DAO.SachDAO;
import DAO.TacGiaDAO;
import DTO.LoaiSachDTO;
import DTO.NhaXuatBanDTO;

import DTO.SachDTO;
import DTO.TacGiaDTO;
import GUI.MainFrameGUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ha
 */
public class SachBUS {

    public static ArrayList<SachDTO> arrayList_Sach = new ArrayList<SachDTO>();

    public SachBUS() {

    }

    public void docDuLieuSach() throws SQLException {
        SachDAO data = new SachDAO();

        arrayList_Sach = data.dataSachOfDatabase();
    }

    public DefaultTableModel timLoaiSach(int maLoai) {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"}, 0);

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getTinhTrang().equals("Còn bán")) {
                if (sach.getMaLoai() == maLoai) {

                    Vector record = new Vector();

                    record.add(sach.getMaSach());
                    record.add(sach.getTenSach());
                    for (int j = 0; j < arrayList_TacGia.size(); j++) {
                        TacGiaDTO tacGia = arrayList_TacGia.get(j);

                        if (sach.getMaTacGia() == tacGia.getMaTacGia()) {
                            String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();
                            record.add(tenDayDu);
                            break;
                        }
                    }
                    for (int k = 0; k < arrayList_LoaiSach.size(); k++) {
                        LoaiSachDTO loaiSach = arrayList_LoaiSach.get(k);

                        if (sach.getMaLoai() == loaiSach.getMaLoai()) {
                            record.add(loaiSach.getTenLoai());
                            break;
                        }
                    }
                    record.add(sach.getNgayXuatBan());
                    for (int l = 0; l < arrayList_NhaXuatBan.size(); l++) {
                        NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(l);

                        if (sach.getmaNXB() == nhaXuatBan.getmaNXB()) {
                            record.add(nhaXuatBan.getTenNhaXuatBan());
                            break;
                        }
                    }
                    record.add(String.format("%,d", sach.getDonGia()));

                    modelTemp.addRow(record);
                }
            }
        }

        return modelTemp;
    }

    public DefaultTableModel hienThiSanPhamSach() throws SQLException {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"}, 0);
        SachBUS sachBus = new SachBUS();
        sachBus.docDuLieuSach();
        TacGiaBUS tacGiaBus = new TacGiaBUS();
        tacGiaBus.docDuLieuTacGia();
        LoaiSachBUS loaiSachBUS = new LoaiSachBUS();
        loaiSachBUS.docDuLieuLoaiSach();
        NhaXuatBanBUS nhaXuatBanBUS = new NhaXuatBanBUS();
        nhaXuatBanBUS.docDuLieuNhaXuatBan();

        for (int i = 0; i < arrayList_Sach.size(); i++) {

            SachDTO sach = arrayList_Sach.get(i);
            if (sach.getSoLuong() != 0 && sach.getTinhTrang().equals("Còn bán")) {
                Vector record = new Vector();

                record.add(sach.getMaSach());
                record.add(sach.getTenSach());
                
                for (int j = 0; j < arrayList_TacGia.size(); j++) {
                    TacGiaDTO tacGia = arrayList_TacGia.get(j);

                    if (sach.getMaTacGia() == tacGia.getMaTacGia()) {
                        String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();
                        record.add(tenDayDu);
                        break;
                    }
                }
                for (int k = 0; k < arrayList_LoaiSach.size(); k++) {
                    LoaiSachDTO loaiSach = arrayList_LoaiSach.get(k);

                    if (sach.getMaLoai() == loaiSach.getMaLoai()) {
                        record.add(loaiSach.getTenLoai());
                        break;
                    }
                }

                record.add(sach.getNgayXuatBan());

                for (int l = 0; l < arrayList_NhaXuatBan.size(); l++) {
                    NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(l);

                    if (sach.getmaNXB() == nhaXuatBan.getmaNXB()) {
                        record.add(nhaXuatBan.getTenNhaXuatBan());
                        break;
                    }
                }
                record.add(String.format("%,d", sach.getDonGia()));

                modelTemp.addRow(record);
            }

        }
        return modelTemp;
    }

    public DefaultTableModel timTenSach(String tenSach) {
        boolean check = false;
        DefaultTableModel modelTenSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"}, 0);
        tenSach = tenSach.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getTinhTrang().equals("Còn bán")) {
                String tenSachTemp = sach.getTenSach().toLowerCase();

                if (tenSachTemp.indexOf(tenSach) != -1) {
                    addKetQuaTimVaoModel(sach, modelTenSach);
                    check = true;
                }
            }

        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenSach;
    }

    public DefaultTableModel timTenLoaiSach(String loaiSach) throws SQLException {
        LoaiSachBUS loaiSachBUS = new LoaiSachBUS();
        boolean check = false;
        DefaultTableModel modelTenLoaiSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"}, 0);

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getTinhTrang().equals("Còn bán")) {
                if (sach.getMaLoai() == loaiSachBUS.timMaLoaiSachKhachHang(loaiSach)) {
                    addKetQuaTimVaoModel(sach, modelTenLoaiSach);
                    check = true;
                }
            }

        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenLoaiSach;
    }

    public DefaultTableModel timTenTacGia(String tenTacGia) throws SQLException {
        TacGiaBUS tacGiaBUS = new TacGiaBUS();
        boolean check = false;
        DefaultTableModel modelTenTacGia = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"}, 0);
        tenTacGia = tenTacGia.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getTinhTrang().equals("Còn bán")) {
                if (sach.getMaTacGia() == tacGiaBUS.timMaTacGiaKhachHang(tenTacGia)) {
                    addKetQuaTimVaoModel(sach, modelTenTacGia);
                    check = true;
                }
            }

        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenTacGia;
    }

    private void addKetQuaTimVaoModel(SachDTO sach, DefaultTableModel model) {
        Vector record = new Vector();

        record.add(sach.getMaSach());
        record.add(sach.getTenSach());
        
        for (int j = 0; j < arrayList_TacGia.size(); j++) {
            TacGiaDTO tacGia = arrayList_TacGia.get(j);

            if (sach.getMaTacGia() == tacGia.getMaTacGia()) {
                String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();
                record.add(tenDayDu);
                break;
            }
        }
        for (int k = 0; k < arrayList_LoaiSach.size(); k++) {
            LoaiSachDTO loaiSach = arrayList_LoaiSach.get(k);

            if (sach.getMaLoai() == loaiSach.getMaLoai()) {
                record.add(loaiSach.getTenLoai());
                break;
            }
        }
        record.add(sach.getNgayXuatBan());
        for (int l = 0; l < arrayList_NhaXuatBan.size(); l++) {
            NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(l);

            if (sach.getmaNXB() == nhaXuatBan.getmaNXB()) {
                record.add(nhaXuatBan.getTenNhaXuatBan());
                break;
            }
        }
        record.add(String.format("%,d", sach.getDonGia()));

        model.addRow(record);
    }

    public int tinhTien(DefaultTableModel modelGioHang) {
        int tongTien = 0;

        for (int i = 0; i < modelGioHang.getRowCount(); i++) {

            String donGiaString = (String) modelGioHang.getValueAt(i, 7);
            donGiaString = removeThousandSeparators(donGiaString);

            int donGia = Integer.parseInt(donGiaString);
            int soLuong = (int) modelGioHang.getValueAt(i, 6);

            tongTien += soLuong * donGia;
        }

        return tongTien;
    }

    public void timKiem(JComboBox cbTimKiem, JTable tableSanPhamSach, JTextField txTimKiem) {
        switch ((String) cbTimKiem.getSelectedItem()) {
            case "Tên sách": {
                tableSanPhamSach.setModel(timTenSach(txTimKiem.getText()));
                break;
            }
            case "Loại sách": {
                try {
                    tableSanPhamSach.setModel(timTenLoaiSach(txTimKiem.getText()));

                } catch (SQLException ex) {
                    System.out.println("Tìm tên loại sách thất bại");
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            case "Tên tác giả": {
                try {
                    tableSanPhamSach.setModel(timTenTacGia(txTimKiem.getText()));

                } catch (SQLException ex) {
                    System.out.println("Tìm tên loại sách thất bại");
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            default: {
                break;
            }
        }

    }

    public void hienThiLoaiSach(JTable tbSanPhamSach, JComboBox cbLoaiSach) throws SQLException {

        for (int i = 1; i < cbLoaiSach.getItemCount(); i++) {
            if (cbLoaiSach.getSelectedIndex() == 0) {
                tbSanPhamSach.setModel(hienThiSanPhamSach());
                break;
            }
            if (cbLoaiSach.getSelectedIndex() == i) {
                tbSanPhamSach.setModel(timLoaiSach(i + 1));
                break;
            }
        }
    }

    public void hienThiGioHang(JTable tbSanPhamSach, JTable tbGioHang, DefaultTableModel modelGioHang, JSpinner spinSoLuong, JTextField txTongTien, JTextField txThanhTien) throws SQLException {
        SachBUS sachBus = new SachBUS();
        TableModel modelTemp = tbSanPhamSach.getModel();
        int row = tbSanPhamSach.getSelectedRow();
        boolean check = false;

        if (tbGioHang.getRowCount() == 0) {
            Vector record = new Vector();

            record.add(modelTemp.getValueAt(row, 0));
            record.add(modelTemp.getValueAt(row, 1));
            record.add(modelTemp.getValueAt(row, 2));
            record.add(modelTemp.getValueAt(row, 3));
            record.add(modelTemp.getValueAt(row, 4));
            record.add(modelTemp.getValueAt(row, 5));
            record.add(spinSoLuong.getValue());
            record.add(modelTemp.getValueAt(row, 6));

            modelGioHang.addRow(record);
            tbGioHang.setModel(modelGioHang);

            int tongTien = sachBus.tinhTien(modelGioHang);
            String tongTienString = String.format("%,d", tongTien);

            txTongTien.setText(tongTienString);
            txThanhTien.setText(tongTienString);

        } else {
            for (int i = 0; i < tbGioHang.getRowCount(); i++) {
                if (modelTemp.getValueAt(row, 0) == modelGioHang.getValueAt(i, 0)) {
                    int soLuong = (int) modelGioHang.getValueAt(i, 6);
                    int soLuongMoi = soLuong + (int) spinSoLuong.getValue();

                    modelGioHang.setValueAt(soLuongMoi, i, 6);

                    int tongTien = sachBus.tinhTien(modelGioHang);
                    String tongTienString = String.format("%,d", tongTien);

                    txTongTien.setText(tongTienString);
                    txThanhTien.setText(tongTienString);

                    check = true;
                }
            }

            if (!check) {
                Vector record = new Vector();

                record.add(modelTemp.getValueAt(row, 0));
                record.add(modelTemp.getValueAt(row, 1));
                record.add(modelTemp.getValueAt(row, 2));
                record.add(modelTemp.getValueAt(row, 3));
                record.add(modelTemp.getValueAt(row, 4));
                record.add(modelTemp.getValueAt(row, 5));
                record.add(spinSoLuong.getValue());
                record.add(modelTemp.getValueAt(row, 6));

                modelGioHang.addRow(record);
                tbGioHang.setModel(modelGioHang);

                int tongTien = sachBus.tinhTien(modelGioHang);
                String tongTienString = String.format("%,d", tongTien);

                txTongTien.setText(tongTienString);
                txThanhTien.setText(tongTienString);
            }
        }

    }

    public void xoaSanPham(DefaultTableModel modelGioHang, int row, JTextField txThanhTien, JTextField txTongTien) {
        int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa sản phẩm nảy", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION);

        if (luaChon == 0) {
            if (row >= 0) {
                int tongTien = 0;

                modelGioHang.removeRow(row);
                tongTien = tinhTien(modelGioHang);

                txThanhTien.setText(String.format("%,d", tongTien));
                txTongTien.setText(String.format("%,d", tongTien));
            } else {
                JOptionPane.showMessageDialog(null, "Hãy chọn 1 sản phẩm muốn xóa");
            }
        }

    }

    public boolean kiemTraSoLuong(int maSach, int soLuong) {
        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (maSach == sach.getMaSach()) {
                if (soLuong <= sach.getSoLuong()) {
                    return true;
                }
            }
        }

        return false;
    }

    public void capNhapSoLuong(DefaultTableModel modelGioHang) {
        for (int i = 0; i < modelGioHang.getRowCount(); i++) {
            int maSach = (int) modelGioHang.getValueAt(i, 0);
            int soLuongBan = (int) modelGioHang.getValueAt(i, 6);

            for (int j = 0; j < arrayList_Sach.size(); j++) {
                SachDTO sach = arrayList_Sach.get(j);

                if (sach.getMaSach() == maSach) {
                    int soLuongCon = sach.getSoLuong() - soLuongBan;

                    if (soLuongCon > 0) {
                        sach.setSoLuong(sach.getSoLuong() - soLuongBan);
                    } else {
                        sach.setSoLuong(sach.getSoLuong() - soLuongBan);
                        sach.setTinhTrang("Hết hàng");
                    }
                }
            }
        }

        SachDAO sachDao = new SachDAO();
        sachDao.capNhatSoLuongKhiBan(modelGioHang);

    }

    public String removeThousandSeparators(String s) {
        StringBuilder sTemp = new StringBuilder(s);

        for (int i = 0; i < sTemp.length(); i++) {
            if (sTemp.charAt(i) == ',') {
                sTemp.deleteCharAt(i);
            }
        }

        String result = sTemp.toString();

        return result;
    }

    public String timNgayXuatBan(SachDTO sachTemp) {
        String ngayXuatBan = "0";
        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getNgayXuatBan().equals(sachTemp.getNgayXuatBan())) {
                return sach.getNgayXuatBan();
            } else {
                return sachTemp.getNgayXuatBan();
            }
        }
        return ngayXuatBan;
    }

    public String tenLoaiSach(SachDTO sach) {
        String tenLoaiSach = "0";

        for (int i = 0; i < arrayList_LoaiSach.size(); i++) {
            LoaiSachDTO loaiSach = arrayList_LoaiSach.get(i);

            if (loaiSach.getMaLoai() == sach.getMaLoai()) {
                return loaiSach.getTenLoai();
            }
        }

        return tenLoaiSach;

    }

    public String tenTacGia(SachDTO sach) {
        String tenTacGia = "0";

        for (int i = 0; i < arrayList_TacGia.size(); i++) {
            TacGiaDTO tacGia = arrayList_TacGia.get(i);

            if (tacGia.getMaTacGia() == sach.getMaTacGia()) {
                String tenDayDu = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();

                return tenDayDu;

            }

        }

        return tenTacGia;
    }

    public String tenNhaXuatBan(SachDTO sach) {
        String tenNhaXuatBan = "0";

        for (int i = 0; i < arrayList_NhaXuatBan.size(); i++) {
            NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(i);

            if (nhaXuatBan.getmaNXB() == sach.getMaNXB()) {
                return nhaXuatBan.getTenNhaXuatBan();
            }
        }

        return tenNhaXuatBan;
    }

    public int soLuongSachDangCo(int maSach) {
        int soLuong = 0;

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (maSach == sach.getMaSach()) {
                return sach.getSoLuong();
            }
        }

        return soLuong;
    }

    public int timMaSach(String tenSach, String loaiSach, String hoTacGia, String tenTacGia, String nhaXuatBan, String ngayXuatBan) {
        int maSach = 0;
        LoaiSachBUS loaiSachBus = new LoaiSachBUS();
        TacGiaBUS tacGiaBus = new TacGiaBUS();
        NhaXuatBanBUS nhaXuatBanBus = new NhaXuatBanBUS();

        for (int i = 0; i < arrayList_Sach.size(); i++) {

            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getTenSach().equals(tenSach)) {
                if (loaiSachBus.timMaLoaiSach(loaiSach) != 0) {
                    if (tacGiaBus.timMaTacGia(hoTacGia, tenTacGia) != 0) {
                        if (nhaXuatBanBus.timMaNhaXuatBan(nhaXuatBan) != 0) {
                            if (sach.getNgayXuatBan().equals(ngayXuatBan)) {
                                return sach.getMaSach();
                            }
                        }
                    }
                }
            }

        }

        return maSach;
    }

}
