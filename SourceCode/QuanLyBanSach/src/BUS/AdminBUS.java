/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.ChiTietHoaDonBUS.arrayList_ChiTietHoaDonALL;
import static BUS.HoaDonBUS.arrayList_HoaDonALL;
import static BUS.KhachHangBUS.arrayList_KhachHang;
import static BUS.LoaiSachBUS.arrayList_LoaiSach;
import static BUS.NhaXuatBanBUS.arrayList_NhaXuatBan;
import static BUS.NhanVienBUS.arrayList_NhanVien;
import static BUS.SachBUS.arrayList_Sach;
import static BUS.TacGiaBUS.arrayList_TacGia;
import DAO.AdminDAO;
import DAO.NhanVienDAO;
import DTO.AdminDTO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.LoaiSachDTO;
import DTO.NhaXuatBanDTO;
import DTO.NhanVienDTO;
import DTO.SachDTO;
import DTO.TacGiaDTO;
import static GUI.LoginGUI.idHienHanh;
import GUI.MainFrameGUI;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.table.TableModel;

/**
 *
 * @author Ha
 */
public class AdminBUS {

    public static ArrayList<AdminDTO> arrayList_Admin = new ArrayList<AdminDTO>();

    public AdminBUS() {

    }

    public void docDuLieuAdmin() throws SQLException {
        AdminDAO data = new AdminDAO();
        if (arrayList_Admin.size() == 0) {
            arrayList_Admin = data.dataAdminOfDatabase();
        }
    }

    public int timAccountAdmin(String user, String pass) {
        int id = 0;
        for (int i = 0; i < arrayList_Admin.size(); i++) {
            AdminDTO admin = arrayList_Admin.get(i);

            if (admin.getUser().equals(user) && admin.getPass().equals(pass)) {
                id = admin.getId();
            }
        }

        return id;
    }

    public void themNhanVien(NhanVienDTO nhanVien) throws SQLException {
        AdminDAO adminDao = new AdminDAO();

        if (checkDauVaoNhanVien(nhanVien, true)) {
            nhanVien.setPass(getMd5(nhanVien.getPass()));
            String query = "SELECT Id FROM account ORDER BY Id ASC";
            ResultSet rs = adminDao.connection.getStatement().executeQuery(query);

            while (rs.next()) {
                nhanVien.setId(rs.getInt(1)); // lay Id moi nhat
            }

            adminDao.connection.getStatement().executeUpdate("ALTER TABLE account AUTO_INCREMENT=" + nhanVien.getId()); //Xu ly xoa khi co Auto_Increment

            nhanVien.setId(nhanVien.getId() + 1);

            arrayList_NhanVien.add(nhanVien);

            adminDao.themNhanVienVaoDatabase();

            JOptionPane.showMessageDialog(null, "Thêm tài khoản nhân viên thành công !");

        }
    }

    public void themKhachHang(KhachHangDTO khachHang) throws SQLException {
        AdminDAO adminDao = new AdminDAO();

        if (checkDauVaoKhachHang(khachHang, true)) {
            khachHang.setPass(getMd5(khachHang.getPass()));
            String query = "SELECT Id FROM account ORDER BY Id ASC";
            ResultSet rs = adminDao.connection.getStatement().executeQuery(query);

            while (rs.next()) {
                khachHang.setId(rs.getInt(1)); // lay Id moi nhat
            }

            adminDao.connection.getStatement().executeUpdate("ALTER TABLE account AUTO_INCREMENT=" + khachHang.getId()); //Xu ly xoa khi co Auto_Increment

            khachHang.setId(khachHang.getId() + 1);

            arrayList_KhachHang.add(khachHang);

            adminDao.themKhachHangVaoDatabase();

            JOptionPane.showMessageDialog(null, "Thêm tài khoản khách hàng thành công !");

        }
    }

    public void suaNhanVien(int row, NhanVienDTO nhanVien, JTextField txTaiKhoan) {
        AdminDAO adminDao = new AdminDAO();
        NhanVienDTO nhanVienTemp = arrayList_NhanVien.get(row);
        boolean check = true;

        if (!nhanVien.getUser().equals(nhanVienTemp.getUser())) {
            JOptionPane.showMessageDialog(null, "Không được sửa tên tài khoản !");
            txTaiKhoan.setText(nhanVienTemp.getUser());
            check = false;
        }

        if (check && checkDauVaoNhanVien(nhanVien, false)) {
            nhanVien.setPass(getMd5(nhanVien.getPass())); //update pass MD5
            arrayList_NhanVien.set(row, nhanVien);
            adminDao.suaNhanVienTrenDatabase(row);
            JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên thành công");
        }
    }

