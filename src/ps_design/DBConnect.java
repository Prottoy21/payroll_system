
package ps_design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class DBConnect {
     // Create a connection variable and set it to null
    Connection conn = null;
    public static Connection DBConnect(){
        
         // Provide a try and catch exception
        try {
            // Connect to mysql library
            Class.forName("com.mysql.cj.jdbc.Driver");
            // jdbc:mysql://hostname:port/databasename, server username, server password
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project_payroll","root","");
            
            return conn;
            
        }catch(Exception ex) {
            // If connection fail
            System.out.println("Erro: " + ex);
            return null;
        }

    }
}