
package models;
import models.Usuario;
import Estructuras.Lista;

public class Emprendedor extends Usuario{
    private String Carrera;
    private String NombreNegocio;
    private Lista Pedidos;
    
    public Emprendedor(String name, String last_name, String Tell, String email, String password, String Carrera, String NombreNegocio){
        super(name, last_name, Tell, email, password, "Emprendedor");
        this.Carrera = Carrera;
        this.NombreNegocio = NombreNegocio;
        
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
    
    
    
    
}
