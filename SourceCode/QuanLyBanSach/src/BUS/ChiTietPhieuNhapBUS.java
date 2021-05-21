/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietPhieuNhapDAO;
import DTO.ChiTietPhieuNhapDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ha
 */
public class ChiTietPhieuNhapBUS {

    public static ArrayList<ChiTietPhieuNhapDTO> arrayList_ChiTietPhieuNhap = new ArrayList<ChiTietPhieuNhapDTO>();

    public ChiTietPhieuNhapBUS() {

    }

    public void docDuLieuChiTietPhieuNhap() throws SQLException {
        ChiTietPhieuNhapDAO data = new ChiTietPhieuNhapDAO();

        arrayList_ChiTietPhieuNhap = data.dataChiTietPhieuNhapOfDatabase();

    }

    public DefaultTableModel hienThiChiTietPhieuNhap(int row, JTable tbHoaDon, ArrayList<ChiTietPhieuNhapDTO> arrayList) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã phiếu nhập", "Mã sách", "Số lượng", "Đơn giá nhập"}, 0);
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        TableModel modelTemp = tbHoaDon.getModel();
        for (int i = 0; i < arrayList.size(); i++) {
            ChiTietPhieuNhapDTO chitiet = arrayList.get(i);

            if (chitiet.getMaPhieuNhap()== (int)modelTemp.getValueAt(row, 0)) {
                Vector record = new Vector();

                record.add(chitiet.getMaPhieuNhap());
                record.add(chitiet.getMaSach());
                record.add(chitiet.getSoLuong());
                record.add(String.format("%,d", chitiet.getDonGiaNhap()));

                model.addRow(record);
            }
        }

        return model;
    }
    
        public void thanhToanChiTietPhieuNhap(TableModel modelGioHang) {
        ChiTietPhieuNhapDAO chiTietPhieuNhapDao = new ChiTietPhieuNhapDAO();
        ChiTietPhieuNhapDTO chiTietPhieuNhapDto = new ChiTietPhieuNhapDTO();
        SachBUS sachBus = new SachBUS();

        chiTietPhieuNhapDao.addChiTietPhieuNhapChoDatabse(modelGioHang);

//        for (int i = 0; i < modelGioHang.getRowCount(); i++) {
//            chiTietHoaDonDto.setMaHoaDon(arrayList_HoaDon.get(arrayList_HoaDon.size() - 1).getMaHoaDon()); //lay ma hoa don vua add vao array Hoa Don
//            chiTietHoaDonDto.setMaSach((int) modelGioHang.getValueAt(i, 0));
//            chiTietHoaDonDto.setTenSach((String) modelGioHang.getValueAt(i, 1));
//            int soLuong = (int) modelGioHang.getValueAt(i, 6);
//            int donGia = Integer.parseInt(sachBus.removeThousandSeparators(String.valueOf(modelGioHang.getValueAt(i, 7))));
//            int thanhTien = soLuong * donGia;
//
//            chiTietHoaDonDto.setSoLuong(soLuong);
//            chiTietHoaDonDto.setDonGia(donGia);
//            chiTietHoaDonDto.setThanhTien(thanhTien);
//            chiTietHoaDonDto.setGhiChu("");
//
//            arrayList_ChiTietHoaDon.add(chiTietHoaDonDto);
//        }
    }

}
