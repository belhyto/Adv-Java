
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roshni Sahoo
 */
public class dbconnect {
      final String url="jdbc:mysql:localhost:3306.siss";
      final String username="root";
      final String password="rootpassword";
      Connection con;
      
      public Connection con1(){
          try {
          con=(Connection) DriverManager.getConnection(url,username,password);
          }
          catch(SQLException e)
          {
              System.out.println(e.toString());
              
          }
          return con;
      }
      
      
              
}
