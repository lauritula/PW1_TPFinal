package tallerweb.supermercado.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;

@Controller
public class ControllerSupermercado {

//		INDEX (vista: index.jsp)
	@RequestMapping("/index")
	public  ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;		
	}
	
//		VER STOCK (vista: stock.jsp)
	
//		ALTA PRODUCTO NUEVO (vista: alta.jsp)
	
//		AÑADIR STOCK PRODUCTO (vista: agregarProducto.jsp)
	
//		ELIMINAR STOCK PRODUCTO (vista: eliminarProducto.jsp)
	
//		AÑADIR PRODUCTO A CARRITO (vista: carrito.jsp)
	
//		VER PRECIO TOTAL SIN DESCUENTO (vista: carrito.jsp)
	
//		AGREGAR DESCUENTO A CARRITO (vista: carrito.jsp)
	
//		VER PRECIO TOTAL CON DESCUENTO (vista: carrito.jsp)
	
//		VER AHORRO (vista: carrito.jsp)
	
//		VER CHECKOUT (vista: checkout.jsp)

}
