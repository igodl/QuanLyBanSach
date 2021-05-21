/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.HoaDonBUS.arrayList_HoaDon;
import static BUS.HoaDonBUS.arrayList_HoaDonALL;
import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import static GUI.LoginGUI.idHienHanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha
 */
public class NhanVienBUS {

    public static ArrayList<NhanVienDTO> arrayList_NhanVien = new ArrayList<NhanVienDTO>();

    public NhanVienBUS() {

    }

    public void docDuLieuNhanVien() throws SQLException {
        NhanVienDAO data = new NhanVienDAO();
        if (arrayList_NhanVien.size() == 0) {
            arrayList_NhanVien = data.dataNhanVienOfDatabase();
        }
    }

    public int timAccountNhanVien(String user, String pass) {
        int id = 0;
        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);

            if (nhanVien.getUser().equals(user) && nhanVien.getPass().equals(pass) && nhanVien.getTinhTrangHoatDong().equals("1")) {
                id = nhanVien.getId();
            } else if (nhanVien.getUser().equals(user) && nhanVien.getPass().equals(pass) && nhanVien.getTinhTrangHoatDong().equals("0")) {
                return 1;
            }
        }

        return id;
    }

    public DefaultTableModel hienThiNhanVien() {
        DefaultTableModel modelNhanVien = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu", "Tình trạng hoạt động"}, 0);

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);

            Vector record = new Vector();
            record.add(nhanVien.getId());
            record.add(nhanVien.getHoLot());
            record.add(nhanVien.getTen());
            record.add(nhanVien.getNgaySinh());
            record.add(nhanVien.getGioiTinh());
            record.add(nhanVien.getSoDienThoai());
            record.add(nhanVien.getUser());
            record.add(nhanVien.getPass());
            record.add(nhanVien.getTinhTrangHoatDong());

            modelNhanVien.addRow(record);

        }

        return modelNhanVien;
    }

    public NhanVienDTO thongTinNhanVien() {
        NhanVienDTO nhanVien = new NhanVienDTO();

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            nhanVien = arrayList_NhanVien.get(i);

            if (idHienHanh == nhanVien.getId()) {
                return nhanVien;
            }
        }

        return nhanVien;
    }

    public void suaThongTinNhanVien(NhanVienDTO nhanVien) {

        if (checkDauVaoNhanVien(nhanVien)) {
            for (int i = 0; i < arrayList_NhanVien.size(); i++) {
                NhanVienDTO nhanVienTemp = arrayList_NhanVien.get(i);

                if (idHienHanh == nhanVienTemp.getId()) {
                    nhanVienTemp.setTen(nhanVien.getTen());
                    nhanVienTemp.setHoLot(nhanVien.getHoLot());
                    nhanVienTemp.setPass(nhanVien.getPass());
                    nhanVienTemp.setGioiTinh(nhanVien.getGioiTinh());
                    nhanVienTemp.setSoDienThoai(nhanVien.getSoDienThoai());
                    nhanVienTemp.setNgaySinh(nhanVien.getNgaySinh());

                    arrayList_NhanVien.set(i, nhanVienTemp);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Sửa thông tin thành công !");

        }

        NhanVienDAO nhanVienDao = new NhanVienDAO();
        nhanVienDao.updateThongTinNhanVien();
    }

    public boolean checkDauVaoNhanVien(NhanVienDTO nhanVien) {
        AdminBUS adminBus = new AdminBUS();

        if (nhanVien.getTen().equals("") || nhanVien.getPass().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ các thông tin bắt buộc");
            return false;
        } else if (adminBus.checkHoTen(nhanVien.getTen()) && adminBus.checkHoTen(nhanVien.getHoLot())) {
            if (adminBus.checkNgaySinh(nhanVien.getNgaySinh())) {
                if (adminBus.checkSDT(nhanVien.getSoDienThoai())) {
                    if (adminBus.checkMatKhau(nhanVien.getPass())) {
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
                JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ ! Nhập ngày sinh theo định dạng dd-mm-yyyy (VD: 01-01-2001)");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Họ và tên chỉ bao gồm chữ");
            return false;
        }

    }
    
    public String timTenNhanVien(int maNhanVien)
    {
        for (NhanVienDTO nhanVienDTO : arrayList_NhanVien) {
            
            if(nhanVienDTO.getId() == maNhanVien)
            {
                String tenDayDu=nhanVienDTO.getHoLot()+" "+nhanVienDTO.getTen();
                return tenDayDu;
            }
        }
        
        return "Đang cập nhật";
    }
    
}
