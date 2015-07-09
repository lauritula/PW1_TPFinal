package tallerweb.supermercado.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tallerweb.supermercado.modelo.Producto;
import tallerweb.supermercado.modelo.Stock;

@Controller
@RequestMapping("/Stock")
public class ControllerSupermercado {
	private Stock stockSupermercado = Stock.getInstance();
	
	@RequestMapping("/Stock/altaProducto")
	public ModelAndView altaProducto(){
	return new ModelAndView("alta", "command", new Producto());
	}
	
	@RequestMapping(value = "/altaSubmit", method = RequestMethod.POST )
	public ModelAndView agregarProducto(@RequestParam("nombre") String nombre, 
						@RequestParam("precio") Double precio,   
						ModelMap model){
		
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecio(precio);
		
		stockSupermercado.agregarProducto(producto);
		return new ModelAndView("altaSubmit");
	}
	
	@RequestMapping(value = "/alta", method = RequestMethod.POST )
	public ModelAndView mostrar( ModelMap model){
		return new ModelAndView("altaSubmit");
	}
	
	@RequestMapping("irIndex")
	public ModelAndView irAlInicio(){
		return new ModelAndView("index");
	}
	
	
	
	
//		INDEX (vista: index.jsp)
//	@RequestMapping(value="/index", method = RequestMethod.GET)
//	public  ModelAndView index(){
//		private Stock productosEnStock = Stock.getInstance();
//		// CARGA DE PRODUCTOS 
//		
//		Producto pan=new Producto();
//		pan.setNombre("Pan Lactal");
//		pan.setPrecio(30.0);
//		Producto arroz=new Producto();
//		arroz.setNombre("Arroz Gallo");
//		arroz.setPrecio(15.0);
//		Producto gaseosa=new Producto();
//		gaseosa.setNombre("Coca Cola");
//		gaseosa.setPrecio(22.0);
//		Producto fideos=new Producto();
//		fideos.setNombre("Mostacholes");
//		fideos.setPrecio(19.5);
//		
//		productosEnStock.agregarProducto(pan);
//		productosEnStock.agregarProducto(arroz);
//		productosEnStock.agregarProducto(gaseosa);
//		productosEnStock.agregarProducto(fideos);
//		
//		productosEnStock.agregarStock(pan, 10);
//		productosEnStock.agregarStock(arroz, 20);
//		productosEnStock.agregarStock(gaseosa, 50);
//		productosEnStock.agregarStock(fideos, 30);
//		
//		ModelAndView agregarStock = new ModelAndView("index");
//		agregarStock.addObject(productosEnStock);
//		agregarStock.setViewName("agregarStock");
//		RETURN AGREGARSTOCK;
//		
//}

	
	
	

	
	
	
//		VER STOCK (vista: stock.jsp)
	
	
//	@RequestMapping(value="/stock", method = RequestMethod.GET)
//	public  ModelAndView stock(){
//		ModelAndView modelAndView = new ModelAndView("stock");
//		return modelAndView;		
//	}
	
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
