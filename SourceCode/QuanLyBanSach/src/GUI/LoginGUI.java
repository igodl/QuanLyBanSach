/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BUS.AdminBUS;
import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ha
 */
public class LoginGUI extends javax.swing.JFrame {

    public static int idHienHanh = 0;

    public LoginGUI() {
        initComponents();
        //process();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        panelMain = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        cbHienMatKhau = new javax.swing.JCheckBox();
        txPass = new javax.swing.JPasswordField();
        lbIconLogin = new javax.swing.JLabel();
        lbDangNhap = new javax.swing.JLabel();
        lbGachChan = new javax.swing.JPanel();
        lbIconUser = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        lbIconPass = new javax.swing.JLabel();
        btDangNhap = new javax.swing.JButton();
        btDangKy = new javax.swing.JButton();
        lbBgLogin = new javax.swing.JLabel();
        lbBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setLayout(null);

        panelLogin.setLayout(null);

        cbHienMatKhau.setText("Hiện mật khẩu");
        cbHienMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMatKhauMouseClicked(evt);
            }
        });
        panelLogin.add(cbHienMatKhau);
        cbHienMatKhau.setBounds(234, 288, 108, 20);

        txPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPassKeyPressed(evt);
            }
        });
        panelLogin.add(txPass);
        txPass.setBounds(108, 252, 234, 30);

        lbIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Login.png"))); // NOI18N
        panelLogin.add(lbIconLogin);
        lbIconLogin.setBounds(165, 18, 64, 64);

        lbDangNhap.setBackground(new java.awt.Color(102, 0, 255));
        lbDangNhap.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbDangNhap.setForeground(new java.awt.Color(102, 0, 153));
        lbDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangNhap.setText("Đăng Nhập");
        panelLogin.add(lbDangNhap);
        lbDangNhap.setBounds(108, 90, 180, 43);

        lbGachChan.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout lbGachChanLayout = new javax.swing.GroupLayout(lbGachChan);
        lbGachChan.setLayout(lbGachChanLayout);
        lbGachChanLayout.setHorizontalGroup(
            lbGachChanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        lbGachChanLayout.setVerticalGroup(
            lbGachChanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelLogin.add(lbGachChan);
        lbGachChan.setBounds(135, 144, 120, 5);

        lbIconUser.setBackground(new java.awt.Color(204, 204, 204));
        lbIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_User.png"))); // NOI18N
        panelLogin.add(lbIconUser);
        lbIconUser.setBounds(36, 162, 50, 50);
        lbIconUser.getAccessibleContext().setAccessibleDescription("");

        txUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txUserActionPerformed(evt);
            }
        });
        panelLogin.add(txUser);
        txUser.setBounds(108, 180, 234, 30);

        lbIconPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon_Pass.png"))); // NOI18N
        panelLogin.add(lbIconPass);
        lbIconPass.setBounds(36, 234, 50, 50);

        btDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btDangNhap.setForeground(new java.awt.Color(102, 0, 153));
        btDangNhap.setText("Đăng nhập");
        btDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangNhapMouseClicked(evt);
            }
        });
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });
        panelLogin.add(btDangNhap);
        btDangNhap.setBounds(90, 324, 108, 36);

        btDangKy.setBackground(new java.awt.Color(255, 255, 255));
        btDangKy.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btDangKy.setForeground(new java.awt.Color(102, 0, 153));
        btDangKy.setText("Đăng ký");
        btDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangKyMouseClicked(evt);
            }
        });
        btDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKyActionPerformed(evt);
            }
        });
        panelLogin.add(btDangKy);
        btDangKy.setBounds(234, 324, 108, 36);

        lbBgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg_Login.png"))); // NOI18N
        panelLogin.add(lbBgLogin);
        lbBgLogin.setBounds(0, 0, 378, 396);

        panelMain.add(panelLogin);
        panelLogin.setBounds(144, 36, 378, 396);

        lbBgMain.setForeground(new java.awt.Color(204, 204, 204));
        lbBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg_Login.png"))); // NOI18N
        panelMain.add(lbBgMain);
        lbBgMain.setBounds(0, 0, 666, 504);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txUserActionPerformed

    private void btDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDangKyActionPerformed

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDangNhapActionPerformed

    private void btDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangNhapMouseClicked
        dangNhap();
    }//GEN-LAST:event_btDangNhapMouseClicked

    private void txPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            dangNhap();
    }//GEN-LAST:event_txPassKeyPressed

    private void cbHienMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMatKhauMouseClicked
        if (cbHienMatKhau.isSelected())
            txPass.setEchoChar((char) 0);
        else
            txPass.setEchoChar('*');
    }//GEN-LAST:event_cbHienMatKhauMouseClicked

    private void btDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangKyMouseClicked
        DangKyGUI dangKy = new DangKyGUI();

        dangKy.setLocationRelativeTo(null);
        dangKy.setVisible(true);

    }//GEN-LAST:event_btDangKyMouseClicked

    private void dangNhap() {
        try {
            KhachHangBUS khachHangBus = new KhachHangBUS();
            NhanVienBUS nhanVienBus = new NhanVienBUS();
            AdminBUS adminBUs = new AdminBUS();

            boolean check = false;
            int idKhachHang = khachHangBus.timAccountKhachHang(txUser.getText(), txPass.getText());
            int idNhanVien = nhanVienBus.timAccountNhanVien(txUser.getText(), txPass.getText());
            int idAdmin = adminBUs.timAccountAdmin(txUser.getText(), txPass.getText());

            if (idKhachHang != 0 && idKhachHang != 1) {
                idHienHanh = idKhachHang;
                dispose();
                MainFrameGUI main = new MainFrameGUI();
                main.khachHang();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                check = true;
            } else if (idKhachHang == 1) {
                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khóa", "Khóa tài khoản", JOptionPane.WARNING_MESSAGE);
                check=true;
            }

            if (idNhanVien != 0 && idNhanVien != 1) {
                idHienHanh = idNhanVien;
                dispose();
                MainFrameGUI main = new MainFrameGUI();
                main.nhanVien();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                check = true;
            } else if (idNhanVien == 1) {
                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khóa", "Khóa tài khoản", JOptionPane.WARNING_MESSAGE);
                check=true;
            }

            if (idAdmin != 0) {
                idHienHanh = idAdmin;
                dispose();
                MainFrameGUI main = new MainFrameGUI();
                main.admin();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                check = true;
            }

            if (!check) {
                JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu", "Sai thông tin đăng nhập", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KhachHangBUS khachHangBus = new KhachHangBUS();
                    khachHangBus.docDuLieuKhachHang();

                    NhanVienBUS nhanVienBus = new NhanVienBUS();
                    nhanVienBus.docDuLieuNhanVien();

                    AdminBUS adminBUs = new AdminBUS();
                    adminBUs.docDuLieuAdmin();

                    LoginGUI log = new LoginGUI();
                    log.setVisible(true);
                    log.setLocationRelativeTo(null);

                } catch (SQLException ex) {
                    Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKy;
    private javax.swing.JButton btDangNhap;
    private javax.swing.JCheckBox cbHienMatKhau;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbBgLogin;
    private javax.swing.JLabel lbBgMain;
    private javax.swing.JLabel lbDangNhap;
    private javax.swing.JPanel lbGachChan;
    private javax.swing.JLabel lbIconLogin;
    private javax.swing.JLabel lbIconPass;
    private javax.swing.JLabel lbIconUser;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPasswordField txPass;
    private javax.swing.JTextField txUser;
    // End of variables declaration//GEN-END:variables
}
