package tallerweb.supermercado.modelo;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductoTest {
	  private Carrito carrito;
	  
	  @Before
	    public void init(){
	        carrito = new Carrito();
	        Producto p1 = new Producto();
	        carrito.agregarProducto(p1);
	        Producto p2 = new Producto();
	        carrito.agregarProducto(p2);
	    }

	
    @Test
    public void testVaciar() {
    	//carga ficticia realizada en  @before
    	carrito.vaciar();
    	Assert.assertTrue(0==carrito.verProductos().size());
  
    }


	@Test
    public void testAgregarProducto() {
		//carga ficticia realizada en  @before
		Assert.assertTrue(2==carrito.verProductos().size());

    }

	
    @Test
    public void testAplicarDescuento() {
    	//carga ficticia realizada en  @before
    	Descuento d1=new Descuento();
    	carrito.aplicarDescuento(d1);
    	
    	Assert.assertTrue(1==carrito.aplicarDescuento());
    	
    }

//    @Test
//    public void testVerProductos() {
//        
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
