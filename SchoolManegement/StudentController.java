/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Aruni
 */
public class StudentController {
    
public static void Form(String stdName, String address, String grade, String age, String gender) {
    new model.addRecord().Form(stdName, address, grade, age, gender);
        JOptionPane.showMessageDialog(null,"New Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
}
    
}
