/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.element.Text;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.*;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import DTO.*;
import DAO.*;
import BUS.*;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Itext {

    public static final String FSB = "C:\\Windows\\Fonts\\Arial.ttf";

    public String report(HoaDonDTO hd) throws IOException {
        String manv = String.valueOf(hd.getMaNhanVien());
        String mahd = String.valueOf(hd.getMaHoaDon());
        String makh = String.valueOf(hd.getMaKhachHang());
        String ngay = hd.getNgayMua();

        ChiTietHoaDonBUS cthdBus = new ChiTietHoaDonBUS();

        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            // Tạo đối tượng PdfWriter
            JFileChooser chooser = new JFileChooser();
            int i = chooser.showSaveDialog(chooser);
            File file = chooser.getSelectedFile();
            FileOutputStream out = new FileOutputStream(file);
            PdfWriter.getInstance(document, out);

            // Mở file để thực hiện ghi
            document.open();
            Font f14 = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\cour.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 14,
                    Font.NORMAL);
            Font f = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\cour.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 18,
                    Font.NORMAL);
            Font f10 = new Font(BaseFont.createFont("C:\\Windows\\Fonts\\cour.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED), 10,
                    Font.NORMAL);
            f.setColor(BaseColor.BLUE);
            //PdfFont FSB1=PdfFontFactory.createFont(FSB,true);
            // Thêm nội dung sử dụng add function

//            Chunk chunk=new Chunk(new VerticalPositionMark());
            Paragraph par = new Paragraph("HÓA ĐƠN", f);
            par.setAlignment(Element.ALIGN_CENTER);
            par.setFont(f);
            document.add(par);
            document.add(Chunk.NEWLINE);
            Paragraph mahdpdf = new Paragraph("Mã Hóa đơn: " + mahd, f14);
            mahdpdf.setAlignment(Element.ALIGN_CENTER);
            document.add(mahdpdf);
            document.add(Chunk.NEWLINE);
            Paragraph giopdf = new Paragraph("Ngày : " + ngay, f14);
            document.add(giopdf);
            document.add(Chunk.NEWLINE);
            NhanVienBUS nhanVienBUS=new NhanVienBUS();
            Paragraph Manvpdf = new Paragraph("Tên nhân viên :    " + nhanVienBUS.timTenNhanVien(Integer.parseInt(manv)), f14);
            document.add(Manvpdf);
            document.add(Chunk.NEWLINE);
            KhachHangBUS khachHangBUS = new KhachHangBUS();
            Paragraph mabnpdf = new Paragraph("Tên Khách hàng :    " + khachHangBUS.timTenKhachHang(Integer.parseInt(makh)), f14);
            document.add(mabnpdf);
            document.add(Chunk.NEWLINE);
            PdfPTable table = new PdfPTable(5);
            int[] a = {20, 70, 25, 15, 25};
            table.setWidths(a);
            table.setSpacingAfter(5);
            PdfPCell c1 = new PdfPCell(new Phrase("Mã Sách", f10));
            table.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Tên Sách", f10));
            table.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Giá", f10));
            table.addCell(c3);
            PdfPCell c4 = new PdfPCell(new Phrase("SL", f10));
            table.addCell(c4);
            PdfPCell c5 = new PdfPCell(new Phrase("Thành tiền", f10));
            table.addCell(c5);
            ArrayList<ChiTietHoaDonDTO> arr = new ArrayList<ChiTietHoaDonDTO>();
            arr = cthdBus.timChiTietHoaDonCuaHoaDon(Integer.parseInt(mahd));
            DefaultTableModel cthd = new DefaultTableModel();
            double tongtien = 0;
            for (int r = 0; r < arr.size(); r++) {
                ChiTietHoaDonDTO cthd_DTO = arr.get(r);
                String maSach = String.valueOf(cthd_DTO.getMaSach());
                PdfPCell mt = new PdfPCell(new Phrase(maSach, f10));//
                table.addCell(mt);

                PdfPCell ten = new PdfPCell(new Phrase(cthd_DTO.getTenSach(), f10));//
                table.addCell(ten);
                double gia = cthd_DTO.getDonGia();
                PdfPCell giathuoc = new PdfPCell(new Phrase(String.valueOf(gia), f10));//
                table.addCell(giathuoc);
                int sl1 = cthd_DTO.getSoLuong();
                PdfPCell sl = new PdfPCell(new Phrase(String.valueOf(sl1), f10));//
                table.addCell(sl);
                double tt = gia * sl1;
                tongtien += tt;
                PdfPCell thanhtien = new PdfPCell(new Phrase(String.valueOf(tt), f10));//
                table.addCell(thanhtien);
            }

            document.add(table);
            // �?óng File
            document.add(Chunk.NEWLINE);
            Paragraph tongcong = new Paragraph("Tổng cộng : " + tongtien, f14);
            document.add(tongcong);
            document.close();
            
            JOptionPane.showMessageDialog(null,"In hóa đơn thành công");
            
            return "report thành công!";
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
            return "report không thành công";
        }
    }

    public boolean Issdt(String t) {
        try {
            if (t.charAt(0) != '0') {
                return false;
            }
            long a = Long.parseLong(t);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e);
            return false;
        }

    }

//    public static void main(String[] args) throws IOException, SQLException {
//        HoaDonBUS hoaDonBus = new HoaDonBUS();
//        ChiTietHoaDonBUS chiTietHoaDonBus = new ChiTietHoaDonBUS();
//
//        hoaDonBus.docDuLieuHoaDonALL();
//        chiTietHoaDonBus.docDuLieuChiTietHoaDonALL();
//        
//        
//        
//        KhachHangBUS khachHangBUS=new KhachHangBUS();
//        khachHangBUS.docDuLieuKhachHang();
//        
////         Tạo đối tượng tài liệu
//        HoaDonDTO hd = new HoaDonDTO();
//        hd.setMaHoaDon(1);
//        hd.setMaNhanVien(1);
//        hd.setNgayMua("2002-02-02");
//        hd.setMaKhachHang(3);
//        Itext a = new Itext();
//        a.report(hd);
//
//    }
}
