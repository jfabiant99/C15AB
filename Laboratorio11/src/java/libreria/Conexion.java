package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection con;
    
    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jfabiant", "jfabiant");
            
        }catch(ClassNotFoundException | SQLException e1){
            
        }
        return con;
    }
}
