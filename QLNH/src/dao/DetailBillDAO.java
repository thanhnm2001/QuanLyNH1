/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.util.List;
import model.DetailBill;

/**
 *
 * @author Administrator
 */
public class DetailBillDAO extends DAO<DetailBill, String>{

    @Override
    public void insert(DetailBill entity) {
    String sql="insert into cthd values (?,?,?)";
        JDBCHelper.update(sql, entity.getMaHD(),entity.getMaMA(),entity.getSL());
        

    }

    @Override
    public void update(DetailBill entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailBill> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetailBill selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
