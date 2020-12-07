/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;

/**
 *
 * @author Administrator
 */
public class NhanVienDAO extends DAO<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity) {
        String sql="update nhanvien set password=? where manv=?";
        try {
            JDBCHelper.value(sql, entity.getPassword(),entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql="select * from ban";
        return null;
        
    }

    @Override
    public NhanVien selectById(String key) {
                try {
             String sql="select * from nhanvien where manv=?";
        ResultSet rs=JDBCHelper.query(sql, key);
        while(rs.next()){
            String maNV=rs.getString(1);
            String hoTen=rs.getString(2);
            Date ngaySinh=rs.getDate(3);
            String SDT=rs.getString(4);
            Boolean chucVu=rs.getBoolean(5);
            String password=rs.getString(6);
            String soCMT=rs.getString(7);
            NhanVien nv=new NhanVien(maNV, hoTen, ngaySinh, SDT, chucVu, password, soCMT);
            return nv;
            
        }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
