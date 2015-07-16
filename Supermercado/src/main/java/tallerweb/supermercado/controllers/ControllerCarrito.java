package tallerweb.supermercado.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
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
public class ControllerCarrito {
	private Carrito carrito = Carrito.getInstance();
	private Stock stockSupermercado = Stock.getInstance();

//	 @RequestMapping(value = "agregarProductoAlCarrito", method =RequestMethod.POST)
//	 public String agregarStock(@RequestParam("nombre") String nombre) {
//	 Producto productoAAgregar = new Producto();
//	 productoAAgregar.setNombre(nombre);
//	 carrito.agregarProducto(productoAAgregar);
//	 stockSupermercado.comprarProducto(productoAAgregar, 1);
//	 return "redirect:verCarrito";
//	 }
	
	
	@RequestMapping(value = "agregarDescuentoAlCarrito")
	public String agregarDescuento(@RequestParam("tipo") String tipo,
			@RequestParam("valor") Double valor) {
		Descuento descuentoAAgregar = new Descuento();
		if (tipo == "Monto") {
			descuentoAAgregar.setMonto(valor);
		}
		if (tipo == "Porcentaje") {
			descuentoAAgregar.setPorcentaje(valor);
		}
		carrito.aplicarDescuento(descuentoAAgregar);
		return "redirect:verCarrito";
	}
	
}
