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
import modelo.Suministro;

@ManagedBean(name = "suministroData", eager = true)
@SessionScoped

public class SuministroData implements Serializable{
    
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
    
    public List<Suministro> getSuministros () {
        List<Suministro> records = new ArrayList<>();
        
        PreparedStatement sen;
        ResultSet res;
        String query = "SELECT SUM_CODIGO, SUM_EMPRESA, SUM_RUC FROM SUMINISTRO";
        
        try{
            sen = getConnection().prepareStatement(query);
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
    
}
