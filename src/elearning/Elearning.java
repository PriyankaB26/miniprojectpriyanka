/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
       
package elearning;


/**
 *
 * @author admin
 */
public class Elearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Class.forname("com.mysql.cj.jdbc.Driver");
        }catch(Exception e) ;
        // TODO code application logic here
    }
    
}
