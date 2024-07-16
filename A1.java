/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author india
 */
public class A1 {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","");
                System.out.println("Connected");
        }catch(Exception ee){
                System.out.println(ee);
        }
    }
}
