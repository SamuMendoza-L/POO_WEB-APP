
package models;
import models.Usuario;
import Estructuras.Lista;

public class Emprendedor extends Usuario{
    private String Carrera;
    private String NombreNegocio;
    private String TipoNegocio;
    
    public Emprendedor(String name, String last_name, String Tell, String email, String password, String Carrera, String NombreNegocio, String TipoNegocio){
        super(name, last_name, Tell, email, password, "Emprendedor");
        this.Carrera = Carrera;
        this.NombreNegocio = NombreNegocio;
        this.TipoNegocio = TipoNegocio;
        
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

    @Override
    public String toString() {
        return super.toString() + "Emprendedor{" + "Carrera=" + Carrera + ", NombreNegocio=" + NombreNegocio + ", TipoNegocio=" + TipoNegocio + '}';
    }
    
    
    
    
    
    
    
    
}
