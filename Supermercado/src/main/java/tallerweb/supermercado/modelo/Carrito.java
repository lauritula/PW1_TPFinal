package tallerweb.supermercado.modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Carrito {
	private static Carrito instance = new Carrito();
	private List<Producto> productos = new LinkedList<Producto>();
	private List<Descuento> descuentos = new LinkedList<Descuento>();
	
	public static Carrito getInstance() {
		return instance;
	}

	/**
	 * Elimina todos los productos del carrito.<br>
	 */
	
	public void vaciar() {
		this.descuentos.clear();
		this.productos.clear();
	}

	/**
	 * Agrega un producto al carrito.<br>
	 * 
	 * @param ingrediente
	 */
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);

	}

	/**
	 * Permite agregar un descuento que sera aplicado al carrito.<br>
	 * 
	 * @param descuento
	 */
	
	public void aplicarDescuento(Descuento descuento) {
		this.descuentos.add(descuento);
	}

	/**
	 * Lista todos los productos que forman parte del carrito.<br>
	 * 
	 * @return
	 */
	
	public List<Producto> verProductos() {
		Iterator<Producto> iteratorProductos = productos.iterator();
		while (iteratorProductos.hasNext()) {
			Producto cadaProducto = iteratorProductos.next();
		}
		return this.productos;
	}

	/**
	 * Devuelve el precio sin descuentos del carrito.<br>
	 * 
	 * @return
	 */
	
	public Double totalSinDescuentos() {
		double precioTotal = 0.0;
		for(Producto producto : productos){
			precioTotal+=producto.getPrecio();
		}
		return precioTotal;
	}

	/**
	 * Devuelve el precio total del carrito aplicando descuentos si los hubiese,
	 * primero aplica los descuentos de monto y luego los de porcentaje.<br>
	 * 
	 * @return
	 */

	double porcentajeAcumulado, montoAcumulado, precioConDescuentos;
	public Double total() {
		
		Double totalSinDescuento = totalSinDescuentos();
		Double total=0.0;
		Double monto = 0.0;
		Double porcentaje=0.0;
		for(Descuento descuento : descuentos){
			monto += descuento.getMonto();
			porcentaje += descuento.getPorcentaje();
		}
		if(porcentaje>0.0){
			total=(totalSinDescuento-monto)*(1-(porcentaje/100));
		}
		else{
			total=totalSinDescuento-monto;
		}
		return total;
	}

	/**
	 * Devuelve el dinero ahorrado gracias a los descuentos.<br>
	 * 
	 * @return
	 */
	
	public Double totalAhorros() {
		double precioSinDescuento = totalSinDescuentos();
		double precioConDescuento = total();
		return precioSinDescuento - precioConDescuento;
		
		}
	
	}
