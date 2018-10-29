package prueba06;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejemplo1 {
    public static void main(String[] args) {
        int numero01 = 20;
        int numero02 = 30;
        
        BeanFactory beanFactory;
        
        beanFactory = new ClassPathXmlApplicationContext("prueba06/contexto.xml");
      
        MateServicios servicio = beanFactory.getBean(MateServicios.class);
		
        int suma = servicio.Calcular_suma(numero01, numero02);
        
        System.out.println("Suma: " + suma);
		servicio.mostrarLista();
    }
    
}
