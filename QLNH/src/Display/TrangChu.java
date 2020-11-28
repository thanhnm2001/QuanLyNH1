/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author Chung
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        setLocationRelativeTo(null);
        
        setSize(858,610);
//        ImageIcon icon1=new ImageIcon("src//image//nen.jpg");
//        Image icon=icon1.getImage();
//                ImageIcon icon2 = new ImageIcon(icon.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
//                lblImage.setIcon(icon2);btnKey.setBorder(new EmptyBorder(20, 20, 20, 20));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnBan = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnDanhGia = new javax.swing.JButton();
        btnDMK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSG");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Welcome, ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Version: 1.0.0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhanvien.png"))); // NOI18N
        btnNhanVien.setBorderPainted(false);
        btnNhanVien.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhanvien1.png"))); // NOI18N
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 180, 90));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        btnMenu.setBorderPainted(false);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu1.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 180, 90));

        btnBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ban.png"))); // NOI18N
        btnBan.setBorderPainted(false);
        btnBan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ban1.png"))); // NOI18N
        btnBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanActionPerformed(evt);
            }
        });
        getContentPane().add(btnBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 180, 90));

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat1.png"))); // NOI18N
        getContentPane().add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 180, 90));

        btnDanhGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/danhgia.png"))); // NOI18N
        btnDanhGia.setBorderPainted(false);
        btnDanhGia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/danhgia1.png"))); // NOI18N
        getContentPane().add(btnDanhGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 180, 90));

        btnDMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chìa.png"))); // NOI18N
        btnDMK.setBorderPainted(false);
        btnDMK.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chìa2.png"))); // NOI18N
        btnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDMKActionPerformed(evt);
            }
        });
        getContentPane().add(btnDMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 180, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nen.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
    TrangMenu tmn = new TrangMenu();
    tmn.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanActionPerformed
    TrangBan tb = new TrangBan();
    tb.setVisible(true);
//    this.dispose();
    }//GEN-LAST:event_btnBanActionPerformed

    private void btnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDMKActionPerformed
     
        ChangePassword cp=new ChangePassword();
        cp.setVisible(true);
    }//GEN-LAST:event_btnDMKActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
       
        TrangNhanVien tnv=new TrangNhanVien();
        tnv.setVisible(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBan;
    private javax.swing.JButton btnDMK;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhGia;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
