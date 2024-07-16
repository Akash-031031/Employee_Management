/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author india
 */
public class A4 {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","");
                System.out.println("Connected");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Select * from Students where rollno=102");
                ResultSet rs=stmt.executeQuery();
                if(rs.next())
                {
                    String s1=rs.getString(1);
                    String s2=rs.getString("name");
                    String s3=rs.getString(3);
                    String s4=rs.getString(4);
                    String s5=rs.getString(5);
                    System.out.println(s1+","+s2+","+s3+","+s4+","+s5);
                }                
        }catch(Exception ee){
                System.out.println(ee);
        }
    }
}
