/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.PhieuNhapDAO;
import DTO.PhieuNhapDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ha
 */
public class PhieuNhapBUS {

    public static ArrayList<PhieuNhapDTO> arrayList_PhieuNhap = new ArrayList<PhieuNhapDTO>();

    public PhieuNhapBUS() {

    }

    public void docDuLieuPhieuNhap() throws SQLException {
        PhieuNhapDAO data = new PhieuNhapDAO();

        arrayList_PhieuNhap = data.dataPhieuNhapOfDatabase();

    }

    private void addKetQuaTimVaoModel(PhieuNhapDTO phieuNhap, DefaultTableModel model) {
        Vector record = new Vector();

        record.add(phieuNhap.getMaPhieuNhap());
        record.add(phieuNhap.getMaNhanVien());
        record.add(phieuNhap.getMaNCC());
        record.add(phieuNhap.getNgayNhap());
        record.add(String.format("%,d", phieuNhap.getTongTien()));

        model.addRow(record);
    }

    public DefaultTableModel timMaPhieuNhap(int maPhieuNhap) {
        boolean check = false;
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"}, 0);

        for (int i = 0; i < arrayList_PhieuNhap.size(); i++) {
            PhieuNhapDTO phieuNhap = arrayList_PhieuNhap.get(i);

            if (maPhieuNhap == phieuNhap.getMaPhieuNhap()) {
                addKetQuaTimVaoModel(phieuNhap, model);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return model;
    }

    public DefaultTableModel timMaNhanVien(int maNhanVien) {
        boolean check = false;
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"}, 0);

        for (int i = 0; i < arrayList_PhieuNhap.size(); i++) {
            PhieuNhapDTO phieuNhap = arrayList_PhieuNhap.get(i);

            if (maNhanVien == phieuNhap.getMaNhanVien()) {
                addKetQuaTimVaoModel(phieuNhap, model);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return model;
    }

    public void timKiem(JComboBox cbTimKiem, JTable tableQuanLyHoaDon, JTextField txTimKiem) {
        switch ((int) cbTimKiem.getSelectedIndex()) {
            case 0: {
                tableQuanLyHoaDon.setModel(timMaPhieuNhap(Integer.parseInt(txTimKiem.getText())));
                break;
            }
            case 1: {
                tableQuanLyHoaDon.setModel(timMaNhanVien(Integer.parseInt(txTimKiem.getText())));
                break;
            }

            default: {
                break;
            }
        }
    }

    public DefaultTableModel hienThiPhieuNhap(ArrayList<PhieuNhapDTO> arrayList) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"}, 0);

        for (int i = 0; i < arrayList.size(); i++) {
            PhieuNhapDTO phieuNhap = arrayList.get(i);

            Vector record = new Vector();

            record.add(phieuNhap.getMaPhieuNhap());
            record.add(phieuNhap.getMaNhanVien());
            record.add(phieuNhap.getMaNCC());
            record.add(phieuNhap.getNgayNhap());
            record.add(String.format("%,d", phieuNhap.getTongTien()));

            model.addRow(record);
        }

        return model;
    }

    public DefaultTableModel thongKeNgayADenB(String ngayA, String ngayB) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"}, 0);

        for (int i = 0; i < arrayList_PhieuNhap.size(); i++) {
            PhieuNhapDTO phieuNhap = arrayList_PhieuNhap.get(i);

            if (phieuNhap.getNgayNhap().compareTo(ngayA) >= 0 && phieuNhap.getNgayNhap().compareTo(ngayB) <= 0) {
                Vector record = new Vector();

                record.add(phieuNhap.getMaPhieuNhap());
                record.add(phieuNhap.getMaNhanVien());
                record.add(phieuNhap.getMaNCC());
                record.add(phieuNhap.getNgayNhap());
                record.add(String.format("%,d", phieuNhap.getTongTien()));

                model.addRow(record);
            }
        }

        return model;
    }

    public int tinhTienPhieuNhap(TableModel model) {
        int tongTien = 0;
        SachBUS sachBus = new SachBUS();

        for (int i = 0; i < model.getRowCount(); i++) {

            String donGiaString = (String) model.getValueAt(i, 7);
            donGiaString = sachBus.removeThousandSeparators(donGiaString);

            int donGia = Integer.parseInt(donGiaString);
            int soLuong = Integer.parseInt((String) model.getValueAt(i, 6));

            tongTien += soLuong * donGia;
        }

        return tongTien;
    }

    public void thanhToanPhieuNhap(JComboBox cbNhaCungCap, JTextField txTongTien4) throws SQLException {
        PhieuNhapDAO phieuNhapDao = new PhieuNhapDAO();
        PhieuNhapDTO phieuNhapDto = new PhieuNhapDTO();
        SachBUS sachBus = new SachBUS();
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        NhaCungCapBUS nhaCungCapBus = new NhaCungCapBUS();

        Date ngayban = Calendar.getInstance().getTime();
        String strNgayNhap = hoaDonBus.formatStringyyyy(ngayban);

        phieuNhapDto.setMaPhieuNhap(phieuNhapDao.maPhieuNhapMoiNhat() + 1);
        phieuNhapDto.setMaNhanVien(idHienHanh);
        phieuNhapDto.setNgayNhap(strNgayNhap);

        if (nhaCungCapBus.timMaNCC(cbNhaCungCap) != 0) {
            phieuNhapDto.setMaNCC(nhaCungCapBus.timMaNCC(cbNhaCungCap));
        }
        
        phieuNhapDto.setTongTien(Integer.parseInt(sachBus.removeThousandSeparators(txTongTien4.getText())));

        arrayList_PhieuNhap.add(phieuNhapDto);
        phieuNhapDao.addPhieuNhapChoDataBase(); // add vào database

    }
}
