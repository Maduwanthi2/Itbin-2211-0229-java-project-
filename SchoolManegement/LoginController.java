/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Home;
import model.DBConnection;
import model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Login;

/**
 *
 * @author Aruni
 */
public class LoginController {
    
public static void login(String username, String password) {
    try { 
   
  
    ResultSet rs = new DBSearch().searchLogin(username);
    
    
        while (rs.next()) {
username = rs.getString("username"); //assign database login name to the variable
password = rs.getString("password"); //assign database password to the variable
        }
        if (username != null && password != null) {
            if (password.equals(password)) {
      System.out.println("Login Successfull");
      Login.getFrames() [1].dispose();
      new Home().setVisible(true);
            }
            
        } else {
            
JOptionPane.showMessageDialog(null, "Please check the Credentials","Error",JOptionPane.ERROR_MESSAGE);
        }
        DBConnection.closeCon();
        
        
    }catch (SQLException ex) {
Logger.getLogger (LoginController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
}
