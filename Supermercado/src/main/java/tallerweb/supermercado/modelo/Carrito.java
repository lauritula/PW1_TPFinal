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
        this.productos.removeAll(productos);
        
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
    	while(iteratorProductos.hasNext()){
    	Producto cadaProducto = iteratorProductos.next();}
    	//System.out.println(cadaProducto.getNombre() + cadaProducto.getPrecio());}
        return this.productos;
    }

    /**
     * Devuelve el precio sin descuentos del carrito.<br>
     * 
     * @return
     */
    public Double totalSinDescuentos() {
    	double precioTotal=0.0;
    	Iterator<Producto> iteratorPrecioTotal = productos.iterator();
    	while(iteratorPrecioTotal.hasNext()){
    	Producto producto = iteratorPrecioTotal.next();
    	precioTotal=precioTotal+producto.getPrecio();
    	}
        return precioTotal;
    }
    
    /**
     * Devuelve el precio total del carrito aplicando descuentos si los hubiese,
     * primero aplica los descuentos de monto y luego los de porcentaje.<br>
     * 
     * @return
     */
    public Double total() {
    	Double subTotal=totalSinDescuentos();
    	Double porcentajeAcumulado=0.0;
        Double montoAcumulado=0.0;
        Double precioConDescuentos=0.0;
        Iterator<Descuento> iteratorDescuentos = descuentos.iterator();
    	while(iteratorDescuentos.hasNext()){
    	Descuento descuento = iteratorDescuentos.next();
    	montoAcumulado=montoAcumulado+descuento.getMonto();
    	porcentajeAcumulado=porcentajeAcumulado+descuento.getPorcentaje();
    	}
    	System.out.println("Total: " + montoAcumulado);
    	System.out.println("Total: " + porcentajeAcumulado);
    	subTotal=subTotal-montoAcumulado; //aplica el descuento de monto
    	precioConDescuentos=subTotal-(1-(porcentajeAcumulado/100)); //aplica el descuento de porcentaje
    	System.out.println(precioConDescuentos);
    	return precioConDescuentos;
    }


    /**
     * Devuelve el dinero ahorrado gracias a los descuentos.<br>
     * 
     * @return
     */
    public Double totalAhorros() {
        Double dineroAhorrado=0.0;
        Double precioSinDescuento=totalSinDescuentos();
        Double precioConDescuento= total();
        return dineroAhorrado=precioSinDescuento-precioConDescuento;
    }
}
