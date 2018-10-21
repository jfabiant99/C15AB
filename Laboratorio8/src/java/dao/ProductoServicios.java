package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.ProductoBean;

public class ProductoServicios {
    
    Connection con;
    
    public ProductoServicios () throws SQLException, ClassNotFoundException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/sistema";
        String usuario = "root";
        String clave = "";
        
       Class.forName(driver);
       con = DriverManager.getConnection(url, usuario, clave);
        
    }
    
    public void RegistrarProducto (ProductoBean producto) throws Exception {
        
        String sql = "insert into producto (codigo, nombre, precio, stock) values (?, ?, ?, ?)";
        
        PreparedStatement sen = con.prepareStatement(sql);
        sen.setString(1, producto.getCodigo());
        sen.setString(2, producto.getNombre());
        sen.setDouble(3, producto.getPrecio());
        sen.setInt(4, producto.getStock());
        sen.executeUpdate();
        
    }
    
    public List ListarProductos () throws Exception{
        String sql = "select codigo, nombre, precio, stock from producto";
        PreparedStatement sen = con.prepareStatement(sql);
        ResultSet res = sen.executeQuery();
        
        List l = new ArrayList();
        
        while (res.next()) {
            ProductoEntity producto = new ProductoEntity();
            
            producto.setCodigo(res.getString(1));
            producto.setNombre(res.getString(2));
            producto.setPrecio(res.getDouble(3));
            producto.setStock(res.getInt(4));
            
            l.add(producto);
            
        }
        return l;
    }
    
    public ProductoEntity ConsultaProducto (ProductoEntity producto) throws Exception{
        ProductoEntity pro = null;
        String sql = "select codigo, nombre, precio, stock from producto where codigo = ?";
        PreparedStatement sen = con.prepareStatement(sql);
        sen.setString(1, producto.getCodigo());
        ResultSet res = sen.executeQuery();
        
        while (res.next()) {
            pro = new ProductoEntity();
            
            pro.setCodigo(res.getString(1));
            pro.setNombre(res.getString(2));
            pro.setPrecio(res.getDouble(3));
            pro.setStock(res.getInt(4));
            
        }
        return pro;
    }
    
}
