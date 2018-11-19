package desarrollo.spring.app.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import desarrollo.spring.app.model.Service;
import desarrollo.spring.app.model.VentaModel;
@Controller
public class AppController {
  
  @Autowired
  private VentaModel ventaModel;
  @Autowired
  private Service service;

  /*
   * Permite mostrar un view
   * @nombre  Nombre del view a mostrar
   */
  @RequestMapping(value = "mostrarView.htm", method = RequestMethod.GET)
  public ModelAndView mostrarView(@RequestParam("nombre") String nombre) {
	 ModelAndView view;
	 view = new ModelAndView(nombre);
	 return view;
  }

  @RequestMapping(value = "procesarSuma.htm", method = RequestMethod.POST)
  public ModelAndView procesarSuma(
			 @RequestParam("num1") int a, 
			 @RequestParam("num2") int b) {
	 // Proceso
	 int suma;
	 suma = a + b;
	 // Salida
	 ModelAndView view = new ModelAndView("sumar");
	 view.addObject("num1", a);
	 view.addObject("num2", b);
	 view.addObject("suma", suma);
	 return view;
  }
  
  @RequestMapping(value = "procesarSuma2.htm", method = RequestMethod.POST)
  public ModelAndView procesarSuma(HttpServletRequest request){
	 // Datos
	 int n1 = Integer.parseInt(request.getParameter("num1"));
	 int n2 = Integer.parseInt(request.getParameter("num2"));
	 // Proceso
	 int suma;
	 suma = n1 + n2;
	 // Salida
	 ModelAndView view = new ModelAndView("sumar");
	 view.addObject("num1", n1);
	 view.addObject("num2", n2);
	 view.addObject("suma", suma);
	 return view;
  }
  
  @RequestMapping(value = "cantCuentas.htm", method = RequestMethod.GET)
  public ModelAndView cantCuentas(){
	 int cantCuentas = service.obtenerCantCuentas();
	 double saldo = service.obtenerSaldoTotal();
	 ModelAndView view = new ModelAndView("cuentas");
	 view.addObject("cantCuentas", cantCuentas);
	 view.addObject("saldoTotal", saldo);
	 return view;
  }
}
