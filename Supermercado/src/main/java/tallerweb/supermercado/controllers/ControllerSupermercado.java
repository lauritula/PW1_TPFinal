package tallerweb.supermercado.controllers;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@ModelAttribute("productList")
	public Set<Producto> productosDisponibles() {
		return stockSupermercado.listarProductosDisponibles();
	}
	
//	@RequestMapping(value = "agregarDescuentoAlCarrito", method = RequestMethod.POST)
//	public ModelAndView agregarStock(@RequestParam("tipo") String tipo,
//			@RequestParam("valor") Double valor) {
//		Descuento descuentoAAgregar = new Descuento();
//		if (tipo == "Monto") {
//			descuentoAAgregar.setMonto(valor);
//		}
//		if (tipo == "Porcentaje") {
//			descuentoAAgregar.setPorcentaje(valor);
//		}
//		carrito.aplicarDescuento(descuentoAAgregar);
//		return new ModelAndView("redirect:carrito");
//	} 

	
}