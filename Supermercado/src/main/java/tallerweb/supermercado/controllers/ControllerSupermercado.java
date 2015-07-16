package tallerweb.supermercado.controllers;

import java.util.List;
import java.util.Map;
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

	@RequestMapping("altaProducto")
	public ModelAndView altaProducto() {
		return new ModelAndView("alta", "comand", new Producto());
	}

	@RequestMapping(value = "/alta", method = RequestMethod.POST)
	public ModelAndView mostrarModelo() {
		return new ModelAndView("altaSubmit");
	}

	@RequestMapping(value = "/altaSubmit", method = RequestMethod.POST)
	public ModelAndView agregar(@RequestParam("nombre") String nombre,
			@RequestParam("precio") Double precio, ModelMap model) {

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);

		stockSupermercado.agregarProducto(producto);
		return new ModelAndView("altaSubmit");
	}

	@RequestMapping("verStock")
	public ModelAndView irStock() {
		return new ModelAndView("stock");
	}

	@ModelAttribute("stockSuper")
	public Map<Producto, Integer> listadoStock() {
		return stockSupermercado.obtenerStock();
	}

	@RequestMapping("agregarStock")
	public ModelAndView agregarStock() {
		return new ModelAndView("agregar");
	}

	@RequestMapping(value = "/agregar", method = RequestMethod.POST)
	public ModelAndView submit() {
		return new ModelAndView("agregarSubmit");
	}

	@RequestMapping(value = "/agregarSubmit", method = RequestMethod.POST)
	public ModelAndView agregarStock(@RequestParam("nombre") String nombre,
			@RequestParam("cantidad") Integer cantidad) {
		Producto productoAAgregar = new Producto();
		productoAAgregar.setNombre(nombre);
		stockSupermercado.agregarStock(productoAAgregar, cantidad);
		return new ModelAndView("agregarSubmit");
	}

	@RequestMapping("eliminarStock")
	public ModelAndView eliminar() {
		return new ModelAndView("eliminar");
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.POST)
	public ModelAndView eliminarStock() {
		return new ModelAndView("eliminarSubmit");
	}

	@RequestMapping(value = "/eliminarSubmit", method = RequestMethod.POST)
	public ModelAndView eliminarSubmit(@RequestParam("nombre") String nombre) {
		Producto productoAEliminarStock = new Producto();
		productoAEliminarStock.setNombre(nombre);
		stockSupermercado.eliminarProducto(productoAEliminarStock);
		return new ModelAndView("eliminarSubmit");
	}
	
	
	@ModelAttribute("carritoTicket")
	public List<Producto> ticketProducto() {
		return carrito.verProductos();
	}

	
	 @RequestMapping(value = "agregarProductoAlCarrito", method = RequestMethod.POST)
	 public String agregarACarrito(@RequestParam("nombre") String nombre) {
	 Producto productoAAgregar = new Producto();
	 Integer cantidad=1;
	 Set<Producto> productos = stockSupermercado.listarProductosDisponibles();
	 for(Producto producto: productos){
	 if(producto.getNombre().equals(nombre)){
	 productoAAgregar = producto;
	 	}
	 }
	 carrito.agregarProducto(productoAAgregar);
	 stockSupermercado.comprarProducto(productoAAgregar,cantidad);
	 return "redirect:verCarrito";
	 }
	
	
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
	
	@ModelAttribute("subtotal")
	public  Double returnSubtotal(){
		return carrito.totalSinDescuentos();
	}
	
	@ModelAttribute("total")
	public  Double returnTotal(){
		return carrito.total();
	}
	
	@ModelAttribute("ahorro")
	public  Double returnAhorro(){
		return carrito.totalAhorros();
	}
	
	@RequestMapping("vaciarCarrito")
	public String vaciaCarrito(){
		carrito.vaciar();
		return "redirect:verCarrito";
	}

	@RequestMapping(value = "carrito", method = RequestMethod.POST)
	public ModelAndView verCarritoCompra() {
		return new ModelAndView("compraSubmit");
	}
	@RequestMapping("/compraSubmit")
	public ModelAndView ticketCompra(){
		return new ModelAndView("compraSubmit");
	}
	
}