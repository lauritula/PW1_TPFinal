package tallerweb.supermercado.controllers;

import java.util.Map;
import java.util.Set;

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
	
	@RequestMapping("altaProducto")
	public ModelAndView altaProducto(){
		return new ModelAndView("alta", "comand",  new Producto());}
	
	@RequestMapping(value = "/alta", method = RequestMethod.POST )
	public ModelAndView mostrarModelo(){
		return new ModelAndView("altaSubmit");}
	
	@RequestMapping(value = "/altaSubmit", method = RequestMethod.POST )
	public ModelAndView agregar(@RequestParam("nombre") String nombre, 
						@RequestParam("precio") Double precio, 
						ModelMap model){
		
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		
		stockSupermercado.agregarProducto(producto);
		return new ModelAndView("altaSubmit");}
	
	@RequestMapping("verStock")
	public ModelAndView irStock() {
		return new ModelAndView("stock");}
	
	@ModelAttribute("stockSuper")
	public  Map<Producto, Integer> listadoStock(){
		return stockSupermercado.obtenerStock();}
	
	@RequestMapping("agregarStock")
	public ModelAndView agregarStock() {
		return new ModelAndView("agregar");}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.POST )
	public ModelAndView submit(){
		return new ModelAndView("agregarSubmit");}
	
	@ModelAttribute("productList")
	public  Set<Producto> productosDisponibles(){
		return stockSupermercado.listarProductosDisponibles();}
	
	@RequestMapping(value = "/agregarSubmit", method = RequestMethod.POST )
	public ModelAndView agregarStock(@RequestParam("nombre") String nombre, 
						@RequestParam("cantidad") Integer cantidad){
		Producto productoAAgregar = new Producto();
		productoAAgregar.setNombre(nombre);
		stockSupermercado.agregarStock(productoAAgregar, cantidad);
		return new ModelAndView("agregarSubmit");}
	
	@RequestMapping("eliminarStock")
	public ModelAndView eliminar(){
		return new ModelAndView ("eliminar");}
	
	@RequestMapping(value = "/eliminar", method = RequestMethod.POST)
	public ModelAndView eliminarStock(){
		return new ModelAndView("eliminarSubmit");}
	
	@RequestMapping(value="/eliminarSubmit", method = RequestMethod.POST)
	public ModelAndView eliminarSubmit(@RequestParam ("nombre") String nombre){
		Producto productoAEliminarStock = new Producto();
		productoAEliminarStock.setNombre(nombre);
		stockSupermercado.eliminarProducto(productoAEliminarStock);
		return new ModelAndView("eliminarSubmit");}
}
