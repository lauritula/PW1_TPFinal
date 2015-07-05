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

    	Producto p3=new Producto();
    	carrito.agregarProducto(p3);
    	p3.setNombre("pan");
    	p3.setPrecio(20.0);
    	Descuento d5=new Descuento();
    	carrito.aplicarDescuento(d5);
    	d5.setMonto(7.0);
    	d5.setPorcentaje(10.0);
      	double totalDescuentoParcial = carrito.total();
    	Assert.assertEquals(38.7, totalDescuentoParcial, 0.0);

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
    	carrito.aplicarDescuento(d1);
        Descuento d2 = new Descuento();
        carrito.aplicarDescuento(d2);
        d1.setPorcentaje(5.00);
        d2.setMonto(5.00);
       	double totalDesc = carrito.total();
    	Assert.assertEquals(23.75, totalDesc, 0.0);
    }



    @Test
    public void testTotalAhorros() {
    	//carga ficticia realizada en  @before 
   
        
    }
}