    public void suaKhachHang(int row, KhachHangDTO khachHang, JTextField txTaiKhoan) {
        AdminDAO adminDao = new AdminDAO();
        KhachHangDTO khachHangTemp = arrayList_KhachHang.get(row);
        boolean check = true;

        if (!khachHang.getUser().equals(khachHangTemp.getUser())) {
            JOptionPane.showMessageDialog(null, "Không được sửa tên tài khoản !");
            txTaiKhoan.setText(khachHangTemp.getUser());
            check = false;
        }

        if (check && checkDauVaoKhachHang(khachHang, false)) {
            khachHang.setPass(getMd5(khachHang.getPass()));
            arrayList_KhachHang.set(row, khachHang);
            adminDao.suaKhachHangTrenDatabase(row);
            JOptionPane.showMessageDialog(null, "Sửa thông tin nhân viên thành công");
        }
    }

    public void xoaNhanVien(int row) {
        AdminDAO adminDao = new AdminDAO();

        adminDao.xoaNhanVienTrenDatabase(row);
        arrayList_NhanVien.get(row).setTinhTrangHoatDong("0");
    }

    public void xoaSach(int row) {
        AdminDAO adminDao = new AdminDAO();

        adminDao.xoaSachTrenDatabase(row);
        arrayList_Sach.get(row).setTinhTrang("Ngưng bán");
    }

    public void xoaKhachHang(int row) {
        AdminDAO adminDao = new AdminDAO();

        adminDao.xoaKhachHangTrenDatabase(row);
        arrayList_KhachHang.get(row).setTinhTrangHoatDong("0");
    }

    public AdminDTO thongTinAdmin() {
        AdminDTO admin = new AdminDTO();

        for (int i = 0; i < arrayList_Admin.size(); i++) {
            admin = arrayList_Admin.get(i);

            if (idHienHanh == admin.getId()) {
                return admin;
            }
        }

        return admin;
    }

    public DefaultTableModel timMaNhanVien(String maNhanVien) {
        boolean check = false;
        DefaultTableModel modelMaNhanVien = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);

            if (String.valueOf(nhanVien.getId()).indexOf(maNhanVien) != -1) {
                addKetQuaNhanVienTimVaoModel(nhanVien, modelMaNhanVien);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelMaNhanVien;
    }

