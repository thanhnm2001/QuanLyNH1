/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author Administrator
 */
public class CustomerDAO extends DAO<Customer, String> {

    @Override
    public void insert(Customer entity) {
        String sql="insert into khachhang values(?,?,?,?,?)";
        //ngày sinh phải insert String
        String ngaySinh=new SimpleDateFormat("yyyy-MM-dd").format(entity.getNgaySinh());
        JDBCHelper.update(sql, entity.getMaKH(),entity.getHoTen(),ngaySinh,entity.getSDT(),entity.getCMT());
    }

    @Override
    public void update(Customer entity) {
        String sql="update khachhang set hoten=?,ngaysinh=?,sdt=?,socmt=? where makh=?";
        String date=new SimpleDateFormat("yyyy-MM-dd").format(entity.getNgaySinh());
        JDBCHelper.update(sql, entity.getHoTen(),date,entity.getSDT(),entity.getCMT(),entity.getMaKH());
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> selectAll() {
        List<Customer> lst=new ArrayList<>();
        String sql="Select * from khachhang";
        try {
            ResultSet rs=JDBCHelper.query(sql);
            while(rs.next()){
                String maKH=rs.getString(1);
                String hoTen=rs.getString(2);
                Date ngaySinh=rs.getDate(3);
                String SDT=rs.getString(4);
                String soCMT=rs.getString(5);
                Customer cs=new Customer(maKH, hoTen, ngaySinh, SDT, soCMT);
                lst.add(cs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
        
    }

    @Override
    public Customer selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
