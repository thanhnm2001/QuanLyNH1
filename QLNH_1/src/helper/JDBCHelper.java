/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class JDBCHelper {
   static String user="sa";
    static String pass="123";
    static String url="jdbc:sqlserver://THANHJOKER:1433;databaseName=QLNH";
    public static PreparedStatement getStmt(String sql,Object... args) throws SQLException{
        Connection cn=DriverManager.getConnection(url, user, pass);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt=cn.prepareCall(sql);
        }else{
            stmt=cn.prepareStatement(sql);
        }
        for(int i=0;i<args.length;i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
        
    }
    public static ResultSet query(String sql,Object... args) throws SQLException{
        PreparedStatement stmt=JDBCHelper.getStmt(sql, args);
        return stmt.executeQuery();
        
    }
    public static Object value(String sql,Object... args) throws SQLException{
      
             ResultSet rs=JDBCHelper.query(sql, args);
       if(rs.next()){
           return rs.getObject(1);
       }
       rs.getStatement().getConnection().close();
       return null;
        
    }
    public static void update(String sql,Object... args) {
        try {
            PreparedStatement ps=JDBCHelper.getStmt(sql, args);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
     
            
      
    }
}
