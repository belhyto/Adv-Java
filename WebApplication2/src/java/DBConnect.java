/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roshni Sahoo
 */

import java.sql.*; //add this import
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    Connection con;
    public Connection getConnect() throws ClassNotFoundException{ //added 
        
        try {
            // Database connection details
             Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/students_db";
            String username = "root";
            String password = "1234";
            con= DriverManager.getConnection(url,username,password);
               
           
        } catch (SQLException ex) { //try-catch added automatically
            
        }
         return con;
    }
    public int check(String p,String q) throws SQLException //exception added automatically
    {
        int k=0;
            String str ="select * from users where username='"+p+"' and password ='"+q+"'";
            Statement st;
        try {
            
            Connection m =getConnect();
            st=m.createStatement();
            ResultSet rs;
            rs = st.executeQuery(str);
            if (rs.next()){
                k=1;
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
}
