package controlador;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Producto;

@ManagedBean(name = "productoData", eager = true)
@SessionScoped

public class ProductoData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public Connection getConnection () {
        
        Connection con = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jfabiant", "jfabiant");
            System.out.println("Conexion establecida correctamente");
            
        }catch(ClassNotFoundException | SQLException e1){
            System.out.println("Error al establecer la conexion: "+e1);
        }
        return con;
    }
    
    public List<Producto> getProductos () {
        
        List<Producto> records = new ArrayList<>();
        
        PreparedStatement sen;
        ResultSet res;
        String query = "SELECT PRO_CODIGO, PRO_NOMBRE, PRO_PRECIO, PRO_STOCK FROM PRODUCTO";
        try{
            sen = getConnection().prepareStatement(query);
            res = sen.executeQuery();
            while (res.next()) {
                Producto prod = new Producto();
                prod.setCodigo(res.getString(1));
                prod.setNombre(res.getString(2));
                prod.setPrecio(res.getDouble(3));
                prod.setStock(res.getInt(4));
                
                records.add(prod);
            }
        }catch(SQLException e2){
            e2.printStackTrace();
        }
        
        return records;
    }
    
}
