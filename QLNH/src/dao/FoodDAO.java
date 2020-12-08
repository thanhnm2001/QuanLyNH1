/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Food;

/**
 *
 * @author Administrator
 */
public class FoodDAO extends DAO<Food, String>{

    @Override
    public void insert(Food entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Food entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Food> selectAll() {
        List<Food> lst=new ArrayList<>();
        String sql="Select * from monan";
        try {
            ResultSet rs=JDBCHelper.query(sql);
            while(rs.next()){
                String idFood=rs.getString(1);
                String nameFood=rs.getString(2);
                float price=rs.getFloat(3);
                String describe=rs.getString(4);
                String status=rs.getString(5);
                Food f=new Food(idFood, nameFood, price, describe, status);
                lst.add(f);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }

    @Override
    public Food selectById(String key) {
        Food ds=new Food();
        return ds;
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Customer cs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
