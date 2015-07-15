package tallerweb.supermercado.controllers;

import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;
import tallerweb.supermercado.modelo.Descuento;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

public class ControllerCarrito {
	private Carrito carrito = Carrito.getInstance();
	private Stock stockSupermercado = Stock.getInstance();

//	@ModelAttribute("listaProductos")
//	public Set<Producto> productos() {
//		return stockSupermercado.listarProductosDisponibles();
//	}
	
//	@RequestMapping(value = "agregarProductoAlCarrito", method = RequestMethod.POST)
//	public String agregarStock(@RequestParam("nombre") String nombre) {
//		Producto productoAAgregar = new Producto();
//		productoAAgregar.setNombre(nombre);
//		carrito.agregarProducto(productoAAgregar);
//		return "redirect:/carrito/";
//	} 
	


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
