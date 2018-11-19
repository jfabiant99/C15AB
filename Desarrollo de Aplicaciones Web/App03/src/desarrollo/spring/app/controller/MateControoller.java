package desarrollo.spring.app.controller;
import desarrollo.spring.app.model.espec.IMateModel;
public class MateControoller {
	
        private IMateModel mateModel;
        
	public MateControoller(IMateModel mateModel) {
		this.mateModel = mateModel;
	}
	public int sumar(int num1, int num2) {
		return this.mateModel.sumar(num1, num2);
	}
}
