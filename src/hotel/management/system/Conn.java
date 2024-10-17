package hotel.management.system;

import java.sql.*;  

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {  
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            // Updating the connection URL to match your new MySQL Workbench section
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel_management_system", "root", "supreet361"); 
            
            s = c.createStatement();  
           
        } catch (Exception e) { 
            System.out.println(e);
        }  
    }  
}
