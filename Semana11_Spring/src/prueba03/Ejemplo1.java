package prueba03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        int n1 = 20;
        int n2 = 30;
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("prueba03/contexto.xml");
        //Para este caso solo se hace una llamada a la clase
        Matematica m = (Matematica)beanFactory.getBean(Matematica.class);
        
        int res = m.sumar(n1, n2);
        System.out.println("Suma: "+res);
        
    }
    
}
