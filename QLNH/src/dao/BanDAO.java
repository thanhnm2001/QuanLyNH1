/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Ban;

/**
 *
 * @author Administrator
 */
public class BanDAO extends DAO<Ban, String> {

    @Override
    public void insert(Ban entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ban entity) {
        String sql="";
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ban> selectAll() {
        String sql="Select * from ban";
        List<Ban> lst=new ArrayList<>();
        try {
            ResultSet rs=JDBCHelper.query(sql);
            while(rs.next()){
                String maBan=rs.getString(1);
                String tenBan=rs.getString(2);
                String loaiBan=rs.getString(3);
                String trangThai=rs.getString(4);
                Ban bn=new Ban(maBan, tenBan, trangThai, loaiBan);
                lst.add(bn);
            }
          
        } catch (Exception e) {
        }
          return lst;
         
    }

    @Override
    public Ban selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
