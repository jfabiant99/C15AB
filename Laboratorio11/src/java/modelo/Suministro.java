package modelo;

import java.io.Serializable;

public class Suministro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int codigo;
    private String empresa;
    private int ruc;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
    
}
