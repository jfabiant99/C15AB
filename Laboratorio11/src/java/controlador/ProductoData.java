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
    
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private int alm_codigo;
    private int sum_codigo;

    public Conexion getC() {
        return c;
    }

    public void setC(Conexion c) {
        this.c = c;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAlm_codigo() {
        return alm_codigo;
    }

    public void setAlm_codigo(int alm_codigo) {
        this.alm_codigo = alm_codigo;
    }

    public int getSum_codigo() {
        return sum_codigo;
    }

    public void setSum_codigo(int sum_codigo) {
        this.sum_codigo = sum_codigo;
    }
    
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
    
    
    public void registrarProducto() {
        PreparedStatement sen;
        String sql = "INSERT INTO PRODUCTO VALUES (?, ?, ?, ?, ?, ?)";
        try{
            
            sen = c.getConnection().prepareStatement(sql);
            
            sen.setString(1, codigo);
            sen.setString(2, nombre);
            sen.setDouble(3, precio);
            sen.setInt(4, stock);
            sen.setInt(5, alm_codigo);
            sen.setInt(6, sum_codigo);
            
            sen.executeUpdate();
            
        }catch(SQLException e3){
            e3.printStackTrace();
        }
        
        //empresa = "";
        //ruc = 0;
        
    }
    

}
