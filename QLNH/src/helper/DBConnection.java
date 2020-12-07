/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CuongNP
 */
public class DBConnection {
    private static String DB_URL = "jdbc:sqlserver://DESKTOP-QPFGD23:1433;databaseName=QLNH";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123"; 
    public static Connection conn;
    
    public DBConnection(){
        try {            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi thiếu thư viện kết nối");
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối CSDL!");
        }
    }
    
    
}
