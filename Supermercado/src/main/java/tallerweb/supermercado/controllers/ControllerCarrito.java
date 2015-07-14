package tallerweb.supermercado.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.supermercado.modelo.Carrito;
import tallerweb.supermercado.modelo.Descuento;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

public class ControllerCarrito {
	private Stock stockSupermercado = Stock.getInstance();
	private Carrito carrito = Carrito.getInstance();
	


	@RequestMapping(value = "agregarProductoAlCarrito", method = RequestMethod.POST)
	public ModelAndView agregarStock(@RequestParam("nombre") String nombre) {
		Producto productoAAgregar = new Producto();
		productoAAgregar.setNombre(nombre);
		carrito.agregarProducto(productoAAgregar);
		return new ModelAndView("agregarSubmit");
	} // tiene que hacer redirect?
	
	@RequestMapping(value = "agregarDescuentoAlCarrito", method = RequestMethod.POST)
	public ModelAndView agregarStock(@RequestParam("tipo") String tipo,
									@RequestParam("valor") double valor) {
		Descuento descuentoAAgregar = new Descuento();
		if (tipo=="Monto"){descuentoAAgregar.setMonto(valor);}
		if (tipo=="Porcentaje"){descuentoAAgregar.setPorcentaje(valor);}
		carrito.aplicarDescuento(descuentoAAgregar);
		return new ModelAndView("agregarSubmit");
	} // tiene que hacer redirect?


}
