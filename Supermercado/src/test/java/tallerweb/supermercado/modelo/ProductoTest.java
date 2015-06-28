package tallerweb.supermercado.modelo;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductoTest {
	  private Carrito carrito;
	  
	  @Before
	    public void init(){
	        carrito = new Carrito();
	    }

    @Test
    public void testVaciar() {
    	Assert.assertTrue(0 == carrito.vaciar());
    	Assert.assertFalse(1 == carrito.vaciar());
    	Assert.assertFalse(5 == carrito.vaciar());
    }

    @Test
    public void testAgregarProducto() {
    	carrito.agregarProducto(new Producto());
    	Assert.assertTrue(1== carrito.sizeCarrito());
    	Assert.assertFalse(0 == carrito.sizeCarrito());
    }
//
//    @Test
//    public void testAplicarDescuento() {
//        // Implementar
//    }
//
//    @Test
//    public void testVerProductos() {
//        // Implementar
//    }
//
//    @Test
//    public void testTotal() {
//        // Implementar
//    }
//
//    @Test
//    public void testTotalSinDescuentos() {
//        // Implementar
//    }
//
//    @Test
//    public void testTotalAhorros() {
//        // Implementar
//    }
}
