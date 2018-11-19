package desarrollo.spring.app.model.impl1;
import desarrollo.spring.app.model.espec.IMateModel;
public class MateModelImpl1 implements IMateModel{
	@Override
	public int sumar(int n1, int n2){
		int suma;
		suma = n1 + n2;
		return suma;
	}
}
