package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.JOptionPane;

@ManagedBean
@RequestScoped
public class AppControlador {

    private int numero1;
    private int numero2;
    
    private int [] A1;
    private int [] A2;
    
    private String operacion;
    
    private int res = 0;
    
    private int contador = 0;
    
    public AppControlador(int n1){
        A1 = new int [8];
        A2 = new int [8];
        
        A1[0] = n1;
        
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
        
    public int[] getA1() {
        return A1;
    }

    public void setA1(int[] A1) {
        this.A1 = A1;
    }

    public int[] getA2() {
        return A2;
    }

    public void setA2(int[] A2) {
        this.A2 = A2;
    }
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    public void operar (String opc) {
        
        if (opc.equals("SUMAR")) {
            res = A1[0];
        } else if (opc.equals("RESTAR")) {
            res = numero1 - 10;
        } else if (opc.equals("MULTIPLICAR")) {
            res = numero1 * 10;
        } else if (opc.equals("DIVIDIR")) {
            res = numero1 / 10;
        }
    }
    
}
