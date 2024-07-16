/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author india
 */
public class A2 {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","");
                System.out.println("Connected");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create table products(pcode int,pname varchar(20),price int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into products values(1,'Computer',35000)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(1,'Aniket Kumar','Manager',32000)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(2,'Raman Kumar','Manager',35000)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("update students set course='MCA',age=23 where rollno=103");
                stmt.executeUpdate();
                System.out.println("Done");
        }catch(Exception ee){
                System.out.println(ee);
        }
    }
}
