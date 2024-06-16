/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Aruni
 */
public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
public ResultSet searchLogin(String username) {
    try {
  stmt = DBConnection.getStatementConnection();
  String name = username;
  
rs = stmt.executeQuery("SELECT * FROM login where username='" + name + "'");
    } catch (Exception e) {
        e.printStackTrace();
    }
    return rs;
}

   

   

}

    

   

    
