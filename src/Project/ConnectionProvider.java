/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon()
    {//com.mysql.cj.jdbc.Driver
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");                                            
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Swastik@8087");
        return con;
       
        }
        catch(Exception e)   
        {
            return null;
        }
    }
    
}
