/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.AdminBUS;
import BUS.HoaDonBUS;
import DTO.KhachHangDTO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ha
 */
public class DangKyGUI extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKyGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDangKy = new javax.swing.JPanel();
        cbHienMatKhau1 = new javax.swing.JCheckBox();
        cbHienMatKhau = new javax.swing.JCheckBox();
        btDangKy = new javax.swing.JButton();
        btTraVeDangNhap = new javax.swing.JButton();
        txSoDienThoai1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rbtNu2 = new javax.swing.JRadioButton();
        rbtNam2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txTen1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txHoLot1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNhapLaiMatKhau1 = new javax.swing.JPasswordField();
        txMatKhau1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txTaiKhoan1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbGachChan1 = new javax.swing.JPanel();
        lbDangNhap = new javax.swing.JLabel();
        lbBackGround = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDangKy.setLayout(null);

        cbHienMatKhau1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbHienMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau1.setText("Hiện mật khẩu");
        cbHienMatKhau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhau1MouseClicked(evt);
            }
        });
        panelDangKy.add(cbHienMatKhau1);
        cbHienMatKhau1.setBounds(414, 216, 126, 24);

        cbHienMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbHienMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        cbHienMatKhau.setText("Hiện mật khẩu");
        cbHienMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhauMouseClicked(evt);
            }
        });
        panelDangKy.add(cbHienMatKhau);
        cbHienMatKhau.setBounds(414, 162, 126, 24);

        btDangKy.setBackground(new java.awt.Color(204, 204, 204));
        btDangKy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btDangKy.setForeground(new java.awt.Color(102, 0, 153));
        btDangKy.setText("Đăng ký");
        btDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangKyMouseClicked(evt);
            }
        });
        btDangKy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btDangKyKeyPressed(evt);
            }
        });
        panelDangKy.add(btDangKy);
        btDangKy.setBounds(126, 552, 108, 36);

        btTraVeDangNhap.setBackground(new java.awt.Color(204, 204, 204));
        btTraVeDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btTraVeDangNhap.setForeground(new java.awt.Color(102, 0, 153));
        btTraVeDangNhap.setText("Trở về đăng nhập");
        btTraVeDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTraVeDangNhapMouseClicked(evt);
            }
        });
        panelDangKy.add(btTraVeDangNhap);
        btTraVeDangNhap.setBounds(306, 552, 198, 36);

        txSoDienThoai1.setBackground(new java.awt.Color(204, 204, 204));
        txSoDienThoai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSoDienThoai1.setForeground(new java.awt.Color(0, 0, 0));
        txSoDienThoai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSoDienThoai1ActionPerformed(evt);
            }
        });
        txSoDienThoai1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txSoDienThoai1KeyPressed(evt);
            }
        });
        panelDangKy.add(txSoDienThoai1);
        txSoDienThoai1.setBounds(234, 486, 162, 26);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Số điện thoại :");
        panelDangKy.add(jLabel9);
        jLabel9.setBounds(54, 486, 180, 24);

        dcNgaySinh.setBackground(new java.awt.Color(204, 204, 204));
        dcNgaySinh.setForeground(new java.awt.Color(0, 0, 0));
        dcNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        panelDangKy.add(dcNgaySinh);
        dcNgaySinh.setBounds(234, 432, 162, 25);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ngày sinh :");
        panelDangKy.add(jLabel8);
        jLabel8.setBounds(54, 432, 180, 24);

        rbtNu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtNu2.setForeground(new java.awt.Color(255, 255, 255));
        rbtNu2.setText("Nữ");
        panelDangKy.add(rbtNu2);
        rbtNu2.setBounds(324, 378, 72, 25);

        rbtNam2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtNam2.setForeground(new java.awt.Color(255, 255, 255));
        rbtNam2.setSelected(true);
        rbtNam2.setText("Nam");
        panelDangKy.add(rbtNam2);
        rbtNam2.setBounds(234, 378, 72, 25);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Giới tính :");
        panelDangKy.add(jLabel7);
        jLabel7.setBounds(54, 378, 180, 24);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tên :");
        panelDangKy.add(jLabel6);
        jLabel6.setBounds(54, 324, 180, 24);

        txTen1.setBackground(new java.awt.Color(204, 204, 204));
        txTen1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTen1.setForeground(new java.awt.Color(0, 0, 0));
        txTen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTen1ActionPerformed(evt);
            }
        });
        txTen1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTen1KeyPressed(evt);
            }
        });
        panelDangKy.add(txTen1);
        txTen1.setBounds(234, 324, 162, 26);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Họ lót :");
        panelDangKy.add(jLabel5);
        jLabel5.setBounds(54, 270, 180, 24);

        txHoLot1.setBackground(new java.awt.Color(204, 204, 204));
        txHoLot1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txHoLot1.setForeground(new java.awt.Color(0, 0, 0));
        txHoLot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHoLot1ActionPerformed(evt);
            }
        });
        txHoLot1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txHoLot1KeyPressed(evt);
            }
        });
        panelDangKy.add(txHoLot1);
        txHoLot1.setBounds(234, 270, 162, 26);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nhập lại mật khẩu :");
        panelDangKy.add(jLabel4);
        jLabel4.setBounds(54, 216, 180, 24);

        txNhapLaiMatKhau1.setBackground(new java.awt.Color(204, 204, 204));
        txNhapLaiMatKhau1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txNhapLaiMatKhau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNhapLaiMatKhau1ActionPerformed(evt);
            }
        });
        txNhapLaiMatKhau1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNhapLaiMatKhau1KeyPressed(evt);
            }
        });
        panelDangKy.add(txNhapLaiMatKhau1);
        txNhapLaiMatKhau1.setBounds(234, 216, 162, 25);

        txMatKhau1.setBackground(new java.awt.Color(204, 204, 204));
        txMatKhau1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMatKhau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMatKhau1ActionPerformed(evt);
            }
        });
        txMatKhau1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txMatKhau1KeyPressed(evt);
            }
        });
        panelDangKy.add(txMatKhau1);
        txMatKhau1.setBounds(234, 162, 162, 25);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mật khẩu :");
        panelDangKy.add(jLabel3);
        jLabel3.setBounds(54, 162, 180, 24);

        txTaiKhoan1.setBackground(new java.awt.Color(204, 204, 204));
        txTaiKhoan1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txTaiKhoan1.setForeground(new java.awt.Color(0, 0, 0));
        txTaiKhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTaiKhoan1ActionPerformed(evt);
            }
        });
        txTaiKhoan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txTaiKhoan1KeyPressed(evt);
            }
        });
        panelDangKy.add(txTaiKhoan1);
        txTaiKhoan1.setBounds(234, 108, 162, 26);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tài khoản :");
        panelDangKy.add(jLabel1);
        jLabel1.setBounds(54, 108, 180, 24);

        lbGachChan1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout lbGachChan1Layout = new javax.swing.GroupLayout(lbGachChan1);
        lbGachChan1.setLayout(lbGachChan1Layout);
        lbGachChan1Layout.setHorizontalGroup(
            lbGachChan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lbGachChan1Layout.setVerticalGroup(
            lbGachChan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelDangKy.add(lbGachChan1);
        lbGachChan1.setBounds(216, 72, 100, 8);

        lbDangNhap.setBackground(new java.awt.Color(102, 0, 255));
        lbDangNhap.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbDangNhap.setForeground(new java.awt.Color(102, 0, 153));
        lbDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangNhap.setText("Đăng Ký");
        panelDangKy.add(lbDangNhap);
        lbDangNhap.setBounds(180, 18, 180, 43);

        lbBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg_Login.png"))); // NOI18N
        panelDangKy.add(lbBackGround);
        lbBackGround.setBounds(0, 0, 558, 612);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panelDangKy.add(jTextField2);
        jTextField2.setBounds(198, 144, 162, 26);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ lót :");
        panelDangKy.add(jLabel2);
        jLabel2.setBounds(126, 144, 72, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txTaiKhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTaiKhoan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTaiKhoan1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txMatKhau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMatKhau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMatKhau1ActionPerformed

    private void txNhapLaiMatKhau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNhapLaiMatKhau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNhapLaiMatKhau1ActionPerformed

    private void txHoLot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHoLot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHoLot1ActionPerformed

    private void txTen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTen1ActionPerformed

    private void txSoDienThoai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSoDienThoai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSoDienThoai1ActionPerformed

    private void btTraVeDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTraVeDangNhapMouseClicked
        dispose();
//        Login login = new Login();
//        
//        login.setLocationRelativeTo(null);
//        login.setVisible(true);

    }//GEN-LAST:event_btTraVeDangNhapMouseClicked

    private void txTaiKhoan1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTaiKhoan1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txMatKhau1.requestFocus();
    }//GEN-LAST:event_txTaiKhoan1KeyPressed

    private void txMatKhau1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMatKhau1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txNhapLaiMatKhau1.requestFocus();
    }//GEN-LAST:event_txMatKhau1KeyPressed

    private void txNhapLaiMatKhau1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNhapLaiMatKhau1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txHoLot1.requestFocus();
    }//GEN-LAST:event_txNhapLaiMatKhau1KeyPressed

    private void txHoLot1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txHoLot1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txTen1.requestFocus();
    }//GEN-LAST:event_txHoLot1KeyPressed

    private void txTen1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTen1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            rbtNam2.requestFocus();
    }//GEN-LAST:event_txTen1KeyPressed

    private void txSoDienThoai1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSoDienThoai1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btDangKy.requestFocus();
    }//GEN-LAST:event_txSoDienThoai1KeyPressed

    private void btDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangKyMouseClicked
        try {
            dangKy();
        } catch (SQLException ex) {
            Logger.getLogger(DangKyGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDangKyMouseClicked

    private void btDangKyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btDangKyKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                dangKy();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKyGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDangKyKeyPressed

    private void cbHienMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhauMouseClicked
        if (cbHienMatKhau.isSelected())
            txMatKhau1.setEchoChar((char) 0);
        else
            txMatKhau1.setEchoChar('*');
    }//GEN-LAST:event_cbHienMatKhauMouseClicked

    private void cbHienMatKhau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhau1MouseClicked
        if (cbHienMatKhau1.isSelected())
            txNhapLaiMatKhau1.setEchoChar((char) 0);
        else
            txNhapLaiMatKhau1.setEchoChar('*');
    }//GEN-LAST:event_cbHienMatKhau1MouseClicked
    
    public void dangKy() throws SQLException {
        KhachHangDTO khachHang = new KhachHangDTO();
        AdminBUS adminBus = new AdminBUS();
        HoaDonBUS hoaDonBus = new HoaDonBUS();
        
        khachHang.setUser(txTaiKhoan1.getText());
        khachHang.setPass(txMatKhau1.getText());
        khachHang.setHoLot(txHoLot1.getText());
        khachHang.setTen(txTen1.getText());
        
        if (rbtNam2.isSelected()) {
            khachHang.setGioiTinh("Nam");
        } else {
            khachHang.setGioiTinh("Nữ");
        }
        
        khachHang.setNgaySinh(hoaDonBus.formatStringyyyy(dcNgaySinh.getDate()));
        khachHang.setSoDienThoai(txSoDienThoai1.getText());
        khachHang.setTinhTrangHoatDong("1");
        
        if (adminBus.checkDauVaoDangKy(khachHang, true)) {
            if (txMatKhau1.getText().equals(txNhapLaiMatKhau1.getText())) {
                adminBus.themKhachHang(khachHang);
            }
            else
                JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKy;
    private javax.swing.JButton btTraVeDangNhap;
    private javax.swing.JCheckBox cbHienMatKhau;
    private javax.swing.JCheckBox cbHienMatKhau1;
    private com.toedter.calendar.JDateChooser dcNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbBackGround;
    private javax.swing.JLabel lbDangNhap;
    private javax.swing.JPanel lbGachChan1;
    private javax.swing.JPanel panelDangKy;
    private javax.swing.JRadioButton rbtNam2;
    private javax.swing.JRadioButton rbtNu2;
    private javax.swing.JTextField txHoLot1;
    private javax.swing.JPasswordField txMatKhau1;
    private javax.swing.JPasswordField txNhapLaiMatKhau1;
    private javax.swing.JTextField txSoDienThoai1;
    private javax.swing.JTextField txTaiKhoan1;
    private javax.swing.JTextField txTen1;
    // End of variables declaration//GEN-END:variables
}