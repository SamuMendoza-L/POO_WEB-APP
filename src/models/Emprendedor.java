
package models;
import models.Usuario;
import Estructuras.Lista;
import Estructuras.Nodo;

public class Emprendedor extends Usuario{
    private String Carrera;
    private String NombreNegocio;
    private String TipoNegocio;
    private Lista Ingresos;
    private Lista Egresos;
    private Lista Productos;
    private Lista Pedidos;
    private double IngresosAcumulados;
    
    public Emprendedor(String name, String last_name, String Tell, String email, String password, String Carrera, String NombreNegocio, String TipoNegocio){
        super(name, last_name, Tell, email, password, "Emprendedor");
        this.Carrera = Carrera;
        this.NombreNegocio = NombreNegocio;
        this.TipoNegocio = TipoNegocio;
        this.Ingresos = new Lista();
        this.Egresos = new Lista();
        this.Productos = new Lista();
        this.Pedidos = new Lista();
        this.IngresosAcumulados = 0;
        
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNombreNegocio() {
        return NombreNegocio;
    }

    public void setNombreNegocio(String NombreNegocio) {
        this.NombreNegocio = NombreNegocio;
    }

    public String getTipoNegocio() {
        return TipoNegocio;
    }

    public void setTipoNegocio(String TipoNegocio) {
        this.TipoNegocio = TipoNegocio;
    }

    public Lista getProductos() {
        return Productos;
    }

    public void setProductos(Lista Productos) {
        this.Productos = Productos;
    }

    public Lista getIngresos() {
        return Ingresos;
    }

    public void setIngresos(Lista Ingresos) {
        this.Ingresos = Ingresos;
    }

    public Lista getEgresos() {
        return Egresos;
    }

    public void setEgresos(Lista Egresos) {
        this.Egresos = Egresos;
    }

    public Lista getPedidos() {
        return Pedidos;
    }

    public void setPedidos(Lista Pedidos) {
        this.Pedidos = Pedidos;
    }

    public double getIngresosAcumulados() {
        return IngresosAcumulados;
    }

    public void setIngresosAcumulados(double IngresosAcumulados) {
        this.IngresosAcumulados = IngresosAcumulados;
    }
    
    
    
    
    
    
    public double getTotalIngresos() {
        double total = 0;
        Nodo aux = Ingresos.getPrimero();
    
        while (aux != null) {
            double valor = (double) aux.getDato(); // o convierte según tu tipo de dato
            total += valor;
            aux = aux.getEnlace();
        }
    
        return total;
    }
    
    public double getTotalEgresos() {
        double total = 0;
        Nodo aux = Egresos.getPrimero();
    
        while (aux != null) {
            double valor = (double) aux.getDato(); // o convierte según tu tipo de dato
            total += valor;
            aux = aux.getEnlace();
        }
    
        return total;
    }
    
    public int getTotalProductos(){
        int total = 0;
        Nodo aux = Productos.getPrimero();
        
        while (aux != null){
            int cantidad = (int) aux.getDato();
            total += cantidad;
            aux = aux.getEnlace();
        }
        return total;
        
    }
    
    public int getTotalPedidos(){
        int total = 0;
        Nodo aux = Pedidos.getPrimero();
        
        while (aux != null){
            int cantidad = (int) aux.getDato();
            total += cantidad;
            aux = aux.getEnlace();
        }
        return total;
        
    }
    
    
    
    
    
    @Override
    public String toString() {
        return super.toString() + "Emprendedor{" + "Carrera=" + Carrera + ", NombreNegocio=" + NombreNegocio + ", TipoNegocio=" + TipoNegocio + '}';
    }
    
    
    
    
    
    
    
    
}
