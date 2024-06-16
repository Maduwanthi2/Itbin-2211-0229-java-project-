/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aruni
 */
public class DBConnection {
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection() {
       try {
           String url = "jdbc:postgresql://localhost:5432/schoolmanegement02";
           conn = DriverManager.getConnection(url,"postgres","");
           stat= conn.createStatement();
           
           
       } catch(Exception e){
           e.printStackTrace();
       }
           
       
        return stat;
  }
    public static void closeCon() throws SQLException{
        conn.close();
    }
}

    

