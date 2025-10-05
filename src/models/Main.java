
package models;
import Templates.Login;
import javax.swing.JFrame;
import Estructuras.Lista;


public class Main extends javax.swing.JFrame {
    
    static Login login = new Login();
    static Lista Clientes = new Lista();
    static Lista Usuarios = new Lista();
    
    public static Lista GetListaClientes(){
        return Clientes;
    }
    
    public static Lista GetListaUsuarios(){
        return Usuarios;
    }
    
    public static void main(String[] args) {
        
        login.setVisible(true);
    }
    
    
    
     
    
}


