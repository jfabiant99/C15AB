package prueba04;
public class MateServicios {
    
    private IMatematica mate;
    
    public void setMate(IMatematica mate) {
        this.mate = mate;
    }
    
    public int Calcular_suma (int n1, int n2) {
        return mate.sumar(n1, n2);
    }
    
}
