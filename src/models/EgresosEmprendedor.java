
package models;
import java.time.LocalDate;
import java.util.Random;

public class EgresosEmprendedor {
    
    private int codigo;
    private double MontoEgreso;
    private LocalDate fecha;
    private String Descripcion;
    private String MetodoPago;

    public EgresosEmprendedor(double MontoEgreso, LocalDate fecha, String Descripcion, String MetodoPago) {
        this.codigo = generarCodigo();
        this.MontoEgreso = MontoEgreso;
        this.fecha = fecha;
        this.Descripcion = Descripcion;
        this.MetodoPago = MetodoPago;
    }
    
    private int generarCodigo(){
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMontoEgreso() {
        return MontoEgreso;
    }

    public void setMontoEgreso(double MontoEgreso) {
        this.MontoEgreso = MontoEgreso;
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
        return "EgresosEmprendedor{" + "codigo=" + codigo + ", MontoEgreso=" + MontoEgreso + ", fecha=" + fecha + ", Descripcion=" + Descripcion + ", MetodoPago=" + MetodoPago + '}';
    }
    
    
    
    
    
    
    
    
}
