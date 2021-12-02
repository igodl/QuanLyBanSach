/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BUS.LoaiSachBUS;
import BUS.NhaXuatBanBUS;
import BUS.SachBUS;
import BUS.TacGiaBUS;
import DTO.SachDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ha
 */
public class SachDAO {

    ConnectionDatabase connection;

    public SachDAO() {
        connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
        connection.Test();
    }

    public ArrayList<SachDTO> dataSachOfDatabase() throws SQLException {
        ArrayList<SachDTO> data = new ArrayList<SachDTO>();
        String query = "select * from sanphamsach";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            if (connection.getStatement() != null) {
                while (rs.next()) {
                    SachDTO sach = new SachDTO();

                    sach.setMaSach(rs.getInt(1));
                    sach.setTenSach(rs.getString(2));
                    sach.setMaLoai(rs.getInt(3));
                    sach.setMaTacGia(rs.getInt(4));
                    sach.setSoLuong(rs.getInt(5));
                    sach.setDonGia(rs.getInt(6));
                    sach.setmaNXB(rs.getInt(7));
                    sach.setNgayXuatBan(rs.getString(8));
                    sach.setTinhTrang(rs.getString(9));

                    data.add(sach);

                }
            }

        } catch (Exception e) {
            System.out.println("Lay du lieu Sach tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public ArrayList<SachDTO> dataSachSALEOfDatabase() throws SQLException {
        ArrayList<SachDTO> data = new ArrayList<SachDTO>();
        String query = "select * from sanphamsach where khuyenmai = 1";
        ResultSet rs = connection.getStatement().executeQuery(query);

        try {
            while (rs.next()) {
                SachDTO sach = new SachDTO();

                sach.setMaSach(rs.getInt(1));
                sach.setTenSach(rs.getString(2));
                sach.setMaLoai(rs.getInt(3));
                sach.setMaTacGia(rs.getInt(4));
                sach.setSoLuong(rs.getInt(5));
                sach.setDonGia(rs.getInt(6));
                sach.setmaNXB(rs.getInt(7));
                sach.setNgayXuatBan(rs.getString(8));
                sach.setTinhTrang(rs.getString(9));

                data.add(sach);

            }
        } catch (Exception e) {
            System.out.println("Lay du lieu Sach tu Database thất bại");
            System.out.println(e);
        }

        rs.close();

        return data;
    }

    public void capNhatSoLuongKhiBan(DefaultTableModel modelGioHang) {
        try {
            for (int i = 0; i < modelGioHang.getRowCount(); i++) {

                int soLuongGoc = 0;
                int soLuongBan = (int) modelGioHang.getValueAt(i, 6);
                int maSach = (int) modelGioHang.getValueAt(i, 0);
                String querySoLuongGoc = "SELECT SoLuong FROM sanphamsach WHERE MaSach=" + maSach;
                ResultSet rs = connection.getStatement().executeQuery(querySoLuongGoc);

                while (rs.next()) {
                    soLuongGoc = rs.getInt(1);
                }

                int soLuongCon = soLuongGoc - soLuongBan;

                if (soLuongCon > 0) {
                    String queryUpdate = "UPDATE sanphamsach SET SoLuong ='" + soLuongCon + "' WHERE MaSach ='" + maSach + "'";
                    connection.getStatement().executeUpdate(queryUpdate);
                } else {
                    String queryUpdate = "UPDATE `sanphamsach` SET `SoLuong`='" + soLuongCon + "',`TinhTrang`='Hết hàng' WHERE MaSach ='" + maSach + "'";
                    connection.getStatement().executeUpdate(queryUpdate);

                }
            }

        } catch (Exception e) {
            System.out.println("Cap nhat so luong khi ban that bai !");
            System.out.println(e);
        }
    }

    public int maSachMoiDatabas() {
        int maSach = 0;

        try {
            String query = "SELECT MaSach FROM `sanphamsach` ORDER BY MaSach";
            ResultSet rs = connection.getStatement().executeQuery(query);

            while (rs.next()) {
                maSach = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Lay ma sach moi that bai");
            System.out.println(e);
        }

        return maSach + 1;

    }

    public void nhapKhoDatabase(TableModel model) {
        SachBUS sachBus = new SachBUS();
        LoaiSachBUS loaiSachBUS = new LoaiSachBUS();
        LoaiSachDAO loaiSachDao = new LoaiSachDAO();
        TacGiaBUS tacGiaBus = new TacGiaBUS();
        TacGiaDAO tacGiaDao = new TacGiaDAO();
        NhaXuatBanBUS nhaXuatBanBUS = new NhaXuatBanBUS();
        NhaXuatBanDAO nhaXuatBanDao = new NhaXuatBanDAO();
        int maSach = 0;
        int soLuongDangCo = 0;
        int soLuongKhiDaNhap = 0;
        // doc du lieu o day vi co truong hop vua mo chuong trinh nguoi dung mo chuc nang nay dau tien
        try {
            sachBus.docDuLieuSach();
            tacGiaBus.docDuLieuTacGia();
            loaiSachBUS.docDuLieuLoaiSach();
            nhaXuatBanBUS.docDuLieuNhaXuatBan();
        } catch (Exception e) {
            System.out.println("Loi doc du lieu tu nhap kho");
            System.out.println(e);
        }

        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                SachDTO sach = new SachDTO();

                String tenSach = (String) model.getValueAt(i, 0);
                String loaiSach = (String) model.getValueAt(i, 1);
                String hoLotTacGia = (String) model.getValueAt(i, 2);
                String tenTacGia = (String) model.getValueAt(i, 3);
                String nhaXuatBan = (String) model.getValueAt(i, 4);
                String ngayXuatBan = (String) model.getValueAt(i, 5);
                int soLuongNhap = Integer.parseInt((String) model.getValueAt(i, 6));
                int donGia = Integer.parseInt(sachBus.removeThousandSeparators((String) model.getValueAt(i, 7)));

                // doc DB ve ArrayList phong cho truong hop SP dau tien co du lieu moi (tac gia,loai sach,...) thi SP thu 2 cung tac gia SP 1 thi khong xem tac gia SP 2 la tac gia moi
                try {
                    sachBus.docDuLieuSach();
                    tacGiaBus.docDuLieuTacGia();
                    loaiSachBUS.docDuLieuLoaiSach();
                    nhaXuatBanBUS.docDuLieuNhaXuatBan();
                } catch (Exception e) {
                    System.out.println("Loi doc du lieu tu nhap kho");
                    System.out.println(e);
                }

                //Doc ArrayList lai roi nen tim se dung
                loaiSachDao.themLoaiSach(sach, loaiSach);
                tacGiaDao.themTacGia(sach, hoLotTacGia, tenTacGia);
                nhaXuatBanDao.themNhaXuatBan(sach, nhaXuatBan);

                String query = "SELECT MaSach FROM `sanphamsach` WHERE `TenSach`='" + tenSach + "' and MaLoai=" + sach.getMaLoai() + " and MaTacGia=" + sach.getMaTacGia() + " and MaNXB=" + sach.getMaNXB() + " and NgayXuatBan='" + ngayXuatBan + "'";
                ResultSet rs = connection.getStatement().executeQuery(query);

                if (rs.next()) {

                    maSach = rs.getInt(1);

                    soLuongDangCo = sachBus.soLuongSachDangCo(maSach);
                    soLuongKhiDaNhap = soLuongDangCo + soLuongNhap;

                    connection.getStatement().executeUpdate("UPDATE `sanphamsach` SET `SoLuong`='" + soLuongKhiDaNhap + "', `TinhTrang`='Còn hàng' WHERE MaSach=" + maSach);

                } else {
                    String query1 = "INSERT INTO `sanphamsach`(`TenSach`, `MaLoai`, `MaTacGia`, `SoLuong`, `DonGia`, `MaNXB`, `NgayXuatBan`, `TinhTrang`) VALUES ('" + tenSach + "','" + sach.getMaLoai() + "','" + sach.getMaTacGia() + "','" + soLuongNhap + "','" + donGia + "','" + sach.getMaNXB() + "','" + ngayXuatBan + "','Còn bán')";
                    connection.getStatement().executeUpdate(query1);
                }
            }
        } catch (Exception e) {
            System.out.println("Nhap Kho thất bại");
            System.out.println(e);
        }

        //  doc lai DB ve ArrayList de cap nhap SP CUOI CUNG vao ArrayList
        try {
            sachBus.docDuLieuSach();
            tacGiaBus.docDuLieuTacGia();
            loaiSachBUS.docDuLieuLoaiSach();
            nhaXuatBanBUS.docDuLieuNhaXuatBan();
        } catch (Exception e) {
            System.out.println("Loi doc du lieu tu nhap kho");
            System.out.println(e);
        }
    }

