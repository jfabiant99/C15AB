package modelo;

import java.io.Serializable;

public class Almacen implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int codigo;
    private String distrito;
    private String responsable;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
}
