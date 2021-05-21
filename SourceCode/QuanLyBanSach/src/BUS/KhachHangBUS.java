/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.NhanVienBUS.arrayList_NhanVien;
import DAO.KhachHangDAO;
import DAO.SachDAO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class KhachHangBUS {

    public static ArrayList<KhachHangDTO> arrayList_KhachHang = new ArrayList<KhachHangDTO>();

    public KhachHangBUS() {

    }

    public void docDuLieuKhachHang() throws SQLException {
        KhachHangDAO data = new KhachHangDAO();
        if (arrayList_KhachHang.size() == 0) {
            arrayList_KhachHang = data.dataKhachHangOfDatabase();
        }
    }

    public int timAccountKhachHang(String user, String pass) {
        int id = 0;
        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);

            if (khachHang.getUser().equals(user) && khachHang.getPass().equals(pass) && khachHang.getTinhTrangHoatDong().equals("1")) {
                id = khachHang.getId();
            } else if (khachHang.getUser().equals(user) && khachHang.getPass().equals(pass) && khachHang.getTinhTrangHoatDong().equals("0")) {
                return 1;
            }

        }

        return id;
    }

    public void suaThongTinKhachHang(KhachHangDTO khachHang) {

        if (checkDauVaoKhachHang(khachHang)) {
            for (int i = 0; i < arrayList_KhachHang.size(); i++) {
                KhachHangDTO khachHangTemp = arrayList_KhachHang.get(i);

                if (idHienHanh == khachHangTemp.getId()) {
                    khachHangTemp.setTen(khachHang.getTen());
                    khachHangTemp.setHoLot(khachHang.getHoLot());
                    khachHangTemp.setPass(khachHang.getPass());
                    khachHangTemp.setGioiTinh(khachHang.getGioiTinh());
                    khachHangTemp.setSoDienThoai(khachHang.getSoDienThoai());
                    khachHangTemp.setNgaySinh(khachHang.getNgaySinh());

                    arrayList_KhachHang.set(i, khachHangTemp);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Sửa thông tin thành công !");

        }

        KhachHangDAO khachHangDao = new KhachHangDAO();
        khachHangDao.updateThongTinKhachHang();
    }

    public KhachHangDTO thongTinKhachHang() {
        KhachHangDTO khachHang = new KhachHangDTO();

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            khachHang = arrayList_KhachHang.get(i);

            if (idHienHanh == khachHang.getId()) {
                return khachHang;
            }
        }

        return khachHang;
    }

    public boolean checkDauVaoKhachHang(KhachHangDTO khachHang) {
        AdminBUS adminBus = new AdminBUS();

        if (khachHang.getTen().equals("") || khachHang.getPass().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ các thông tin bắt buộc");
            return false;
        } else if (adminBus.checkHoTen(khachHang.getTen()) && adminBus.checkHoTen(khachHang.getHoLot())) {
            if (adminBus.checkNgaySinh(khachHang.getNgaySinh())) {
                if (adminBus.checkSDT(khachHang.getSoDienThoai())) {
                    if (adminBus.checkMatKhau(khachHang.getPass())) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                        return false;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Số điện thoại có 10-11 số chỉ bao gồm các số từ 0-9");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ ! Nhập ngày sinh theo định dạng yyyy-mm-dd (VD: 2001-12-01)");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Họ và tên chỉ bao gồm chữ");
            return false;
        }
    }

    public DefaultTableModel hienThiKhachHang() {
        DefaultTableModel modelKhachHang = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu", "Tình trạng hoạt động"}, 0);

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);

            Vector record = new Vector();
            record.add(khachHang.getId());
            record.add(khachHang.getHoLot());
            record.add(khachHang.getTen());
            record.add(khachHang.getNgaySinh());
            record.add(khachHang.getGioiTinh());
            record.add(khachHang.getSoDienThoai());
            record.add(khachHang.getUser());
            record.add(khachHang.getPass());
            record.add(khachHang.getTinhTrangHoatDong());

            modelKhachHang.addRow(record);

        }

        return modelKhachHang;
    }

    public String timTenKhachHang(int maKhachHang)
    {
        for(KhachHangDTO khachHang : arrayList_KhachHang)
        {
            if(khachHang.getId() ==  maKhachHang)
            {
                String tenDayDu=khachHang.getHoLot()+" "+khachHang.getTen();
                return tenDayDu;
            }
        }
        
        return "Khong co";
    }
}
