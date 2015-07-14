package tallerweb.supermercado.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;
import tallerweb.supermercado.modelo.Descuento;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
public class ControllerSupermercado {
	private Stock stockSupermercado = Stock.getInstance();
	private Carrito carrito = Carrito.getInstance();

	@RequestMapping("irIndex")
	public ModelAndView volverIndex() {
		return new ModelAndView("inicio");
	}

	@RequestMapping("verCarrito")
	public ModelAndView carrito() {
		return new ModelAndView("carrito");
	}

	@RequestMapping(value = "/carrito", method = RequestMethod.POST)
	public ModelAndView verCarrito() {
		return new ModelAndView("carrito");
	}
	
}