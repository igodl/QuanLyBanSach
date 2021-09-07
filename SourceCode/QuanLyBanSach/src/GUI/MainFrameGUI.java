/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.AdminBUS;
import static BUS.AdminBUS.arrayList_Admin;
import static BUS.AdminBUS.getMd5;
import BUS.ChiTietHoaDonBUS;
import static BUS.ChiTietHoaDonBUS.arrayList_ChiTietHoaDon;
import static BUS.ChiTietHoaDonBUS.arrayList_ChiTietHoaDonALL;
import BUS.ChiTietPhieuNhapBUS;
import static BUS.ChiTietPhieuNhapBUS.arrayList_ChiTietPhieuNhap;
import BUS.HoaDonBUS;
import static BUS.HoaDonBUS.arrayList_HoaDon;
import static BUS.HoaDonBUS.arrayList_HoaDonALL;
import BUS.Itext;
import BUS.KhachHangBUS;
import static BUS.KhachHangBUS.arrayList_KhachHang;
import BUS.LoaiSachBUS;
import BUS.NhaCungCapBUS;
import BUS.NhaXuatBanBUS;
import BUS.NhanVienBUS;
import static BUS.NhanVienBUS.arrayList_NhanVien;
import BUS.PhieuNhapBUS;
import static BUS.PhieuNhapBUS.arrayList_PhieuNhap;
import BUS.SachBUS;
import static BUS.SachBUS.arrayList_Sach;
import BUS.TacGiaBUS;
import DAO.SachDAO;
import DTO.AdminDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.SachDTO;
import static GUI.LoginGUI.idHienHanh;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainFrameGUI extends javax.swing.JFrame {

    DefaultTableModel modelGioHang = new DefaultTableModel(new String[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);
    DefaultTableModel modelNhapKho = new DefaultTableModel(new String[]{"Tên sách", "Loại sách", "Họ tác giả", "Tên tác giả", "Nhà xuất bản", "Ngày xuất bản", "Số lượng", "Đơn giá"}, 0);

    CardLayout cardLayout;

    public MainFrameGUI() throws SQLException {
        initComponents();
        cardLayout = (CardLayout) panelTacVu.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        btgThongKe = new javax.swing.ButtonGroup();
        btgLocHoaDon = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        panelMain = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelMenuKhachHang = new javax.swing.JPanel();
        lbAvatarKhachHang = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbIconKhachHang = new javax.swing.JLabel();
        lbKhachHang = new javax.swing.JLabel();
        btTrangChu1 = new javax.swing.JPanel();
        lbIconHome1 = new javax.swing.JLabel();
        lbTrangChu1 = new javax.swing.JLabel();
        btGioHang = new javax.swing.JPanel();
        lbIConCart = new javax.swing.JLabel();
        lbGioHang = new javax.swing.JLabel();
        btHoaDon = new javax.swing.JPanel();
        lbIconBill = new javax.swing.JLabel();
        lbHoaDon = new javax.swing.JLabel();
        btThongTInCaNhan2 = new javax.swing.JPanel();
        lbIconUserFolder = new javax.swing.JLabel();
        lbThongTinCaNhan1 = new javax.swing.JLabel();
        btDangXuat = new javax.swing.JPanel();
        lbIconLogOut = new javax.swing.JLabel();
        lbDangXuat = new javax.swing.JLabel();
        btSanPhamSach = new javax.swing.JPanel();
        lbIconBook = new javax.swing.JLabel();
        lbSanPhamSach = new javax.swing.JLabel();
        panelMenuNhanVien = new javax.swing.JPanel();
        lbAvatarNhanVien = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        lbIconNhanVien = new javax.swing.JLabel();
        lbNhanVien = new javax.swing.JLabel();
        btTrangChu2 = new javax.swing.JPanel();
        lbIconHome2 = new javax.swing.JLabel();
        lbTrangChu2 = new javax.swing.JLabel();
        btQuanLySanPham1 = new javax.swing.JPanel();
        lbIconBook1 = new javax.swing.JLabel();
        lbQuanLySanPham1 = new javax.swing.JLabel();
        btXuLyHoaDon = new javax.swing.JPanel();
        lbIconServices = new javax.swing.JLabel();
        lbXuLyHoaDon = new javax.swing.JLabel();
        btDangXuat1 = new javax.swing.JPanel();
        lbIconLogOut2 = new javax.swing.JLabel();
        lbDangXuat2 = new javax.swing.JLabel();
        btThongTinCaNhan1 = new javax.swing.JPanel();
        lbIconServices1 = new javax.swing.JLabel();
        lbXuLyHoaDon1 = new javax.swing.JLabel();
        btNhapKho3 = new javax.swing.JPanel();
        lbIConCart6 = new javax.swing.JLabel();
        lbQuanLyHoaDon5 = new javax.swing.JLabel();
        panelMenuAdmin = new javax.swing.JPanel();
        lbAvatarAdmin = new javax.swing.JLabel();
        lbTenAdmin = new javax.swing.JLabel();
        lbIconAdmin = new javax.swing.JLabel();
        lbAdmin = new javax.swing.JLabel();
        btQuanLySanPham2 = new javax.swing.JPanel();
        lbIconQuanLySanPham2 = new javax.swing.JLabel();
        lbQuanLySanPham2 = new javax.swing.JLabel();
        btQuanLyNhanVien = new javax.swing.JPanel();
        lbIconBook2 = new javax.swing.JLabel();
        lbQuanLyNhanVien = new javax.swing.JLabel();
        btQuanLyKhachHang = new javax.swing.JPanel();
        lbIconSale1 = new javax.swing.JLabel();
        lbQuanLyKhachHang = new javax.swing.JLabel();
        btNhapKho = new javax.swing.JPanel();
        lbIConCart1 = new javax.swing.JLabel();
        lbQuanLyHoaDon = new javax.swing.JLabel();
        btThongKeDoanhThu = new javax.swing.JPanel();
        lbIconBill1 = new javax.swing.JLabel();
        lbThongKeDoanhThu = new javax.swing.JLabel();
        btDangXuat3 = new javax.swing.JPanel();
        lbIconLogOut3 = new javax.swing.JLabel();
        lbDangXuat3 = new javax.swing.JLabel();
        btQuanLyHoaDon = new javax.swing.JPanel();
        lbIConCart2 = new javax.swing.JLabel();
        lbQuanLyHoaDon1 = new javax.swing.JLabel();
        btQuanLyNhapKho = new javax.swing.JPanel();
        lbIConCart3 = new javax.swing.JLabel();
        lbQuanLyHoaDon2 = new javax.swing.JLabel();
        panelTacVu = new javax.swing.JPanel();
        panelTrangChu = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        lbBgTrangChu = new javax.swing.JLabel();
        panelSanPhamSach = new javax.swing.JPanel();
        lbLoaiSach = new javax.swing.JLabel();
        txLoaiSach = new javax.swing.JTextField();
        txTenSach = new javax.swing.JTextField();
        lbTenSach = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        txDonGia = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        lbTacGia = new javax.swing.JLabel();
        txTacGia = new javax.swing.JTextField();
        btThemGioHang = new javax.swing.JButton();
        lbAnhSach = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPhamSach = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        spinSoLuong = new javax.swing.JSpinner();
        lbTimKiem1 = new javax.swing.JLabel();
        cbTimKiem1 = new javax.swing.JComboBox<>();
        txTimKiem1 = new javax.swing.JTextField();
        btTim1 = new javax.swing.JButton();
        cbLoaiSach = new javax.swing.JComboBox<>();
        lbMaSach = new javax.swing.JLabel();
        txMaSach = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panelThongTinCaNhanKhachHang = new javax.swing.JPanel();
        lbMatKhau = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        lbThongTinCaNhan = new javax.swing.JLabel();
        txHoLot = new javax.swing.JTextField();
        txSoDienThoai = new javax.swing.JTextField();
        txNgaySinh = new javax.swing.JTextField();
        btSuaThongTin = new javax.swing.JButton();
        lbHoLot = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        txMatKhau = new javax.swing.JPasswordField();
        cbHienMatKhau = new javax.swing.JCheckBox();
        lbXacNhanMatKhau = new javax.swing.JLabel();
        txXacNhanMatKhau = new javax.swing.JPasswordField();
        cbHienMatKhau1 = new javax.swing.JCheckBox();
        rbtNam = new javax.swing.JRadioButton();
        rbtNu = new javax.swing.JRadioButton();
        lbTen = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        panelGioHang = new javax.swing.JPanel();
        lbGioHangCuaBan = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        lbIconCart1 = new javax.swing.JLabel();
        lbThanhTien = new javax.swing.JLabel();
        txThanhTien = new javax.swing.JTextField();
        btThanhToan = new javax.swing.JButton();
        lbTongTien = new javax.swing.JLabel();
        txTongTien = new javax.swing.JTextField();
        lbLoaiSach3 = new javax.swing.JLabel();
        txLoaiSach3 = new javax.swing.JTextField();
        lbTenSach2 = new javax.swing.JLabel();
        txTenSach2 = new javax.swing.JTextField();
        lbSoLuong2 = new javax.swing.JLabel();
        lbTacGia2 = new javax.swing.JLabel();
        txTacGia2 = new javax.swing.JTextField();
        txDonGia1 = new javax.swing.JTextField();
        lbDonGia1 = new javax.swing.JLabel();
        txSoLuong = new javax.swing.JTextField();
        btXoa = new javax.swing.JButton();
        panelHoaDon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        txMaHoaDon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNgayMua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txMaKhachHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txMaNhanVien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txTongTien1 = new javax.swing.JTextField();
        lbIconHoaDon = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbChiTietHoaDon = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        lbChiTietHoaDon = new javax.swing.JLabel();
        lbHoaDonKhachHng = new javax.swing.JLabel();
        btInHoaDon = new javax.swing.JButton();
        panellQuanLyNhanVien = new javax.swing.JPanel();
        lbQuanLyNhanVien1 = new javax.swing.JLabel();
        lbMaNhanVien = new javax.swing.JLabel();
        lbHoLot1 = new javax.swing.JLabel();
        lbGioiTinh1 = new javax.swing.JLabel();
        lbNgaySinh1 = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JLabel();
        lbSoDienThoai1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbQuanLyNhanVien = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa1 = new javax.swing.JButton();
        btTimKiem = new javax.swing.JButton();
        txMaNhanVien1 = new javax.swing.JTextField();
        txHoLot1 = new javax.swing.JTextField();
        txSoDienThoai1 = new javax.swing.JTextField();
        txNgaySinh1 = new javax.swing.JTextField();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        txTaiKhoan = new javax.swing.JTextField();
        cbTimKiem = new javax.swing.JComboBox<>();
        lbMatKhau1 = new javax.swing.JLabel();
        txMatKhau1 = new javax.swing.JTextField();
        txTimKiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbTen1 = new javax.swing.JLabel();
        txTen1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txHoatDong = new javax.swing.JTextField();
        lbMatKhau4 = new javax.swing.JLabel();
        panelQuanLySanPham = new javax.swing.JPanel();
        lbQuanLySach = new javax.swing.JLabel();
        lbMasach = new javax.swing.JLabel();
        LbTensach = new javax.swing.JLabel();
        lbTacgia = new javax.swing.JLabel();
        lbDongia = new javax.swing.JLabel();
        txMaSach1 = new javax.swing.JTextField();
        txTenSach1 = new javax.swing.JTextField();
        txDonGia2 = new javax.swing.JTextField();
        cbTimKiem2 = new javax.swing.JComboBox<>();
        btSua1 = new javax.swing.JButton();
        btnTimkiem1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbQuanLySanPham = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        lbNhaxuatban = new javax.swing.JLabel();
        lbLoaisach = new javax.swing.JLabel();
        txTimKiem2 = new javax.swing.JTextField();
        cbLoaiSach1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbLoaiSach2 = new javax.swing.JComboBox<>();
        cbTacGia = new javax.swing.JComboBox<>();
        cbNhaXuatBan = new javax.swing.JComboBox<>();
        lbNgayXuatBan = new javax.swing.JLabel();
        txNgayXuatBan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txSoLuong1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btXoa3 = new javax.swing.JButton();
        lbMasach1 = new javax.swing.JLabel();
        txTinhTrang = new javax.swing.JTextField();
        btnNhapExcel = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        panelThongTinCaNhanNhanien = new javax.swing.JPanel();
        lbThongTinCaNhan2 = new javax.swing.JLabel();
        lbHoLot2 = new javax.swing.JLabel();
        txHoLot2 = new javax.swing.JTextField();
        lbTen2 = new javax.swing.JLabel();
        txTen2 = new javax.swing.JTextField();
        txUser1 = new javax.swing.JTextField();
        lbUser1 = new javax.swing.JLabel();
        lbMatKhau2 = new javax.swing.JLabel();
        txMatKhau2 = new javax.swing.JPasswordField();
        cbHienMatKhau2 = new javax.swing.JCheckBox();
        cbHienMatKhau3 = new javax.swing.JCheckBox();
        txXacNhanMatKhau1 = new javax.swing.JPasswordField();
        lbXacNhanMatKhau1 = new javax.swing.JLabel();
        lbGioiTinh2 = new javax.swing.JLabel();
        rbtNam1 = new javax.swing.JRadioButton();
        rbtNu1 = new javax.swing.JRadioButton();
        txSoDienThoai2 = new javax.swing.JTextField();
        lbSoDienThoai2 = new javax.swing.JLabel();
        lbNgaySinh2 = new javax.swing.JLabel();
        txNgaySinh3 = new javax.swing.JTextField();
        btSuaThongTin1 = new javax.swing.JButton();
        panellQuanLyKhachHang = new javax.swing.JPanel();
        lbQuanLyKhachHang1 = new javax.swing.JLabel();
        lbMaKhachHang1 = new javax.swing.JLabel();
        lbHoLot3 = new javax.swing.JLabel();
        lbGioiTinh3 = new javax.swing.JLabel();
        lbNgaySinh3 = new javax.swing.JLabel();
        lbTaiKhoan1 = new javax.swing.JLabel();
        lbSoDienThoai3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbQuanLyKhachHang = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        btThem1 = new javax.swing.JButton();
        btSua2 = new javax.swing.JButton();
        btXoa2 = new javax.swing.JButton();
        btTimKiem1 = new javax.swing.JButton();
        txMaKhachHang2 = new javax.swing.JTextField();
        txHoLot3 = new javax.swing.JTextField();
        txSoDienThoai3 = new javax.swing.JTextField();
        txNgaySinh2 = new javax.swing.JTextField();
        rbNam1 = new javax.swing.JRadioButton();
        rbNu1 = new javax.swing.JRadioButton();
        txTaiKhoan1 = new javax.swing.JTextField();
        cbTimKiem3 = new javax.swing.JComboBox<>();
        lbMatKhau3 = new javax.swing.JLabel();
        txMatKhau3 = new javax.swing.JTextField();
        txTimKiem3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbTen3 = new javax.swing.JLabel();
        txTen3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbMatKhau5 = new javax.swing.JLabel();
        txHoatDong1 = new javax.swing.JTextField();
        panelThongKe = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbHoaDon1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        jScrollPane9 = new javax.swing.JScrollPane();
        tbChiTietHoaDon1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        lbChiTietHoaDon1 = new javax.swing.JLabel();
        lbHoaDonKhachHng1 = new javax.swing.JLabel();
        txTenSach3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbQuy = new javax.swing.JComboBox<>();
        dcNgayA = new com.toedter.calendar.JDateChooser();
        dcNgayB = new com.toedter.calendar.JDateChooser();
        lbDoanhThu = new javax.swing.JLabel();
        txDoanhThu = new javax.swing.JTextField();
        btThongKe = new javax.swing.JButton();
        btThongKeTatCa = new javax.swing.JButton();
        cbTenSach = new javax.swing.JRadioButton();
        cbNgayADenB = new javax.swing.JRadioButton();
        cbTheoQuy = new javax.swing.JRadioButton();
        txNam = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        panelNhapKho = new javax.swing.JPanel();
        LbTensach1 = new javax.swing.JLabel();
        lbTacgia1 = new javax.swing.JLabel();
        lbDongia1 = new javax.swing.JLabel();
        txTenSach4 = new javax.swing.JTextField();
        txDonGia3 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        lbNhaxuatban1 = new javax.swing.JLabel();
        lbLoaisach1 = new javax.swing.JLabel();
        lbNgayXuatBan1 = new javax.swing.JLabel();
        txNgayXuatBan1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txSoLuong2 = new javax.swing.JTextField();
        txLoaiSach1 = new javax.swing.JTextField();
        txHoLotTacGia = new javax.swing.JTextField();
        txNhaXuatBan1 = new javax.swing.JTextField();
        lbHoaDonKhachHng2 = new javax.swing.JLabel();
        btThem2 = new javax.swing.JButton();
        lbThongTinCaNhan3 = new javax.swing.JLabel();
        btXoa4 = new javax.swing.JButton();
        lbTongTien1 = new javax.swing.JLabel();
        txTongTien4 = new javax.swing.JTextField();
        btThanhToan1 = new javax.swing.JButton();
        lbTacgia3 = new javax.swing.JLabel();
        txTenTacGia = new javax.swing.JTextField();
        cbNhaCungCap = new javax.swing.JComboBox<>();
        lbDongia2 = new javax.swing.JLabel();
        btBaCham1 = new javax.swing.JButton();
        btBaCham2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelQuanLyHoaDon = new javax.swing.JPanel();
        lbTimKiem2 = new javax.swing.JLabel();
        cbTimKiem4 = new javax.swing.JComboBox<>();
        txTimKiem4 = new javax.swing.JTextField();
        btTim2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txMaHoaDon1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txNgayMua1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txMaNhanVien2 = new javax.swing.JTextField();
        txMaKhachHang1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txTongTien2 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbHoaDon2 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        lbHoaDonKhachHng3 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbChiTietHoaDon2 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        lbChiTietHoaDon2 = new javax.swing.JLabel();
        rbTatCa = new javax.swing.JRadioButton();
        rbChuaXuLy = new javax.swing.JRadioButton();
        lbTimKiem3 = new javax.swing.JLabel();
        rbDaXuLy = new javax.swing.JRadioButton();
        panelQuanLyKho = new javax.swing.JPanel();
        LbTensach2 = new javax.swing.JLabel();
        lbTacgia2 = new javax.swing.JLabel();
        txMaPhieuNhap = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbPhieuNhap1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        lbLoaisach2 = new javax.swing.JLabel();
        txMaNhanVien3 = new javax.swing.JTextField();
        txNgayNhap = new javax.swing.JTextField();
        LbTensach3 = new javax.swing.JLabel();
        txMaNhaCungCap = new javax.swing.JTextField();
        LbTensach4 = new javax.swing.JLabel();
        txTongTien3 = new javax.swing.JTextField();
        lbHoaDonKhachHng4 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbChiTietPhieuNhap = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        lbHoaDonKhachHng5 = new javax.swing.JLabel();
        lbTimKiem4 = new javax.swing.JLabel();
        cbTimKiem5 = new javax.swing.JComboBox<>();
        btTim3 = new javax.swing.JButton();
        txTimKiem5 = new javax.swing.JTextField();
        lbTimKiem5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btLoc = new javax.swing.JButton();
        btHienThiTatCa = new javax.swing.JButton();
        dcNgayBatDau = new com.toedter.calendar.JDateChooser();
        dcNgayKetThuc = new com.toedter.calendar.JDateChooser();
        panelXuLyHoaDon = new javax.swing.JPanel();
        lbChiTietHoaDon3 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbChiTietHoaDon3 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        lbHoaDonKhachHng6 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tbHoaDon3 = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        txMaNhanVien4 = new javax.swing.JTextField();
        rbTatCa1 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        txNgayMua2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txMaHoaDon2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btTim4 = new javax.swing.JButton();
        txTongTien5 = new javax.swing.JTextField();
        txTimKiem6 = new javax.swing.JTextField();
        cbTimKiem6 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        rbDaXuLy1 = new javax.swing.JRadioButton();
        lbTimKiem6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbTimKiem7 = new javax.swing.JLabel();
        txMaKhachHang3 = new javax.swing.JTextField();
        rbChuaXuLy1 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        txTinhTrang1 = new javax.swing.JTextField();
        btBanGiaoVanChuyen = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(110, 89, 222));
        panelMain.setForeground(new java.awt.Color(110, 89, 222));
        panelMain.setPreferredSize(new java.awt.Dimension(516, 720));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelMenu.setBackground(new java.awt.Color(102, 102, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(255, 720));

        panelMenuKhachHang.setBackground(new java.awt.Color(102, 102, 255));

        lbAvatarKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatarKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Avatar_KhachHang.jpg"))); // NOI18N

        lbTenKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        lbTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbTenKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenKhachHang.setText("Vy Trương");

        lbIconKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_KhachHang.png"))); // NOI18N

        lbKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        lbKhachHang.setText("Khách Hàng");

        btTrangChu1.setBackground(new java.awt.Color(204, 204, 255));
        btTrangChu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTrangChu11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTrangChu11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTrangChu11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btTrangChu11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btTrangChu11MouseReleased(evt);
            }
        });

        lbIconHome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Home.png"))); // NOI18N

        lbTrangChu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTrangChu1.setForeground(new java.awt.Color(51, 51, 51));
        lbTrangChu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrangChu1.setText("Trang chủ");

        javax.swing.GroupLayout btTrangChu1Layout = new javax.swing.GroupLayout(btTrangChu1);
        btTrangChu1.setLayout(btTrangChu1Layout);
        btTrangChu1Layout.setHorizontalGroup(
            btTrangChu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btTrangChu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangChu1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btTrangChu1Layout.setVerticalGroup(
            btTrangChu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconHome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTrangChu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btGioHang.setBackground(new java.awt.Color(204, 204, 255));
        btGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGioHangMouseClicked(evt);
            }
        });

        lbIConCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIConCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Cart.png"))); // NOI18N

        lbGioHang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbGioHang.setForeground(new java.awt.Color(51, 51, 51));
        lbGioHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGioHang.setText("Giỏ Hàng");

        javax.swing.GroupLayout btGioHangLayout = new javax.swing.GroupLayout(btGioHang);
        btGioHang.setLayout(btGioHangLayout);
        btGioHangLayout.setHorizontalGroup(
            btGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIConCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btGioHangLayout.setVerticalGroup(
            btGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btGioHangLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIConCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        btHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btHoaDonMouseEntered(evt);
            }
        });

        lbIconBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Bill.png"))); // NOI18N

        lbHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        lbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDon.setText("Hóa đơn");

        javax.swing.GroupLayout btHoaDonLayout = new javax.swing.GroupLayout(btHoaDon);
        btHoaDon.setLayout(btHoaDonLayout);
        btHoaDonLayout.setHorizontalGroup(
            btHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btHoaDonLayout.setVerticalGroup(
            btHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btThongTInCaNhan2.setBackground(new java.awt.Color(204, 204, 255));
        btThongTInCaNhan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongTInCaNhanMouseClicked(evt);
            }
        });

        lbIconUserFolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconUserFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_UserFolder.png"))); // NOI18N

        lbThongTinCaNhan1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbThongTinCaNhan1.setForeground(new java.awt.Color(51, 51, 51));
        lbThongTinCaNhan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThongTinCaNhan1.setText("Thông tin cá nhân");

        javax.swing.GroupLayout btThongTInCaNhan2Layout = new javax.swing.GroupLayout(btThongTInCaNhan2);
        btThongTInCaNhan2.setLayout(btThongTInCaNhan2Layout);
        btThongTInCaNhan2Layout.setHorizontalGroup(
            btThongTInCaNhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btThongTInCaNhan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconUserFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThongTinCaNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btThongTInCaNhan2Layout.setVerticalGroup(
            btThongTInCaNhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconUserFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbThongTinCaNhan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btDangXuat.setBackground(new java.awt.Color(204, 204, 255));
        btDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangXuatMouseClicked(evt);
            }
        });

        lbIconLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_SignOut.png"))); // NOI18N

        lbDangXuat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(51, 51, 51));
        lbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangXuat.setText("Đăng xuất");

        javax.swing.GroupLayout btDangXuatLayout = new javax.swing.GroupLayout(btDangXuat);
        btDangXuat.setLayout(btDangXuatLayout);
        btDangXuatLayout.setHorizontalGroup(
            btDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        btDangXuatLayout.setVerticalGroup(
            btDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btDangXuatLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btSanPhamSach.setBackground(new java.awt.Color(204, 204, 255));
        btSanPhamSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSanPhamSachMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSanPhamSachMouseEntered(evt);
            }
        });

        lbIconBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Book.png"))); // NOI18N

        lbSanPhamSach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbSanPhamSach.setForeground(new java.awt.Color(51, 51, 51));
        lbSanPhamSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSanPhamSach.setText("Sản phẩm sách");

        javax.swing.GroupLayout btSanPhamSachLayout = new javax.swing.GroupLayout(btSanPhamSach);
        btSanPhamSach.setLayout(btSanPhamSachLayout);
        btSanPhamSachLayout.setHorizontalGroup(
            btSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSanPhamSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSanPhamSach, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btSanPhamSachLayout.setVerticalGroup(
            btSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbSanPhamSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuKhachHangLayout = new javax.swing.GroupLayout(panelMenuKhachHang);
        panelMenuKhachHang.setLayout(panelMenuKhachHangLayout);
        panelMenuKhachHangLayout.setHorizontalGroup(
            panelMenuKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btTrangChu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuKhachHangLayout.createSequentialGroup()
                .addGroup(panelMenuKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuKhachHangLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbAvatarKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuKhachHangLayout.createSequentialGroup()
                        .addComponent(lbIconKhachHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(btGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuKhachHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbKhachHang)
                .addGap(73, 73, 73))
            .addComponent(btThongTInCaNhan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btSanPhamSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuKhachHangLayout.setVerticalGroup(
            panelMenuKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuKhachHangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbAvatarKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIconKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbKhachHang)
                .addGap(18, 18, 18)
                .addComponent(btTrangChu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btSanPhamSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btThongTInCaNhan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMenuNhanVien.setBackground(new java.awt.Color(102, 102, 255));
        panelMenuNhanVien.setPreferredSize(new java.awt.Dimension(239, 734));

        lbAvatarNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatarNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Avatar_NhanVien.jpg"))); // NOI18N

        lbTenNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lbTenNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTenNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenNhanVien.setText("Vy Trương");

        lbIconNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_NhanVien.png"))); // NOI18N

        lbNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbNhanVien.setForeground(new java.awt.Color(102, 255, 255));
        lbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNhanVien.setText("Nhân viên");

        btTrangChu2.setBackground(new java.awt.Color(204, 204, 255));
        btTrangChu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTrangChu21MouseClicked(evt);
            }
        });

        lbIconHome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Home.png"))); // NOI18N

        lbTrangChu2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTrangChu2.setForeground(new java.awt.Color(51, 51, 51));
        lbTrangChu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrangChu2.setText("Trang chủ");

        javax.swing.GroupLayout btTrangChu2Layout = new javax.swing.GroupLayout(btTrangChu2);
        btTrangChu2.setLayout(btTrangChu2Layout);
        btTrangChu2Layout.setHorizontalGroup(
            btTrangChu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btTrangChu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangChu2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btTrangChu2Layout.setVerticalGroup(
            btTrangChu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconHome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTrangChu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btQuanLySanPham1.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLySanPham1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLySanPham1MouseClicked(evt);
            }
        });

        lbIconBook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Book.png"))); // NOI18N

        lbQuanLySanPham1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLySanPham1.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLySanPham1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLySanPham1.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout btQuanLySanPham1Layout = new javax.swing.GroupLayout(btQuanLySanPham1);
        btQuanLySanPham1.setLayout(btQuanLySanPham1Layout);
        btQuanLySanPham1Layout.setHorizontalGroup(
            btQuanLySanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLySanPham1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuanLySanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btQuanLySanPham1Layout.setVerticalGroup(
            btQuanLySanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLySanPham1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btXuLyHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        btXuLyHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXuLyHoaDonMouseClicked(evt);
            }
        });

        lbIconServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Services.png"))); // NOI18N

        lbXuLyHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbXuLyHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        lbXuLyHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXuLyHoaDon.setText("Xử lý hóa đơn");

        javax.swing.GroupLayout btXuLyHoaDonLayout = new javax.swing.GroupLayout(btXuLyHoaDon);
        btXuLyHoaDon.setLayout(btXuLyHoaDonLayout);
        btXuLyHoaDonLayout.setHorizontalGroup(
            btXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btXuLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconServices, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbXuLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btXuLyHoaDonLayout.setVerticalGroup(
            btXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbXuLyHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btDangXuat1.setBackground(new java.awt.Color(204, 204, 255));
        btDangXuat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangXuat1MouseClicked(evt);
            }
        });

        lbIconLogOut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconLogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_SignOut.png"))); // NOI18N

        lbDangXuat2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbDangXuat2.setForeground(new java.awt.Color(51, 51, 51));
        lbDangXuat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangXuat2.setText("Đăng xuất");

        javax.swing.GroupLayout btDangXuat1Layout = new javax.swing.GroupLayout(btDangXuat1);
        btDangXuat1.setLayout(btDangXuat1Layout);
        btDangXuat1Layout.setHorizontalGroup(
            btDangXuat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btDangXuat1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDangXuat2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btDangXuat1Layout.setVerticalGroup(
            btDangXuat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconLogOut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbDangXuat2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btThongTinCaNhan1.setBackground(new java.awt.Color(204, 204, 255));
        btThongTinCaNhan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongTinCaNhan1MouseClicked(evt);
            }
        });

        lbIconServices1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconServices1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Services.png"))); // NOI18N

        lbXuLyHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbXuLyHoaDon1.setForeground(new java.awt.Color(51, 51, 51));
        lbXuLyHoaDon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXuLyHoaDon1.setText("Thông tin cá nhân");

        javax.swing.GroupLayout btThongTinCaNhan1Layout = new javax.swing.GroupLayout(btThongTinCaNhan1);
        btThongTinCaNhan1.setLayout(btThongTinCaNhan1Layout);
        btThongTinCaNhan1Layout.setHorizontalGroup(
            btThongTinCaNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btThongTinCaNhan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconServices1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbXuLyHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btThongTinCaNhan1Layout.setVerticalGroup(
            btThongTinCaNhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconServices1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbXuLyHoaDon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btNhapKho3.setBackground(new java.awt.Color(204, 204, 255));
        btNhapKho3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNhapKho3MouseClicked(evt);
            }
        });

        lbIConCart6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIConCart6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_WareHouse.png"))); // NOI18N

        lbQuanLyHoaDon5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyHoaDon5.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyHoaDon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyHoaDon5.setText("Nhập kho");

        javax.swing.GroupLayout btNhapKho3Layout = new javax.swing.GroupLayout(btNhapKho3);
        btNhapKho3.setLayout(btNhapKho3Layout);
        btNhapKho3Layout.setHorizontalGroup(
            btNhapKho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btNhapKho3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIConCart6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuanLyHoaDon5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btNhapKho3Layout.setVerticalGroup(
            btNhapKho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIConCart6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyHoaDon5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuNhanVienLayout = new javax.swing.GroupLayout(panelMenuNhanVien);
        panelMenuNhanVien.setLayout(panelMenuNhanVienLayout);
        panelMenuNhanVienLayout.setHorizontalGroup(
            panelMenuNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btTrangChu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btXuLyHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuNhanVienLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbAvatarNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuNhanVienLayout.createSequentialGroup()
                .addComponent(lbIconNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btThongTinCaNhan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDangXuat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQuanLySanPham1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNhapKho3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuNhanVienLayout.setVerticalGroup(
            panelMenuNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuNhanVienLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbAvatarNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMenuNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIconNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNhanVien)
                .addGap(18, 18, 18)
                .addComponent(btTrangChu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btQuanLySanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXuLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btNhapKho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btThongTinCaNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDangXuat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenuAdmin.setBackground(new java.awt.Color(102, 102, 255));

        lbAvatarAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Avatar_Admin.jpg"))); // NOI18N

        lbTenAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lbTenAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTenAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lbTenAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenAdmin.setText("Vy Trương");

        lbIconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Admin.png"))); // NOI18N

        lbAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAdmin.setForeground(new java.awt.Color(255, 102, 102));
        lbAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAdmin.setText("Admin");

        btQuanLySanPham2.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLySanPham2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLySanPham21MouseClicked(evt);
            }
        });

        lbIconQuanLySanPham2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconQuanLySanPham2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Book.png"))); // NOI18N

        lbQuanLySanPham2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLySanPham2.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLySanPham2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLySanPham2.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout btQuanLySanPham2Layout = new javax.swing.GroupLayout(btQuanLySanPham2);
        btQuanLySanPham2.setLayout(btQuanLySanPham2Layout);
        btQuanLySanPham2Layout.setHorizontalGroup(
            btQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLySanPham2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconQuanLySanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuanLySanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btQuanLySanPham2Layout.setVerticalGroup(
            btQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconQuanLySanPham2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLySanPham2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btQuanLyNhanVien.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLyNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btQuanLyNhanVienMouseEntered(evt);
            }
        });

        lbIconBook2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_UserFolder.png"))); // NOI18N

        lbQuanLyNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyNhanVien.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyNhanVien.setText("Quản lý nhân viên");

        javax.swing.GroupLayout btQuanLyNhanVienLayout = new javax.swing.GroupLayout(btQuanLyNhanVien);
        btQuanLyNhanVien.setLayout(btQuanLyNhanVienLayout);
        btQuanLyNhanVienLayout.setHorizontalGroup(
            btQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLyNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btQuanLyNhanVienLayout.setVerticalGroup(
            btQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btQuanLyKhachHang.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLyKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLyKhachHangMouseClicked(evt);
            }
        });

        lbIconSale1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconSale1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_ChangeUser.png"))); // NOI18N

        lbQuanLyKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyKhachHang.setText("Quản lý khách hàng");

        javax.swing.GroupLayout btQuanLyKhachHangLayout = new javax.swing.GroupLayout(btQuanLyKhachHang);
        btQuanLyKhachHang.setLayout(btQuanLyKhachHangLayout);
        btQuanLyKhachHangLayout.setHorizontalGroup(
            btQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconSale1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuanLyKhachHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btQuanLyKhachHangLayout.setVerticalGroup(
            btQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconSale1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btNhapKho.setBackground(new java.awt.Color(204, 204, 255));
        btNhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNhapKhoMouseClicked(evt);
            }
        });

        lbIConCart1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIConCart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_WareHouse.png"))); // NOI18N

        lbQuanLyHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyHoaDon.setText("Nhập kho");

        javax.swing.GroupLayout btNhapKhoLayout = new javax.swing.GroupLayout(btNhapKho);
        btNhapKho.setLayout(btNhapKhoLayout);
        btNhapKhoLayout.setHorizontalGroup(
            btNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btNhapKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIConCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btNhapKhoLayout.setVerticalGroup(
            btNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIConCart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btThongKeDoanhThu.setBackground(new java.awt.Color(204, 204, 255));
        btThongKeDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongKeDoanhThuMouseClicked(evt);
            }
        });

        lbIconBill1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconBill1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Bill.png"))); // NOI18N

        lbThongKeDoanhThu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbThongKeDoanhThu.setForeground(new java.awt.Color(51, 51, 51));
        lbThongKeDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThongKeDoanhThu.setText("Thống kê doanh thu");

        javax.swing.GroupLayout btThongKeDoanhThuLayout = new javax.swing.GroupLayout(btThongKeDoanhThu);
        btThongKeDoanhThu.setLayout(btThongKeDoanhThuLayout);
        btThongKeDoanhThuLayout.setHorizontalGroup(
            btThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btThongKeDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThongKeDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btThongKeDoanhThuLayout.setVerticalGroup(
            btThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconBill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbThongKeDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btDangXuat3.setBackground(new java.awt.Color(204, 204, 255));
        btDangXuat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangXuat3MouseClicked(evt);
            }
        });

        lbIconLogOut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconLogOut3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_SignOut.png"))); // NOI18N

        lbDangXuat3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbDangXuat3.setForeground(new java.awt.Color(51, 51, 51));
        lbDangXuat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangXuat3.setText("Đăng xuất");

        javax.swing.GroupLayout btDangXuat3Layout = new javax.swing.GroupLayout(btDangXuat3);
        btDangXuat3.setLayout(btDangXuat3Layout);
        btDangXuat3Layout.setHorizontalGroup(
            btDangXuat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btDangXuat3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconLogOut3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDangXuat3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btDangXuat3Layout.setVerticalGroup(
            btDangXuat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIconLogOut3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbDangXuat3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btQuanLyHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLyHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLyHoaDonMouseClicked(evt);
            }
        });

        lbIConCart2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIConCart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_QLHD.png"))); // NOI18N

        lbQuanLyHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyHoaDon1.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyHoaDon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyHoaDon1.setText("Quản lý hóa đơn");

        javax.swing.GroupLayout btQuanLyHoaDonLayout = new javax.swing.GroupLayout(btQuanLyHoaDon);
        btQuanLyHoaDon.setLayout(btQuanLyHoaDonLayout);
        btQuanLyHoaDonLayout.setHorizontalGroup(
            btQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIConCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuanLyHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btQuanLyHoaDonLayout.setVerticalGroup(
            btQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIConCart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyHoaDon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btQuanLyNhapKho.setBackground(new java.awt.Color(204, 204, 255));
        btQuanLyNhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuanLyNhapKhoMouseClicked(evt);
            }
        });

        lbIConCart3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIConCart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Product.png"))); // NOI18N

        lbQuanLyHoaDon2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbQuanLyHoaDon2.setForeground(new java.awt.Color(51, 51, 51));
        lbQuanLyHoaDon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyHoaDon2.setText("Quản lý nhập kho");

        javax.swing.GroupLayout btQuanLyNhapKhoLayout = new javax.swing.GroupLayout(btQuanLyNhapKho);
        btQuanLyNhapKho.setLayout(btQuanLyNhapKhoLayout);
        btQuanLyNhapKhoLayout.setHorizontalGroup(
            btQuanLyNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btQuanLyNhapKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIConCart3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuanLyHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btQuanLyNhapKhoLayout.setVerticalGroup(
            btQuanLyNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIConCart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyHoaDon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuAdminLayout = new javax.swing.GroupLayout(panelMenuAdmin);
        panelMenuAdmin.setLayout(panelMenuAdminLayout);
        panelMenuAdminLayout.setHorizontalGroup(
            panelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btQuanLySanPham2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQuanLyKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btThongKeDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDangXuat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuAdminLayout.createSequentialGroup()
                .addGroup(panelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelMenuAdminLayout.createSequentialGroup()
                        .addComponent(lbIconAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTenAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMenuAdminLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lbAvatarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMenuAdminLayout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(lbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(btQuanLyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQuanLyNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuAdminLayout.setVerticalGroup(
            panelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAvatarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQuanLySanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQuanLyNhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThongKeDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDangXuat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenuAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMenuNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelMenuNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelMain.add(panelMenu, java.awt.BorderLayout.WEST);

        panelTacVu.setBackground(new java.awt.Color(110, 89, 222));
        panelTacVu.setPreferredSize(new java.awt.Dimension(838, 720));
        panelTacVu.setLayout(new java.awt.CardLayout());

        panelTrangChu.setBackground(new java.awt.Color(102, 95, 215));
        panelTrangChu.setPreferredSize(new java.awt.Dimension(838, 720));

        lbHeader.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(255, 255, 255));
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("__________ ♥ Quản lý sách cùng Vy Trương ♥ __________");
        lbHeader.setPreferredSize(new java.awt.Dimension(598, 94));

        lbBgTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg_TrangChu.jpg"))); // NOI18N
        lbBgTrangChu.setPreferredSize(new java.awt.Dimension(838, 519));

        javax.swing.GroupLayout panelTrangChuLayout = new javax.swing.GroupLayout(panelTrangChu);
        panelTrangChu.setLayout(panelTrangChuLayout);
        panelTrangChuLayout.setHorizontalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTrangChuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbBgTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelTrangChuLayout.setVerticalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTrangChuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbBgTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelTacVu.add(panelTrangChu, "cardTrangChu");

        panelSanPhamSach.setBackground(new java.awt.Color(110, 89, 222));
        panelSanPhamSach.setPreferredSize(new java.awt.Dimension(838, 720));

        lbLoaiSach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbLoaiSach.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaiSach.setText("Loại sách");

        txLoaiSach.setEditable(false);
        txLoaiSach.setBackground(new java.awt.Color(204, 204, 255));
        txLoaiSach.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txLoaiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLoaiSachActionPerformed(evt);
            }
        });

        txTenSach.setEditable(false);
        txTenSach.setBackground(new java.awt.Color(204, 204, 255));
        txTenSach.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSachActionPerformed(evt);
            }
        });

        lbTenSach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTenSach.setForeground(new java.awt.Color(255, 255, 255));
        lbTenSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenSach.setText("Tên sách");

        lbSoLuong.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        lbSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoLuong.setText("Số lượng");

        txDonGia.setEditable(false);
        txDonGia.setBackground(new java.awt.Color(204, 204, 255));
        txDonGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lbDonGia.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(255, 255, 255));
        lbDonGia.setText("Đơn giá");

        lbTacGia.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacGia.setForeground(new java.awt.Color(255, 255, 255));
        lbTacGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTacGia.setText("Tác giả");

        txTacGia.setEditable(false);
        txTacGia.setBackground(new java.awt.Color(204, 204, 255));
        txTacGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btThemGioHang.setBackground(new java.awt.Color(204, 204, 255));
        btThemGioHang.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btThemGioHang.setForeground(new java.awt.Color(51, 0, 51));
        btThemGioHang.setText("Thêm vào giỏ hàng");
        btThemGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemGioHangMouseClicked(evt);
            }
        });
        btThemGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemGioHangActionPerformed(evt);
            }
        });

        lbAnhSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tbSanPhamSach.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbSanPhamSach.setBackground(new java.awt.Color(204, 204, 255));
        tbSanPhamSach.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbSanPhamSach.setForeground(new java.awt.Color(51, 0, 51));
        tbSanPhamSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSanPhamSach.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbSanPhamSach.getTableHeader().setReorderingAllowed(false);
        tbSanPhamSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSanPhamSach);

        spinSoLuong.setBackground(new Color(204,204,255));
        spinSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        spinSoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinSoLuong.setRequestFocusEnabled(false);

        lbTimKiem1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem1.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem1.setText("Tìm kiếm");

        cbTimKiem1.setBackground(new java.awt.Color(204, 204, 204));
        cbTimKiem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên sách", "Tên tác giả", "Loại sách" }));

        txTimKiem1.setBackground(new java.awt.Color(204, 204, 204));
        txTimKiem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem1KeyPressed(evt);
            }
        });

        btTim1.setBackground(new java.awt.Color(204, 204, 204));
        btTim1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btTim1.setText("Tìm");
        btTim1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTim1MouseClicked(evt);
            }
        });

        cbLoaiSach.setBackground(new java.awt.Color(204, 204, 204));
        cbLoaiSach.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbLoaiSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tiểu thuyết", "Giáo trình", "Kĩ năng sống", "Văn học", "Tâm lí" }));
        cbLoaiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiSachActionPerformed(evt);
            }
        });

        lbMaSach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMaSach.setForeground(new java.awt.Color(255, 255, 255));
        lbMaSach.setText("Mã sách");

        txMaSach.setEditable(false);
        txMaSach.setBackground(new java.awt.Color(204, 204, 255));
        txMaSach.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaSach.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Loại sách");

        javax.swing.GroupLayout panelSanPhamSachLayout = new javax.swing.GroupLayout(panelSanPhamSach);
        panelSanPhamSach.setLayout(panelSanPhamSachLayout);
        panelSanPhamSachLayout.setHorizontalGroup(
            panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                            .addComponent(txTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(spinSoLuong))
                        .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                            .addComponent(lbTenSach)
                            .addGap(161, 161, 161)
                            .addComponent(lbSoLuong)))
                    .addComponent(btThemGioHang)
                    .addComponent(lbTimKiem1)
                    .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                        .addComponent(cbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTim1))
                    .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                            .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTacGia)
                                .addComponent(txTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbDonGia)
                                .addComponent(txDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                                .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaSach)
                                    .addComponent(txMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbLoaiSach)
                                    .addComponent(txLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAnhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelSanPhamSachLayout.setVerticalGroup(
            panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbAnhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSanPhamSachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTimKiem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTim1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSanPhamSachLayout.createSequentialGroup()
                                .addComponent(lbLoaiSach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSanPhamSachLayout.createSequentialGroup()
                                .addComponent(lbMaSach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSach)
                            .addComponent(lbSoLuong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTacGia)
                            .addComponent(lbDonGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSanPhamSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btThemGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
        );

        panelTacVu.add(panelSanPhamSach, "cardSanPhamSach");

        panelThongTinCaNhanKhachHang.setBackground(new java.awt.Color(110, 89, 222));
        panelThongTinCaNhanKhachHang.setPreferredSize(new java.awt.Dimension(838, 720));

        lbMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMatKhau.setText("Mật khẩu :");

        lbGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGioiTinh.setText("Giới tính :");

        lbNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgaySinh.setText("Ngày sinh :");

        lbSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbSoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoDienThoai.setText("Số điện thoại :");

        lbThongTinCaNhan.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbThongTinCaNhan.setForeground(new java.awt.Color(255, 255, 255));
        lbThongTinCaNhan.setText("Thông tin cá nhân");

        txHoLot.setBackground(new java.awt.Color(204, 204, 255));
        txHoLot.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txHoLot.setForeground(new java.awt.Color(51, 51, 51));

        txSoDienThoai.setBackground(new java.awt.Color(204, 204, 255));
        txSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txSoDienThoai.setForeground(new java.awt.Color(51, 51, 51));

        txNgaySinh.setBackground(new java.awt.Color(204, 204, 255));
        txNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgaySinh.setForeground(new java.awt.Color(51, 51, 51));

        btSuaThongTin.setBackground(new java.awt.Color(204, 204, 255));
        btSuaThongTin.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btSuaThongTin.setText("Sửa đổi thông tin");
        btSuaThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSuaThongTinMouseClicked(evt);
            }
        });

        lbHoLot.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHoLot.setForeground(new java.awt.Color(255, 255, 255));
        lbHoLot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoLot.setText("Họ lót :");

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("User :");

        txUser.setEditable(false);
        txUser.setBackground(new java.awt.Color(204, 204, 255));
        txUser.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txUser.setForeground(new java.awt.Color(51, 51, 51));

        txMatKhau.setBackground(new java.awt.Color(204, 204, 255));
        txMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbHienMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbHienMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau.setText("Hiện mật khẩu");
        cbHienMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhauMouseClicked(evt);
            }
        });
        cbHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienMatKhauActionPerformed(evt);
            }
        });

        lbXacNhanMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbXacNhanMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbXacNhanMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXacNhanMatKhau.setText("Xác nhận mật khẩu :");

        txXacNhanMatKhau.setBackground(new java.awt.Color(204, 204, 255));
        txXacNhanMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbHienMatKhau1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbHienMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau1.setText("HIện mật khẩu");
        cbHienMatKhau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhau1MouseClicked(evt);
            }
        });

        btgGioiTinh.add(rbtNam);
        rbtNam.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rbtNam.setForeground(new java.awt.Color(255, 255, 255));
        rbtNam.setText("Nam");

        btgGioiTinh.add(rbtNu);
        rbtNu.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rbtNu.setForeground(new java.awt.Color(255, 255, 255));
        rbtNu.setText("Nữ");

        lbTen.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Tên :");

        txTen.setBackground(new java.awt.Color(204, 204, 255));
        txTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelThongTinCaNhanKhachHangLayout = new javax.swing.GroupLayout(panelThongTinCaNhanKhachHang);
        panelThongTinCaNhanKhachHang.setLayout(panelThongTinCaNhanKhachHangLayout);
        panelThongTinCaNhanKhachHangLayout.setHorizontalGroup(
            panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                        .addComponent(lbHoLot, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txHoLot, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                        .addComponent(lbThongTinCaNhan)
                        .addGap(274, 274, 274))))
            .addGroup(panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGioiTinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                                .addComponent(rbtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(rbtNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txSoDienThoai)
                            .addComponent(txNgaySinh)
                            .addComponent(txMatKhau)
                            .addComponent(txXacNhanMatKhau)
                            .addComponent(txUser))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbHienMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbHienMatKhau1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btSuaThongTin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThongTinCaNhanKhachHangLayout.setVerticalGroup(
            panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongTinCaNhanKhachHangLayout.createSequentialGroup()
                .addComponent(lbThongTinCaNhan)
                .addGap(49, 49, 49)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txHoLot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen)
                    .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoLot))
                .addGap(40, 40, 40)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUser))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhau)
                    .addComponent(txMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHienMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbXacNhanMatKhau)
                    .addComponent(txXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHienMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh)
                    .addComponent(rbtNam)
                    .addComponent(rbtNu))
                .addGap(58, 58, 58)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoDienThoai)
                    .addComponent(txSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgaySinh)
                    .addComponent(txNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelTacVu.add(panelThongTinCaNhanKhachHang, "cardThongTinCaNhanKhachHang");

        panelGioHang.setBackground(new java.awt.Color(110, 89, 222));

        lbGioHangCuaBan.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbGioHangCuaBan.setForeground(new java.awt.Color(255, 255, 255));
        lbGioHangCuaBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGioHangCuaBan.setText("Giỏ hàng của bạn");

        tbGioHang.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbGioHang.setBackground(new java.awt.Color(204, 204, 255));
        tbGioHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbGioHang.setForeground(new java.awt.Color(51, 0, 51));
        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGioHang.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbGioHang.getTableHeader().setReorderingAllowed(false);
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbGioHang);

        lbIconCart1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconCart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Cart1.png"))); // NOI18N

        lbThanhTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbThanhTien.setForeground(new java.awt.Color(255, 255, 255));
        lbThanhTien.setText("Thành tiền :");

        txThanhTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txThanhTien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txThanhTienActionPerformed(evt);
            }
        });

        btThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        btThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btThanhToan.setForeground(new java.awt.Color(51, 0, 51));
        btThanhToan.setText("Thanh Toán");
        btThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThanhToanMouseClicked(evt);
            }
        });

        lbTongTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTongTien.setForeground(new java.awt.Color(255, 255, 255));
        lbTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongTien.setText("Tổng tiền :");

        txTongTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txTongTien.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbLoaiSach3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbLoaiSach3.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaiSach3.setText("Loại sách");

        txLoaiSach3.setEditable(false);
        txLoaiSach3.setBackground(new java.awt.Color(204, 204, 255));
        txLoaiSach3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lbTenSach2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTenSach2.setForeground(new java.awt.Color(255, 255, 255));
        lbTenSach2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTenSach2.setText("Tên sách");

        txTenSach2.setEditable(false);
        txTenSach2.setBackground(new java.awt.Color(204, 204, 255));
        txTenSach2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenSach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSach2ActionPerformed(evt);
            }
        });

        lbSoLuong2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbSoLuong2.setForeground(new java.awt.Color(255, 255, 255));
        lbSoLuong2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoLuong2.setText("Số lượng");

        lbTacGia2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacGia2.setForeground(new java.awt.Color(255, 255, 255));
        lbTacGia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTacGia2.setText("Tác giả");

        txTacGia2.setEditable(false);
        txTacGia2.setBackground(new java.awt.Color(204, 204, 255));
        txTacGia2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txDonGia1.setEditable(false);
        txDonGia1.setBackground(new java.awt.Color(204, 204, 255));
        txDonGia1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lbDonGia1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbDonGia1.setForeground(new java.awt.Color(255, 255, 255));
        lbDonGia1.setText("Đơn giá");

        txSoLuong.setEditable(false);
        txSoLuong.setBackground(new java.awt.Color(204, 204, 255));
        txSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btXoa.setBackground(new java.awt.Color(255, 255, 255));
        btXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setText("Xóa");
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGioHangLayout = new javax.swing.GroupLayout(panelGioHang);
        panelGioHang.setLayout(panelGioHangLayout);
        panelGioHangLayout.setHorizontalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGioHangLayout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(lbGioHangCuaBan))
                            .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelGioHangLayout.createSequentialGroup()
                                    .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTenSach2)
                                        .addComponent(txTenSach2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelGioHangLayout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(lbDonGia1))
                                        .addGroup(panelGioHangLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(37, 37, 37)
                                    .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSoLuong2)))
                                .addGroup(panelGioHangLayout.createSequentialGroup()
                                    .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbLoaiSach3)
                                        .addComponent(txLoaiSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTacGia2)
                                        .addComponent(txTacGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(75, 75, 75)
                        .addComponent(lbIconCart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbThanhTien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelGioHangLayout.createSequentialGroup()
                                .addComponent(txTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))
                            .addGroup(panelGioHangLayout.createSequentialGroup()
                                .addComponent(txThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelGioHangLayout.setVerticalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGioHangLayout.createSequentialGroup()
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbIconCart1))
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addComponent(lbGioHangCuaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLoaiSach3)
                            .addComponent(lbTacGia2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txLoaiSach3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTacGia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSach2)
                            .addComponent(lbDonGia1)
                            .addComponent(lbSoLuong2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTenSach2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGioHangLayout.createSequentialGroup()
                                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTongTien))
                                .addGap(12, 12, 12))
                            .addGroup(panelGioHangLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txThanhTien)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGioHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelTacVu.add(panelGioHang, "cardGioHang");

        panelHoaDon.setBackground(new java.awt.Color(102, 95, 215));

        tbHoaDon.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        tbHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"
            }
        ));
        tbHoaDon.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbHoaDon.getTableHeader().setReorderingAllowed(false);
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbHoaDon);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã hóa đơn :");

        txMaHoaDon.setEditable(false);
        txMaHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        txMaHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txMaHoaDon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaHoaDonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ngày mua :");

        txNgayMua.setEditable(false);
        txNgayMua.setBackground(new java.awt.Color(204, 204, 204));
        txNgayMua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txNgayMua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNgayMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayMuaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã khách hàng :");

        txMaKhachHang.setEditable(false);
        txMaKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        txMaKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txMaKhachHang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaKhachHangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mã nhân viên :");

        txMaNhanVien.setEditable(false);
        txMaNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        txMaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txMaNhanVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tổng tiền :");

        txTongTien1.setEditable(false);
        txTongTien1.setBackground(new java.awt.Color(204, 204, 204));
        txTongTien1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txTongTien1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbIconHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_BillCheck.png"))); // NOI18N

        tbChiTietHoaDon.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbChiTietHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        tbChiTietHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"
            }
        ));
        tbChiTietHoaDon.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbChiTietHoaDon.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tbChiTietHoaDon);

        lbChiTietHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbChiTietHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lbChiTietHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChiTietHoaDon.setText("Chi tiết hóa đơn");

        lbHoaDonKhachHng.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng.setText("Hóa đơn");

        btInHoaDon.setBackground(new java.awt.Color(204, 204, 204));
        btInHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btInHoaDon.setForeground(new java.awt.Color(0, 0, 0));
        btInHoaDon.setText("In hóa đơn");
        btInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInHoaDonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoaDonLayout.createSequentialGroup()
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoaDonLayout.createSequentialGroup()
                        .addComponent(btInHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHoaDonKhachHng)
                        .addGap(145, 145, 145)))
                .addComponent(lbIconHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane6)
            .addComponent(jScrollPane4)
            .addGroup(panelHoaDonLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(lbChiTietHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoaDonLayout.createSequentialGroup()
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHoaDonKhachHng)
                            .addComponent(btInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIconHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChiTietHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTacVu.add(panelHoaDon, "cardTheoDoiBill");

        panellQuanLyNhanVien.setBackground(new java.awt.Color(110, 89, 222));
        panellQuanLyNhanVien.setPreferredSize(new java.awt.Dimension(838, 720));

        lbQuanLyNhanVien1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbQuanLyNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        lbQuanLyNhanVien1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyNhanVien1.setText("QUẢN LÝ NHÂN VIÊN");

        lbMaNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lbMaNhanVien.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMaNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbMaNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMaNhanVien.setText("Mã nhân viên :");

        lbHoLot1.setBackground(new java.awt.Color(255, 255, 255));
        lbHoLot1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbHoLot1.setForeground(new java.awt.Color(255, 255, 255));
        lbHoLot1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHoLot1.setText("Họ lót :");

        lbGioiTinh1.setBackground(new java.awt.Color(255, 255, 255));
        lbGioiTinh1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbGioiTinh1.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGioiTinh1.setText("Giới tính :");

        lbNgaySinh1.setBackground(new java.awt.Color(255, 255, 255));
        lbNgaySinh1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNgaySinh1.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNgaySinh1.setText("Ngày sinh :");

        lbTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTaiKhoan.setText("Tài khoản :");

        lbSoDienThoai1.setBackground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbSoDienThoai1.setForeground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai1.setText("Số điện thoại :");

        tbQuanLyNhanVien.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));

        tbQuanLyNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        tbQuanLyNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        tbQuanLyNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbQuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu", "Tình trạng hoạt động"
            }
        ));
        tbQuanLyNhanVien.getTableHeader().setReorderingAllowed(false);
        tbQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyNhanVienMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbQuanLyNhanVien);

        btThem.setBackground(new java.awt.Color(204, 204, 255));
        btThem.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btThem.setText("Thêm");
        btThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btThemMouseEntered(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(204, 204, 255));
        btSua.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btSua.setText("Sửa");
        btSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSuaMouseClicked(evt);
            }
        });

        btXoa1.setBackground(new java.awt.Color(204, 204, 255));
        btXoa1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btXoa1.setText("Xóa");
        btXoa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoa1MouseClicked(evt);
            }
        });

        btTimKiem.setBackground(new java.awt.Color(204, 204, 255));
        btTimKiem.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTimKiemMouseClicked(evt);
            }
        });
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        txMaNhanVien1.setEditable(false);
        txMaNhanVien1.setBackground(new java.awt.Color(204, 204, 255));
        txMaNhanVien1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaNhanVien1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txHoLot1.setBackground(new java.awt.Color(204, 204, 255));
        txHoLot1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txSoDienThoai1.setBackground(new java.awt.Color(204, 204, 255));
        txSoDienThoai1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txNgaySinh1.setBackground(new java.awt.Color(204, 204, 255));
        txNgaySinh1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgaySinh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgaySinh1ActionPerformed(evt);
            }
        });

        btgGioiTinh.add(rbNam);
        rbNam.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbNam.setForeground(new java.awt.Color(255, 255, 255));
        rbNam.setSelected(true);
        rbNam.setText("Nam");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        btgGioiTinh.add(rbNu);
        rbNu.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbNu.setForeground(new java.awt.Color(255, 255, 255));
        rbNu.setText("Nữ");

        //txTaiKhoan.setEditable(false);
        txTaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        txTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTaiKhoanActionPerformed(evt);
            }
        });

        cbTimKiem.setBackground(new java.awt.Color(204, 204, 255));
        cbTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Họ lót nhân viên", "Tên nhân viên", "Tài khoản nhân viên" }));
        cbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimKiemActionPerformed(evt);
            }
        });

        lbMatKhau1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau1.setText("Mật khẩu :");

        txMatKhau1.setBackground(new java.awt.Color(204, 204, 255));
        txMatKhau1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMatKhau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMatKhau1ActionPerformed(evt);
            }
        });

        txTimKiem.setBackground(new java.awt.Color(204, 204, 255));
        txTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTimKiemActionPerformed(evt);
            }
        });
        txTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiemKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("( * )");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("( * )");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("( * )");

        lbTen1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbTen1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTen1.setText("Tên :");

        txTen1.setBackground(new java.awt.Color(204, 204, 255));
        txTen1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("( * )");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Hiển thị tất cả");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Sắp xếp theo tên");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txHoatDong.setBackground(new java.awt.Color(204, 204, 255));
        txHoatDong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHoatDongActionPerformed(evt);
            }
        });

        lbMatKhau4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMatKhau4.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau4.setText("Hoạt động :");

        javax.swing.GroupLayout panellQuanLyNhanVienLayout = new javax.swing.GroupLayout(panellQuanLyNhanVien);
        panellQuanLyNhanVien.setLayout(panellQuanLyNhanVienLayout);
        panellQuanLyNhanVienLayout.setHorizontalGroup(
            panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbQuanLyNhanVien1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txHoLot1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                        .addComponent(lbMaNhanVien)
                                        .addGap(38, 38, 38)
                                        .addComponent(txMaNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbHoLot1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btTimKiem))))))
                .addContainerGap())
            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbGioiTinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgaySinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txTaiKhoan)
                            .addComponent(txNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)))
                .addGap(50, 50, 50)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSoDienThoai1)
                    .addComponent(lbMatKhau1)
                    .addComponent(lbMatKhau4))
                .addGap(12, 12, 12)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txSoDienThoai1)
                            .addComponent(txMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(txHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panellQuanLyNhanVienLayout.setVerticalGroup(
            panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                .addComponent(lbQuanLyNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaNhanVien)
                            .addComponent(txMaNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoLot1)
                    .addComponent(txHoLot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbTen1))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGioiTinh1)
                            .addComponent(rbNam)
                            .addComponent(rbNu))
                        .addGap(27, 27, 27)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgaySinh1)
                            .addComponent(txNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panellQuanLyNhanVienLayout.createSequentialGroup()
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoDienThoai1)
                            .addComponent(txSoDienThoai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(24, 24, 24)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMatKhau4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTaiKhoan)
                        .addComponent(txTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(panellQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        panelTacVu.add(panellQuanLyNhanVien, "cardQuanLyNhanVien");

        panelQuanLySanPham.setBackground(new java.awt.Color(110, 89, 222));
        panelQuanLySanPham.setMaximumSize(new java.awt.Dimension(838, 720));
        panelQuanLySanPham.setPreferredSize(new java.awt.Dimension(838, 720));

        lbQuanLySach.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbQuanLySach.setForeground(new java.awt.Color(255, 255, 255));
        lbQuanLySach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLySach.setText("QUẢN LÝ SÁCH");

        lbMasach.setBackground(new java.awt.Color(255, 255, 255));
        lbMasach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMasach.setForeground(new java.awt.Color(255, 255, 255));
        lbMasach.setText("Mã sách :");

        LbTensach.setBackground(new java.awt.Color(255, 255, 255));
        LbTensach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        LbTensach.setForeground(new java.awt.Color(255, 255, 255));
        LbTensach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTensach.setText("Tên sách :");

        lbTacgia.setBackground(new java.awt.Color(255, 255, 255));
        lbTacgia.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacgia.setForeground(new java.awt.Color(255, 255, 255));
        lbTacgia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTacgia.setText("Tác giả :");

        lbDongia.setBackground(new java.awt.Color(255, 255, 255));
        lbDongia.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbDongia.setForeground(new java.awt.Color(255, 255, 255));
        lbDongia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDongia.setText("Đơn giá :");

        txMaSach1.setEditable(false);
        txMaSach1.setBackground(new java.awt.Color(204, 204, 255));
        txMaSach1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaSach1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaSach1ActionPerformed(evt);
            }
        });

        txTenSach1.setBackground(new java.awt.Color(204, 204, 255));
        txTenSach1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenSach1.setMaximumSize(new java.awt.Dimension(64, 26));
        txTenSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSach1ActionPerformed(evt);
            }
        });

        //txTaiKhoan.setEditable(false);
        txDonGia2.setBackground(new java.awt.Color(204, 204, 255));
        txDonGia2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txDonGia2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDonGia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDonGia2ActionPerformed(evt);
            }
        });

        cbTimKiem2.setBackground(new java.awt.Color(204, 204, 255));
        cbTimKiem2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên sách", "Tên tác giả", "Loại sách" }));
        cbTimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimKiem2ActionPerformed(evt);
            }
        });

        btSua1.setBackground(new java.awt.Color(204, 204, 255));
        btSua1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btSua1.setText("Sửa");
        btSua1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSua1MouseClicked(evt);
            }
        });
        btSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua1ActionPerformed(evt);
            }
        });

        btnTimkiem1.setBackground(new java.awt.Color(204, 204, 255));
        btnTimkiem1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTimkiem1.setText("Tìm kiếm");
        btnTimkiem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiem1MouseClicked(evt);
            }
        });

        tbQuanLySanPham.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbQuanLySanPham.setBackground(new java.awt.Color(204, 204, 255));
        tbQuanLySanPham.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbQuanLySanPham.setForeground(new java.awt.Color(51, 0, 51));
        tbQuanLySanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbQuanLySanPham.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbQuanLySanPham.getTableHeader().setReorderingAllowed(false);
        tbQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLySanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbQuanLySanPham);
        if (tbQuanLySanPham.getColumnModel().getColumnCount() > 0) {
            tbQuanLySanPham.getColumnModel().getColumn(0).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(1).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(2).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(3).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(4).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(5).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(6).setResizable(false);
            tbQuanLySanPham.getColumnModel().getColumn(7).setResizable(false);
        }

        lbNhaxuatban.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNhaxuatban.setForeground(new java.awt.Color(255, 255, 255));
        lbNhaxuatban.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNhaxuatban.setText("Nhà xuất bản :");

        lbLoaisach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbLoaisach.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaisach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbLoaisach.setText("Loại sách :");

        txTimKiem2.setBackground(new java.awt.Color(204, 204, 255));
        txTimKiem2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem2KeyPressed(evt);
            }
        });

        cbLoaiSach1.setBackground(new java.awt.Color(204, 204, 255));
        cbLoaiSach1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbLoaiSach1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tiểu thuyết", "Giáo trình", "Kĩ năng sống", "Văn học", "Tâm lí" }));
        cbLoaiSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiSach1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Loại sách :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tìm kiếm :");

        cbLoaiSach2.setBackground(new java.awt.Color(204, 204, 255));
        cbLoaiSach2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbLoaiSach2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiểu thuyết", "Giáo trình", "Kĩ năng sống", "Văn học", "Tâm lí" }));

        cbTacGia.setBackground(new java.awt.Color(204, 204, 255));
        cbTacGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trác Nhã", "Nguyễn Hiển", "Paulo Coelho", "Đại học FPT", "Ở Đây Dui Nè", "Nguyễn Rosie", "Tống Mặc", "UKI OSHO", "Lê Đỗ Quỳnh Hương", "Trần Minh Phương Thảo" }));
        cbTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTacGiaActionPerformed(evt);
            }
        });

        cbNhaXuatBan.setBackground(new java.awt.Color(204, 204, 255));
        cbNhaXuatBan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbNhaXuatBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kim Đồng", "Nhà xuất bản trẻ", "Anphabook", "Nhã Nam", "Rio Book", "Sách ĐôngA", "Đại học Quốc Gia", "Thái Hà", "1980s Book", "Đinh Tị Book" }));

        lbNgayXuatBan.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNgayXuatBan.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayXuatBan.setText("Ngày xuất bản :");

        txNgayXuatBan.setBackground(new java.awt.Color(204, 204, 255));
        txNgayXuatBan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgayXuatBan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Số lượng :");

        txSoLuong1.setEditable(false);
        txSoLuong1.setBackground(new java.awt.Color(204, 204, 255));
        txSoLuong1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txSoLuong1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txSoLuong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSoLuong1ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Chỉnh sửa :");

        btXoa3.setBackground(new java.awt.Color(204, 204, 255));
        btXoa3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btXoa3.setText("Xóa");
        btXoa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoa3MouseClicked(evt);
            }
        });
        btXoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa3ActionPerformed(evt);
            }
        });

        lbMasach1.setBackground(new java.awt.Color(255, 255, 255));
        lbMasach1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMasach1.setForeground(new java.awt.Color(255, 255, 255));
        lbMasach1.setText("Tình trạng:");

        txTinhTrang.setBackground(new java.awt.Color(204, 204, 255));
        txTinhTrang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnNhapExcel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnNhapExcel.setText("Nhập Excel");
        btnNhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapExcelActionPerformed(evt);
            }
        });

        btnXuatExcel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQuanLySanPhamLayout = new javax.swing.GroupLayout(panelQuanLySanPham);
        panelQuanLySanPham.setLayout(panelQuanLySanPhamLayout);
        panelQuanLySanPhamLayout.setHorizontalGroup(
            panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbTensach))
                                .addGap(18, 18, 18)
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTenSach1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                                .addComponent(lbLoaisach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTacGia, 0, 204, Short.MAX_VALUE)
                                    .addComponent(cbLoaiSach2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNgayXuatBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNhaxuatban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDongia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbNhaXuatBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNgayXuatBan)
                            .addComponent(txSoLuong1)
                            .addComponent(txDonGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelQuanLySanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbLoaiSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNhapExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimkiem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(111, 111, 111)
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySanPhamLayout.createSequentialGroup()
                                .addComponent(btSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btXoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMasach1)))
                            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(lbQuanLySach))
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTacgia)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelQuanLySanPhamLayout.setVerticalGroup(
            panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbQuanLySach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btXoa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimkiem1)
                        .addComponent(btSua1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbLoaiSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhapExcel)
                    .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMasach)
                    .addComponent(txMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMasach1))
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTensach)
                            .addComponent(txTenSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNgayXuatBan)
                            .addComponent(txNgayXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelQuanLySanPhamLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoaisach)
                    .addComponent(cbLoaiSach2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTacgia)
                    .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDongia)
                    .addComponent(txDonGia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
        );

        panelTacVu.add(panelQuanLySanPham, "cardQuanLySanPham");

        panelThongTinCaNhanNhanien.setBackground(new java.awt.Color(110, 89, 222));

        lbThongTinCaNhan2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbThongTinCaNhan2.setForeground(new java.awt.Color(255, 255, 255));
        lbThongTinCaNhan2.setText("Thông tin cá nhân");

        lbHoLot2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHoLot2.setForeground(new java.awt.Color(255, 255, 255));
        lbHoLot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoLot2.setText("Họ lót :");

        txHoLot2.setBackground(new java.awt.Color(204, 204, 255));
        txHoLot2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txHoLot2.setForeground(new java.awt.Color(51, 51, 51));

        lbTen2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbTen2.setForeground(new java.awt.Color(255, 255, 255));
        lbTen2.setText("Tên :");

        txTen2.setBackground(new java.awt.Color(204, 204, 255));
        txTen2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txUser1.setEditable(false);
        txUser1.setBackground(new java.awt.Color(204, 204, 255));
        txUser1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txUser1.setForeground(new java.awt.Color(51, 51, 51));

        lbUser1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser1.setText("User :");

        lbMatKhau2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbMatKhau2.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMatKhau2.setText("Mật khẩu :");

        txMatKhau2.setBackground(new java.awt.Color(204, 204, 255));
        txMatKhau2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbHienMatKhau2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbHienMatKhau2.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau2.setText("Hiện mật khẩu");
        cbHienMatKhau2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhau2MouseClicked(evt);
            }
        });
        cbHienMatKhau2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHienMatKhau2ActionPerformed(evt);
            }
        });

        cbHienMatKhau3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbHienMatKhau3.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau3.setText("HIện mật khẩu");
        cbHienMatKhau3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhau3MouseClicked(evt);
            }
        });

        txXacNhanMatKhau1.setBackground(new java.awt.Color(204, 204, 255));
        txXacNhanMatKhau1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lbXacNhanMatKhau1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbXacNhanMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        lbXacNhanMatKhau1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXacNhanMatKhau1.setText("Xác nhận mật khẩu :");

        lbGioiTinh2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbGioiTinh2.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGioiTinh2.setText("Giới tính :");

        btgGioiTinh.add(rbtNam1);
        rbtNam1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rbtNam1.setForeground(new java.awt.Color(255, 255, 255));
        rbtNam1.setText("Nam");

        btgGioiTinh.add(rbtNu1);
        rbtNu1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rbtNu1.setForeground(new java.awt.Color(255, 255, 255));
        rbtNu1.setText("Nữ");

        txSoDienThoai2.setBackground(new java.awt.Color(204, 204, 255));
        txSoDienThoai2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txSoDienThoai2.setForeground(new java.awt.Color(51, 51, 51));

        lbSoDienThoai2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbSoDienThoai2.setForeground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoDienThoai2.setText("Số điện thoại :");

        lbNgaySinh2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbNgaySinh2.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgaySinh2.setText("Ngày sinh :");

        txNgaySinh3.setBackground(new java.awt.Color(204, 204, 255));
        txNgaySinh3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgaySinh3.setForeground(new java.awt.Color(51, 51, 51));

        btSuaThongTin1.setBackground(new java.awt.Color(204, 204, 255));
        btSuaThongTin1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btSuaThongTin1.setText("Sửa đổi thông tin");
        btSuaThongTin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSuaThongTin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelThongTinCaNhanNhanienLayout = new javax.swing.GroupLayout(panelThongTinCaNhanNhanien);
        panelThongTinCaNhanNhanien.setLayout(panelThongTinCaNhanNhanienLayout);
        panelThongTinCaNhanNhanienLayout.setHorizontalGroup(
            panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                        .addComponent(lbHoLot2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txHoLot2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTen2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                        .addComponent(lbThongTinCaNhan2)
                        .addGap(274, 274, 274))))
            .addGroup(panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbSoDienThoai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbNgaySinh2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGioiTinh2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMatKhau2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbXacNhanMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                                .addComponent(rbtNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(rbtNu1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txSoDienThoai2)
                            .addComponent(txNgaySinh3)
                            .addComponent(txMatKhau2)
                            .addComponent(txXacNhanMatKhau1)
                            .addComponent(txUser1))
                        .addGap(18, 18, 18)
                        .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbHienMatKhau2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbHienMatKhau3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btSuaThongTin1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThongTinCaNhanNhanienLayout.setVerticalGroup(
            panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongTinCaNhanNhanienLayout.createSequentialGroup()
                .addComponent(lbThongTinCaNhan2)
                .addGap(49, 49, 49)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txHoLot2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen2)
                    .addComponent(txTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoLot2))
                .addGap(40, 40, 40)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUser1))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhau2)
                    .addComponent(txMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHienMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbXacNhanMatKhau1)
                    .addComponent(txXacNhanMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHienMatKhau3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh2)
                    .addComponent(rbtNam1)
                    .addComponent(rbtNu1))
                .addGap(58, 58, 58)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoDienThoai2)
                    .addComponent(txSoDienThoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelThongTinCaNhanNhanienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgaySinh2)
                    .addComponent(txNgaySinh3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btSuaThongTin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelTacVu.add(panelThongTinCaNhanNhanien, "cardThongTinCaNhanNhanVien");

        panellQuanLyKhachHang.setBackground(new java.awt.Color(110, 89, 222));
        panellQuanLyKhachHang.setPreferredSize(new java.awt.Dimension(838, 720));

        lbQuanLyKhachHang1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbQuanLyKhachHang1.setForeground(new java.awt.Color(255, 255, 255));
        lbQuanLyKhachHang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyKhachHang1.setText("QUẢN LÝ KHÁCH HÀNG");

        lbMaKhachHang1.setBackground(new java.awt.Color(255, 255, 255));
        lbMaKhachHang1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMaKhachHang1.setForeground(new java.awt.Color(255, 255, 255));
        lbMaKhachHang1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMaKhachHang1.setText("Mã khách hàng :");

        lbHoLot3.setBackground(new java.awt.Color(255, 255, 255));
        lbHoLot3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbHoLot3.setForeground(new java.awt.Color(255, 255, 255));
        lbHoLot3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHoLot3.setText("Họ lót :");

        lbGioiTinh3.setBackground(new java.awt.Color(255, 255, 255));
        lbGioiTinh3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbGioiTinh3.setForeground(new java.awt.Color(255, 255, 255));
        lbGioiTinh3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbGioiTinh3.setText("Giới tính :");

        lbNgaySinh3.setBackground(new java.awt.Color(255, 255, 255));
        lbNgaySinh3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNgaySinh3.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNgaySinh3.setText("Ngày sinh :");

        lbTaiKhoan1.setBackground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTaiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTaiKhoan1.setText("Tài khoản :");

        lbSoDienThoai3.setBackground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbSoDienThoai3.setForeground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai3.setText("Số điện thoại :");

        tbQuanLyKhachHang.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));

        tbQuanLyKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        tbQuanLyKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        tbQuanLyKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbQuanLyKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ lót", "Tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Tài khoản", "Mật khẩu", "Tình trạng hoạt động"
            }
        ));
        tbQuanLyKhachHang.getTableHeader().setReorderingAllowed(false);
        tbQuanLyKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyKhachHangMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbQuanLyKhachHang);

        btThem1.setBackground(new java.awt.Color(204, 204, 255));
        btThem1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btThem1.setText("Thêm");
        btThem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btThem1MouseEntered(evt);
            }
        });

        btSua2.setBackground(new java.awt.Color(204, 204, 255));
        btSua2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btSua2.setText("Sửa");
        btSua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSua2MouseClicked(evt);
            }
        });

        btXoa2.setBackground(new java.awt.Color(204, 204, 255));
        btXoa2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btXoa2.setText("Xóa");
        btXoa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoa2MouseClicked(evt);
            }
        });

        btTimKiem1.setBackground(new java.awt.Color(204, 204, 255));
        btTimKiem1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btTimKiem1.setText("Tìm kiếm");
        btTimKiem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTimKiem1MouseClicked(evt);
            }
        });
        btTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiem1ActionPerformed(evt);
            }
        });

        txMaKhachHang2.setEditable(false);
        txMaKhachHang2.setBackground(new java.awt.Color(204, 204, 255));
        txMaKhachHang2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaKhachHang2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txHoLot3.setBackground(new java.awt.Color(204, 204, 255));
        txHoLot3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txSoDienThoai3.setBackground(new java.awt.Color(204, 204, 255));
        txSoDienThoai3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txNgaySinh2.setBackground(new java.awt.Color(204, 204, 255));
        txNgaySinh2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgaySinh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgaySinh2ActionPerformed(evt);
            }
        });

        btgGioiTinh.add(rbNam1);
        rbNam1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbNam1.setForeground(new java.awt.Color(255, 255, 255));
        rbNam1.setText("Nam");
        rbNam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNam1ActionPerformed(evt);
            }
        });

        btgGioiTinh.add(rbNu1);
        rbNu1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbNu1.setForeground(new java.awt.Color(255, 255, 255));
        rbNu1.setText("Nữ");

        //txTaiKhoan.setEditable(false);
        txTaiKhoan1.setBackground(new java.awt.Color(204, 204, 255));
        txTaiKhoan1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTaiKhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTaiKhoan1ActionPerformed(evt);
            }
        });

        cbTimKiem3.setBackground(new java.awt.Color(204, 204, 255));
        cbTimKiem3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Họ lót khách hàng", "Tên khách hàng", "Tài khoản khách hàng" }));
        cbTimKiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimKiem3ActionPerformed(evt);
            }
        });

        lbMatKhau3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMatKhau3.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau3.setText("Mật khẩu :");

        txMatKhau3.setBackground(new java.awt.Color(204, 204, 255));
        txMatKhau3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMatKhau3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMatKhau3ActionPerformed(evt);
            }
        });

        txTimKiem3.setBackground(new java.awt.Color(204, 204, 255));
        txTimKiem3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTimKiem3ActionPerformed(evt);
            }
        });
        txTimKiem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem3KeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("( * )");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("( * )");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("( * )");

        lbTen3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTen3.setForeground(new java.awt.Color(255, 255, 255));
        lbTen3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTen3.setText("Tên :");

        txTen3.setBackground(new java.awt.Color(204, 204, 255));
        txTen3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTen3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("( * )");

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Hiển thị tất cả");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setText("Sắp xếp theo tên");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbMatKhau5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbMatKhau5.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau5.setText("Hoạt động :");

        txHoatDong1.setBackground(new java.awt.Color(204, 204, 255));
        txHoatDong1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txHoatDong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHoatDong1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panellQuanLyKhachHangLayout = new javax.swing.GroupLayout(panellQuanLyKhachHang);
        panellQuanLyKhachHang.setLayout(panellQuanLyKhachHangLayout);
        panellQuanLyKhachHangLayout.setHorizontalGroup(
            panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbQuanLyKhachHang1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txHoLot3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTen3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                                        .addComponent(lbMaKhachHang1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txMaKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbHoLot3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                                .addComponent(cbTimKiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txTimKiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyKhachHangLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btTimKiem1)))))
                .addContainerGap())
            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(btSua2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbGioiTinh3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgaySinh3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTaiKhoan1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addComponent(rbNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbNu1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txTaiKhoan1)
                            .addComponent(txNgaySinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)))
                .addGap(50, 50, 50)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSoDienThoai3)
                    .addComponent(lbMatKhau3)
                    .addComponent(lbMatKhau5))
                .addGap(12, 12, 12)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txSoDienThoai3)
                            .addComponent(txMatKhau3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17))
                    .addComponent(txHoatDong1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panellQuanLyKhachHangLayout.setVerticalGroup(
            panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                .addComponent(lbQuanLyKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaKhachHang1)
                            .addComponent(txMaKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTimKiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoLot3)
                    .addComponent(txHoLot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(btTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTen3)
                                    .addComponent(jLabel18)))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTen3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGioiTinh3)
                            .addComponent(rbNam1)
                            .addComponent(rbNu1))
                        .addGap(27, 27, 27)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgaySinh3)
                            .addComponent(txNgaySinh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panellQuanLyKhachHangLayout.createSequentialGroup()
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoDienThoai3)
                            .addComponent(txSoDienThoai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhau3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMatKhau3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(24, 24, 24)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMatKhau5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txHoatDong1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTaiKhoan1)
                        .addComponent(txTaiKhoan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(panellQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        panelTacVu.add(panellQuanLyKhachHang, "cardQuanLyKhachHang");

        panelThongKe.setBackground(new java.awt.Color(102, 95, 215));

        tbHoaDon.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbHoaDon1.setBackground(new java.awt.Color(204, 204, 204));
        tbHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbHoaDon1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"
            }
        ));
        tbHoaDon1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbHoaDon1.getTableHeader().setReorderingAllowed(false);
        tbHoaDon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDon1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbHoaDon1);

        tbChiTietHoaDon.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbChiTietHoaDon1.setBackground(new java.awt.Color(204, 204, 204));
        tbChiTietHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbChiTietHoaDon1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"
            }
        ));
        tbChiTietHoaDon1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbChiTietHoaDon1.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tbChiTietHoaDon1);

        lbChiTietHoaDon1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbChiTietHoaDon1.setForeground(new java.awt.Color(255, 255, 255));
        lbChiTietHoaDon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChiTietHoaDon1.setText("Chi tiết hóa đơn");

        lbHoaDonKhachHng1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng1.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng1.setText("Hóa đơn");

        txTenSach3.setBackground(new java.awt.Color(204, 204, 204));
        txTenSach3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenSach3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTenSach3KeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("-");

        cbQuy.setBackground(new java.awt.Color(204, 204, 204));
        cbQuy.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbQuy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quý 1", "Quý 2", "Quý 3", "Quý 4" }));
        cbQuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuyActionPerformed(evt);
            }
        });

        dcNgayA.setBackground(new java.awt.Color(204, 204, 204));
        dcNgayA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcNgayAKeyPressed(evt);
            }
        });

        dcNgayB.setBackground(new java.awt.Color(204, 204, 204));

        lbDoanhThu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbDoanhThu.setForeground(new java.awt.Color(255, 102, 102));
        lbDoanhThu.setText("Doanh thu :");

        txDoanhThu.setBackground(new java.awt.Color(204, 204, 204));
        txDoanhThu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txDoanhThu.setForeground(new java.awt.Color(204, 0, 0));
        txDoanhThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btThongKe.setBackground(new java.awt.Color(204, 204, 204));
        btThongKe.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btThongKe.setText("Thống kê");
        btThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongKeMouseClicked(evt);
            }
        });

        btThongKeTatCa.setBackground(new java.awt.Color(204, 204, 204));
        btThongKeTatCa.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btThongKeTatCa.setText("Thống kê tất cả");
        btThongKeTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongKeTatCaMouseClicked(evt);
            }
        });

        btgThongKe.add(cbTenSach);
        cbTenSach.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        cbTenSach.setForeground(new java.awt.Color(255, 255, 255));
        cbTenSach.setText("Tên sách");

        btgThongKe.add(cbNgayADenB);
        cbNgayADenB.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        cbNgayADenB.setForeground(new java.awt.Color(255, 255, 255));
        cbNgayADenB.setText("Từ ngày A --> B");

        btgThongKe.add(cbTheoQuy);
        cbTheoQuy.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        cbTheoQuy.setForeground(new java.awt.Color(255, 255, 255));
        cbTheoQuy.setText("Theo quý");
        cbTheoQuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTheoQuyActionPerformed(evt);
            }
        });

        txNam.setBackground(new java.awt.Color(204, 204, 204));
        txNam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNam.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Năm :");

        javax.swing.GroupLayout panelThongKeLayout = new javax.swing.GroupLayout(panelThongKe);
        panelThongKe.setLayout(panelThongKeLayout);
        panelThongKeLayout.setHorizontalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
            .addComponent(jScrollPane5)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelThongKeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btThongKeTatCa)
                                .addGap(162, 162, 162)
                                .addComponent(lbHoaDonKhachHng1))
                            .addGroup(panelThongKeLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(lbChiTietHoaDon1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongKeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbDoanhThu)
                                .addGap(18, 18, 18)
                                .addComponent(txDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelThongKeLayout.createSequentialGroup()
                                .addComponent(btThongKe)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelThongKeLayout.createSequentialGroup()
                                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelThongKeLayout.createSequentialGroup()
                                        .addComponent(dcNgayA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcNgayB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongKeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbNgayADenB)
                                        .addGap(94, 94, 94)))
                                .addGap(28, 28, 28)
                                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelThongKeLayout.createSequentialGroup()
                                        .addComponent(cbQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txNam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongKeLayout.createSequentialGroup()
                                        .addComponent(cbTheoQuy)
                                        .addGap(75, 75, 75)))))))
                .addContainerGap())
        );
        panelThongKeLayout.setVerticalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNgayADenB)
                            .addComponent(cbTheoQuy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcNgayA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcNgayB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNam)
                            .addComponent(cbQuy)
                            .addGroup(panelThongKeLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cbTenSach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTenSach3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btThongKe)
                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btThongKeTatCa)
                        .addGap(46, 46, 46))
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDoanhThu)
                            .addComponent(txDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHoaDonKhachHng1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChiTietHoaDon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTacVu.add(panelThongKe, "cardThongKe");

        panelNhapKho.setBackground(new java.awt.Color(110, 89, 222));
        panelNhapKho.setMaximumSize(new java.awt.Dimension(838, 720));
        panelNhapKho.setPreferredSize(new java.awt.Dimension(838, 720));

        LbTensach1.setBackground(new java.awt.Color(255, 255, 255));
        LbTensach1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        LbTensach1.setForeground(new java.awt.Color(255, 255, 255));
        LbTensach1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTensach1.setText("Tên sách :");

        lbTacgia1.setBackground(new java.awt.Color(255, 255, 255));
        lbTacgia1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacgia1.setForeground(new java.awt.Color(255, 255, 255));
        lbTacgia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTacgia1.setText("Họ lót tác giả :");

        lbDongia1.setBackground(new java.awt.Color(255, 255, 255));
        lbDongia1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbDongia1.setForeground(new java.awt.Color(255, 255, 255));
        lbDongia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDongia1.setText("Đơn giá :");

        txTenSach4.setBackground(new java.awt.Color(204, 204, 255));
        txTenSach4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenSach4.setMaximumSize(new java.awt.Dimension(64, 26));
        txTenSach4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenSach4ActionPerformed(evt);
            }
        });
        txTenSach4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTenSach4KeyPressed(evt);
            }
        });

        //txTaiKhoan.setEditable(false);
        txDonGia3.setBackground(new java.awt.Color(204, 204, 255));
        txDonGia3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txDonGia3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDonGia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDonGia3ActionPerformed(evt);
            }
        });
        txDonGia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txDonGia3KeyPressed(evt);
            }
        });

        tbPhieuNhap.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbPhieuNhap.setBackground(new java.awt.Color(204, 204, 255));
        tbPhieuNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbPhieuNhap.setForeground(new java.awt.Color(51, 0, 51));
        tbPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sách", "Loại sách", "Họ lót tác giả", "Tên tác giả", "Nhà xuất bản", "Ngày xuất bản", "Số lượng", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhieuNhap.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbPhieuNhap.getTableHeader().setReorderingAllowed(false);
        tbPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbPhieuNhap);
        if (tbPhieuNhap.getColumnModel().getColumnCount() > 0) {
            tbPhieuNhap.getColumnModel().getColumn(0).setResizable(false);
            tbPhieuNhap.getColumnModel().getColumn(1).setResizable(false);
            tbPhieuNhap.getColumnModel().getColumn(2).setResizable(false);
        }

        lbNhaxuatban1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNhaxuatban1.setForeground(new java.awt.Color(255, 255, 255));
        lbNhaxuatban1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNhaxuatban1.setText("Nhà xuất bản :");

        lbLoaisach1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbLoaisach1.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaisach1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbLoaisach1.setText("Loại sách :");

        lbNgayXuatBan1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbNgayXuatBan1.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayXuatBan1.setText("Ngày xuất bản :");

        txNgayXuatBan1.setBackground(new java.awt.Color(204, 204, 255));
        txNgayXuatBan1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgayXuatBan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNgayXuatBan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNgayXuatBan1KeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Số lượng :");

        txSoLuong2.setBackground(new java.awt.Color(204, 204, 255));
        txSoLuong2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txSoLuong2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txSoLuong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSoLuong2ActionPerformed(evt);
            }
        });
        txSoLuong2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txSoLuong2KeyPressed(evt);
            }
        });

        txLoaiSach1.setBackground(new java.awt.Color(204, 204, 255));
        txLoaiSach1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txLoaiSach1.setMaximumSize(new java.awt.Dimension(64, 26));
        txLoaiSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLoaiSach1ActionPerformed(evt);
            }
        });
        txLoaiSach1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txLoaiSach1KeyPressed(evt);
            }
        });

        txHoLotTacGia.setBackground(new java.awt.Color(204, 204, 255));
        txHoLotTacGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txHoLotTacGia.setMaximumSize(new java.awt.Dimension(64, 26));
        txHoLotTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHoLotTacGiaActionPerformed(evt);
            }
        });
        txHoLotTacGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txHoLotTacGiaKeyPressed(evt);
            }
        });

        txNhaXuatBan1.setBackground(new java.awt.Color(204, 204, 255));
        txNhaXuatBan1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNhaXuatBan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNhaXuatBan1.setMaximumSize(new java.awt.Dimension(64, 26));
        txNhaXuatBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNhaXuatBan1ActionPerformed(evt);
            }
        });
        txNhaXuatBan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNhaXuatBan1KeyPressed(evt);
            }
        });

        lbHoaDonKhachHng2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng2.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng2.setText("Chi tiết nhập kho");

        btThem2.setBackground(new java.awt.Color(204, 204, 255));
        btThem2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btThem2.setText("Thêm");
        btThem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThem2MouseClicked(evt);
            }
        });
        btThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem2ActionPerformed(evt);
            }
        });
        btThem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btThem2KeyPressed(evt);
            }
        });

        lbThongTinCaNhan3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbThongTinCaNhan3.setForeground(new java.awt.Color(255, 255, 255));
        lbThongTinCaNhan3.setText("Nhập kho");

        btXoa4.setBackground(new java.awt.Color(204, 204, 255));
        btXoa4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btXoa4.setText("Xóa");
        btXoa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoa4MouseClicked(evt);
            }
        });
        btXoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa4ActionPerformed(evt);
            }
        });

        lbTongTien1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTongTien1.setForeground(new java.awt.Color(255, 255, 255));
        lbTongTien1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongTien1.setText("Tổng tiền :");

        txTongTien4.setEditable(false);
        txTongTien4.setBackground(new java.awt.Color(204, 204, 255));
        txTongTien4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txTongTien4.setForeground(new java.awt.Color(255, 51, 51));
        txTongTien4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTongTien4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTien4ActionPerformed(evt);
            }
        });

        btThanhToan1.setBackground(new java.awt.Color(255, 255, 255));
        btThanhToan1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btThanhToan1.setForeground(new java.awt.Color(51, 0, 51));
        btThanhToan1.setText("Thanh Toán");
        btThanhToan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThanhToan1MouseClicked(evt);
            }
        });
        btThanhToan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThanhToan1ActionPerformed(evt);
            }
        });

        lbTacgia3.setBackground(new java.awt.Color(255, 255, 255));
        lbTacgia3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacgia3.setForeground(new java.awt.Color(255, 255, 255));
        lbTacgia3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTacgia3.setText("Tên tác giả :");

        txTenTacGia.setBackground(new java.awt.Color(204, 204, 255));
        txTenTacGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTenTacGia.setMaximumSize(new java.awt.Dimension(64, 26));
        txTenTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenTacGiaActionPerformed(evt);
            }
        });
        txTenTacGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTenTacGiaKeyPressed(evt);
            }
        });

        cbNhaCungCap.setBackground(new java.awt.Color(204, 204, 255));
        cbNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahasa", "Nhà xuất bản Thuận Hóa Huế", "Công ty cổ phẩn phát hành sách Tp.Hồ Chí Minh", "Công ty TNHH văn hóa Việt Long", "Công ty TNHH Đăng Nguyên", "Công ty cổ phần sách Mcbooks", "Nhà sách Nguyễn Du", "Nhà sách Bích Quân", "Công ty cổ phần sách thiết bị Cà Mau", "Công ty TNHH đầu tư và phát triển Kiwi" }));
        cbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaCungCapActionPerformed(evt);
            }
        });

        lbDongia2.setBackground(new java.awt.Color(255, 255, 255));
        lbDongia2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbDongia2.setForeground(new java.awt.Color(255, 255, 255));
        lbDongia2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDongia2.setText("Nhà cung cấp :");

        btBaCham1.setBackground(new java.awt.Color(204, 204, 255));
        btBaCham1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btBaCham1.setText("...");
        btBaCham1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBaCham1MouseClicked(evt);
            }
        });

        btBaCham2.setBackground(new java.awt.Color(204, 204, 255));
        btBaCham2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btBaCham2.setText("jButton5");
        btBaCham2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBaCham2MouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton6.setText("...");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNhapKhoLayout = new javax.swing.GroupLayout(panelNhapKho);
        panelNhapKho.setLayout(panelNhapKhoLayout);
        panelNhapKhoLayout.setHorizontalGroup(
            panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhapKhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                                .addComponent(btThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhapKhoLayout.createSequentialGroup()
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLoaisach1)
                                    .addComponent(lbTacgia1)
                                    .addComponent(LbTensach1)
                                    .addComponent(lbTacgia3)
                                    .addComponent(lbDongia2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNhapKhoLayout.createSequentialGroup()
                                                .addComponent(txHoLotTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                            .addComponent(txTenTacGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNhapKhoLayout.createSequentialGroup()
                                                .addComponent(txTenSach4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btBaCham1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNhapKhoLayout.createSequentialGroup()
                                                .addComponent(txLoaiSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btBaCham2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbNgayXuatBan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbNhaxuatban1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbDongia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txNgayXuatBan1)
                                            .addComponent(txSoLuong2)
                                            .addComponent(txDonGia3)
                                            .addComponent(txNhaXuatBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                                        .addComponent(cbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTongTien1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTongTien4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btThanhToan1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lbHoaDonKhachHng2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(lbThongTinCaNhan3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNhapKhoLayout.setVerticalGroup(
            panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThongTinCaNhan3)
                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbTensach1)
                                    .addComponent(txTenSach4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btBaCham1))
                                .addGap(18, 18, 18)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbLoaisach1)
                                    .addComponent(txLoaiSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btBaCham2))
                                .addGap(18, 18, 18)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTacgia1)
                                    .addComponent(txHoLotTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5))
                                .addGap(18, 18, 18)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTacgia3)
                                    .addComponent(txTenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btThem2))
                            .addGroup(panelNhapKhoLayout.createSequentialGroup()
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNhaxuatban1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNhaXuatBan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNgayXuatBan1)
                                    .addComponent(txNgayXuatBan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txSoLuong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbDongia1)
                                    .addComponent(txDonGia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHoaDonKhachHng2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btThanhToan1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTongTien4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(panelNhapKhoLayout.createSequentialGroup()
                        .addGroup(panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDongia2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelTacVu.add(panelNhapKho, "cardNhapKho");

        panelQuanLyHoaDon.setBackground(new java.awt.Color(110, 89, 222));
        panelQuanLyHoaDon.setPreferredSize(new java.awt.Dimension(838, 720));

        lbTimKiem2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem2.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem2.setText("Tìm kiếm");

        cbTimKiem4.setBackground(new java.awt.Color(204, 204, 204));
        cbTimKiem4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên" }));

        txTimKiem4.setBackground(new java.awt.Color(204, 204, 204));
        txTimKiem4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem4KeyPressed(evt);
            }
        });

        btTim2.setBackground(new java.awt.Color(204, 204, 204));
        btTim2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btTim2.setText("Tìm");
        btTim2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTim2MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mã hóa đơn :");

        txMaHoaDon.setEditable(false);
        txMaHoaDon1.setBackground(new java.awt.Color(204, 204, 204));
        txMaHoaDon1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaHoaDon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaHoaDon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaHoaDon1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ngày mua :");

        txNgayMua.setEditable(false);
        txNgayMua1.setBackground(new java.awt.Color(204, 204, 204));
        txNgayMua1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgayMua1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNgayMua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayMua1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Mã nhân viên :");

        txMaNhanVien.setEditable(false);
        txMaNhanVien2.setBackground(new java.awt.Color(204, 204, 204));
        txMaNhanVien2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaNhanVien2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txMaKhachHang.setEditable(false);
        txMaKhachHang1.setBackground(new java.awt.Color(204, 204, 204));
        txMaKhachHang1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaKhachHang1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaKhachHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaKhachHang1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mã khách hàng :");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Tổng tiền :");

        txTongTien1.setEditable(false);
        txTongTien2.setBackground(new java.awt.Color(204, 204, 204));
        txTongTien2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txTongTien2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTongTien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTien2ActionPerformed(evt);
            }
        });

        tbHoaDon2.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbHoaDon2.setBackground(new java.awt.Color(204, 204, 204));
        tbHoaDon2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbHoaDon2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"
            }
        ));
        tbHoaDon2.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbHoaDon2.getTableHeader().setReorderingAllowed(false);
        tbHoaDon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDon2MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tbHoaDon2);

        lbHoaDonKhachHng3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng3.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng3.setText("Hóa đơn");

        tbChiTietHoaDon2.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbChiTietHoaDon2.setBackground(new java.awt.Color(204, 204, 204));
        tbChiTietHoaDon2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbChiTietHoaDon2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"
            }
        ));
        tbChiTietHoaDon2.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbChiTietHoaDon2.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tbChiTietHoaDon2);

        lbChiTietHoaDon2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbChiTietHoaDon2.setForeground(new java.awt.Color(255, 255, 255));
        lbChiTietHoaDon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChiTietHoaDon2.setText("Chi tiết hóa đơn");

        btgLocHoaDon.add(rbTatCa);
        rbTatCa.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbTatCa.setForeground(new java.awt.Color(255, 255, 255));
        rbTatCa.setText("Tất cả");
        rbTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTatCaMouseClicked(evt);
            }
        });
        rbTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTatCaActionPerformed(evt);
            }
        });

        btgLocHoaDon.add(rbChuaXuLy);
        rbChuaXuLy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbChuaXuLy.setForeground(new java.awt.Color(255, 255, 255));
        rbChuaXuLy.setText("Chưa xử lý");
        rbChuaXuLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChuaXuLyMouseClicked(evt);
            }
        });
        rbChuaXuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChuaXuLyActionPerformed(evt);
            }
        });

        lbTimKiem3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem3.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem3.setText("Lọc hóa đơn :");

        btgLocHoaDon.add(rbDaXuLy);
        rbDaXuLy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbDaXuLy.setForeground(new java.awt.Color(255, 255, 255));
        rbDaXuLy.setText("Đã xử lý");
        rbDaXuLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDaXuLyMouseClicked(evt);
            }
        });
        rbDaXuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDaXuLyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQuanLyHoaDonLayout = new javax.swing.GroupLayout(panelQuanLyHoaDon);
        panelQuanLyHoaDon.setLayout(panelQuanLyHoaDonLayout);
        panelQuanLyHoaDonLayout.setHorizontalGroup(
            panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lbChiTietHoaDon2))
                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(lbHoaDonKhachHng3))
                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTimKiem2)
                            .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txMaHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txMaKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txMaNhanVien2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txNgayMua1))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                                .addComponent(cbTimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txTimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btTim2))
                            .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                                .addComponent(lbTimKiem3)
                                .addGap(18, 18, 18)
                                .addComponent(rbTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbChuaXuLy)
                                .addGap(32, 32, 32)
                                .addComponent(rbDaXuLy)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelQuanLyHoaDonLayout.setVerticalGroup(
            panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTimKiem2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim2))
                .addGap(18, 18, 18)
                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTatCa)
                    .addComponent(rbChuaXuLy)
                    .addComponent(lbTimKiem3)
                    .addComponent(rbDaXuLy))
                .addGap(28, 28, 28)
                .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                        .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgayMua1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMaNhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelQuanLyHoaDonLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTongTien2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHoaDonKhachHng3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChiTietHoaDon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTacVu.add(panelQuanLyHoaDon, "cardQuanLyHoaDon");

        panelQuanLyKho.setBackground(new java.awt.Color(110, 89, 222));
        panelQuanLyKho.setMaximumSize(new java.awt.Dimension(838, 720));
        panelQuanLyKho.setPreferredSize(new java.awt.Dimension(838, 720));

        LbTensach2.setBackground(new java.awt.Color(255, 255, 255));
        LbTensach2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        LbTensach2.setForeground(new java.awt.Color(255, 255, 255));
        LbTensach2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTensach2.setText("Mã phiếu nhập :");

        lbTacgia2.setBackground(new java.awt.Color(255, 255, 255));
        lbTacgia2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbTacgia2.setForeground(new java.awt.Color(255, 255, 255));
        lbTacgia2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTacgia2.setText("Ngày nhập :");

        txMaPhieuNhap.setBackground(new java.awt.Color(204, 204, 255));
        txMaPhieuNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaPhieuNhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaPhieuNhap.setMaximumSize(new java.awt.Dimension(64, 26));
        txMaPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaPhieuNhapActionPerformed(evt);
            }
        });

        tbPhieuNhap1.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbPhieuNhap1.setBackground(new java.awt.Color(204, 204, 255));
        tbPhieuNhap1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbPhieuNhap1.setForeground(new java.awt.Color(51, 0, 51));
        tbPhieuNhap1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhieuNhap1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbPhieuNhap1.getTableHeader().setReorderingAllowed(false);
        tbPhieuNhap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuNhap1MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tbPhieuNhap1);
        if (tbPhieuNhap1.getColumnModel().getColumnCount() > 0) {
            tbPhieuNhap1.getColumnModel().getColumn(0).setResizable(false);
            tbPhieuNhap1.getColumnModel().getColumn(1).setResizable(false);
            tbPhieuNhap1.getColumnModel().getColumn(2).setResizable(false);
            tbPhieuNhap1.getColumnModel().getColumn(3).setResizable(false);
            tbPhieuNhap1.getColumnModel().getColumn(4).setResizable(false);
        }

        lbLoaisach2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbLoaisach2.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaisach2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbLoaisach2.setText("Mã nhân viên :");

        txMaNhanVien3.setBackground(new java.awt.Color(204, 204, 255));
        txMaNhanVien3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaNhanVien3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaNhanVien3.setMaximumSize(new java.awt.Dimension(64, 26));
        txMaNhanVien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaNhanVien3ActionPerformed(evt);
            }
        });

        txNgayNhap.setBackground(new java.awt.Color(204, 204, 255));
        txNgayNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgayNhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNgayNhap.setMaximumSize(new java.awt.Dimension(64, 26));
        txNgayNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayNhapActionPerformed(evt);
            }
        });

        LbTensach3.setBackground(new java.awt.Color(255, 255, 255));
        LbTensach3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        LbTensach3.setForeground(new java.awt.Color(255, 255, 255));
        LbTensach3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTensach3.setText("Mã nhà cung cấp :");

        txMaNhaCungCap.setBackground(new java.awt.Color(204, 204, 255));
        txMaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaNhaCungCap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaNhaCungCap.setMaximumSize(new java.awt.Dimension(64, 26));
        txMaNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaNhaCungCapActionPerformed(evt);
            }
        });

        LbTensach4.setBackground(new java.awt.Color(255, 255, 255));
        LbTensach4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        LbTensach4.setForeground(new java.awt.Color(255, 255, 255));
        LbTensach4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTensach4.setText("Tổng tiền :");

        txTongTien3.setBackground(new java.awt.Color(204, 204, 255));
        txTongTien3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txTongTien3.setForeground(new java.awt.Color(255, 0, 0));
        txTongTien3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTongTien3.setMaximumSize(new java.awt.Dimension(64, 26));
        txTongTien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTien3ActionPerformed(evt);
            }
        });

        lbHoaDonKhachHng4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng4.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng4.setText("Phiếu nhập");

        tbPhieuNhap1.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbChiTietPhieuNhap.setBackground(new java.awt.Color(204, 204, 255));
        tbChiTietPhieuNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbChiTietPhieuNhap.setForeground(new java.awt.Color(51, 0, 51));
        tbChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Mã sách", "Số lượng", "Đơn giá nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChiTietPhieuNhap.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbChiTietPhieuNhap.getTableHeader().setReorderingAllowed(false);
        tbChiTietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tbChiTietPhieuNhap);
        if (tbChiTietPhieuNhap.getColumnModel().getColumnCount() > 0) {
            tbChiTietPhieuNhap.getColumnModel().getColumn(0).setResizable(false);
            tbChiTietPhieuNhap.getColumnModel().getColumn(1).setResizable(false);
            tbChiTietPhieuNhap.getColumnModel().getColumn(2).setResizable(false);
            tbChiTietPhieuNhap.getColumnModel().getColumn(3).setResizable(false);
        }

        lbHoaDonKhachHng5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng5.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng5.setText("Chi tiết phiếu nhập");

        lbTimKiem4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem4.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem4.setText("Tìm kiếm");

        cbTimKiem5.setBackground(new java.awt.Color(204, 204, 204));
        cbTimKiem5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu nhập", "Mã nhân viên" }));

        btTim3.setBackground(new java.awt.Color(204, 204, 204));
        btTim3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btTim3.setText("Tìm");
        btTim3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTim3MouseClicked(evt);
            }
        });

        txTimKiem5.setBackground(new java.awt.Color(204, 204, 204));
        txTimKiem5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem5KeyPressed(evt);
            }
        });

        lbTimKiem5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem5.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem5.setText("Lọc ngày nhập :");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ngày bắt đầu : ");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ngày kết thúc : ");

        btLoc.setBackground(new java.awt.Color(204, 204, 255));
        btLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLoc.setText("Lọc");
        btLoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLocMouseClicked(evt);
            }
        });
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        btHienThiTatCa.setBackground(new java.awt.Color(204, 204, 255));
        btHienThiTatCa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btHienThiTatCa.setText("Hiển thị tất cả");
        btHienThiTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHienThiTatCaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelQuanLyKhoLayout = new javax.swing.GroupLayout(panelQuanLyKho);
        panelQuanLyKho.setLayout(panelQuanLyKhoLayout);
        panelQuanLyKhoLayout.setHorizontalGroup(
            panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(lbHoaDonKhachHng5))
                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLoaisach2)
                                    .addComponent(LbTensach2))
                                .addGap(37, 37, 37)
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txMaNhanVien3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbTensach3)
                                    .addComponent(lbTacgia2))
                                .addGap(18, 18, 18)
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                        .addComponent(txMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                        .addComponent(txNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(LbTensach4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTongTien3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                        .addComponent(cbTimKiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTimKiem5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btTim3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dcNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dcNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbTimKiem4))
                                .addGap(18, 18, 18)
                                .addComponent(btLoc)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btHienThiTatCa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyKhoLayout.createSequentialGroup()
                        .addComponent(lbHoaDonKhachHng4)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyKhoLayout.createSequentialGroup()
                        .addComponent(lbTimKiem5)
                        .addGap(182, 182, 182))))
        );
        panelQuanLyKhoLayout.setVerticalGroup(
            panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                        .addComponent(lbTimKiem4)
                        .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTimKiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTim3))
                        .addGap(12, 12, 12)
                        .addComponent(btHienThiTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                        .addComponent(lbTimKiem5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyKhoLayout.createSequentialGroup()
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelQuanLyKhoLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(dcNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dcNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyKhoLayout.createSequentialGroup()
                                .addComponent(btLoc)
                                .addGap(13, 13, 13)))))
                .addGap(18, 18, 18)
                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbTensach2)
                    .addComponent(txMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTensach3)
                    .addComponent(txMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelQuanLyKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoaisach2)
                    .addComponent(txMaNhanVien3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTacgia2)
                    .addComponent(txNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTongTien3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTensach4))
                .addGap(8, 8, 8)
                .addComponent(lbHoaDonKhachHng4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHoaDonKhachHng5)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );

        panelTacVu.add(panelQuanLyKho, "cardQuanLyKho");

        panelXuLyHoaDon.setBackground(new java.awt.Color(102, 95, 215));
        panelXuLyHoaDon.setPreferredSize(new java.awt.Dimension(838, 720));

        lbChiTietHoaDon3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbChiTietHoaDon3.setForeground(new java.awt.Color(255, 255, 255));
        lbChiTietHoaDon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChiTietHoaDon3.setText("Chi tiết hóa đơn");

        tbChiTietHoaDon3.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbChiTietHoaDon3.setBackground(new java.awt.Color(204, 204, 204));
        tbChiTietHoaDon3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbChiTietHoaDon3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"
            }
        ));
        tbChiTietHoaDon3.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbChiTietHoaDon3.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tbChiTietHoaDon3);

        lbHoaDonKhachHng6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHoaDonKhachHng6.setForeground(new java.awt.Color(255, 255, 255));
        lbHoaDonKhachHng6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoaDonKhachHng6.setText("Hóa đơn");

        tbHoaDon3.getTableHeader().setFont(new Font("Arial",Font.PLAIN,14));
        tbHoaDon3.setBackground(new java.awt.Color(204, 204, 204));
        tbHoaDon3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbHoaDon3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên", "Ngày mua", "Tổng tiền", "Tình trạng"
            }
        ));
        tbHoaDon3.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tbHoaDon3.getTableHeader().setReorderingAllowed(false);
        tbHoaDon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDon3MouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tbHoaDon3);

        txMaNhanVien.setEditable(false);
        txMaNhanVien4.setBackground(new java.awt.Color(204, 204, 204));
        txMaNhanVien4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaNhanVien4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btgLocHoaDon.add(rbTatCa1);
        rbTatCa1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbTatCa1.setForeground(new java.awt.Color(255, 255, 255));
        rbTatCa1.setText("Tất cả");
        rbTatCa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTatCa1MouseClicked(evt);
            }
        });
        rbTatCa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTatCa1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Mã nhân viên :");

        txNgayMua.setEditable(false);
        txNgayMua2.setBackground(new java.awt.Color(204, 204, 204));
        txNgayMua2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txNgayMua2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNgayMua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNgayMua2ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Ngày mua :");

        txMaHoaDon.setEditable(false);
        txMaHoaDon2.setBackground(new java.awt.Color(204, 204, 204));
        txMaHoaDon2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaHoaDon2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaHoaDon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaHoaDon2ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Mã hóa đơn :");

        btTim4.setBackground(new java.awt.Color(204, 204, 204));
        btTim4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btTim4.setText("Tìm");
        btTim4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTim4MouseClicked(evt);
            }
        });

        txTongTien1.setEditable(false);
        txTongTien5.setBackground(new java.awt.Color(204, 204, 204));
        txTongTien5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txTongTien5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTongTien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTongTien5ActionPerformed(evt);
            }
        });

        txTimKiem6.setBackground(new java.awt.Color(204, 204, 204));
        txTimKiem6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTimKiem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTimKiem6ActionPerformed(evt);
            }
        });
        txTimKiem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTimKiem6KeyPressed(evt);
            }
        });

        cbTimKiem6.setBackground(new java.awt.Color(204, 204, 204));
        cbTimKiem6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbTimKiem6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên" }));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Tổng tiền :");

        btgLocHoaDon.add(rbDaXuLy1);
        rbDaXuLy1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbDaXuLy1.setForeground(new java.awt.Color(255, 255, 255));
        rbDaXuLy1.setText("Đã xử lý");
        rbDaXuLy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDaXuLy1MouseClicked(evt);
            }
        });
        rbDaXuLy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDaXuLy1ActionPerformed(evt);
            }
        });

        lbTimKiem6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem6.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem6.setText("Tìm kiếm");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Mã khách hàng :");

        lbTimKiem7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTimKiem7.setForeground(new java.awt.Color(255, 255, 255));
        lbTimKiem7.setText("Lọc hóa đơn :");

        txMaKhachHang.setEditable(false);
        txMaKhachHang3.setBackground(new java.awt.Color(204, 204, 204));
        txMaKhachHang3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txMaKhachHang3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMaKhachHang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaKhachHang3ActionPerformed(evt);
            }
        });

        btgLocHoaDon.add(rbChuaXuLy1);
        rbChuaXuLy1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rbChuaXuLy1.setForeground(new java.awt.Color(255, 255, 255));
        rbChuaXuLy1.setText("Chưa xử lý");
        rbChuaXuLy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChuaXuLy1MouseClicked(evt);
            }
        });
        rbChuaXuLy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChuaXuLy1ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Tình trạng :");

        txMaNhanVien.setEditable(false);
        txTinhTrang1.setBackground(new java.awt.Color(204, 204, 204));
        txTinhTrang1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txTinhTrang1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txTinhTrang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTinhTrang1ActionPerformed(evt);
            }
        });

        btBanGiaoVanChuyen.setBackground(new java.awt.Color(204, 204, 204));
        btBanGiaoVanChuyen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btBanGiaoVanChuyen.setText("Bàn giao vận chuyển");
        btBanGiaoVanChuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBanGiaoVanChuyenMouseClicked(evt);
            }
        });
        btBanGiaoVanChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBanGiaoVanChuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelXuLyHoaDonLayout = new javax.swing.GroupLayout(panelXuLyHoaDon);
        panelXuLyHoaDon.setLayout(panelXuLyHoaDonLayout);
        panelXuLyHoaDonLayout.setHorizontalGroup(
            panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMaKhachHang3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txMaNhanVien4)
                            .addComponent(txNgayMua2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txTongTien5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txTinhTrang1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                        .addComponent(cbTimKiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTimKiem6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btTim4))
                                    .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                        .addComponent(lbTimKiem6)
                                        .addGap(329, 329, 329)
                                        .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                                .addComponent(lbTimKiem7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbTatCa1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(rbChuaXuLy1)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDaXuLy1))
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(lbChiTietHoaDon3))
                            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(lbHoaDonKhachHng6)))
                        .addContainerGap(42, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXuLyHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBanGiaoVanChuyen)
                .addContainerGap())
            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelXuLyHoaDonLayout.setVerticalGroup(
            panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXuLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTimKiem6)
                    .addComponent(lbTimKiem7)
                    .addComponent(rbTatCa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTimKiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTimKiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim4)
                    .addComponent(rbChuaXuLy1)
                    .addComponent(rbDaXuLy1))
                .addGap(18, 18, 18)
                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMaHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNgayMua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTinhTrang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelXuLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMaKhachHang3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMaNhanVien4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTongTien5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbHoaDonKhachHng6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChiTietHoaDon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBanGiaoVanChuyen)
                .addGap(10, 10, 10))
        );

        panelTacVu.add(panelXuLyHoaDon, "cardXuLyHoaDon");

        panelMain.add(panelTacVu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelMain.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemGioHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemGioHangActionPerformed

    private void btSanPhamSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSanPhamSachMouseClicked
        try {
            SachBUS sachBus = new SachBUS();
            tbSanPhamSach.setModel(sachBus.hienThiSanPhamSach());
            cardLayout.show(panelTacVu, "cardSanPhamSach");
            setSelectionBackGround(btSanPhamSach);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSanPhamSachMouseClicked

    private void btTrangChu11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrangChu11MouseReleased

    private void btTrangChu11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrangChu11MousePressed

    private void btTrangChu11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrangChu11MouseExited

    private void btTrangChu11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrangChu11MouseEntered

    private void btTrangChu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu11MouseClicked
        setSelectionBackGround(btTrangChu1);
        cardLayout.show(panelTacVu, "cardTrangChu");

    }//GEN-LAST:event_btTrangChu11MouseClicked

    private void btDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangXuatMouseClicked
        logOut();
    }//GEN-LAST:event_btDangXuatMouseClicked

    private void btSanPhamSachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSanPhamSachMouseEntered

    }//GEN-LAST:event_btSanPhamSachMouseEntered

    private void btGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGioHangMouseClicked
        cardLayout.show(panelTacVu, "cardGioHang");
        setSelectionBackGround(btGioHang);
    }//GEN-LAST:event_btGioHangMouseClicked

    private void btHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHoaDonMouseClicked
        cardLayout.show(panelTacVu, "cardTheoDoiBill");
        setSelectionBackGround(btHoaDon);

        try {
            HoaDonBUS hoaDonBus = new HoaDonBUS();
            ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();

            hoaDonBus.docDuLieuHoaDonKhachHang();
            chiTietHoaDonBus.docDuLieuChiTietHoaDon();

            tbHoaDon.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDon));
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btHoaDonMouseClicked

    private void txThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txThanhTienActionPerformed

    private void btQuanLySanPham21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLySanPham21MouseClicked
        setSelectionBackGround(btQuanLySanPham2);
        cardLayout.show(panelTacVu, "cardQuanLySanPham");

        try {
            AdminBUS adminBus = new AdminBUS();
            tbQuanLySanPham.setModel(adminBus.hienThiQuanLySanPhamAdmin());
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btQuanLySanPham21MouseClicked

    private void btQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLyNhanVienMouseClicked
        setSelectionBackGround(btQuanLyNhanVien);
        cardLayout.show(panelTacVu, "cardQuanLyNhanVien");

        NhanVienBUS nhanVienBus = new NhanVienBUS();
        tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());

    }//GEN-LAST:event_btQuanLyNhanVienMouseClicked

    private void btQuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLyNhanVienMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btQuanLyNhanVienMouseEntered

    private void btQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLyKhachHangMouseClicked
        setSelectionBackGround(btQuanLyKhachHang);
        cardLayout.show(panelTacVu, "cardQuanLyKhachHang");

        KhachHangBUS khachHangBus = new KhachHangBUS();
        tbQuanLyKhachHang.setModel(khachHangBus.hienThiKhachHang());
    }//GEN-LAST:event_btQuanLyKhachHangMouseClicked

    private void btNhapKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNhapKhoMouseClicked
        setSelectionBackGround(btNhapKho);
        cardLayout.show(panelTacVu, "cardNhapKho");

    }//GEN-LAST:event_btNhapKhoMouseClicked

    private void btThongKeDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeDoanhThuMouseClicked
        setSelectionBackGround(btThongKeDoanhThu);
        cardLayout.show(panelTacVu, "cardThongKe");

        try {
            HoaDonBUS hoaDonBus = new HoaDonBUS();
            ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();

            hoaDonBus.docDuLieuHoaDonALL();
            chiTietHoaDonBus.docDuLieuChiTietHoaDonALL();

            tbHoaDon1.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btThongKeDoanhThuMouseClicked

    private void btDangXuat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangXuat3MouseClicked
        logOut();
    }//GEN-LAST:event_btDangXuat3MouseClicked

    private void btTrangChu21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrangChu21MouseClicked
        setSelectionBackGround(btTrangChu2);
        cardLayout.show(panelTacVu, "cardTrangChu");

    }//GEN-LAST:event_btTrangChu21MouseClicked

    private void btQuanLySanPham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLySanPham1MouseClicked
        setSelectionBackGround(btQuanLySanPham1);
        cardLayout.show(panelTacVu, "cardQuanLySanPham");

        try {
            AdminBUS adminBus = new AdminBUS();
            tbQuanLySanPham.setModel(adminBus.hienThiQuanLySanPhamAdmin());
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btQuanLySanPham1MouseClicked

    private void btXuLyHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXuLyHoaDonMouseClicked
        setSelectionBackGround(btXuLyHoaDon);
        cardLayout.show(panelTacVu, "cardXuLyHoaDon");
        try {
            HoaDonBUS hoaDonBus = new HoaDonBUS();
            ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();

            hoaDonBus.docDuLieuHoaDonALL();
            chiTietHoaDonBus.docDuLieuChiTietHoaDonALL();

            tbHoaDon3.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btXuLyHoaDonMouseClicked

    private void btDangXuat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangXuat1MouseClicked
        logOut();
    }//GEN-LAST:event_btDangXuat1MouseClicked

    private void txTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSachActionPerformed

    private void tbSanPhamSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamSachMouseClicked
        try {
            valueOfRowSanPhamSach(tbSanPhamSach);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbSanPhamSachMouseClicked

    private void cbLoaiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiSachActionPerformed
        SachBUS sachBus = new SachBUS();
        try {
            sachBus.hienThiLoaiSach(tbSanPhamSach, cbLoaiSach);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbLoaiSachActionPerformed

    private void btTim1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTim1MouseClicked
        timKiemSach(cbTimKiem1, tbSanPhamSach, txTimKiem1);

    }//GEN-LAST:event_btTim1MouseClicked

    private void txTenSach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSach2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSach2ActionPerformed

    private void btThemGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemGioHangMouseClicked
        try {
            SachBUS sachBus = new SachBUS();
            boolean checkSoLuong = sachBus.kiemTraSoLuong(Integer.parseInt(txMaSach.getText()), (int) spinSoLuong.getValue());

            if (checkSoLuong) {
                sachBus.hienThiGioHang(tbSanPhamSach, tbGioHang, modelGioHang, spinSoLuong, txTongTien, txThanhTien);
                spinSoLuong.setValue(1);
                JOptionPane.showMessageDialog(null, "Thêm vào giỏ hàng thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Số lượng sách không đủ để cung cấp", "Không đủ số lương", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btThemGioHangMouseClicked

    private void tbGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGioHangMouseClicked
        valueOfRowGioHang();
    }//GEN-LAST:event_tbGioHangMouseClicked

    private void txTimKiem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            timKiemSach(cbTimKiem1, tbSanPhamSach, txTimKiem1);
        }

    }//GEN-LAST:event_txTimKiem1KeyPressed

    private void btXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMouseClicked
        SachBUS sachBus = new SachBUS();
        int row = tbGioHang.getSelectedRow();

        sachBus.xoaSanPham(modelGioHang, row, txThanhTien, txTongTien);
        tbGioHang.setModel(modelGioHang);
    }//GEN-LAST:event_btXoaMouseClicked

    private void btThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThanhToanMouseClicked
        if (tbGioHang.getModel().getRowCount() != 0) {
            try {
                DefaultTableModel temp = new DefaultTableModel(new String[]{"Mã sách", "Tên sách", "Tác giả", "Loại sách", "Ngày xuất bản", "Nhà xuất bản", "Số lượng", "Đơn giá"}, 0);

                HoaDonBUS hoaDonBus = new HoaDonBUS();
                ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();

                hoaDonBus.thanhToanHoaDon(txThanhTien);
                chiTietHoaDonBus.thanhToanChiTietHoaDon(modelGioHang);

                SachBUS sachBus = new SachBUS();
                sachBus.capNhapSoLuong(modelGioHang);

                modelGioHang = temp;
                tbGioHang.setModel(modelGioHang);

                txLoaiSach3.setText("");
                txTacGia2.setText("");
                txTenSach2.setText("");
                txDonGia1.setText("");
                txSoLuong.setText("");
                txTongTien.setText("");
                txThanhTien.setText("");

                JOptionPane.showMessageDialog(null, "Thanh toán thành công !");
            } catch (SQLException ex) {
                Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Giỏ hàng của bạn đang trống,mua hàng thêm nhé <3");
        }

    }//GEN-LAST:event_btThanhToanMouseClicked

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();
        valueOfRowHoaDon();
        int row = tbHoaDon.getSelectedRow();
        tbChiTietHoaDon.setModel(chiTietHoaDonBus.hienThiChiTietHoaDon(row, tbHoaDon, arrayList_ChiTietHoaDon));

    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void btThongTInCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongTInCaNhanMouseClicked
        setSelectionBackGround(btThongTInCaNhan2);
        cardLayout.show(panelTacVu, "cardThongTinCaNhanKhachHang");

        KhachHangBUS khachHangBus = new KhachHangBUS();
        KhachHangDTO khachHang = khachHangBus.thongTinKhachHang();

        txHoLot.setText(khachHang.getHoLot());
        txTen.setText(khachHang.getTen());
        txUser.setText(khachHang.getUser());
        txMatKhau.setText(khachHang.getPass());
        if (khachHang.getGioiTinh().equals("Nam")) {
            rbtNam.setSelected(true);
        } else {
            rbtNu.setSelected(true);
        }

        txSoDienThoai.setText(khachHang.getSoDienThoai());
        txNgaySinh.setText(khachHang.getNgaySinh());

        txXacNhanMatKhau.setText(khachHang.getPass());
    }//GEN-LAST:event_btThongTInCaNhanMouseClicked

    private void btSuaThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaThongTinMouseClicked
        KhachHangBUS khachHangBus = new KhachHangBUS();
        KhachHangDTO khachHang = new KhachHangDTO();
        HoaDonBUS hoaDonBus = new HoaDonBUS();

        khachHang.setHoLot(txHoLot.getText());
        khachHang.setTen(txTen.getText());
        khachHang.setPass(txMatKhau.getText());
        khachHang.setUser(txUser.getText());
        if (rbtNam.isSelected()) {
            khachHang.setGioiTinh("Nam");
        } else {
            khachHang.setGioiTinh("Nữ");
        }
        khachHang.setSoDienThoai(txSoDienThoai.getText());
        khachHang.setNgaySinh(txNgaySinh.getText());

        if (txXacNhanMatKhau.getText().equals(khachHang.getPass()))
            khachHangBus.suaThongTinKhachHang(khachHang);
        else
            JOptionPane.showMessageDialog(null, "Mật khẩu và xác nhận không trùng khớp");
    }//GEN-LAST:event_btSuaThongTinMouseClicked

    private void txLoaiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLoaiSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLoaiSachActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void txTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTaiKhoanActionPerformed

    private void txNgaySinh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgaySinh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgaySinh1ActionPerformed

    private void txMatKhau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMatKhau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMatKhau1ActionPerformed

    private void cbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimKiemActionPerformed
        if (cbTimKiem.getSelectedItem().equals("Tất cả")) {
            NhanVienBUS nhanVienBus = new NhanVienBUS();
            tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());
        }
    }//GEN-LAST:event_cbTimKiemActionPerformed

    private void txTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTimKiemActionPerformed

    private void tbQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyNhanVienMouseClicked
        valueOfRowNhanVien();
    }//GEN-LAST:event_tbQuanLyNhanVienMouseClicked

    private void btThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMouseClicked

        try {
            NhanVienBUS nhanVienBus = new NhanVienBUS();
            AdminBUS adminBus = new AdminBUS();
            NhanVienDTO nhanVien = new NhanVienDTO();

            nhanVien.setHoLot(txHoLot1.getText());
            nhanVien.setTen(txTen1.getText());
            nhanVien.setNgaySinh(txNgaySinh1.getText());
            if (rbNam.isSelected()) {
                nhanVien.setGioiTinh("Nam");
            } else {
                nhanVien.setGioiTinh("Nữ");
            }
            nhanVien.setSoDienThoai(txSoDienThoai1.getText());
            nhanVien.setUser(txTaiKhoan.getText());
            nhanVien.setPass(txMatKhau1.getText());
            nhanVien.setTinhTrangHoatDong(txHoatDong.getText());

            adminBus.themNhanVien(nhanVien);
            tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btThemMouseClicked

    private void btThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemMouseEntered

    private void txDonGia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDonGia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDonGia2ActionPerformed

    private void cbTimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimKiem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTimKiem2ActionPerformed

    private void tbQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLySanPhamMouseClicked
        valueOfRowQuanLySanPham();
    }//GEN-LAST:event_tbQuanLySanPhamMouseClicked

    private void btSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaMouseClicked
        AdminBUS adminBus = new AdminBUS();
        NhanVienBUS nhanVienBus = new NhanVienBUS();
        NhanVienDTO nhanVien = new NhanVienDTO();
        int row = tbQuanLyNhanVien.getSelectedRow();

        nhanVien.setId(Integer.parseInt(txMaNhanVien1.getText()));
        nhanVien.setHoLot(txHoLot1.getText());
        nhanVien.setTen(txTen1.getText());
        nhanVien.setNgaySinh(txNgaySinh1.getText());
        if (rbNam.isSelected()) {
            nhanVien.setGioiTinh("Nam");
        } else {
            nhanVien.setGioiTinh("Nữ");
        }
        nhanVien.setSoDienThoai(txSoDienThoai1.getText());
        nhanVien.setUser(txTaiKhoan.getText());
        nhanVien.setPass(txMatKhau1.getText());
        nhanVien.setTinhTrangHoatDong(txHoatDong.getText());

        if (row >= 0) {
            adminBus.suaNhanVien(row, nhanVien, txTaiKhoan);
            tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());
            tbQuanLyNhanVien.getSelectionModel().setSelectionInterval(row, row); // chon lai row dang Selected 
        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn sửa");
        }


    }//GEN-LAST:event_btSuaMouseClicked

    private void btXoa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoa1MouseClicked
        NhanVienBUS nhanVienBus = new NhanVienBUS();
        AdminBUS adminBus = new AdminBUS();
        int row = tbQuanLyNhanVien.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có thật sự muốn xóa nhân viên này ?", "Xóa nhân viên", JOptionPane.YES_NO_OPTION);

        if (row >= 0) {
            if (luaChon == 0) {
                adminBus.xoaNhanVien(row);
                tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());
                JOptionPane.showMessageDialog(null, "Xóa thành công");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn xóa");
        }

    }//GEN-LAST:event_btXoa1MouseClicked

    private void cbHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHienMatKhauActionPerformed

    private void cbHienMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhauMouseClicked
        if (cbHienMatKhau.isSelected()) {
            txMatKhau.setEchoChar((char) 0);
        } else {
            txMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbHienMatKhauMouseClicked

    private void cbHienMatKhau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhau1MouseClicked
        if (cbHienMatKhau1.isSelected()) {
            txXacNhanMatKhau.setEchoChar((char) 0);
        } else {
            txXacNhanMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbHienMatKhau1MouseClicked

    private void btTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTimKiemMouseClicked
        timKiemNhanVien();
    }//GEN-LAST:event_btTimKiemMouseClicked

    private void txTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            timKiemNhanVien();
        }

    }//GEN-LAST:event_txTimKiemKeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        NhanVienBUS nhanVienBus = new NhanVienBUS();
        tbQuanLyNhanVien.setModel(nhanVienBus.hienThiNhanVien());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        AdminBUS adminBus = new AdminBUS();
        tbQuanLyNhanVien.setModel(adminBus.sortNameNhanVien());
    }//GEN-LAST:event_jButton2MouseClicked

    private void btThongTinCaNhan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongTinCaNhan1MouseClicked
        setSelectionBackGround(btThongTinCaNhan1);
        cardLayout.show(panelTacVu, "cardThongTinCaNhanNhanVien");

        NhanVienBUS nhanVienBus = new NhanVienBUS();
        NhanVienDTO nhanVien = nhanVienBus.thongTinNhanVien();

        txHoLot2.setText(nhanVien.getHoLot());
        txTen2.setText(nhanVien.getTen());
        txUser1.setText(nhanVien.getUser());
        txMatKhau2.setText(nhanVien.getPass());
        if (nhanVien.getGioiTinh().equals("Nam")) {
            rbtNam1.setSelected(true);
        } else {
            rbtNu1.setSelected(true);
        }

        txSoDienThoai2.setText(nhanVien.getSoDienThoai());
        txNgaySinh3.setText(nhanVien.getNgaySinh());

        txXacNhanMatKhau1.setText(nhanVien.getPass());
    }//GEN-LAST:event_btThongTinCaNhan1MouseClicked

    private void cbHienMatKhau2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhau2MouseClicked
        if (cbHienMatKhau2.isSelected()) {
            txMatKhau2.setEchoChar((char) 0);
        } else {
            txMatKhau2.setEchoChar('*');
        }
    }//GEN-LAST:event_cbHienMatKhau2MouseClicked

    private void cbHienMatKhau2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHienMatKhau2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHienMatKhau2ActionPerformed

    private void cbHienMatKhau3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhau3MouseClicked
        if (cbHienMatKhau3.isSelected()) {
            txXacNhanMatKhau1.setEchoChar((char) 0);
        } else {
            txXacNhanMatKhau1.setEchoChar('*');
        }
    }//GEN-LAST:event_cbHienMatKhau3MouseClicked

    private void btSuaThongTin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaThongTin1MouseClicked
        NhanVienBUS nhanVienBus = new NhanVienBUS();
        NhanVienDTO nhanVien = new NhanVienDTO();

        nhanVien.setHoLot(txHoLot2.getText());
        nhanVien.setTen(txTen2.getText());
        nhanVien.setPass(txMatKhau2.getText());
        nhanVien.setUser(txUser1.getText());
        if (rbtNam1.isSelected()) {
            nhanVien.setGioiTinh("Nam");
        } else {
            nhanVien.setGioiTinh("Nữ");
        }
        nhanVien.setSoDienThoai(txSoDienThoai2.getText());
        nhanVien.setNgaySinh(txNgaySinh3.getText());

        if (txXacNhanMatKhau1.getText().equals(nhanVien.getPass()))
            nhanVienBus.suaThongTinNhanVien(nhanVien);
        else
            JOptionPane.showMessageDialog(null, "Mật khẩu và xác nhận không trùng khớp");
    }//GEN-LAST:event_btSuaThongTin1MouseClicked

    private void cbLoaiSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiSach1ActionPerformed
        AdminBUS adminBus = new AdminBUS();
        adminBus.hienThiLoaiSachQLSP(tbQuanLySanPham, cbLoaiSach1);

    }//GEN-LAST:event_cbLoaiSach1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btSua1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSua1MouseClicked
        int row = tbQuanLySanPham.getSelectedRow();
        SachBUS sachBus = new SachBUS();

        if (row >= 0) {

            AdminBUS adminBus = new AdminBUS();
            SachDTO sach = new SachDTO();

            sach.setMaSach(Integer.parseInt(txMaSach1.getText()));
            sach.setTenSach(txTenSach1.getText());

            if (adminBus.timMaLoaiSach(cbLoaiSach2) != 0) {
                sach.setMaLoai(adminBus.timMaLoaiSach(cbLoaiSach2));
            } else {
                System.out.println("Loai sach khong co");
            }

            if (adminBus.timMaTacGia(cbTacGia) != 0) {
                sach.setMaTacGia(adminBus.timMaTacGia(cbTacGia));
            } else {
                System.out.println("Tac gia khong co");
            }

            if (adminBus.timMaNhaXuatBan(cbNhaXuatBan) != 0) {
                sach.setmaNXB(adminBus.timMaNhaXuatBan(cbNhaXuatBan));
            } else {
                System.out.println("Nha Xuat Ban khong co");
            }

            sach.setNgayXuatBan(txNgayXuatBan.getText());
            sach.setSoLuong(Integer.parseInt(txSoLuong1.getText()));
            sach.setDonGia(Integer.parseInt(sachBus.removeThousandSeparators(txDonGia2.getText())));
            sach.setTinhTrang(txTinhTrang.getText());

            if (adminBus.checkNgaySinh(txNgayXuatBan.getText())) {
                adminBus.suaSach(row, sach);
                JOptionPane.showMessageDialog(null, "Sửa thông tin sách thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Ngày xuất bản không hợp lệ ! Nhập ngày xuất bản theo định dạng yyyy-mm-dd (VD: 2001-12-23)");
            }

            try {
                tbQuanLySanPham.setModel(adminBus.hienThiQuanLySanPhamAdmin());
            } catch (SQLException ex) {
                System.out.println("Cập nhật Quan Ly San Pham model lỗi");
                Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn sửa");
    }//GEN-LAST:event_btSua1MouseClicked

    private void txMaSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaSach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaSach1ActionPerformed

    private void cbTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTacGiaActionPerformed

    private void txTenSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSach1ActionPerformed

    private void txSoLuong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSoLuong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSoLuong1ActionPerformed

    private void btnTimkiem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiem1MouseClicked
        try {
            timKiemQuanLySanPham(cbTimKiem2, tbQuanLySanPham, txTimKiem2);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimkiem1MouseClicked

    private void txTimKiem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                timKiemQuanLySanPham(cbTimKiem2, tbQuanLySanPham, txTimKiem2);
            } catch (SQLException ex) {
                Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txTimKiem2KeyPressed

    private void tbQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyKhachHangMouseClicked
        valueOfRowKhachHang();
    }//GEN-LAST:event_tbQuanLyKhachHangMouseClicked

    private void btThem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThem1MouseClicked
        try {
            KhachHangBUS khachHangBus = new KhachHangBUS();
            AdminBUS adminBus = new AdminBUS();
            KhachHangDTO khachHang = new KhachHangDTO();

            khachHang.setHoLot(txHoLot3.getText());
            khachHang.setTen(txTen3.getText());
            khachHang.setNgaySinh(txNgaySinh2.getText());
            if (rbNam1.isSelected()) {
                khachHang.setGioiTinh("Nam");
            } else {
                khachHang.setGioiTinh("Nữ");
            }
            khachHang.setSoDienThoai(txSoDienThoai3.getText());
            khachHang.setUser(txTaiKhoan1.getText());
            khachHang.setPass(txMatKhau3.getText());
            khachHang.setTinhTrangHoatDong(txHoatDong1.getText());

            adminBus.themKhachHang(khachHang);
            tbQuanLyKhachHang.setModel(khachHangBus.hienThiKhachHang());
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btThem1MouseClicked

    private void btThem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThem1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btThem1MouseEntered

    private void btSua2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSua2MouseClicked
        AdminBUS adminBus = new AdminBUS();
        KhachHangBUS khachHangBus = new KhachHangBUS();
        KhachHangDTO khachHang = new KhachHangDTO();
        int row = tbQuanLyKhachHang.getSelectedRow();

        khachHang.setId(Integer.parseInt(txMaKhachHang2.getText()));
        khachHang.setHoLot(txHoLot3.getText());
        khachHang.setTen(txTen3.getText());
        khachHang.setNgaySinh(txNgaySinh2.getText());
        if (rbNam1.isSelected()) {
            khachHang.setGioiTinh("Nam");
        } else {
            khachHang.setGioiTinh("Nữ");
        }
        khachHang.setSoDienThoai(txSoDienThoai3.getText());
        khachHang.setUser(txTaiKhoan1.getText());
        khachHang.setPass(txMatKhau3.getText());
        khachHang.setTinhTrangHoatDong(txHoatDong1.getText());

        if (row >= 0) {
            adminBus.suaKhachHang(row, khachHang, txTaiKhoan1);
            tbQuanLyKhachHang.setModel(khachHangBus.hienThiKhachHang());
            tbQuanLyKhachHang.getSelectionModel().setSelectionInterval(row, row); // chon lai row dang Selected 
        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn sửa");
        }


    }//GEN-LAST:event_btSua2MouseClicked

    private void btXoa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoa2MouseClicked
        KhachHangBUS khachHangBus = new KhachHangBUS();
        AdminBUS adminBus = new AdminBUS();
        int row = tbQuanLyKhachHang.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có thật sự muốn xóa khách hàng này ?", "Xóa khách hàng", JOptionPane.YES_NO_OPTION);

        if (row >= 0) {
            if (luaChon == 0) {
                adminBus.xoaKhachHang(row);
                tbQuanLyKhachHang.setModel(khachHangBus.hienThiKhachHang());
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn xóa");
        }
    }//GEN-LAST:event_btXoa2MouseClicked

    private void btTimKiem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTimKiem1MouseClicked
        timKiemKhachHang();
    }//GEN-LAST:event_btTimKiem1MouseClicked

    private void btTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTimKiem1ActionPerformed

    private void txNgaySinh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgaySinh2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgaySinh2ActionPerformed

    private void rbNam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNam1ActionPerformed

    private void txTaiKhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTaiKhoan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTaiKhoan1ActionPerformed

    private void cbTimKiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimKiem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTimKiem3ActionPerformed

    private void txMatKhau3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMatKhau3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMatKhau3ActionPerformed

    private void txTimKiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTimKiem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTimKiem3ActionPerformed

    private void txTimKiem3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            timKiemKhachHang();
    }//GEN-LAST:event_txTimKiem3KeyPressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        KhachHangBUS khachHangBus = new KhachHangBUS();
        tbQuanLyKhachHang.setModel(khachHangBus.hienThiKhachHang());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        AdminBUS adminBus = new AdminBUS();
        tbQuanLyKhachHang.setModel(adminBus.sortNameKhachHang());

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHoaDonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btHoaDonMouseEntered

    private void txTen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTen3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTen3ActionPerformed

    private void btSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSua1ActionPerformed

    private void btXoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoa3ActionPerformed

    private void btXoa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoa3MouseClicked
        SachBUS sachBus = new SachBUS();
        AdminBUS adminBus = new AdminBUS();
        int row = tbQuanLySanPham.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có thật sự muốn xóa sách này ?", "Xóa sách", JOptionPane.YES_NO_OPTION);

        if (row >= 0) {
            if (luaChon == 0) {
                adminBus.xoaSach(row);
                try {
                    tbQuanLySanPham.setModel(adminBus.hienThiQuanLySanPhamAdmin());
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Xóa thành công");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn xóa");
        }

    }//GEN-LAST:event_btXoa3MouseClicked

    private void tbHoaDon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDon1MouseClicked
        ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();
        int row = tbHoaDon1.getSelectedRow();
        tbChiTietHoaDon1.setModel(chiTietHoaDonBus.hienThiChiTietHoaDon(row, tbHoaDon1, arrayList_ChiTietHoaDonALL));

    }//GEN-LAST:event_tbHoaDon1MouseClicked

    private void txMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaKhachHangActionPerformed

    private void txNgayMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayMuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayMuaActionPerformed

    private void txMaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaHoaDonActionPerformed

    private void dcNgayAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcNgayAKeyPressed

    }//GEN-LAST:event_dcNgayAKeyPressed

    private void btThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeMouseClicked
        thongKe();
    }//GEN-LAST:event_btThongKeMouseClicked

    private void btThongKeTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeTatCaMouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        AdminBUS adminBus = new AdminBUS();

        tbHoaDon1.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));
        txDoanhThu.setText(adminBus.thongKeTatCa(tbHoaDon1.getModel()));

    }//GEN-LAST:event_btThongKeTatCaMouseClicked

    private void txTenSach3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTenSach3KeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER)
            thongKe();
    }//GEN-LAST:event_txTenSach3KeyPressed

    private void cbQuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuyActionPerformed

    private void cbTheoQuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTheoQuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTheoQuyActionPerformed

    private void txTenSach4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenSach4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenSach4ActionPerformed

    private void txDonGia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDonGia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDonGia3ActionPerformed

    private void tbPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhapMouseClicked
        valueOfRowNhapKho();
    }//GEN-LAST:event_tbPhieuNhapMouseClicked

    private void txSoLuong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSoLuong2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSoLuong2ActionPerformed

    private void txLoaiSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLoaiSach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLoaiSach1ActionPerformed

    private void txHoLotTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHoLotTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHoLotTacGiaActionPerformed

    private void txNhaXuatBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNhaXuatBan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNhaXuatBan1ActionPerformed

    private void btThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThem2ActionPerformed

    private void btQuanLyHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLyHoaDonMouseClicked
        setSelectionBackGround(btQuanLyHoaDon);
        cardLayout.show(panelTacVu, "cardQuanLyHoaDon");

        try {
            HoaDonBUS hoaDonBus = new HoaDonBUS();
            ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();

            hoaDonBus.docDuLieuHoaDonALL();
            chiTietHoaDonBus.docDuLieuChiTietHoaDonALL();

            tbHoaDon2.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btQuanLyHoaDonMouseClicked

    private void btQuanLyNhapKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuanLyNhapKhoMouseClicked
        setSelectionBackGround(btQuanLyNhapKho);
        cardLayout.show(panelTacVu, "cardQuanLyKho");

        try {
            PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
            ChiTietPhieuNhapBUS chiTietPhieuNhapBus = new ChiTietPhieuNhapBUS();

            phieuNhapBus.docDuLieuPhieuNhap();
            chiTietPhieuNhapBus.docDuLieuChiTietPhieuNhap();

            tbPhieuNhap1.setModel(phieuNhapBus.hienThiPhieuNhap(arrayList_PhieuNhap));

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btQuanLyNhapKhoMouseClicked

    private void txTimKiem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            timKiemHoaDon(cbTimKiem4, tbHoaDon2, txTimKiem4);
        }

    }//GEN-LAST:event_txTimKiem4KeyPressed

    private void btTim2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTim2MouseClicked
        timKiemHoaDon(cbTimKiem4, tbHoaDon2, txTimKiem4);
    }//GEN-LAST:event_btTim2MouseClicked

    private void txMaHoaDon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaHoaDon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaHoaDon1ActionPerformed

    private void txNgayMua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayMua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayMua1ActionPerformed

    private void txMaKhachHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaKhachHang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaKhachHang1ActionPerformed

    private void tbHoaDon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDon2MouseClicked
        valueOfRowQuanLyHoaDon();
        ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();
        int row = tbHoaDon2.getSelectedRow();
        tbChiTietHoaDon2.setModel(chiTietHoaDonBus.hienThiChiTietHoaDon(row, tbHoaDon2, arrayList_ChiTietHoaDonALL));
    }//GEN-LAST:event_tbHoaDon2MouseClicked

    private void rbTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTatCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTatCaActionPerformed

    private void rbChuaXuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChuaXuLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbChuaXuLyActionPerformed

    private void txTongTien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTien2ActionPerformed

    private void rbTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTatCaMouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon2.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));
    }//GEN-LAST:event_rbTatCaMouseClicked

    private void rbChuaXuLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChuaXuLyMouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon2.setModel(hoaDonBus.timHoaDonChuaXuLy());
    }//GEN-LAST:event_rbChuaXuLyMouseClicked

    private void rbDaXuLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDaXuLyMouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon2.setModel(hoaDonBus.timHoaDonDaXuLy());
    }//GEN-LAST:event_rbDaXuLyMouseClicked

    private void rbDaXuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDaXuLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDaXuLyActionPerformed

    private void txMaPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaPhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaPhieuNhapActionPerformed

    private void tbPhieuNhap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhap1MouseClicked
        valueOfRowQuanLyNhapKho();
        ChiTietPhieuNhapBUS chiTietPhieuNhapBus = new ChiTietPhieuNhapBUS();
        int row = tbPhieuNhap1.getSelectedRow();
        if (row >= 0) {
            tbChiTietPhieuNhap.setModel(chiTietPhieuNhapBus.hienThiChiTietPhieuNhap(row, tbPhieuNhap1, arrayList_ChiTietPhieuNhap));
        }

    }//GEN-LAST:event_tbPhieuNhap1MouseClicked

    private void txMaNhanVien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaNhanVien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaNhanVien3ActionPerformed

    private void txNgayNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayNhapActionPerformed

    private void txMaNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaNhaCungCapActionPerformed

    private void txTongTien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTien3ActionPerformed

    private void tbChiTietPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuNhapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbChiTietPhieuNhapMouseClicked

    private void btTim3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTim3MouseClicked
        timKiemPhieuNhap(cbTimKiem5, tbPhieuNhap1, txTimKiem5);
    }//GEN-LAST:event_btTim3MouseClicked

    private void txTimKiem5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            timKiemPhieuNhap(cbTimKiem5, tbPhieuNhap1, txTimKiem5);
    }//GEN-LAST:event_txTimKiem5KeyPressed

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLocActionPerformed

    private void btHienThiTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHienThiTatCaMouseClicked
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        tbPhieuNhap1.setModel(phieuNhapBus.hienThiPhieuNhap(arrayList_PhieuNhap));

    }//GEN-LAST:event_btHienThiTatCaMouseClicked

    private void btLocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLocMouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        Boolean check = false;

        String ngayA = hoaDonBus.formatStringyyyy(dcNgayBatDau.getDate());
        String ngayB = hoaDonBus.formatStringyyyy(dcNgayKetThuc.getDate());

        if (ngayA.compareTo(ngayB) <= 0) {
            tbPhieuNhap1.setModel(phieuNhapBus.thongKeNgayADenB(ngayA, ngayB));
        } else {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu và kết thúc không hợp lệ");
        }    }//GEN-LAST:event_btLocMouseClicked

    private void btThanhToan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThanhToan1MouseClicked

        try {
            SachDAO sachDao = new SachDAO();
            PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
            NhaCungCapBUS nhaCungCapBus = new NhaCungCapBUS();
            ChiTietPhieuNhapBUS chiTietPhieuNhapBus = new ChiTietPhieuNhapBUS();

            nhaCungCapBus.docDuLieuNhaCungCap();

            sachDao.nhapKhoDatabase(tbPhieuNhap.getModel());

            phieuNhapBus.thanhToanPhieuNhap(cbNhaCungCap, txTongTien4);
            chiTietPhieuNhapBus.thanhToanChiTietPhieuNhap(tbPhieuNhap.getModel());

        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel modelNhapKhoTemp = new DefaultTableModel(new String[]{"Tên sách", "Loại sách", "Họ tác giả", "Tên tác giả", "Nhà xuất bản", "Ngày xuất bản", "Số lượng", "Đơn giá"}, 0);
        modelNhapKho = modelNhapKhoTemp;
        tbPhieuNhap.setModel(modelNhapKho);

        JOptionPane.showMessageDialog(null, "Thanh toán thành công");
    }//GEN-LAST:event_btThanhToan1MouseClicked

    private void btThanhToan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThanhToan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThanhToan1ActionPerformed

    private void btXoa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoa4ActionPerformed

    private void txTongTien4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTien4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTien4ActionPerformed

    private void btThem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThem2MouseClicked
        themPhieuNhap();
    }//GEN-LAST:event_btThem2MouseClicked

    private void txTenTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenTacGiaActionPerformed

    private void btXoa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoa4MouseClicked
        int row = tbPhieuNhap.getSelectedRow();
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa sản phẩm nảy", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION);

        if (row >= 0) {
            if (luaChon == 0) {
                modelNhapKho.removeRow(row);

                txTongTien4.setText(String.format("%,d", phieuNhapBus.tinhTienPhieuNhap(tbPhieuNhap.getModel())));

            }
        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng bạn muốn xóa");
        }

    }//GEN-LAST:event_btXoa4MouseClicked

    private void txTenSach4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTenSach4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txLoaiSach1.requestFocus();
    }//GEN-LAST:event_txTenSach4KeyPressed

    private void txLoaiSach1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txLoaiSach1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txHoLotTacGia.requestFocus();
    }//GEN-LAST:event_txLoaiSach1KeyPressed

    private void txHoLotTacGiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txHoLotTacGiaKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER)
            txTenTacGia.requestFocus();
    }//GEN-LAST:event_txHoLotTacGiaKeyPressed

    private void txTenTacGiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTenTacGiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txNhaXuatBan1.requestFocus();
    }//GEN-LAST:event_txTenTacGiaKeyPressed

    private void txNhaXuatBan1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNhaXuatBan1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txNgayXuatBan1.requestFocus();
    }//GEN-LAST:event_txNhaXuatBan1KeyPressed

    private void txNgayXuatBan1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNgayXuatBan1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txSoLuong2.requestFocus();
    }//GEN-LAST:event_txNgayXuatBan1KeyPressed

    private void txSoLuong2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSoLuong2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txDonGia3.requestFocus();
    }//GEN-LAST:event_txSoLuong2KeyPressed

    private void txDonGia3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDonGia3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btThem2.requestFocus();
    }//GEN-LAST:event_txDonGia3KeyPressed

    private void btThem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btThem2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            themPhieuNhap();
    }//GEN-LAST:event_btThem2KeyPressed

    private void cbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNhaCungCapActionPerformed

    private void txHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHoatDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHoatDongActionPerformed

    private void txHoatDong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHoatDong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHoatDong1ActionPerformed

    private void btBaCham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBaCham1MouseClicked
        HoTroNhapThongTinSachGUI hoTroNhapThongTinSachGUI = new HoTroNhapThongTinSachGUI();

        hoTroNhapThongTinSachGUI.setLocationRelativeTo(null);
        hoTroNhapThongTinSachGUI.setVisible(true);


    }//GEN-LAST:event_btBaCham1MouseClicked

    private void btBaCham2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBaCham2MouseClicked
        HoTroNhapLoaiSachGUI hoTroNhapLoaiSachGUI = new HoTroNhapLoaiSachGUI();

        hoTroNhapLoaiSachGUI.setLocationRelativeTo(null);
        hoTroNhapLoaiSachGUI.setVisible(true);

    }//GEN-LAST:event_btBaCham2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        HoTroNhapTacGiaGUI hoTroNhapTacGiaGUI = new HoTroNhapTacGiaGUI();

        hoTroNhapTacGiaGUI.setLocationRelativeTo(null);
        hoTroNhapTacGiaGUI.setVisible(true);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        HoTroNhapNhaXuatBanGUI hoTroNhapNhaXuatBanGUI = new HoTroNhapNhaXuatBanGUI();

        hoTroNhapNhaXuatBanGUI.setLocationRelativeTo(null);
        hoTroNhapNhaXuatBanGUI.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void btNhapKho3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNhapKho3MouseClicked
        setSelectionBackGround(btNhapKho3);
        cardLayout.show(panelTacVu, "cardNhapKho");

    }//GEN-LAST:event_btNhapKho3MouseClicked

    private void tbHoaDon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDon3MouseClicked
        valueOfRowXuLyHoaDon();
        ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();
        int row = tbHoaDon3.getSelectedRow();
        tbChiTietHoaDon3.setModel(chiTietHoaDonBus.hienThiChiTietHoaDon(row, tbHoaDon3, arrayList_ChiTietHoaDonALL));

    }//GEN-LAST:event_tbHoaDon3MouseClicked

    private void rbTatCa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTatCa1MouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon3.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));
    }//GEN-LAST:event_rbTatCa1MouseClicked

    private void rbTatCa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTatCa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTatCa1ActionPerformed

    private void txNgayMua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNgayMua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayMua2ActionPerformed

    private void txMaHoaDon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaHoaDon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaHoaDon2ActionPerformed

    private void btTim4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTim4MouseClicked
        timKiemHoaDon(cbTimKiem6, tbHoaDon3, txTimKiem6);
    }//GEN-LAST:event_btTim4MouseClicked

    private void txTongTien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTongTien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTongTien5ActionPerformed

    private void txTimKiem6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTimKiem6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            timKiemHoaDon(cbTimKiem6, tbHoaDon3, txTimKiem6);
    }//GEN-LAST:event_txTimKiem6KeyPressed

    private void rbDaXuLy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDaXuLy1MouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon3.setModel(hoaDonBus.timHoaDonDaXuLy());
    }//GEN-LAST:event_rbDaXuLy1MouseClicked

    private void rbDaXuLy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDaXuLy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDaXuLy1ActionPerformed

    private void txMaKhachHang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaKhachHang3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMaKhachHang3ActionPerformed

    private void rbChuaXuLy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChuaXuLy1MouseClicked
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        tbHoaDon3.setModel(hoaDonBus.timHoaDonChuaXuLy());


    }//GEN-LAST:event_rbChuaXuLy1MouseClicked

    private void rbChuaXuLy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChuaXuLy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbChuaXuLy1ActionPerformed

    private void txTinhTrang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTinhTrang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTinhTrang1ActionPerformed

    private void btBanGiaoVanChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBanGiaoVanChuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBanGiaoVanChuyenActionPerformed

    private void txTimKiem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTimKiem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTimKiem6ActionPerformed

    private void btBanGiaoVanChuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBanGiaoVanChuyenMouseClicked
        int row = tbHoaDon3.getSelectedRow();
        int maHoaDon = 0;

        if (row >= 0) {
            if (!((String) tbHoaDon3.getModel().getValueAt(row, 5)).equals("Đã vận chuyển")) {
                HoaDonBUS hoaDonBus = new HoaDonBUS();

                maHoaDon = (int) tbHoaDon3.getModel().getValueAt(row, 0);
                hoaDonBus.xuLyHoaDon(maHoaDon);

                try {
                    hoaDonBus.docDuLieuHoaDonALL();
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                tbHoaDon3.setModel(hoaDonBus.hienThiHoaDon(arrayList_HoaDonALL));
                JOptionPane.showMessageDialog(null, "Bàn giao thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Đơn hàng này đã được vận chuyển !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 dòng trước");
        }

    }//GEN-LAST:event_btBanGiaoVanChuyenMouseClicked

    private void btnNhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapExcelActionPerformed
        // TODO add your handling code here:
        SachDAO a = new SachDAO();
        try {
            a.importt();
            AdminBUS adminBus = new AdminBUS();
            tbQuanLySanPham.setModel(adminBus.hienThiQuanLySanPhamAdmin());
        } catch (IOException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNhapExcelActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        SachDAO xuat = new SachDAO();
        xuat.ExportExcel();

    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btInHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInHoaDonMouseClicked
        int row = tbHoaDon.getSelectedRow();

        if (row >= 0) {
            HoaDonDTO hoaDonDTO = new HoaDonDTO();

            hoaDonDTO.setMaHoaDon((int) tbHoaDon.getModel().getValueAt(row, 0));
            hoaDonDTO.setMaKhachHang((int) tbHoaDon.getModel().getValueAt(row, 1));
            hoaDonDTO.setMaNhanVien((int) tbHoaDon.getModel().getValueAt(row, 2));
            hoaDonDTO.setNgayMua((String) tbHoaDon.getModel().getValueAt(row, 3));

            if (hoaDonDTO.getMaNhanVien() == 0) {
                JOptionPane.showMessageDialog(null, "Hóa đơn của bạn chưa được xử lý");
            } else {
                Itext in = new Itext();

                try {
                    in.report(hoaDonDTO);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 hóa đơn bạn muốn in");
        }


    }//GEN-LAST:event_btInHoaDonMouseClicked

    public void khachHang() {
        panelMenuAdmin.setVisible(false);
        panelMenuNhanVien.setVisible(false);

        KhachHangBUS khachHangBus = new KhachHangBUS();
        KhachHangDTO khachHang = khachHangBus.thongTinKhachHang();

        String tenDayDu = khachHang.getHoLot() + " " + khachHang.getTen();

        lbTenKhachHang.setText(tenDayDu);

        panelMenuKhachHang.setVisible(true);
    }

    public void nhanVien() {
        panelMenuAdmin.setVisible(false);
        panelMenuKhachHang.setVisible(false);

        NhanVienBUS nhanVienBus = new NhanVienBUS();
        NhanVienDTO nhanVien = nhanVienBus.thongTinNhanVien();

        String tenDayDu = nhanVien.getHoLot() + " " + nhanVien.getTen();

        lbTenNhanVien.setText(tenDayDu);

        panelMenuNhanVien.setVisible(true);
    }

    public void admin() {
        panelMenuKhachHang.setVisible(false);
        panelMenuNhanVien.setVisible(false);

        AdminBUS adminBus = new AdminBUS();
        AdminDTO admin = adminBus.thongTinAdmin();

        String tenDayDu = admin.getHoLot() + " " + admin.getTen();

        lbTenAdmin.setText(tenDayDu);

        panelMenuAdmin.setVisible(true);
    }

    private void logOut() {
        dispose();
        LoginGUI login = new LoginGUI();

        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private void setSelectionBackGround(JPanel p) {
        btTrangChu1.setBackground(new Color(204, 204, 255));
        btSanPhamSach.setBackground(new Color(204, 204, 255));
        btThongTInCaNhan2.setBackground(new Color(204, 204, 255));
        btGioHang.setBackground(new Color(204, 204, 255));
        btHoaDon.setBackground(new Color(204, 204, 255));

        btTrangChu2.setBackground(new Color(204, 204, 255));
        btQuanLySanPham1.setBackground(new Color(204, 204, 255));
        btXuLyHoaDon.setBackground(new Color(204, 204, 255));
        btThongTinCaNhan1.setBackground(new Color(204, 204, 255));
        btNhapKho3.setBackground(new Color(204, 204, 255));

        btQuanLySanPham2.setBackground(new Color(204, 204, 255));
        btQuanLyNhanVien.setBackground(new Color(204, 204, 255));
        btQuanLyKhachHang.setBackground(new Color(204, 204, 255));
        btNhapKho.setBackground(new Color(204, 204, 255));
        btThongKeDoanhThu.setBackground(new Color(204, 204, 255));
        btQuanLyHoaDon.setBackground(new Color(204, 204, 255));
        btQuanLyNhapKho.setBackground(new Color(204, 204, 255));

        p.setBackground(new Color(64, 177, 191));

    }

    private void timKiemSach(JComboBox comboBox, JTable table, JTextField textField) {
        SachBUS sachBus = new SachBUS();
        sachBus.timKiem(comboBox, table, textField);

    }

    private void timKiemHoaDon(JComboBox comboBox, JTable table, JTextField textField) {
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        hoaDonBus.timKiem(comboBox, table, textField);
    }

    private void timKiemPhieuNhap(JComboBox comboBox, JTable table, JTextField textField) {
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        phieuNhapBus.timKiem(comboBox, table, textField);
    }

    private void timKiemQuanLySanPham(JComboBox comboBox, JTable table, JTextField textField) throws SQLException {
        AdminBUS adminBus = new AdminBUS();
        adminBus.timKiemQuanLySach(comboBox, table, textField);

    }

    private void timKiemNhanVien() {
        AdminBUS adminBus = new AdminBUS();

        tbQuanLyNhanVien.setModel(adminBus.timKiem(cbTimKiem, txTimKiem));
    }

    private void timKiemKhachHang() {
        AdminBUS adminBus = new AdminBUS();

        tbQuanLyKhachHang.setModel(adminBus.timKiem(cbTimKiem3, txTimKiem3));
    }

    private void thongKe() {
        AdminBUS adminBus = new AdminBUS();
        HoaDonBUS hoaDonBus = new HoaDonBUS();

        if (cbTenSach.isSelected() || cbNgayADenB.isSelected() || cbTheoQuy.isSelected()) {
            if (cbTenSach.isSelected()) {
                tbHoaDon1.setModel(adminBus.thongKeTenSach(txTenSach3.getText(), txDoanhThu));
            }

            if (cbNgayADenB.isSelected()) {
                Boolean check = false;
                String ngayA = hoaDonBus.formatStringyyyy(dcNgayA.getDate());
                String ngayB = hoaDonBus.formatStringyyyy(dcNgayB.getDate());

                if (ngayA.compareTo(ngayB) <= 0) {
                    tbHoaDon1.setModel(adminBus.thongKeNgayADenB(ngayA, ngayB, txDoanhThu));
                } else {
                    JOptionPane.showMessageDialog(null, "Ngày bắt đầu và kết thúc không hợp lệ");
                }
            }

            if (cbTheoQuy.isSelected()) {
                if (adminBus.checkNam(txNam.getText())) {
                    switch (cbQuy.getSelectedIndex()) {
                        case 0: {
                            String ngayA = txNam.getText() + "-01-01";
                            String ngayB = txNam.getText() + "-03-31";
                            tbHoaDon1.setModel(adminBus.thongKeNgayADenB(ngayA, ngayB, txDoanhThu));
                            break;
                        }
                        case 1: {
                            String ngayA = txNam.getText() + "-04-01";
                            String ngayB = txNam.getText() + "-06-30";
                            tbHoaDon1.setModel(adminBus.thongKeNgayADenB(ngayA, ngayB, txDoanhThu));
                            break;
                        }

                        case 2: {
                            String ngayA = txNam.getText() + "-07-01";
                            String ngayB = txNam.getText() + "-09-30";
                            tbHoaDon1.setModel(adminBus.thongKeNgayADenB(ngayA, ngayB, txDoanhThu));
                            break;
                        }

                        case 3: {
                            String ngayA = txNam.getText() + "-10-01";
                            String ngayB = txNam.getText() + "-12-31";
                            tbHoaDon1.setModel(adminBus.thongKeNgayADenB(ngayA, ngayB, txDoanhThu));
                            break;
                        }

                        default:
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Năm chỉ nhập số từ 0 - 9");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn 1 tùy chọn để thống kê");
        }

    }

    private void valueOfRowSanPhamSach(JTable table) throws SQLException {
        int row = table.getSelectedRow();
        TableModel modelTemp = table.getModel();

        if (row >= 0) {
            txMaSach.setText(String.valueOf(table.getModel().getValueAt(row, 0)));
            txLoaiSach.setText((String) table.getModel().getValueAt(row, 3));
            txTenSach.setText((String) table.getModel().getValueAt(row, 1));
            txTacGia.setText((String) table.getModel().getValueAt(row, 2));
            txDonGia.setText((String) table.getModel().getValueAt(row, 6));

            switch ((int) modelTemp.getValueAt(row, 0)) {
                case 1: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/kheoankheonoi.jpg")));
                    break;
                }
                case 2: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/dungyeunua.jpg")));
                    break;
                }
                case 3: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/vuivekhongquao.jpg")));
                    break;
                }
                case 4: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/nhagiakim.jpg")));
                    break;
                }
                case 5: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/banhangthanhcong.jpg")));
                    break;
                }
                case 6: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/tobinhyen.jpg")));
                    break;
                }
                case 7: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/dungchaytheosodong.jpg")));
                    break;
                }
                case 8: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/songtudo.jpg")));
                    break;
                }
                case 9: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/C.jpg")));
                    break;
                }
                case 10: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/C++.jpg")));
                    break;
                }
                case 11: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/tohoclaptrinh.jpg")));
                    break;
                }
                case 12: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/minhchilanguoibinhthuong.jpg")));
                    break;
                }
                case 13: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/chodilahanhphuc.jpg")));
                    break;
                }
                case 14: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/lalungsao.jpg")));
                    break;
                }
                case 15: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/saoembuondenthe.jpg")));
                    break;
                }
                case 16: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/tudientiengem.jpg")));
                    break;
                }
                case 17: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/thegioinay.jpg")));
                    break;
                }
                case 18: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/cafecungtony.jpg")));
                    break;
                }
                case 19: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/bayxuyennhungtangmay.jpg")));
                    break;
                }
                case 20: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/ngaytrongsuongmu.jpg")));
                    break;
                }
                case 21: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/khitraitimloinhip.jpg")));
                    break;
                }
                case 22: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/comotnguoitunglatatca.jpg")));
                    break;
                }
                case 23: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/quen1ng.jpg")));
                    break;
                }
                case 24: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/vuivekhongquau.jpg")));
                    break;
                }
                case 25: {
                    lbAnhSach.setIcon(new ImageIcon(getClass().getResource("/Images/Sach/airoicungkhac.jpg")));
                    break;
                }
                default:
                    break;
            }
        }
    }

    private void valueOfRowQuanLySanPham() {
        int row = tbQuanLySanPham.getSelectedRow();

        if (row >= 0) {
            txMaSach1.setText(String.valueOf(tbQuanLySanPham.getModel().getValueAt(row, 0)));
            txTenSach1.setText((String) tbQuanLySanPham.getModel().getValueAt(row, 1));
//            txLoaiSach1.setText((String) table.getModel().getValueAt(row, 3));     

            for (int i = 0; i < cbLoaiSach2.getItemCount(); i++) {
                if (cbLoaiSach2.getItemAt(i).equals((String) tbQuanLySanPham.getModel().getValueAt(row, 3))) {
                    cbLoaiSach2.setSelectedIndex(i);
                    break;
                }
            }

            //txTacGia1.setText((String) table.getModel().getValueAt(row, 2));
            for (int i = 0; i < cbTacGia.getItemCount(); i++) {
                if (cbTacGia.getItemAt(i).equals((String) tbQuanLySanPham.getModel().getValueAt(row, 2))) {
                    cbTacGia.setSelectedIndex(i);
                    break;
                }
            }

            for (int i = 0; i < cbNhaXuatBan.getItemCount(); i++) {
                if (cbNhaXuatBan.getItemAt(i).equals((String) tbQuanLySanPham.getModel().getValueAt(row, 5))) {
                    cbNhaXuatBan.setSelectedIndex(i);
                    break;
                }
            }

            txNgayXuatBan.setText((String) tbQuanLySanPham.getModel().getValueAt(row, 4));
            txSoLuong1.setText(String.valueOf(tbQuanLySanPham.getModel().getValueAt(row, 6)));
            txDonGia2.setText((String) tbQuanLySanPham.getModel().getValueAt(row, 7));
            txTinhTrang.setText((String) tbQuanLySanPham.getModel().getValueAt(row, 8));
        }
    }

    private void valueOfRowGioHang() {
        int row = tbGioHang.getSelectedRow();

        if (row >= 0) {
            txLoaiSach3.setText((String) modelGioHang.getValueAt(row, 3));
            txTacGia2.setText((String) modelGioHang.getValueAt(row, 2));
            txTenSach2.setText((String) modelGioHang.getValueAt(row, 1));
            txDonGia1.setText(String.valueOf(modelGioHang.getValueAt(row, 7)));
            txSoLuong.setText(String.valueOf(modelGioHang.getValueAt(row, 6)));
        }
    }

    private void valueOfRowHoaDon() {
        int row = tbHoaDon.getSelectedRow();
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        DefaultTableModel modelTemp = hoaDonBus.hienThiHoaDon(arrayList_HoaDon);

        if (row >= 0) {
            txMaHoaDon.setText(String.valueOf(modelTemp.getValueAt(row, 0)));
            txNgayMua.setText((String) modelTemp.getValueAt(row, 3));
            txMaKhachHang.setText(String.valueOf(modelTemp.getValueAt(row, 1)));
            txMaNhanVien.setText(String.valueOf(modelTemp.getValueAt(row, 2)));
            txTongTien1.setText(String.valueOf(modelTemp.getValueAt(row, 4)));
        }
    }

    private void valueOfRowQuanLyHoaDon() {
        int row = tbHoaDon2.getSelectedRow();
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        TableModel modelTemp = tbHoaDon2.getModel();

        if (row >= 0) {
            txMaHoaDon1.setText(String.valueOf(modelTemp.getValueAt(row, 0)));
            txNgayMua1.setText((String) modelTemp.getValueAt(row, 3));
            txMaKhachHang1.setText(String.valueOf(modelTemp.getValueAt(row, 1)));
            txMaNhanVien2.setText(String.valueOf(modelTemp.getValueAt(row, 2)));
            txTongTien2.setText(String.valueOf(modelTemp.getValueAt(row, 4)));
        }
    }

    private void valueOfRowXuLyHoaDon() {
        int row = tbHoaDon3.getSelectedRow();
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        TableModel modelTemp = tbHoaDon3.getModel();

        if (row >= 0) {
            txMaHoaDon2.setText(String.valueOf(modelTemp.getValueAt(row, 0)));
            txNgayMua2.setText((String) modelTemp.getValueAt(row, 3));
            txMaKhachHang3.setText(String.valueOf(modelTemp.getValueAt(row, 1)));
            txMaNhanVien4.setText(String.valueOf(modelTemp.getValueAt(row, 2)));
            txTongTien5.setText(String.valueOf(modelTemp.getValueAt(row, 4)));
            txTinhTrang1.setText((String) modelTemp.getValueAt(row, 5));
        }
    }

    private void valueOfRowQuanLyNhapKho() {
        int row = tbPhieuNhap1.getSelectedRow();
        TableModel modelTemp = tbPhieuNhap1.getModel();

        if (row >= 0) {
            txMaPhieuNhap.setText(String.valueOf(modelTemp.getValueAt(row, 0)));
            txNgayNhap.setText((String) modelTemp.getValueAt(row, 3));
            txMaNhanVien3.setText(String.valueOf(modelTemp.getValueAt(row, 1)));
            txMaNhaCungCap.setText(String.valueOf(modelTemp.getValueAt(row, 2)));
            txTongTien3.setText(String.valueOf(modelTemp.getValueAt(row, 4)));
        }
    }

    private void valueOfRowNhanVien() {
        int row = tbQuanLyNhanVien.getSelectedRow();

        if (row >= 0) {
            txMaNhanVien1.setText(String.valueOf(tbQuanLyNhanVien.getModel().getValueAt(row, 0)));
            txHoLot1.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 1));
            txTen1.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 2));
            txNgaySinh1.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 3));
            if (tbQuanLyNhanVien.getModel().getValueAt(row, 4).equals("Nam")) {
                rbNam.setSelected(true);
            } else {
                rbNu.setSelected(true);
            }
            txSoDienThoai1.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 5));
            txTaiKhoan.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 6));
            txMatKhau1.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 7));
            txHoatDong.setText((String) tbQuanLyNhanVien.getModel().getValueAt(row, 8));
        }
    }

    private void valueOfRowKhachHang() {
        int row = tbQuanLyKhachHang.getSelectedRow();

        if (row >= 0) {
            txMaKhachHang2.setText(String.valueOf(tbQuanLyKhachHang.getModel().getValueAt(row, 0)));
            txHoLot3.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 1));
            txTen3.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 2));
            txNgaySinh2.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 3));
            if (tbQuanLyKhachHang.getModel().getValueAt(row, 4).equals("Nam")) {
                rbNam1.setSelected(true);
            } else {
                rbNu1.setSelected(true);
            }
            txSoDienThoai3.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 5));
            txTaiKhoan1.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 6));
            txMatKhau3.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 7));
            txHoatDong1.setText((String) tbQuanLyKhachHang.getModel().getValueAt(row, 8));
        }
    }

    private void valueOfRowNhapKho() {
        int row = tbPhieuNhap.getSelectedRow();

        if (row >= 0) {
            txTenSach4.setText((String) tbPhieuNhap.getModel().getValueAt(row, 0));
            txLoaiSach1.setText((String) tbPhieuNhap.getModel().getValueAt(row, 1));
            txHoLotTacGia.setText((String) tbPhieuNhap.getModel().getValueAt(row, 2));
            txTenTacGia.setText((String) tbPhieuNhap.getModel().getValueAt(row, 3));
            txNhaXuatBan1.setText((String) tbPhieuNhap.getModel().getValueAt(row, 4));
            txNgayXuatBan1.setText((String) tbPhieuNhap.getModel().getValueAt(row, 5));
            txSoLuong2.setText((String) tbPhieuNhap.getModel().getValueAt(row, 6));
            txDonGia3.setText((String) tbPhieuNhap.getModel().getValueAt(row, 7));
        }
    }

    private void themPhieuNhap() {
        PhieuNhapBUS phieuNhapBus = new PhieuNhapBUS();
        AdminBUS adminBus = new AdminBUS();

        if (adminBus.checkHoTen(txLoaiSach1.getText())) {
            if (adminBus.checkHoTen(txHoLotTacGia.getText())) {
                if (adminBus.checkHoTen(txTenTacGia.getText())) {
                    if (adminBus.checkNgaySinh(txNgayXuatBan1.getText())) {
                        if (adminBus.checkNam(txSoLuong2.getText())) {
                            if (adminBus.checkNam(txDonGia3.getText())) {
                                Vector record = new Vector();

                                record.add(txTenSach4.getText());
                                record.add(txLoaiSach1.getText());
                                record.add(txHoLotTacGia.getText());
                                record.add(txTenTacGia.getText());
                                record.add(txNhaXuatBan1.getText());
                                record.add(txNgayXuatBan1.getText());
                                record.add(txSoLuong2.getText());
                                record.add(String.format("%,d", Integer.parseInt(txDonGia3.getText())));

                                modelNhapKho.addRow(record);

                                tbPhieuNhap.setModel(modelNhapKho);

                                txTongTien4.setText(String.format("%,d", phieuNhapBus.tinhTienPhieuNhap(tbPhieuNhap.getModel())));

                                txTenSach4.setText("");
                                txLoaiSach1.setText("");
                                txHoLotTacGia.setText("");
                                txTenTacGia.setText("");
                                txNhaXuatBan1.setText("");
                                txNgayXuatBan1.setText("");
                                txSoLuong2.setText("");
                                txDonGia3.setText("");

                            } else {
                                JOptionPane.showMessageDialog(null, "Đơn giá chỉ bao gồm các số");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Số lượng chỉ bao gồm các số");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ngày xuất bản không hợp lệ ! Nhập ngày xuất bản theo định dạng yyyy-mm-dd (VD: 2020-12-25)");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Tên tác giả chỉ bao gồm chữ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Họ lót tác giả chỉ bao gồm chữ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Loại sách chỉ bao gồm các chữ");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTensach;
    private javax.swing.JLabel LbTensach1;
    private javax.swing.JLabel LbTensach2;
    private javax.swing.JLabel LbTensach3;
    private javax.swing.JLabel LbTensach4;
    private javax.swing.JButton btBaCham1;
    private javax.swing.JButton btBaCham2;
    private javax.swing.JButton btBanGiaoVanChuyen;
    private javax.swing.JPanel btDangXuat;
    private javax.swing.JPanel btDangXuat1;
    private javax.swing.JPanel btDangXuat3;
    private javax.swing.JPanel btGioHang;
    private javax.swing.JButton btHienThiTatCa;
    private javax.swing.JPanel btHoaDon;
    private javax.swing.JButton btInHoaDon;
    private javax.swing.JButton btLoc;
    private javax.swing.JPanel btNhapKho;
    private javax.swing.JPanel btNhapKho3;
    private javax.swing.JPanel btQuanLyHoaDon;
    private javax.swing.JPanel btQuanLyKhachHang;
    private javax.swing.JPanel btQuanLyNhanVien;
    private javax.swing.JPanel btQuanLyNhapKho;
    private javax.swing.JPanel btQuanLySanPham1;
    private javax.swing.JPanel btQuanLySanPham2;
    private javax.swing.JPanel btSanPhamSach;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btSua1;
    private javax.swing.JButton btSua2;
    private javax.swing.JButton btSuaThongTin;
    private javax.swing.JButton btSuaThongTin1;
    private javax.swing.JButton btThanhToan;
    private javax.swing.JButton btThanhToan1;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThem1;
    private javax.swing.JButton btThem2;
    private javax.swing.JButton btThemGioHang;
    private javax.swing.JButton btThongKe;
    private javax.swing.JPanel btThongKeDoanhThu;
    private javax.swing.JButton btThongKeTatCa;
    private javax.swing.JPanel btThongTInCaNhan2;
    private javax.swing.JPanel btThongTinCaNhan1;
    private javax.swing.JButton btTim1;
    private javax.swing.JButton btTim2;
    private javax.swing.JButton btTim3;
    private javax.swing.JButton btTim4;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btTimKiem1;
    private javax.swing.JPanel btTrangChu1;
    private javax.swing.JPanel btTrangChu2;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXoa1;
    private javax.swing.JButton btXoa2;
    private javax.swing.JButton btXoa3;
    private javax.swing.JButton btXoa4;
    private javax.swing.JPanel btXuLyHoaDon;
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.ButtonGroup btgLocHoaDon;
    private javax.swing.ButtonGroup btgThongKe;
    private javax.swing.JButton btnNhapExcel;
    private javax.swing.JButton btnTimkiem1;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JCheckBox cbHienMatKhau;
    private javax.swing.JCheckBox cbHienMatKhau1;
    private javax.swing.JCheckBox cbHienMatKhau2;
    private javax.swing.JCheckBox cbHienMatKhau3;
    public static javax.swing.JComboBox<String> cbLoaiSach;
    private javax.swing.JComboBox<String> cbLoaiSach1;
    private javax.swing.JComboBox<String> cbLoaiSach2;
    private javax.swing.JRadioButton cbNgayADenB;
    private javax.swing.JComboBox<String> cbNhaCungCap;
    private javax.swing.JComboBox<String> cbNhaXuatBan;
    private javax.swing.JComboBox<String> cbQuy;
    private javax.swing.JComboBox<String> cbTacGia;
    private javax.swing.JRadioButton cbTenSach;
    private javax.swing.JRadioButton cbTheoQuy;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JComboBox<String> cbTimKiem1;
    private javax.swing.JComboBox<String> cbTimKiem2;
    private javax.swing.JComboBox<String> cbTimKiem3;
    private javax.swing.JComboBox<String> cbTimKiem4;
    private javax.swing.JComboBox<String> cbTimKiem5;
    private javax.swing.JComboBox<String> cbTimKiem6;
    private com.toedter.calendar.JDateChooser dcNgayA;
    private com.toedter.calendar.JDateChooser dcNgayB;
    private com.toedter.calendar.JDateChooser dcNgayBatDau;
    private com.toedter.calendar.JDateChooser dcNgayKetThuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lbAnhSach;
    private javax.swing.JLabel lbAvatarAdmin;
    private javax.swing.JLabel lbAvatarKhachHang;
    private javax.swing.JLabel lbAvatarNhanVien;
    private javax.swing.JLabel lbBgTrangChu;
    private javax.swing.JLabel lbChiTietHoaDon;
    private javax.swing.JLabel lbChiTietHoaDon1;
    private javax.swing.JLabel lbChiTietHoaDon2;
    private javax.swing.JLabel lbChiTietHoaDon3;
    private javax.swing.JLabel lbDangXuat;
    private javax.swing.JLabel lbDangXuat2;
    private javax.swing.JLabel lbDangXuat3;
    private javax.swing.JLabel lbDoanhThu;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbDonGia1;
    private javax.swing.JLabel lbDongia;
    private javax.swing.JLabel lbDongia1;
    private javax.swing.JLabel lbDongia2;
    private javax.swing.JLabel lbGioHang;
    private javax.swing.JLabel lbGioHangCuaBan;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbGioiTinh1;
    private javax.swing.JLabel lbGioiTinh2;
    private javax.swing.JLabel lbGioiTinh3;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbHoLot;
    private javax.swing.JLabel lbHoLot1;
    private javax.swing.JLabel lbHoLot2;
    private javax.swing.JLabel lbHoLot3;
    private javax.swing.JLabel lbHoaDon;
    private javax.swing.JLabel lbHoaDonKhachHng;
    private javax.swing.JLabel lbHoaDonKhachHng1;
    private javax.swing.JLabel lbHoaDonKhachHng2;
    private javax.swing.JLabel lbHoaDonKhachHng3;
    private javax.swing.JLabel lbHoaDonKhachHng4;
    private javax.swing.JLabel lbHoaDonKhachHng5;
    private javax.swing.JLabel lbHoaDonKhachHng6;
    private javax.swing.JLabel lbIConCart;
    private javax.swing.JLabel lbIConCart1;
    private javax.swing.JLabel lbIConCart2;
    private javax.swing.JLabel lbIConCart3;
    private javax.swing.JLabel lbIConCart6;
    private javax.swing.JLabel lbIconAdmin;
    private javax.swing.JLabel lbIconBill;
    private javax.swing.JLabel lbIconBill1;
    private javax.swing.JLabel lbIconBook;
    private javax.swing.JLabel lbIconBook1;
    private javax.swing.JLabel lbIconBook2;
    private javax.swing.JLabel lbIconCart1;
    private javax.swing.JLabel lbIconHoaDon;
    private javax.swing.JLabel lbIconHome1;
    private javax.swing.JLabel lbIconHome2;
    private javax.swing.JLabel lbIconKhachHang;
    private javax.swing.JLabel lbIconLogOut;
    private javax.swing.JLabel lbIconLogOut2;
    private javax.swing.JLabel lbIconLogOut3;
    private javax.swing.JLabel lbIconNhanVien;
    private javax.swing.JLabel lbIconQuanLySanPham2;
    private javax.swing.JLabel lbIconSale1;
    private javax.swing.JLabel lbIconServices;
    private javax.swing.JLabel lbIconServices1;
    private javax.swing.JLabel lbIconUserFolder;
    private javax.swing.JLabel lbKhachHang;
    private javax.swing.JLabel lbLoaiSach;
    private javax.swing.JLabel lbLoaiSach3;
    private javax.swing.JLabel lbLoaisach;
    private javax.swing.JLabel lbLoaisach1;
    private javax.swing.JLabel lbLoaisach2;
    private javax.swing.JLabel lbMaKhachHang1;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbMaSach;
    private javax.swing.JLabel lbMasach;
    private javax.swing.JLabel lbMasach1;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbMatKhau1;
    private javax.swing.JLabel lbMatKhau2;
    private javax.swing.JLabel lbMatKhau3;
    private javax.swing.JLabel lbMatKhau4;
    private javax.swing.JLabel lbMatKhau5;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbNgaySinh1;
    private javax.swing.JLabel lbNgaySinh2;
    private javax.swing.JLabel lbNgaySinh3;
    private javax.swing.JLabel lbNgayXuatBan;
    private javax.swing.JLabel lbNgayXuatBan1;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbNhaxuatban;
    private javax.swing.JLabel lbNhaxuatban1;
    private javax.swing.JLabel lbQuanLyHoaDon;
    private javax.swing.JLabel lbQuanLyHoaDon1;
    private javax.swing.JLabel lbQuanLyHoaDon2;
    private javax.swing.JLabel lbQuanLyHoaDon5;
    private javax.swing.JLabel lbQuanLyKhachHang;
    private javax.swing.JLabel lbQuanLyKhachHang1;
    private javax.swing.JLabel lbQuanLyNhanVien;
    private javax.swing.JLabel lbQuanLyNhanVien1;
    private javax.swing.JLabel lbQuanLySach;
    private javax.swing.JLabel lbQuanLySanPham1;
    private javax.swing.JLabel lbQuanLySanPham2;
    private javax.swing.JLabel lbSanPhamSach;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JLabel lbSoDienThoai1;
    private javax.swing.JLabel lbSoDienThoai2;
    private javax.swing.JLabel lbSoDienThoai3;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbSoLuong2;
    private javax.swing.JLabel lbTacGia;
    private javax.swing.JLabel lbTacGia2;
    private javax.swing.JLabel lbTacgia;
    private javax.swing.JLabel lbTacgia1;
    private javax.swing.JLabel lbTacgia2;
    private javax.swing.JLabel lbTacgia3;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbTaiKhoan1;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTen1;
    private javax.swing.JLabel lbTen2;
    private javax.swing.JLabel lbTen3;
    private javax.swing.JLabel lbTenAdmin;
    private javax.swing.JLabel lbTenKhachHang;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JLabel lbTenSach;
    private javax.swing.JLabel lbTenSach2;
    private javax.swing.JLabel lbThanhTien;
    private javax.swing.JLabel lbThongKeDoanhThu;
    private javax.swing.JLabel lbThongTinCaNhan;
    private javax.swing.JLabel lbThongTinCaNhan1;
    private javax.swing.JLabel lbThongTinCaNhan2;
    private javax.swing.JLabel lbThongTinCaNhan3;
    private javax.swing.JLabel lbTimKiem1;
    private javax.swing.JLabel lbTimKiem2;
    private javax.swing.JLabel lbTimKiem3;
    private javax.swing.JLabel lbTimKiem4;
    private javax.swing.JLabel lbTimKiem5;
    private javax.swing.JLabel lbTimKiem6;
    private javax.swing.JLabel lbTimKiem7;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JLabel lbTongTien1;
    private javax.swing.JLabel lbTrangChu1;
    private javax.swing.JLabel lbTrangChu2;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser1;
    private javax.swing.JLabel lbXacNhanMatKhau;
    private javax.swing.JLabel lbXacNhanMatKhau1;
    private javax.swing.JLabel lbXuLyHoaDon;
    private javax.swing.JLabel lbXuLyHoaDon1;
    private javax.swing.JPanel panelGioHang;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuAdmin;
    private javax.swing.JPanel panelMenuKhachHang;
    private javax.swing.JPanel panelMenuNhanVien;
    private javax.swing.JPanel panelNhapKho;
    private javax.swing.JPanel panelQuanLyHoaDon;
    private javax.swing.JPanel panelQuanLyKho;
    private javax.swing.JPanel panelQuanLySanPham;
    private javax.swing.JPanel panelSanPhamSach;
    private javax.swing.JPanel panelTacVu;
    private javax.swing.JPanel panelThongKe;
    private javax.swing.JPanel panelThongTinCaNhanKhachHang;
    private javax.swing.JPanel panelThongTinCaNhanNhanien;
    private javax.swing.JPanel panelTrangChu;
    private javax.swing.JPanel panelXuLyHoaDon;
    private javax.swing.JPanel panellQuanLyKhachHang;
    private javax.swing.JPanel panellQuanLyNhanVien;
    private javax.swing.JRadioButton rbChuaXuLy;
    private javax.swing.JRadioButton rbChuaXuLy1;
    private javax.swing.JRadioButton rbDaXuLy;
    private javax.swing.JRadioButton rbDaXuLy1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNam1;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JRadioButton rbNu1;
    private javax.swing.JRadioButton rbTatCa;
    private javax.swing.JRadioButton rbTatCa1;
    private javax.swing.JRadioButton rbtNam;
    private javax.swing.JRadioButton rbtNam1;
    private javax.swing.JRadioButton rbtNu;
    private javax.swing.JRadioButton rbtNu1;
    private javax.swing.JSpinner spinSoLuong;
    private javax.swing.JTable tbChiTietHoaDon;
    private javax.swing.JTable tbChiTietHoaDon1;
    private javax.swing.JTable tbChiTietHoaDon2;
    private javax.swing.JTable tbChiTietHoaDon3;
    private javax.swing.JTable tbChiTietPhieuNhap;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbHoaDon1;
    private javax.swing.JTable tbHoaDon2;
    private javax.swing.JTable tbHoaDon3;
    private javax.swing.JTable tbPhieuNhap;
    private javax.swing.JTable tbPhieuNhap1;
    private javax.swing.JTable tbQuanLyKhachHang;
    private javax.swing.JTable tbQuanLyNhanVien;
    private javax.swing.JTable tbQuanLySanPham;
    private javax.swing.JTable tbSanPhamSach;
    private javax.swing.JTextField txDoanhThu;
    private javax.swing.JTextField txDonGia;
    private javax.swing.JTextField txDonGia1;
    private javax.swing.JTextField txDonGia2;
    public static javax.swing.JTextField txDonGia3;
    private javax.swing.JTextField txHoLot;
    private javax.swing.JTextField txHoLot1;
    private javax.swing.JTextField txHoLot2;
    private javax.swing.JTextField txHoLot3;
    public static javax.swing.JTextField txHoLotTacGia;
    private javax.swing.JTextField txHoatDong;
    private javax.swing.JTextField txHoatDong1;
    private javax.swing.JTextField txLoaiSach;
    public static javax.swing.JTextField txLoaiSach1;
    private javax.swing.JTextField txLoaiSach3;
    private javax.swing.JTextField txMaHoaDon;
    private javax.swing.JTextField txMaHoaDon1;
    private javax.swing.JTextField txMaHoaDon2;
    private javax.swing.JTextField txMaKhachHang;
    private javax.swing.JTextField txMaKhachHang1;
    private javax.swing.JTextField txMaKhachHang2;
    private javax.swing.JTextField txMaKhachHang3;
    private javax.swing.JTextField txMaNhaCungCap;
    private javax.swing.JTextField txMaNhanVien;
    private javax.swing.JTextField txMaNhanVien1;
    private javax.swing.JTextField txMaNhanVien2;
    private javax.swing.JTextField txMaNhanVien3;
    private javax.swing.JTextField txMaNhanVien4;
    private javax.swing.JTextField txMaPhieuNhap;
    private javax.swing.JTextField txMaSach;
    private javax.swing.JTextField txMaSach1;
    private javax.swing.JPasswordField txMatKhau;
    private javax.swing.JTextField txMatKhau1;
    private javax.swing.JPasswordField txMatKhau2;
    private javax.swing.JTextField txMatKhau3;
    private javax.swing.JTextField txNam;
    private javax.swing.JTextField txNgayMua;
    private javax.swing.JTextField txNgayMua1;
    private javax.swing.JTextField txNgayMua2;
    private javax.swing.JTextField txNgayNhap;
    private javax.swing.JTextField txNgaySinh;
    private javax.swing.JTextField txNgaySinh1;
    private javax.swing.JTextField txNgaySinh2;
    private javax.swing.JTextField txNgaySinh3;
    private javax.swing.JTextField txNgayXuatBan;
    public static javax.swing.JTextField txNgayXuatBan1;
    public static javax.swing.JTextField txNhaXuatBan1;
    private javax.swing.JTextField txSoDienThoai;
    private javax.swing.JTextField txSoDienThoai1;
    private javax.swing.JTextField txSoDienThoai2;
    private javax.swing.JTextField txSoDienThoai3;
    private javax.swing.JTextField txSoLuong;
    private javax.swing.JTextField txSoLuong1;
    private javax.swing.JTextField txSoLuong2;
    private javax.swing.JTextField txTacGia;
    private javax.swing.JTextField txTacGia2;
    private javax.swing.JTextField txTaiKhoan;
    private javax.swing.JTextField txTaiKhoan1;
    private javax.swing.JTextField txTen;
    private javax.swing.JTextField txTen1;
    private javax.swing.JTextField txTen2;
    private javax.swing.JTextField txTen3;
    private javax.swing.JTextField txTenSach;
    private javax.swing.JTextField txTenSach1;
    private javax.swing.JTextField txTenSach2;
    private javax.swing.JTextField txTenSach3;
    public static javax.swing.JTextField txTenSach4;
    public static javax.swing.JTextField txTenTacGia;
    private javax.swing.JTextField txThanhTien;
    private javax.swing.JTextField txTimKiem;
    private javax.swing.JTextField txTimKiem1;
    private javax.swing.JTextField txTimKiem2;
    private javax.swing.JTextField txTimKiem3;
    private javax.swing.JTextField txTimKiem4;
    private javax.swing.JTextField txTimKiem5;
    private javax.swing.JTextField txTimKiem6;
    private javax.swing.JTextField txTinhTrang;
    private javax.swing.JTextField txTinhTrang1;
    private javax.swing.JTextField txTongTien;
    private javax.swing.JTextField txTongTien1;
    private javax.swing.JTextField txTongTien2;
    private javax.swing.JTextField txTongTien3;
    private javax.swing.JTextField txTongTien4;
    private javax.swing.JTextField txTongTien5;
    private javax.swing.JTextField txUser;
    private javax.swing.JTextField txUser1;
    private javax.swing.JPasswordField txXacNhanMatKhau;
    private javax.swing.JPasswordField txXacNhanMatKhau1;
    // End of variables declaration//GEN-END:variables
}
