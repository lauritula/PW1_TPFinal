package tallerweb.supermercado.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
public class ControllerSupermercado {

//		INDEX (vista: index.jsp)
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public  ModelAndView index(){
		Stock productosEnStock = Stock.getInstance();
		productosEnStock.agregarProducto(new Producto("pan",30.0)3));
		ModelAndView modelAndView = new ModelAndView("index");
		
	
		
		
		
		
		return modelAndView;		
	}
	
	
	
//		VER STOCK (vista: stock.jsp)
	
	
	@RequestMapping(value="/stock", method = RequestMethod.GET)
	public  ModelAndView stock(){
		ModelAndView modelAndView = new ModelAndView("stock");
		return modelAndView;		
	}
	
//	ALTA PRODUCTO NUEVO (vista: alta.jsp)

//	AÑADIR STOCK PRODUCTO (vista: agregarProducto.jsp)

//	ELIMINAR STOCK PRODUCTO (vista: eliminarProducto.jsp)

//	AÑADIR PRODUCTO A CARRITO (vista: carrito.jsp)

//	VER PRECIO TOTAL SIN DESCUENTO (vista: carrito.jsp)

//	AGREGAR DESCUENTO A CARRITO (vista: carrito.jsp)

//	VER PRECIO TOTAL CON DESCUENTO (vista: carrito.jsp)

//	VER AHORRO (vista: carrito.jsp)

//	VER CHECKOUT (vista: checkout.jsp)

}
