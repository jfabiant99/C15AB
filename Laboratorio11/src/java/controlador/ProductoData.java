package controlador;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import libreria.Conexion;
import modelo.Producto;

@ManagedBean(name = "productoData", eager = true)
@SessionScoped

public class ProductoData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    Conexion c = new Conexion();
    
    //
    
    public List<Producto> getProductos () {
        
        List<Producto> records = new ArrayList<>();
        
        try{
            
            PreparedStatement sen;
            ResultSet res;
            String sql = "SELECT PRO_CODIGO, PRO_NOMBRE, PRO_PRECIO, PRO_STOCK FROM PRODUCTO";
        
            sen = c.getConnection().prepareStatement(sql);
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
    
    /*
    public void registrarProducto() {
        PreparedStatement sen;
        String sql = "INSERT INTO PRODUCTO VALUES (?, ?, ?, ?, ?, ?)";
        try{
            
            sen = c.getConnection().prepareStatement(sql);
            
            sen.setString(1, empresa);
            sen.setInt(2, ruc);
            
            sen.executeUpdate();
            
        }catch(SQLException e3){
            e3.printStackTrace();
        }
        
        empresa = "";
        ruc = 0;
        
    }
    
*/
}
