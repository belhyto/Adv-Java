/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author dell
 */
public class DatabaseAccess {
    public static void accessDatabase() {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/yourdatabase";  // Update with your DB URL
        String user = "root";  // Update with your DB username
        String password = "nayana";  // Update with your DB password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            // Create a statement
            stmt = conn.createStatement();
            // Execute a query
            String sql = "SELECT * FROM ProductMaster";
            rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                int productID = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                double productPrice = rs.getDouble("price");
                int productQuantity = rs.getInt("quantity");
                

                // Display values
                System.out.println("Product ID: " + productID);
                System.out.println("Product Name: " + productName);
                System.out.println("Product Price: " + productPrice);
                System.out.println("Product Quantity: " + productQuantity);
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean-up environment
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
