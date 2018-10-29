package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Articulo;

@ManagedBean
@RequestScoped
public class AppControlador {
    
    private List <Articulo> lista1 = null;
    private List <Map <String, Object>> lista2 = null;
    
    public List<Articulo> getLista1 () {
        if (lista1 == null){
            lista1 = new ArrayList<>();
            lista1.add(new Articulo("Polos", 200, 3));
            lista1.add(new Articulo("Pantalones", 150, 15));
            lista1.add(new Articulo("Casacas", 100, 1));
        }
        return lista1;
    }
    
    public List<Map<String, Object>> getLista2 () {
        if (lista2 == null) {
            lista2 = new ArrayList<Map<String, Object>>();
            Map <String, Object> r;
            r = new HashMap<String, Object>();
            
            r.put("nombre", "Televisor");
            r.put("precio", 200);
            r.put("stock", 3);
            
            lista2.add(r);
            
            r = new HashMap<String, Object>();
            
            r.put("nombre", "Celular");
            r.put("precio", 500);
            r.put("stock", 12);
            
            lista2.add(r);
        }
        return lista2;
    }
    
    
    
}
