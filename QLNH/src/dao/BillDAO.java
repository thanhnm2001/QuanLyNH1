/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Bill;

/**
 *
 * @author Administrator
 */
public class BillDAO extends DAO<Bill, String>{

    @Override
    public void insert(Bill entity) {
        String sql="insert into khachhang values(?,?,?,?,?,?)";
        String ngayLap=new SimpleDateFormat("yyyy-MM-dd").format(entity.getNgayLap());
        JDBCHelper.update(sql, entity.getMaHD(),entity.getMaKH(),entity.getMaNV(),entity.getMaBan(),entity.getThanhTien(),ngayLap);
    }

    @Override
    public void update(Bill entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bill> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bill selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
