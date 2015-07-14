package tallerweb.supermercado.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest {
	private Carrito carrito;

	@Before
	public void init() {
		carrito = new Carrito();
		Producto producto1 = new Producto();
		carrito.agregarProducto(producto1);
		Producto producto2 = new Producto();
		carrito.agregarProducto(producto2);
		producto1.setPrecio(10.00);
		producto1.setNombre("Fideos");
		producto2.setPrecio(20.00);
		producto2.setNombre("Azucar");
		Descuento descuento1 = new Descuento();
		carrito.aplicarDescuento(descuento1);
		Descuento descuento2 = new Descuento();
		carrito.aplicarDescuento(descuento2);
		descuento1.setPorcentaje(5.00);
		descuento2.setMonto(5.00);
	}

	@Test
	public void testVaciar() {
		// carga ficticia realizada en @before
		carrito.vaciar();
		Assert.assertTrue(0 == carrito.verProductos().size());
	}

	@Test
	public void testAgregarProducto() {
		// carga ficticia realizada en @before
		Assert.assertTrue(2 == carrito.verProductos().size());
	}

	@Test
	public void testAplicarDescuento() {
		Producto producto3 = new Producto();
		carrito.agregarProducto(producto3);
		producto3.setNombre("Pan");
		producto3.setPrecio(20.0);
		Descuento descuento3 = new Descuento();
		carrito.aplicarDescuento(descuento3);
		descuento3.setMonto(7.0);
		descuento3.setPorcentaje(10.0);
		double totalDescuentoParcial = carrito.total();
		Assert.assertEquals(32.3, totalDescuentoParcial, 0.0);
	}

	@Test
	public void testVerProductos() {
		// carga ficticia realizada en @before
		carrito.verProductos();
		Assert.assertNotNull(carrito.verProductos().size());
	}

	@Test
	public void testTotalSinDescuentos() {
		// carga ficticia realizada en @before
		double precio = carrito.totalSinDescuentos();
		Assert.assertEquals(30.00, precio, 0);
	}

	@Test
	public void testTotal() {
		// carga ficticia realizada en @before
		double totalDesc = carrito.total();
		Assert.assertEquals(23.75, totalDesc, 0.0);
	}

	@Test
	public void testTotalAhorros() {
		// carga ficticia realizada en @before
		double totalAhorros = carrito.totalAhorros();
		Assert.assertEquals(6.25, totalAhorros, 0.0);
	}
}
