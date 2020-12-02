/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.text.SimpleDateFormat;
import java.util.List;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
