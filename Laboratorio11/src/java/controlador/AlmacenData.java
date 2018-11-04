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
import modelo.Almacen;

@ManagedBean(name = "almacenData", eager = true)
@SessionScoped

public class AlmacenData implements Serializable{
    
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
    
    public List<Almacen> getAlmacen (){
        
        List<Almacen> records = new ArrayList<>();
        
        PreparedStatement sen;
        ResultSet res;
        String query = "SELECT ALM_CODIGO, ALM_DISTRITO, ALM_RESPONSABLE FROM ALMACEN";
        
        try{
            sen = getConnection().prepareStatement(query);
            res = sen.executeQuery();
            while (res.next()) {
                Almacen alm = new Almacen();
                alm.setCodigo(res.getInt(1));
                alm.setDistrito(res.getString(2));
                alm.setResponsable(res.getString(3));
                
                records.add(alm);
            }
        }catch(SQLException e2){
            e2.printStackTrace();
        }
        return records;
    }
    
    public void registrarAlmacen(String distrito, String responsable) {
        PreparedStatement sen;
        String query = "INSERT INTO ALMACEN (ALM_CODIGO, ALM_DISTRITO, ALM_RESPONSABLE) VALUES (ALMACEN_SEQUENCE.NEXTVAL, ?, ?)";
        try{
            sen = getConnection().prepareStatement(query);
            
            sen.setString(1, distrito);
            sen.setString(2, responsable);
            
            sen.executeUpdate();
            
        }catch(SQLException e3){
            e3.printStackTrace();
        }
    }
    
}
