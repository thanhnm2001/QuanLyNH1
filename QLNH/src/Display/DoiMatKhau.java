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
import model.NhanVien;

/**
 *
 * @author dell
 */
public class DoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form DoiMatKhau
     */
    Connection cn;
    int index;
        ArrayList<NhanVien> lstnv = new ArrayList<>();
    public DoiMatKhau() {
        initComponents();
        setLocationRelativeTo(null);
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         cn = Helper.ketnoi("QLNH");
       
       
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txttaikhoan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnhaplai = new javax.swing.JPasswordField();
        txtpassmoi = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtpasscu = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Đổi Mật Khẩu");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttaikhoanActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Xác Nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Bỏ Qua");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên Đăng Nhập");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mật Khẩu Mới");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nhập Lại Mật Khẩu ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mật Khẩu Cũ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnhaplai)
                            .addComponent(txtpassmoi)
                            .addComponent(txttaikhoan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(txtpasscu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpasscu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnhaplai)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            String manv = txttaikhoan.getText();
             String pass = new String(txtpasscu.getPassword());
            String passMoi = new String(txtpassmoi.getPassword());
            String passXacNhan = new String(txtnhaplai.getPassword());
            String sql1 = "select * from nhanvien";
            Statement sm = cn.createStatement();
            ResultSet rs = sm.executeQuery(sql1);
            if (rs.next()) {
                if(!pass.equalsIgnoreCase(rs.getString("password"))){
                    JOptionPane.showMessageDialog(this,"Sai mật khẩu cũ");
                    txtpasscu.requestFocus();
                } else if (!passXacNhan.equals(passMoi)) {
                    JOptionPane.showMessageDialog(this,"Mật khẩu không trùng khớp");
                    txtnhaplai.requestFocus();
                } else {
                    String sql = "UPDATE NhanVien SET PASSWORD =? where MaNV =?";
                    PreparedStatement pm = cn.prepareStatement(sql);
                    pm.setString(1, passMoi);
                    pm.setString(2, manv);
                    int row = pm.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(this,"Đổi mật khẩu thành công");
                        new TrangNhanVien().setVisible(true);
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "Không đổi được mật khẩu");
                    }
                }
            }
            
//            String sql = "update NhanVien\n"
//                    + "set password =?\n"
//                    + "where manv =?";
//            PreparedStatement pstm = cn.prepareStatement(sql);
//            pstm.setString(1, pass);
//            pstm.setString(2, manv);
//            int row = pstm.executeUpdate();
//            if (row > 0) {
//
//               JOptionPane.showMessageDialog(this, "Đổi password thành công");
//                new TrangNhanVien().setVisible(true);
//                showdetail();
//                this.dispose();
//            } else {
//                JOptionPane.showMessageDialog(this, "Lỗi khi đổi password ");
//            }
            
              
        } catch (Exception e) {
   
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttaikhoanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new TrangNhanVien().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoiMatKhau().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtnhaplai;
    private javax.swing.JPasswordField txtpasscu;
    private javax.swing.JPasswordField txtpassmoi;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
private boolean chekfrom() {
        try {
            if (txttaikhoan.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Không để trống tên đăng nhập");
                txttaikhoan.requestFocus();
                return true;
            }
          if (txtpasscu.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Không để trống mật khẩu cũ");
                txtpasscu.requestFocus();
                return true;
            }
          
            if (txtpassmoi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Không để trống mật khẩu mới");
                txtpassmoi.requestFocus();
                return true;
            }
            if (txtnhaplai.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Không để trống nhập lại mật khẩu");
                txtnhaplai.requestFocus();
                return true;
            }
          
//            String pass = txtpassmoi.getText();
//            String repass = txtnhaplai.getText();
//            if (!repass.matches(pass)) {
//                JOptionPane.showMessageDialog(this, "Mật khẩu không khớp nhau. Vui lòng nhập lại!");
//                return true;
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi check form");
        }
        return false;
    }
    public void showdetail() {
        NhanVien s = lstnv.get(index);
        txttaikhoan.setText(s.getMaNV());
        txtpasscu.setText(s.getPassword());
        txtpassmoi.setText(s.getPassword());
        txtnhaplai.setText(s.getPassword());
//        txthinh.setText(s.getHinh());
    }

}
