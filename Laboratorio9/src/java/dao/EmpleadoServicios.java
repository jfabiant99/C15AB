package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoServicios {
    
    Connection con;
    PreparedStatement sen;
    ResultSet res;
    
    public EmpleadoServicios (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
            
        }catch(SQLException | ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
    public ArrayList ListarEmpleados () throws Exception{
        ArrayList l = new ArrayList();
        String sql = "select * from empleado";
        sen = con.prepareStatement(sql);
        res = sen.executeQuery();
        while (res.next()){
            EmpleadoEntity empleado = new EmpleadoEntity();
            
            empleado.setCodigo(res.getString("id"));
            empleado.setFirst_name(res.getString("first_name"));
            empleado.setLast_name(res.getString("last_name"));
            empleado.setAge(res.getInt("age"));
            empleado.setRol(res.getString("rol"));
            
            l.add(empleado);
        }
        return l;
    }
    
}