    public DefaultTableModel timTenNhanVien(String tenNhanVien) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        tenNhanVien = tenNhanVien.toLowerCase();

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);
            String tenNhanVienTemp = nhanVien.getTen().toLowerCase();

            if (tenNhanVienTemp.indexOf(tenNhanVien) != -1) {
                addKetQuaNhanVienTimVaoModel(nhanVien, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timHoLotNhanVien(String hoLotNhanVien) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        hoLotNhanVien = hoLotNhanVien.toLowerCase();

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);
            String hoLotNhanVienTemp = nhanVien.getHoLot().toLowerCase();

            if (hoLotNhanVienTemp.indexOf(hoLotNhanVien) != -1) {
                addKetQuaNhanVienTimVaoModel(nhanVien, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timUserNhanVien(String UserNhanVien) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        UserNhanVien = UserNhanVien.toLowerCase();

        for (int i = 0; i < arrayList_NhanVien.size(); i++) {
            NhanVienDTO nhanVien = arrayList_NhanVien.get(i);
            String userNhanVienTemp = nhanVien.getUser().toLowerCase();

            if (userNhanVienTemp.indexOf(UserNhanVien) != -1) {
                addKetQuaNhanVienTimVaoModel(nhanVien, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timMaKhachHang(String maKhachHang) {
        boolean check = false;
        DefaultTableModel modelMaKhachHang = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);

            if (String.valueOf(khachHang.getId()).indexOf(maKhachHang) != -1) {
                addKetQuaKhachHangTimVaoModel(khachHang, modelMaKhachHang);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelMaKhachHang;
    }

    public DefaultTableModel timTenKhachHang(String tenKhachHang) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        tenKhachHang = tenKhachHang.toLowerCase();

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);
            String tenNhanVienTemp = khachHang.getTen().toLowerCase();

            if (tenNhanVienTemp.indexOf(tenKhachHang) != -1) {
                addKetQuaKhachHangTimVaoModel(khachHang, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timHoLotKhachHang(String hoLotKhachHang) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        hoLotKhachHang = hoLotKhachHang.toLowerCase();

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);
            String hoLotNhanVienTemp = khachHang.getHoLot().toLowerCase();

            if (hoLotNhanVienTemp.indexOf(hoLotKhachHang) != -1) {
                addKetQuaKhachHangTimVaoModel(khachHang, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timUserKhachHang(String UserKhachHang) {
        boolean check = false;
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        UserKhachHang = UserKhachHang.toLowerCase();

        for (int i = 0; i < arrayList_KhachHang.size(); i++) {
            KhachHangDTO khachHang = arrayList_KhachHang.get(i);
            String userNhanVienTemp = khachHang.getUser().toLowerCase();

            if (userNhanVienTemp.indexOf(UserKhachHang) != -1) {
                addKetQuaKhachHangTimVaoModel(khachHang, modelTemp);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTemp;
    }

    public DefaultTableModel timKiem(JComboBox cbTimKiem, JTextField txTimKiem) {
        NhanVienBUS nhanVienBus = new NhanVienBUS();
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu"}, 0);
        switch ((String) cbTimKiem.getSelectedItem()) {
            case "Mã nhân viên": {
                return timMaNhanVien(txTimKiem.getText());
            }

            case "Tên nhân viên": {
                return timTenNhanVien(txTimKiem.getText());
            }

            case "Họ lót nhân viên": {
                return timHoLotNhanVien(txTimKiem.getText());
            }

            case "Tài khoản nhân viên": {
                return timUserNhanVien(txTimKiem.getText());
            }

            case "Mã khách hàng": {
                return timMaKhachHang(txTimKiem.getText());
            }

            case "Tên khách hàng": {
                return timTenKhachHang(txTimKiem.getText());
            }

            case "Họ lót khách hàng": {
                return timHoLotKhachHang(txTimKiem.getText());
            }

            case "Tài khoản khách hàng": {
                return timUserKhachHang(txTimKiem.getText());
            }

            default: {
                break;
            }
        }

        return modelTemp;
    }

    private void addKetQuaNhanVienTimVaoModel(NhanVienDTO nhanVien, DefaultTableModel model) {
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

        model.addRow(record);
    }

    private void addKetQuaKhachHangTimVaoModel(KhachHangDTO khachHang, DefaultTableModel model) {
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

        model.addRow(record);
    }

    public DefaultTableModel sortNameNhanVien() {
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        ArrayList<NhanVienDTO> arrayListTemp = arrayList_NhanVien;

        for (int i = 0; i < arrayListTemp.size() - 1; i++) {
            for (int j = i + 1; j < arrayListTemp.size(); j++) {
                if (arrayListTemp.get(i).getTen().compareTo(arrayListTemp.get(j).getTen()) > 0) {
                    NhanVienDTO nhanVienI = arrayListTemp.get(i);
                    NhanVienDTO nhanVienJ = arrayListTemp.get(j);

                    arrayListTemp.set(i, nhanVienJ);
                    arrayListTemp.set(j, nhanVienI);

                }
            }
        }

        for (int i = 0; i < arrayListTemp.size(); i++) {
            NhanVienDTO nhanVien = arrayListTemp.get(i);
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

            modelTemp.addRow(record);
        }

        return modelTemp;
    }

    public DefaultTableModel sortNameKhachHang() {
        DefaultTableModel modelTemp = new DefaultTableModel(new String[]{"Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu","Tình trạng hoạt động"}, 0);
        ArrayList<KhachHangDTO> arrayListTemp = arrayList_KhachHang;

        for (int i = 0; i < arrayListTemp.size() - 1; i++) {
            for (int j = i + 1; j < arrayListTemp.size(); j++) {
                if (arrayListTemp.get(i).getTen().compareTo(arrayListTemp.get(j).getTen()) > 0) {
                    KhachHangDTO khachHangI = arrayListTemp.get(i);
                    KhachHangDTO khachHangJ = arrayListTemp.get(j);

                    arrayListTemp.set(i, khachHangJ);
                    arrayListTemp.set(j, khachHangI);

                }
            }
        }

        for (int i = 0; i < arrayListTemp.size(); i++) {
            KhachHangDTO nhanVien = arrayListTemp.get(i);
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

            modelTemp.addRow(record);
        }

        return modelTemp;
    }

    public void suaSach(int row, SachDTO sach) {
        AdminDAO adminDao = new AdminDAO();

        arrayList_Sach.set(row, sach);
        adminDao.suaSachTrenDatabase(sach);

    }

    public int timMaLoaiSach(JComboBox combo) {
        int maLoaiSach = 0;

        for (int i = 0; i < arrayList_LoaiSach.size(); i++) {
            LoaiSachDTO loaiSach = arrayList_LoaiSach.get(i);

            if (combo.getSelectedItem().equals(loaiSach.getTenLoai())) {
                return loaiSach.getMaLoai();
            }
        }

        return maLoaiSach;
    }

    public int timMaTacGia(JComboBox combo) {
        int maTacGia = 0;

        for (int i = 0; i < arrayList_TacGia.size(); i++) {
            TacGiaDTO tacGia = arrayList_TacGia.get(i);
            String tenDayDuTacGia = tacGia.getHoLotTacGia() + " " + tacGia.getTenTacGia();

            if (combo.getSelectedItem().equals(tenDayDuTacGia)) {
                return tacGia.getMaTacGia();
            }
        }

        return maTacGia;
    }

    public int timMaNhaXuatBan(JComboBox combo) {
        int maNhaXuatBan = 0;

        for (int i = 0; i < arrayList_NhaXuatBan.size(); i++) {
            NhaXuatBanDTO nhaXuatBan = arrayList_NhaXuatBan.get(i);

            if (combo.getSelectedItem().equals(nhaXuatBan.getTenNhaXuatBan())) {
                return nhaXuatBan.getmaNXB();
            }
        }

        return maNhaXuatBan;
    }

    public DefaultTableModel hienThiQuanLySanPhamAdmin() throws SQLException {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá","Tình trạng"}, 0);
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

            record.add(sach.getSoLuong());
            record.add(String.format("%,d", sach.getDonGia()));
            record.add(sach.getTinhTrang());

            modelTemp.addRow(record);

        }

        return modelTemp;
    }

    public DefaultTableModel hienThiHoTro() throws SQLException {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", " Họ tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
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

            Vector record = new Vector();

            record.add(sach.getMaSach());
            record.add(sach.getTenSach());
            for (int j = 0; j < arrayList_TacGia.size(); j++) {
                TacGiaDTO tacGia = arrayList_TacGia.get(j);

                if (sach.getMaTacGia() == tacGia.getMaTacGia()) {

                    record.add(tacGia.getHoLotTacGia());
                    record.add(tacGia.getTenTacGia());
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

            record.add(sach.getSoLuong());
            record.add(String.format("%,d", sach.getDonGia()));

            modelTemp.addRow(record);

        }

        return modelTemp;
    }

    public DefaultTableModel timTenSachQLSP(String tenSach) {
        boolean check = false;
        DefaultTableModel modelTenSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá","Tình trạng"}, 0);
        tenSach = tenSach.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);
            String tenSachTemp = sach.getTenSach().toLowerCase();

            if (tenSachTemp.indexOf(tenSach) != -1) {
                addKetQuaTimVaoModel(sach, modelTenSach);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenSach;
    }

    public DefaultTableModel timTenSachHoTro(String tenSach) {
        boolean check = false;
        DefaultTableModel modelTenSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Họ Lót tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
        tenSach = tenSach.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);
            String tenSachTemp = sach.getTenSach().toLowerCase();

            if (tenSachTemp.indexOf(tenSach) != -1) {
                addKetQuaTimVaoModelHoTro(sach, modelTenSach);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenSach;
    }

    public DefaultTableModel timTenLoaiSachQLSP(String loaiSach) throws SQLException {
        boolean check = false;
        DefaultTableModel modelTenLoaiSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá","Tình trạng"}, 0);
        DefaultTableModel modelTemp = hienThiQuanLySanPhamAdmin();
        loaiSach = loaiSach.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            String loaiSachTemp = (String) modelTemp.getValueAt(i, 3);
            loaiSachTemp = loaiSachTemp.toLowerCase();

            if (loaiSachTemp.indexOf(loaiSach) != -1) {
                addKetQuaTimVaoModel(sach, modelTenLoaiSach);
                check = true;
            }

        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenLoaiSach;
    }

    public DefaultTableModel timTenLoaiSachHoTro(String loaiSach) throws SQLException {
        boolean check = false;
        DefaultTableModel modelTenLoaiSach = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Họ lót tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
        DefaultTableModel modelTemp = hienThiHoTro();
        loaiSach = loaiSach.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            String loaiSachTemp = (String) modelTemp.getValueAt(i, 3);
            loaiSachTemp = loaiSachTemp.toLowerCase();

            if (loaiSachTemp.indexOf(loaiSach) != -1) {
                addKetQuaTimVaoModelHoTro(sach, modelTenLoaiSach);
                check = true;
            }

        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenLoaiSach;
    }

    public DefaultTableModel timTenTacGiaQLSP(String tenTacGia) throws SQLException {
        boolean check = false;
        DefaultTableModel modelTenTacGia = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá","Tình trạng"}, 0);
        DefaultTableModel modelTemp = hienThiQuanLySanPhamAdmin();
        tenTacGia = tenTacGia.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            String tenTacGiaTemp = (String) modelTemp.getValueAt(i, 2);
            tenTacGiaTemp = tenTacGiaTemp.toLowerCase();

            if (tenTacGiaTemp.indexOf(tenTacGia) != -1) {
                addKetQuaTimVaoModel(sach, modelTenTacGia);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenTacGia;
    }

    public DefaultTableModel timTenTacGiaHoTro(String tenTacGia) throws SQLException {
        boolean check = false;
        DefaultTableModel modelTenTacGia = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Họ lót tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
        DefaultTableModel modelTemp = hienThiHoTro();
        tenTacGia = tenTacGia.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            String tenTacGiaTemp = (String) modelTemp.getValueAt(i, 3);
            tenTacGiaTemp = tenTacGiaTemp.toLowerCase();

            if (tenTacGiaTemp.indexOf(tenTacGia) != -1) {
                addKetQuaTimVaoModelHoTro(sach, modelTenTacGia);
                check = true;
            }
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, "Không có kết quả nào được tìm thấy");
        }

        return modelTenTacGia;
    }

    public DefaultTableModel timHoLotTacGiaHoTro(String hoLotTacGia) throws SQLException {
        boolean check = false;
        DefaultTableModel modelTenTacGia = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Họ lót tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
        DefaultTableModel modelTemp = hienThiHoTro();
        hoLotTacGia = hoLotTacGia.toLowerCase();

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            String hoLotTacGiaTemp = (String) modelTemp.getValueAt(i, 2);
            hoLotTacGiaTemp = hoLotTacGiaTemp.toLowerCase();

            if (hoLotTacGiaTemp.indexOf(hoLotTacGia) != -1) {
                addKetQuaTimVaoModelHoTro(sach, modelTenTacGia);
                check = true;
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
        record.add(sach.getSoLuong());
        record.add(String.format("%,d", sach.getDonGia()));
        record.add(sach.getTinhTrang());

        model.addRow(record);
    }

    private void addKetQuaTimVaoModelHoTro(SachDTO sach, DefaultTableModel model) {
        Vector record = new Vector();

        record.add(sach.getMaSach());
        record.add(sach.getTenSach());
        for (int j = 0; j < arrayList_TacGia.size(); j++) {
            TacGiaDTO tacGia = arrayList_TacGia.get(j);

            if (sach.getMaTacGia() == tacGia.getMaTacGia()) {

                record.add(tacGia.getHoLotTacGia());
                record.add(tacGia.getTenTacGia());
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
        record.add(sach.getSoLuong());
        record.add(String.format("%,d", sach.getDonGia()));

        model.addRow(record);
    }

    public void timKiemQuanLySach(JComboBox cbTimKiem, JTable tableSanPhamSach, JTextField txTimKiem) throws SQLException {
        switch ((String) cbTimKiem.getSelectedItem()) {
            case "Tên sách": {
                tableSanPhamSach.setModel(timTenSachQLSP(txTimKiem.getText()));
                break;
            }
            case "Loại sách": {
                tableSanPhamSach.setModel(timTenLoaiSachQLSP(txTimKiem.getText()));
                break;
            }
            case "Tên tác giả": {
                tableSanPhamSach.setModel(timTenTacGiaQLSP(txTimKiem.getText()));
                break;
            }
            default: {
                break;
            }
        }

    }

    public void timKiemHoTro(JComboBox cbTimKiem, JTable tableSanPhamSach, JTextField txTimKiem) throws SQLException {
        switch (cbTimKiem.getSelectedIndex()) {
            case 0: {
                tableSanPhamSach.setModel(timTenSachHoTro(txTimKiem.getText()));
                break;
            }
            case 3: {
                tableSanPhamSach.setModel(timTenLoaiSachHoTro(txTimKiem.getText()));
                break;
            }
            case 1: {
                tableSanPhamSach.setModel(timHoLotTacGiaHoTro(txTimKiem.getText()));
                break;
            }

            case 2: {
                tableSanPhamSach.setModel(timTenTacGiaHoTro(txTimKiem.getText()));
                break;
            }
            default: {
                break;
            }
        }

    }

    public DefaultTableModel timLoaiSachQLSP(int maLoai) {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá","Tình trạng"}, 0);

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

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

                record.add(sach.getSoLuong());
                record.add(String.format("%,d", sach.getDonGia()));
                record.add(sach.getTinhTrang());

                modelTemp.addRow(record);
            }
        }

        return modelTemp;
    }

    public DefaultTableModel timLoaiSachHoTro(int maLoai) {
        DefaultTableModel modelTemp = new DefaultTableModel(new Object[]{"Mã sách", "Tên sách", "Họ lót tác giả", "Tên tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);

        for (int i = 0; i < arrayList_Sach.size(); i++) {
            SachDTO sach = arrayList_Sach.get(i);

            if (sach.getMaLoai() == maLoai) {

                Vector record = new Vector();

                record.add(sach.getMaSach());
                record.add(sach.getTenSach());
                for (int j = 0; j < arrayList_TacGia.size(); j++) {
                    TacGiaDTO tacGia = arrayList_TacGia.get(j);

                    if (sach.getMaTacGia() == tacGia.getMaTacGia()) {

                        record.add(tacGia.getHoLotTacGia());
                        record.add(tacGia.getTenTacGia());
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

                record.add(sach.getSoLuong());
                record.add(String.format("%,d", sach.getDonGia()));

                modelTemp.addRow(record);
            }
        }

        return modelTemp;
    }

    public void hienThiLoaiSachQLSP(JTable tbSanPhamSach, JComboBox cbLoaiSach) {
        switch ((String) cbLoaiSach.getSelectedItem()) {
            case "Tất cả": {
                try {
                    tbSanPhamSach.setModel(hienThiQuanLySanPhamAdmin());
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            case "Tiểu thuyết": {
                tbSanPhamSach.setModel(timLoaiSachQLSP(2));
                break;
            }
            case "Giáo trình": {
                tbSanPhamSach.setModel(timLoaiSachQLSP(3));
                break;
            }
            case "Kĩ năng sống": {
                tbSanPhamSach.setModel(timLoaiSachQLSP(4));
                break;
            }
            case "Văn học": {
                tbSanPhamSach.setModel(timLoaiSachQLSP(5));
                break;
            }
            case "Tâm lí": {
                tbSanPhamSach.setModel(timLoaiSachQLSP(6));
                break;
            }
            default:
                break;
        }

    }

    public void hienThiLoaiSachHoTro(JTable tbSanPhamSach, JComboBox cbLoaiSach) {
        switch ((String) cbLoaiSach.getSelectedItem()) {
            case "Tất cả": {
                try {
                    tbSanPhamSach.setModel(hienThiHoTro());
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            case "Tiểu thuyết": {
                tbSanPhamSach.setModel(timLoaiSachHoTro(2));
                break;
            }
            case "Giáo trình": {
                tbSanPhamSach.setModel(timLoaiSachHoTro(3));
                break;
            }
            case "Kĩ năng sống": {
                tbSanPhamSach.setModel(timLoaiSachHoTro(4));
                break;
            }
            case "Văn học": {
                tbSanPhamSach.setModel(timLoaiSachHoTro(5));
                break;
            }
            case "Tâm lí": {
                tbSanPhamSach.setModel(timLoaiSachHoTro(6));
                break;
            }
            default:
                break;
        }

    }

    public DefaultTableModel thongKeTenSach(String tenSach, JTextField txDoanhThu) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        String tenSachTemp = tenSach.toLowerCase();
        int thanhTien = 0;
        int k = -1;

        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);

            for (int j = 0; j < arrayList_ChiTietHoaDonALL.size(); j++) {
                ChiTietHoaDonDTO chiTietHoaDon = arrayList_ChiTietHoaDonALL.get(j);
                String tenChiTietTemp = chiTietHoaDon.getTenSach().toLowerCase();

                if (chiTietHoaDon.getMaHoaDon() == hoaDon.getMaHoaDon()) {
                    if (tenChiTietTemp.indexOf(tenSachTemp) != -1) {

                        if (k == -1) { //add vao model ket qua dau tien tim duoc,nhu khoi tao dong dau tien cho model tranh null
                            Vector record = new Vector();

                            record.add(hoaDon.getMaHoaDon());
                            record.add(hoaDon.getMaKhachHang());
                            record.add(hoaDon.getMaNhanVien());
                            record.add(hoaDon.getNgayMua());
                            record.add(String.format("%,d", hoaDon.getTongTien()));
                            record.add(hoaDon.getTinhTrang());

                            model.addRow(record);

                            thanhTien += chiTietHoaDon.getThanhTien();

                            k++;
                            continue; //continue de khong chay tiep dieu kien ben duoi,tranh sai.Khoi tao xong thi quay len lien
                        }
                        if ((int) model.getValueAt(k, 0) != hoaDon.getMaHoaDon()) {
                            Vector record = new Vector();

                            record.add(hoaDon.getMaHoaDon());
                            record.add(hoaDon.getMaKhachHang());
                            record.add(hoaDon.getMaNhanVien());
                            record.add(hoaDon.getNgayMua());
                            record.add(String.format("%,d", hoaDon.getTongTien()));
                            record.add(hoaDon.getTinhTrang());

                            model.addRow(record);

                            thanhTien += chiTietHoaDon.getThanhTien();

                            k++;
                        } else { // khong add hoa don trung thi van phai cong tien chi tiet hoa don
                            thanhTien += chiTietHoaDon.getThanhTien();
                        }

                    }
                }
            }

            txDoanhThu.setText(String.format("%,d", thanhTien));

        }
        return model;

    }

    public DefaultTableModel thongKeNgayADenB(String ngayA, String ngayB, JTextField txDoanhThu) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"}, 0);
        int thanhTien = 0;

        for (int i = 0; i < arrayList_HoaDonALL.size(); i++) {
            HoaDonDTO hoaDon = arrayList_HoaDonALL.get(i);

            if (hoaDon.getNgayMua().compareTo(ngayA) >= 0 && hoaDon.getNgayMua().compareTo(ngayB) <= 0) {
                Vector record = new Vector();

                record.add(hoaDon.getMaHoaDon());
                record.add(hoaDon.getMaKhachHang());
                record.add(hoaDon.getMaNhanVien());
                record.add(hoaDon.getNgayMua());
                record.add(String.format("%,d", hoaDon.getTongTien()));
                record.add(hoaDon.getTinhTrang());

                model.addRow(record);

                thanhTien += hoaDon.getTongTien();
            }

        }

        txDoanhThu.setText(String.format("%,d", thanhTien));

        return model;
    }

    public String thongKeTatCa(TableModel model) {
        SachBUS sachBus = new SachBUS();
        int doanhThu = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            doanhThu += Integer.parseInt(sachBus.removeThousandSeparators((String) model.getValueAt(i, 4)));
        }

        return String.format("%,d", doanhThu);
    }

    public boolean checkHoTen(String s) {
        if (s.matches("^[a-zA-Z\\p{L}\\p{M}\\s]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSDT(String s) {
        if (s.matches("^[0-9]{10,11}+$")) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkNam(String s) {
        if (s.matches("^[0-9]+$")) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkNgaySinh(String s) {
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        Date dayNow = Calendar.getInstance().getTime();
        if (s.matches("^([0-9][0-9])?[0-9][0-9]-(0[0-9]||1[0-2])-([0-2][0-9]||3[0-1])$") && s.compareTo(hoaDonBus.formatStringyyyy(dayNow)) <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTaiKhoan(String s) {
        if (s.matches("^[a-z0-9]*$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMatKhau(String s) {
        if (s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDauVaoNhanVien(NhanVienDTO nhanVien, boolean checkUserTonTai) {
        if (nhanVien.getTen().equals("") || nhanVien.getHoLot().equals("") || nhanVien.getUser().equals("") || nhanVien.getPass().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ các thông tin bắt buộc");
            return false;
        } else if (checkHoTen(nhanVien.getTen()) && checkHoTen(nhanVien.getHoLot())) {
            if (checkNgaySinh(nhanVien.getNgaySinh())) {
                if (checkSDT(nhanVien.getSoDienThoai())) {
                    if (checkTaiKhoan(nhanVien.getUser())) {
                        if (checkUserTonTai) {
                            for (int i = 0; i < arrayList_NhanVien.size(); i++) {
                                NhanVienDTO nhanVienTemp = arrayList_NhanVien.get(i);
                                if (nhanVien.getUser().equals(nhanVienTemp.getUser())) {
                                    JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                                    return false;
                                }
                            }

                            if (checkMatKhau(nhanVien.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        } else {
                            if (checkMatKhau(nhanVien.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tài khoản chỉ bao gồm chữ cái thường và số");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Số điện thoại có 10-11 số chỉ bao gồm các số từ 0-9");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ ! Nhập ngày sinh theo định dạng yyyy-mm-dd (VD: 2001-12-30)");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Họ và tên chỉ bao gồm chữ");
            return false;
        }

    }

    public boolean checkDauVaoKhachHang(KhachHangDTO khachHang, boolean checkUserTonTai) {
        if (khachHang.getTen().equals("") || khachHang.getHoLot().equals("") || khachHang.getUser().equals("") || khachHang.getPass().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ các thông tin bắt buộc");
            return false;
        } else if (checkHoTen(khachHang.getTen()) && checkHoTen(khachHang.getHoLot())) {
            if (checkNgaySinh(khachHang.getNgaySinh())) {
                if (checkSDT(khachHang.getSoDienThoai())) {
                    if (checkTaiKhoan(khachHang.getUser())) {
                        if (checkUserTonTai) {
                            for (int i = 0; i < arrayList_KhachHang.size(); i++) {
                                KhachHangDTO khachHangTemp = arrayList_KhachHang.get(i);
                                if (khachHang.getUser().equals(khachHangTemp.getUser())) {
                                    JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                                    return false;
                                }
                            }

                            if (checkMatKhau(khachHang.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        } else {
                            if (checkMatKhau(khachHang.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tài khoản chỉ bao gồm chữ cái thường và số");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Số điện thoại có 10-11 số chỉ bao gồm các số từ 0-9");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ ! Nhập ngày sinh theo định dạng yyyy-mm-dd (VD: 2000-12-23)");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Họ và tên chỉ bao gồm chữ");
            return false;
        }
    }

    public boolean checkDauVaoDangKy(KhachHangDTO khachHang, boolean checkUserTonTai) {
        if (khachHang.getTen().equals("") || khachHang.getHoLot().equals("") || khachHang.getUser().equals("") || khachHang.getPass().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ các thông tin bắt buộc");
            return false;
        } else if (checkHoTen(khachHang.getTen()) && checkHoTen(khachHang.getHoLot())) {
            if (checkNgaySinh(khachHang.getNgaySinh())) {
                if (checkSDT(khachHang.getSoDienThoai())) {
                    if (checkTaiKhoan(khachHang.getUser())) {
                        if (checkUserTonTai) {
                            for (int i = 0; i < arrayList_KhachHang.size(); i++) {
                                KhachHangDTO khachHangTemp = arrayList_KhachHang.get(i);
                                if (khachHang.getUser().equals(khachHangTemp.getUser())) {
                                    JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                                    return false;
                                }
                            }

                            for (int i = 0; i < arrayList_NhanVien.size(); i++) {
                                NhanVienDTO nhanVienTemp = arrayList_NhanVien.get(i);
                                if (khachHang.getUser().equals(nhanVienTemp.getUser())) {
                                    JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                                    return false;
                                }
                            }

                            for (int i = 0; i < arrayList_Admin.size(); i++) {
                                AdminDTO adminTemp = arrayList_Admin.get(i);
                                if (khachHang.getUser().equals(adminTemp.getUser())) {
                                    JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                                    return false;
                                }
                            }

                            if (checkMatKhau(khachHang.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        } else {
                            if (checkMatKhau(khachHang.getPass())) {
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Mật khẩu tối thiểu phải 8 ký tự,không có khoảng trắng,chữ có dấu và bao gồm ít nhất 1 chữ thường,1 chữ hoa và 1 số ");
                                return false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tài khoản chỉ bao gồm chữ cái thường và số");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Số điện thoại có 10-11 số chỉ bao gồm các số từ 0-9");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ ! Nhập ngày sinh theo định dạng yyyy-mm-dd (VD: 2021-12-25)");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Họ và tên chỉ bao gồm chữ");
            return false;
        }
    }

    public static String getMd5(String input) {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        AdminBUS admin = new AdminBUS();
        System.out.println(admin.getMd5("truongnhatvY0"));
    }
}
