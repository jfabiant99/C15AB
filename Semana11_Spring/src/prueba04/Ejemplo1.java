package prueba04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        int n1 = 20;
        int n2 = 30;
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("prueba04/contexto.xml");
        Matematica m = (Matematica)beanFactory.getBean("mate");
        
        int res = m.sumar(n1, n2);
        System.out.println("Suma: "+res);
        
    }
    
}
