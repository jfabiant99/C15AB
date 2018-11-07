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
import modelo.Suministro;

@ManagedBean(name = "suministroData", eager = true)
@SessionScoped

public class SuministroData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    Conexion c = new Conexion();
    
    private String empresa;
    private int ruc;

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
    
    public List<Suministro> getSuministros () {
        List<Suministro> records = new ArrayList<>();
        
        PreparedStatement sen;
        ResultSet res;
        String sql = "SELECT SUM_CODIGO, SUM_EMPRESA, SUM_RUC FROM SUMINISTRO";
        
        try{
            sen = c.getConnection().prepareStatement(sql);
            res = sen.executeQuery();
            while (res.next()) {
                Suministro sum = new Suministro();
                sum.setCodigo(res.getInt(1));
                sum.setEmpresa(res.getString(2));
                sum.setRuc(res.getInt(3));
                
                records.add(sum);
            }
            
        }catch(SQLException e2){
            e2.printStackTrace();
        }
        return records;
    }
    
    public void registrarSuministro() {
        PreparedStatement sen;
        String sql = "INSERT INTO SUMINISTRO VALUES (SUMINISTRO_SEQUENCE.NEXTVAL, ?, ?)";
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
    
}
