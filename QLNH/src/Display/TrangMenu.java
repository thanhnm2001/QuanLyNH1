/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import Class.ThongTinMon;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Chung
 */
public class TrangMenu extends javax.swing.JFrame {

    /**
     * Creates new form TrangMenu
     */
    ArrayList<ThongTinMon> lstmon = new ArrayList<>();

    public TrangMenu() {
        initComponents();
        setLocationRelativeTo(null);

        ThongTin();

//        ImageIcon icon1 = new ImageIcon("src//image//" + lstmon.get(0).getAnh());
//        Image icon = icon1.getImage();
//        ImageIcon icon2 = new ImageIcon(icon.getScaledInstance(lblHinh1.getWidth(), lblHinh1.getHeight(), Image.SCALE_SMOOTH));
//        lblHinh1.setIcon(icon2);
//
//        lblMon1.setText("<html>"+lstmon.get(0).getTenmon() + "<br>" + lstmon.get(0).getDongia() +"<html>");
//
//        ImageIcon icon3 = new ImageIcon("src//image//" + lstmon.get(1).getAnh());
//        Image icon4 = icon3.getImage();
//        ImageIcon icon5 = new ImageIcon(icon4.getScaledInstance(lblHinh2.getWidth(), lblHinh2.getHeight(), Image.SCALE_SMOOTH));
//        lblHinh2.setIcon(icon5);
//
//        lblMon2.setText("<html>"+lstmon.get(1).getTenmon() + "<br>" + lstmon.get(1).getDongia() +"<html>");
        for (int i = 0; i < lstmon.size(); i++) {
            JPanel pn = new JPanel();
            pn.setSize(800, 550);

//            pn.setBackground(Color.yellow);
            pn.setLayout(new GridLayout(4, 3));
            for (int j = 7; j < 17; j++) {
                JPanel pn1 = new JPanel();

                JLabel lbl1 = new JLabel();
                JLabel lbl2 = new JLabel();
                lbl1.setSize(135, 110);
                lbl2.setSize(135, 48);

                ImageIcon icon1 = new ImageIcon("src//image//" + lstmon.get(j).getAnh());
                Image icon = icon1.getImage();
                ImageIcon icon2 = new ImageIcon(icon.getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH));
                lbl1.setIcon(icon2);

                lbl2.setText("<html>" + lstmon.get(j).getTenmon() + "<br>" + lstmon.get(j).getDongia() + "<html>");
                pn1.add(lbl1);
                pn1.add(lbl2);

//                jScrollPane1.add(jPanel16);
                jPanel16.add(pn);

                
                pn.add(pn1);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 39, 39));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton1.setText("Bàn");
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(149, 40));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(35, 35, 35));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton2.setText("Menu Món");
        jButton2.setBorderPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton26.setBackground(new java.awt.Color(0, 153, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Món Chính");
        jButton26.setBorderPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);

        jButton27.setBackground(new java.awt.Color(153, 153, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Đồ Uống");
        jButton27.setBorderPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton27MouseClicked(evt);
            }
        });
        jPanel1.add(jButton27);

        jButton28.setBackground(new java.awt.Color(153, 153, 255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Tráng Miệng");
        jButton28.setBorderPainted(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton28.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);

        jButton3.setBackground(new java.awt.Color(35, 35, 35));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton3.setText("Nhân Viên");
        jButton3.setBorderPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton5.setBackground(new java.awt.Color(35, 35, 35));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton5.setText("Hóa Đơn");
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton4.setBackground(new java.awt.Color(35, 35, 35));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton4.setText("Đăng Xuất");
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setPreferredSize(new java.awt.Dimension(800, 550));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel16);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 790, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Món Chính");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 98, 33));

        jPanel3.setOpaque(false);

        jButton23.setBackground(new java.awt.Color(35, 35, 35));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Thêm Món");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(35, 35, 35));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Sửa Món");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(35, 35, 35));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Xóa Món");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(35, 35, 35));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Reload");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 840, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nen.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(836, 587));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -10, 840, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TrangBan tb = new TrangBan();
        tb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        ThemMon tm = new ThemMon();
        tm.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        SuaMon sm = new SuaMon();
        sm.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        XoaMon xm = new XoaMon();
        xm.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        TrangMenu3 tm3 = new TrangMenu3();
        tm3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseClicked
        TrangMenu2 tm2 = new TrangMenu2();
        tm2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton27MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrangMenu tm = new TrangMenu();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TrangNhanVien tnv = new TrangNhanVien();
        tnv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    TrangHoaDon hd = new TrangHoaDon();
    hd.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        this.dispose();
        TrangMenu tm = new TrangMenu();
        tm.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    DangNhap dn = new DangNhap();
    dn.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TrangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void ThongTin() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-D3866G6:1433;databaseName==QLNH";
            Connection con = DriverManager.getConnection(url, "sa", "dongtuan123");
            String sql = "select tenmon, dongia, mama, anh from monan ";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String mama = rs.getString(3);
                String tenmon = rs.getString(1);
                float dongia = rs.getFloat(2);
                String anh = rs.getString(4);
                ThongTinMon tt = new ThongTinMon(mama, tenmon, dongia, anh);
                lstmon.add(tt);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDataToList() {

    }

//    private void load() {
//
//        for (int i = 7; i <= 16; i++) {
//            for (int j = 1; j <= 16; j++) {
//                if (i == 7 & j == 1) {
//                    String tenmon = "btnMon" + j;
//                    btnMon1.setName(tenmon);
//                    btnMon2.setName(tenmon);
//                }
//
//                btnMon1.setText(lstmon.get(i).getTenmon() + " " + lstmon.get(i).getDongia());
//                btnMon2.setText(lstmon.get(i).getTenmon() + " " + lstmon.get(i).getDongia());
//            }
//        }
//        
//    }
}
