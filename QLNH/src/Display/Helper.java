/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import Class.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dell
 */
public class Helper {
     public static Connection ketnoi(String database){
          try {
            String user = "sa";
            String pass = "dongtuan123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-D3866G6:1433;databaseName="+database;
            Connection cn = DriverManager.getConnection(url, user, pass);
       return cn;
        } catch (Exception e) {
           throw  new RuntimeException(e);
        }
    }

}
