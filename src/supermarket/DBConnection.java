/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KARAN
 */
public class DBConnection {
    
    static Connection conn =null;
    static final String DBURL="jdbc:mysql://localhost:3306/market";
    static final String USER="root";
    static final String PASS="";
    
    public static Connection connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DBURL,USER,PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}
