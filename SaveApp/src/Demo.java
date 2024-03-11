/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author Roshni Sahoo
 */
public class Demo {
    public Connection dbcon()
    {
        Connection x;
        String url="jdbc:mysql:localhost:Employee";
        String uname="root";
        String pswd="1234";
        x=null;
        try{
             x=DriverManager.getConnection(url,uname,pswd);
        }
        catch(Exception e)
        {
            
        }
        return x;
       
    }
    
}
