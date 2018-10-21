package modelo;

import dao.ProductoEntity;
import dao.ProductoServicios;
import javax.swing.JOptionPane;

public class ProductoBean {
    
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoBean(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
    
    public static ProductoBean getProducto (String codigo) {
        ProductoEntity aux = new ProductoEntity();
        ProductoEntity pro = new ProductoEntity();
        
        aux.setCodigo(codigo);
        
        try{
            ProductoServicios servicios = new ProductoServicios();
            pro = servicios.ConsultaProducto(aux);
            
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null, "Error en la busqueda");
        }
        
        ProductoBean pb;
        
        if(pro!=null){
            pb = new ProductoBean(pro.getCodigo(), pro.getNombre(), pro.getPrecio(), pro.getStock());
        }else{
            pb = null;
        }
        
        return pb;
    }
    
}
