package com.mycompany.mvn9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {

    private String id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    Connection con;
    Statement sen;
    ResultSet res;
    
    public Usuario(String id, String nombre, String apellido, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Usuario() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/tienda";
            String usuario = "root";
            String clave = "";
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONNEXION");
        }
    }

    public ArrayList<Usuario> mostrarUsuarios(){
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            String comando = "select *  from usuarios";
            sen = con.createStatement();
            res = sen.executeQuery(comando);
            while (res.next()) {
                lista.add(new Usuario(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LISTAR");
        }
        return lista;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "empleados{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave=" + clave + '}';
    }

}
