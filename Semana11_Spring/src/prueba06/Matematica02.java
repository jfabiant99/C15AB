package prueba06;

public class Matematica02 implements IMatematica {
    @Override
    public int sumar(int numero01, int numero02) {
            int operacion = (numero01 * numero02) / (numero01 - numero02);
            return operacion;
    }
}