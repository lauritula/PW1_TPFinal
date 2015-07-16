package tallerweb.supermercado.modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Carrito {
	private Stock stockSupermercado = Stock.getInstance();
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
		this.productos.clear();
		this.descuentos.clear();

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
		Iterator<Producto> iteratorPrecioTotal = productos.iterator();
		while (iteratorPrecioTotal.hasNext()) {
			Producto producto = iteratorPrecioTotal.next();
			precioTotal = precioTotal + producto.getPrecio();
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
		double totalSinDescuentos = totalSinDescuentos();
		Iterator<Descuento> iteratorDescuentos = this.descuentos.iterator();
		while (iteratorDescuentos.hasNext()) {
			Descuento descuento = iteratorDescuentos.next();
			double getMonto = descuento.getMonto();
			this.montoAcumulado = this.montoAcumulado + getMonto;
			double getPorcentaje = descuento.getPorcentaje();
			this.porcentajeAcumulado = this.porcentajeAcumulado + getPorcentaje;
		}
		this.precioConDescuentos = totalSinDescuentos - this.montoAcumulado; // aplica
																				// el
																				// descuento
																				// de
																				// monto
		if (this.porcentajeAcumulado > 0.0) {
			this.precioConDescuentos = this.precioConDescuentos
					* (1 - (this.porcentajeAcumulado / 100));
		}// aplica el descuento de porcentaje
		return this.precioConDescuentos;
	}

	/**
	 * Devuelve el dinero ahorrado gracias a los descuentos.<br>
	 * 
	 * @return
	 */
	public double totalAhorros() {
		double dineroAhorrado = 0.0;
		double precioSinDescuento = totalSinDescuentos();
		double precioConDescuento = total();
		return dineroAhorrado = precioSinDescuento - precioConDescuento;
	}
}
