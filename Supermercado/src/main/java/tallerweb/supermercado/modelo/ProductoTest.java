package tallerweb.supermercado.modelo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

	public class ProductoTest {
	  private Carrito carrito;
	  
	  @Before
	    public void init(){
	        carrito = new Carrito();
	        //carga ficticia de productos
	        Producto p1 = new Producto();
	        carrito.agregarProducto(p1);
	        Producto p2 = new Producto();
	        carrito.agregarProducto(p2);
	        p2.setPrecio(20.00);
	        p1.setPrecio(10.00);

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
    	Descuento d1 = new Descuento();
        Descuento d2 = new Descuento();
        d1.setPorcentaje(5.00);
        d1.setMonto(0.00);
        d2.setPorcentaje(0.00);
        d2.setMonto(5.00);
    	Double totalDesc = carrito.total();
    	Assert.assertEquals(30.0, totalDesc, 1.0);

    }

    @Test
    public void testVerProductos() {
    	//carga ficticia realizada en  @before  
    	carrito.verProductos();
    	Assert.assertNotNull(carrito.verProductos().size());
    	}
   
  @Test
  public void testTotalSinDescuentos() {
	//carga ficticia realizada en  @before
	  double precio = carrito.totalSinDescuentos();
	  Assert.assertEquals(30.00, precio, 0);
    
  }

    @Test
    public void testTotal() {
    	Descuento d1 = new Descuento();
        Descuento d2 = new Descuento();
        d1.setPorcentaje(5.00);
        d1.setMonto(0.00);
        d2.setPorcentaje(0.00);
        d2.setMonto(5.00);
    	Double totalDesc = carrito.total();
    	Assert.assertEquals(30.0, totalDesc, 1.0);
    }



    @Test
    public void testTotalAhorros() {
    	//carga ficticia realizada en  @before 
   
        
    }
}
