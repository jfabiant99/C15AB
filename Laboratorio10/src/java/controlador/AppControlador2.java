package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AppControlador2 {
    
    private String producto;
    private double precio;
    private int cantidad;
    private double subtotal;
    private double igv;
    private double total;
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void proceso () {
        subtotal = precio * cantidad;
        igv = 0.18 * subtotal;
        total = subtotal + igv;
    }
    
    public void limpiar(){
        producto = "TV";
        precio = 0;
        cantidad = 0;
        subtotal = 0;
        igv = 0;
        total = 0;
        
    }
}
