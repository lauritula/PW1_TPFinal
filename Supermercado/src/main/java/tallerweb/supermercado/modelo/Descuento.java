package tallerweb.supermercado.modelo;

/**
 * Modela un descuento, el mismo puede ser porcentual o por monto, son excluyentes.<br>
 * @author sismael
 *
 */
public class Descuento {
    
    private Double porcentaje=0.0;
    private Double monto=0.0;
    
    public Double getPorcentaje() {
        return porcentaje;
    }
    public Double getMonto() {
        return monto;
    }
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    

}
