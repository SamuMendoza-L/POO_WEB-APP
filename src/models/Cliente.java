
package models;
import models.Usuario;

import java.util.Random;

public class Cliente extends Usuario{
    
    public Cliente(String name, String last_name, String Tell, String email, String password){
        super(name, last_name, Tell, email, password, "Cliente");
    }
    
}
