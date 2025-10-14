
package models;
import java.time.LocalDate;

public class IngresosEmprendedor {
    
    private double MontoIngreso;
    private LocalDate fecha;
    private String Descripcion;
    private String MetodoPago;
    

    public IngresosEmprendedor(double MontoIngreso, LocalDate fecha, String Descripcion, String MetodoPago) {
        this.MontoIngreso = MontoIngreso;
        this.fecha = fecha;
        this.Descripcion = Descripcion;
        this.MetodoPago = MetodoPago;
        
    }

    public double getMontoIngreso() {
        return MontoIngreso;
    }

    public void setMontoIngreso(double MontoIngreso) {
        this.MontoIngreso = MontoIngreso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    
    
    

    @Override
    public String toString() {
        return "IngresosEmprendedor{" + "MontoIngreso=" + MontoIngreso + ", fecha=" + fecha + ", Descripcion=" + Descripcion + ", MetodoPago=" + MetodoPago + '}';
    }
    
    
    
}
