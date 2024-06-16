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
public class StudentInformations {
    Statement stmt;
    ResultSet rs;

    public ResultSet searchAddCustomer; {
        try {
  stmt = DBConnection.getStatementConnection();
 
  rs = stmt.executeQuery("SELECT * FROM student");
    

    } catch(Exception e){
        e.printStackTrace();
    }

}
   

    private static class rs {

        public rs() {
        }
    }
}