    public void importt() throws IOException, SQLException {
//        try{
        JFileChooser fChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xlsx");
        fChooser.setFileFilter(filter);
        File file = fChooser.getSelectedFile();
        if (fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = fChooser.getSelectedFile();
        }

        FileInputStream input = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row;

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            row = sheet.getRow(i);
//                    System.out.println(row);
            int MaSach = (int) row.getCell(0).getNumericCellValue();
            String TenSach = row.getCell(1).getStringCellValue();
            int MaLoai = (int) row.getCell(2).getNumericCellValue();
            int MaTacGia = (int) row.getCell(3).getNumericCellValue();
            int SoLuong = (int) row.getCell(4).getNumericCellValue();
            int DonGia = (int) row.getCell(5).getNumericCellValue();
            int MaNXB = (int) row.getCell(6).getNumericCellValue();
            String NgayXuatBan = row.getCell(7).getStringCellValue();
            String TinhTrang = row.getCell(8).getStringCellValue();;
//                    System.out.println(MaSach+TenSach+MaLoai+MaTacGia+SoLuong+DonGia+MaNXB+NgayXuatBan+TinhTrang);
            String sql_check = "SELECT * FROM sanphamsach WHERE MaSach='" + MaSach + "'";
            Statement stm = connection.getStatement();
            ResultSet rs = stm.executeQuery(sql_check);
            if (!rs.next()) {
                String sql = "INSERT INTO `sanphamsach`(`MaSach`,`TenSach`,`MaLoai`,`MaTacGia`,`SoLuong`,`DonGia`,`MaNXB`,`NgayXuatBan`,`TinhTrang`) VALUES (" + MaSach + ",N'" + TenSach + "'," + MaLoai + "," + MaTacGia + "," + SoLuong + "," + DonGia + "," + MaNXB + ",'" + NgayXuatBan + "',N'" + TinhTrang + "')";
//                connection.getStatement();
                stm.executeUpdate(sql);

            } else {
                String sql = "UPDATE sanphamsach SET TenSach='" + TenSach + "',MaLoai=" + MaLoai + ",MaTacGia=" + MaTacGia + ",SoLuong=" + SoLuong + ",DonGia=" + DonGia + ",MaNXB=" + MaNXB + ",NgayXuatBan='" + NgayXuatBan + "',TinhTrang='" + TinhTrang + "' WHERE MaSach='" + MaSach + "'";
//                connection.getStatement();
                stm.executeUpdate(sql);
            }
        }
        input.close();

    }

    public boolean openConnection() {
        try {
            connection = new ConnectionDatabase("localhost", "root", "", "quanlybansach");
            connection.Test();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void ExportExcel() {
//        if(openConnection()){
        try {
            String sql = "SELECT * FROM sanphamsach";
            Statement st = connection.getStatement();
            ResultSet rs = st.executeQuery(sql);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("SachExcel");

            XSSFCellStyle style = workbook.createCellStyle();

            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;

            cell = row.createCell(0);
            cell.setCellValue("MaSach");
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue("TenSach");
            cell.setCellStyle(style);

            cell = row.createCell(2);
            cell.setCellValue("MaLoai");
            cell.setCellStyle(style);

            cell = row.createCell(3);
            cell.setCellValue("MaTacGia");
            cell.setCellStyle(style);

            cell = row.createCell(4);
            cell.setCellValue("SoLuong");
            cell.setCellStyle(style);

            cell = row.createCell(5);
            cell.setCellValue("DonGia");
            cell.setCellStyle(style);

            cell = row.createCell(6);
            cell.setCellValue("MaNXB");
            cell.setCellStyle(style);

            cell = row.createCell(7);
            cell.setCellValue("NgayXuatBan");
            cell.setCellStyle(style);

            cell = row.createCell(8);
            cell.setCellValue("TinhTrang");
            cell.setCellStyle(style);

            int i = 1;

            while (rs.next()) {
                String masach = rs.getString("MaSach");
                String tensach = rs.getString("TenSach");
                String maloai = rs.getString("MaLoai");
                String matacgia = rs.getString("MaTacGia");
                String soluong = rs.getString("SoLuong");
                String dongia = rs.getString("DonGia");
                String manxb = rs.getString("MaNXB");
                String ngayxuatban = rs.getString("NgayXuatBan");
                String tinhtrang = rs.getString("TinhTrang");
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(masach);
                cell = row.createCell(1);
                cell.setCellValue(tensach);
                cell = row.createCell(2);
                cell.setCellValue(maloai);
                cell = row.createCell(3);
                cell.setCellValue(matacgia);
                cell = row.createCell(4);
                cell.setCellValue(soluong);
                cell = row.createCell(5);
                cell.setCellValue(dongia);
                cell = row.createCell(6);
                cell.setCellValue(manxb);
                cell = row.createCell(7);
                cell.setCellValue(ngayxuatban);
                cell = row.createCell(8);
                cell.setCellValue(tinhtrang);
                i++;
            }
            JFileChooser jChooser = new JFileChooser();
            jChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jChooser.setAcceptAllFileFilterUsed(false);
            if (jChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                int count = 0;
                File ex = new File(jChooser.getSelectedFile() + "/SachExcel.xlsx");
                while (ex.exists()) {
                    String s = "SachExcel.xlsx";
                    String[] parts = s.split(".", 2);
                    String path = parts[1];
                    ex = new File(jChooser.getSelectedFile() + "/" + "(" + (count++) + ")" + path);
                }
                FileOutputStream out = new FileOutputStream(ex);
                out = new FileOutputStream(ex);
                workbook.write(out);
                out.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, e);
        } catch (FileNotFoundException e) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
