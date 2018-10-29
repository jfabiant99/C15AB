package prueba02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejemplo {
    
    public static void main(String[] args) {
        
        double n1 = 20;
        double n2 = 30;
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("prueba02/contexto.xml");
        //En algunos casos se tiene que especificar como segundo parametro la clase:
        Matematica mate = (Matematica)beanFactory.getBean("mate", Matematica.class);
        
        double res = mate.multiplicar(n1, n2);
        System.out.println("Multip.: "+res);
        
    }
    
}
