
package datab;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class dbconnect {
    public static Connection connect()
    {
        Connection conn=null;
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/point_of_sales_system?", "root", "");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
    
}
