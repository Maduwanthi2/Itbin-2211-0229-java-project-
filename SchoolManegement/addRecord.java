/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;

/**
 *
 * @author Aruni
 */
public class addRecord {
    
    Statement stmt;
    
public void Form(String stdName, String address, String grade, String age, String gender) {
    try {
        
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO VALUES('"+stdName+"','"+address+"','"+grade+"','"+age+"','"+gender+"')");
    }catch (Exception e) {
        e.printStackTrace();
    }
}
    
}
