package tallerweb.supermercado.controllers;

import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;


@Controller
public class ControllerStock {
	private Stock stockSupermercado = Stock.getInstance();
	
	@RequestMapping("verStock")
	public ModelAndView irStock() {
		return new ModelAndView("stock");
	}
	
	@ModelAttribute("stockSuper")
	public  Map<Producto, Integer> listadoStock(){
		return stockSupermercado.obtenerStock();
	}
	
	@RequestMapping("agregarStock")
	public ModelAndView agregarStock() {
		return new ModelAndView("agregar");
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.POST )
	public ModelAndView submit(){
		return new ModelAndView("agregarSubmit");
	}
	
//	@RequestMapping(value = "/agregarSubmit", method = RequestMethod.POST )
//	public ModelAndView agregar(@RequestParam("nombre") String nombre, 
//						@RequestParam("precio") Double precio, 
//						ModelMap model){
//		
//		Producto producto = new Producto();
//		producto.setNombre(nombre);
//		producto.setPrecio(precio);
//		
//		stockSupermercado.agregarProducto(producto);
//		stockSupermercado.agregarStock(producto, 0);
//		return new ModelAndView("agregarSubmit");
//	}

	}
