/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.HoaDonBUS.arrayList_HoaDon;
import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;
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
public class ChiTietHoaDonBUS {

    public static ArrayList<ChiTietHoaDonDTO> arrayList_ChiTietHoaDon = new ArrayList<ChiTietHoaDonDTO>();
    public static ArrayList<ChiTietHoaDonDTO> arrayList_ChiTietHoaDonALL = new ArrayList<ChiTietHoaDonDTO>();

    public ChiTietHoaDonBUS() {

    }

    public void docDuLieuChiTietHoaDonALL() throws SQLException {
        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();

        arrayList_ChiTietHoaDonALL = data.dataChiTietHoaDonALLOfDatabase();

    }

    public void docDuLieuChiTietHoaDon() throws SQLException {
        ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
        arrayList_ChiTietHoaDon = data.dataChiTietHoaDonOfDatabase();
    }

    public DefaultTableModel hienThiChiTietHoaDon(int row, JTable tbHoaDon, ArrayList<ChiTietHoaDonDTO> arrayList) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"}, 0);
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        TableModel modelTemp = tbHoaDon.getModel();
        for (int i = 0; i < arrayList.size(); i++) {
            ChiTietHoaDonDTO chitiet = arrayList.get(i);

            if (chitiet.getMaHoaDon() == (int) modelTemp.getValueAt(row, 0)) {
                Vector record = new Vector();

                record.add(chitiet.getMaHoaDon());
                record.add(chitiet.getMaSach());
                record.add(chitiet.getTenSach());
                record.add(chitiet.getSoLuong());
                record.add(String.format("%,d", chitiet.getDonGia()));
                record.add(String.format("%,d", chitiet.getThanhTien()));
                record.add(chitiet.getGhiChu());

                model.addRow(record);
            }
        }

        return model;
    }

    public void thanhToanChiTietHoaDon(DefaultTableModel modelGioHang) {
        ChiTietHoaDonDAO chiTietHoaDonDao = new ChiTietHoaDonDAO();
        ChiTietHoaDonDTO chiTietHoaDonDto = new ChiTietHoaDonDTO();
        SachBUS sachBus = new SachBUS();

        chiTietHoaDonDao.addChiTietHoaDonChoDatabse(modelGioHang);

        for (int i = 0; i < modelGioHang.getRowCount(); i++) {
            chiTietHoaDonDto.setMaHoaDon(arrayList_HoaDon.get(arrayList_HoaDon.size() - 1).getMaHoaDon()); //lay ma hoa don vua add vao array Hoa Don
            chiTietHoaDonDto.setMaSach((int) modelGioHang.getValueAt(i, 0));
            chiTietHoaDonDto.setTenSach((String) modelGioHang.getValueAt(i, 1));
            int soLuong = (int) modelGioHang.getValueAt(i, 6);
            int donGia = Integer.parseInt(sachBus.removeThousandSeparators(String.valueOf(modelGioHang.getValueAt(i, 7))));
            int thanhTien = soLuong * donGia;

            chiTietHoaDonDto.setSoLuong(soLuong);
            chiTietHoaDonDto.setDonGia(donGia);
            chiTietHoaDonDto.setThanhTien(thanhTien);
            chiTietHoaDonDto.setGhiChu("");

            arrayList_ChiTietHoaDon.add(chiTietHoaDonDto);
        }
    }
    
    public ArrayList<ChiTietHoaDonDTO> timChiTietHoaDonCuaHoaDon(int maHoaDon)
    {
        ArrayList<ChiTietHoaDonDTO> arrayList=new ArrayList<ChiTietHoaDonDTO>();
        
        for (ChiTietHoaDonDTO chiTietHoaDonDTO : arrayList_ChiTietHoaDon) {
            
            if(chiTietHoaDonDTO.getMaHoaDon() == maHoaDon)
                arrayList.add(chiTietHoaDonDTO);
        }
        
        return arrayList;
    }
}
