/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;

/**
 *
 * @author dell
 */
public class TrangNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form TrangNhanVien
     */
    DefaultTableModel model;
    Connection cn;
    int index;
    ArrayList<NhanVien> lstnv = new ArrayList<>();

    public TrangNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        cn = Helper.ketnoi("QLNH");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        if(cn!= null){
//            JOptionPane.showMessageDialog(this, "Dang nhap thanh cong");
//        }else{
//            JOptionPane.showMessageDialog(this,"Dang nhap that bai");
//        }
        model = new DefaultTableModel();
        model = (DefaultTableModel) tblnv.getModel();
        loaddata();

        loadtable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btndoimk = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnv = new javax.swing.JTable();
        lblcurrrent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh Sách Nhân Viên");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 33));

        jPanel3.setOpaque(false);

        btnupdate.setBackground(new java.awt.Color(35, 35, 35));
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Chỉnh Sửa");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(35, 35, 35));
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Thêm Mới");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(35, 35, 35));
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btndoimk.setBackground(new java.awt.Color(35, 35, 35));
        btndoimk.setForeground(new java.awt.Color(255, 255, 255));
        btndoimk.setText("Đổi Mật Khẩu");
        btndoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btndoimk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndoimk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 840, -1));
        jPanel4.add(txttim, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 200, 40));

        jButton6.setText("Tìm kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 150, 40));

        tblnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Họ tên", "Ngày sinh", "Điện thoại", "Chức vụ", "Số cmt"
            }
        ));
        tblnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnv);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 800, 340));

        lblcurrrent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcurrrent.setForeground(new java.awt.Color(255, 0, 0));
        lblcurrrent.setText("Tổng số bản ghi:");
        jPanel4.add(lblcurrrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 473, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nen.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(836, 587));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(39, 39, 39));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 7, -1, -1));

        jButton26.setBackground(new java.awt.Color(0, 153, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton26.setText("Sân Vườn");
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
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 52, -1, -1));

        jButton27.setBackground(new java.awt.Color(153, 153, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton27.setText("Trong Nhà");
        jButton27.setBorderPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 97, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton2.setText("Menu Món");
        jButton2.setBorderPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 142, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jButton3.setText("Nhân Viên");
        jButton3.setBorderPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 187, -1, -1));

        jButton4.setBackground(new java.awt.Color(35, 35, 35));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton4.setText("Đánh Giá");
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 232, -1, -1));

        jButton5.setBackground(new java.awt.Color(35, 35, 35));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side.png"))); // NOI18N
        jButton5.setText("Đăng Xuất");
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(151, 40));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (3).png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (2).png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/side (1).png"))); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 277, -1, -1));

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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try {
            int index = tblnv.getSelectedRow();
            if (index >= 0) {

                String manv = tblnv.getValueAt(index, 1) + "";
                String hoten = tblnv.getValueAt(index, 2) + "";
                String ngaysinh = tblnv.getValueAt(index, 3) + "";
                String sdt = tblnv.getValueAt(index, 4) + "";
                String cmt = tblnv.getValueAt(index, 6) + "";
                String chucVu = tblnv.getValueAt(index, 5) + "";

                new SuaNV(manv, hoten, ngaysinh, sdt, cmt, chucVu).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Moi ban chon dong can hien thi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        new ThemNV().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:

        try {
//             index = tblnv.getSelectedRow();
            if (lstnv.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Khong con du lieu de xoa");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa mã nhân viên " + tblnv.getValueAt(index, 1));
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            lstnv.remove(index);
            //xoa trong csdl va bang%
            String sql = "delete from nhanvien\n"
                    + "where manv=?";

            PreparedStatement pstm = cn.prepareStatement(sql);
            // dien gia tri cho cac dau
            pstm.setString(1, tblnv.getValueAt(index, 1) + "");
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            model.setRowCount(0);
            loadtable();
            showdetail();
//            showdetail();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không xóa được nhân viên này!!!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btndoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimkActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau().setVisible(true);

    }//GEN-LAST:event_btndoimkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM nhanvien where manv=?";
            PreparedStatement pm = cn.prepareStatement(sql);
            pm.setString(1, txttim.getText());
            ResultSet rs = pm.executeQuery();
            if (rs.next()) {
                model.setRowCount(1);
                int s5 = rs.getInt(5);
                String chucvu;
                if (s5 == 1) {
                    chucvu = "Quản Lý";
                } else {
                    chucvu = "Nhân viên";
                }
                tblnv.setValueAt(rs.getString(1), index, 1);
                tblnv.setValueAt(rs.getString(2), index, 2);
                tblnv.setValueAt(rs.getString(3), index, 3);
                tblnv.setValueAt(rs.getString(4), index, 4);
                tblnv.setValueAt(chucvu, index, 5);
                tblnv.setValueAt(rs.getString(7), index, 6);

//                JOptionPane.showMessageDialog(this, "Tim thay manv " + tblnv.getValueAt(index, 1) + "\n" + "Ho ten " + tblnv.getValueAt(index, 2)
//                        + "\n" + "Ngay sinh " + tblnv.getValueAt(index, 3) + "\n" + "Dien thoai " + tblnv.getValueAt(index, 4)
//                        + "\n" + "Chuc vu " + chucvu
//                        + "\n" + "So CMT " + tblnv.getValueAt(index, 6));
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy người học này!");
            }

            rs.close();
            pm.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnvMouseClicked
        // TODO add your handling code here:
        try {
            index = tblnv.getSelectedRow();
            if (index >= 0) {
//                NhanVien s = lstnv.get(index);

                showdetail();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblnvMouseClicked

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
            java.util.logging.Logger.getLogger(TrangNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndoimk;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblcurrrent;
    private javax.swing.JTable tblnv;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
private void loadtable() {
        try {
            String sql = "select * from nhanvien";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int stt = 1;
            while (rs.next()) {
                int s5 = rs.getInt(5);
                String chucvu;
                if (s5 == 1) {
                    chucvu = "Quản Lý";
                } else {
                    chucvu = "Nhân Viên";
                }
                model.addRow(new Object[]{stt++, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    chucvu, rs.getString(7)});
            }
            rs.close();
            stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi load table ");
        }
    }

    private void loaddata() {
        try {
            String sql = "select * from nhanvien";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int stt = 1;
            while (rs.next()) {
                int s5 = rs.getInt(5);
                String chucvu;
                if (s5 == 1) {
                    chucvu = "Quản Lý";
                } else {
                    chucvu = "Nhân viên";
                }
                lstnv.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4),
                        rs.getBoolean(5), rs.getString(6), rs.getString(7)));

            }
            rs.close();
            stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi load data");
        }
    }

    private void showdetail() {
        NhanVien s = lstnv.get(index);
        lblcurrrent.setText("Tổng số bản ghi: " + (index + 1) + "/" + lstnv.size());
    }
}
