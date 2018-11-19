package desarrollo.spring.app.model;
import org.springframework.stereotype.Service;
@Service
public class VentaModel {

  public double calcularVenta(double precio, int cant){
	 double importe;
	 importe = precio * cant;
	 return importe;
  }
  
}
