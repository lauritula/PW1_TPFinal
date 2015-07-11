package tallerweb.supermercado.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
public class ControllerSupermercado {
	private Stock stockSupermercado = Stock.getInstance();

	@RequestMapping("altaProducto")
	public ModelAndView altaProducto(){
		return new ModelAndView("alta", "comand",  new Producto());
	}
	
	@RequestMapping(value = "/alta", method = RequestMethod.POST )
	public ModelAndView mostrarModelo(){
		return new ModelAndView("altaSubmit");
	}
	
	@RequestMapping(value = "/altaSubmit", method = RequestMethod.POST )
	public ModelAndView agregar(@RequestParam("nombre") String nombre, 
						@RequestParam("precio") Double precio, 
						ModelMap model){
		
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		
		stockSupermercado.agregarProducto(producto);
		stockSupermercado.agregarStock(producto, 0);
		return new ModelAndView("altaSubmit");
	}

	
	@RequestMapping("irIndex")
	public ModelAndView volverIndex(){
		return new ModelAndView("inicio");
	}
}