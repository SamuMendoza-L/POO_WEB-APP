
package models;
import Templates.Login;
import javax.swing.JFrame;
import Estructuras.Lista;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.awt.Image;


public class Main extends javax.swing.JFrame {
    
    static Login login = new Login();
    static Lista Clientes = new Lista();
    static Lista Usuarios = new Lista();
    static Lista Emprendedores = new Lista();
    
    public static Lista GetListaClientes(){
        return Clientes;
    }
    
    
    
    public static Lista GetListaUsuarios(){
        return Usuarios;
    }
    
    public static void main(String[] args) {
        
        login.setVisible(true);
        
        
        // --- Cambiar ícono del Dock (macOS) o barra de tareas (Windows/Linux) ---
        try {
            Taskbar taskbar = Taskbar.getTaskbar();
            Image logo = Toolkit.getDefaultToolkit().getImage(
                Main.class.getResource("/poo_wep_app/images/IconoFrameApp.png")
            );
            taskbar.setIconImage(logo);
        } catch (UnsupportedOperationException e) {
            System.out.println("Taskbar icon not supported on this platform.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String nombre = "Samuel";
        String apellido = "Mendoza";
        String telefono = "313-7118377";
        String correo = "s@gmail.com";
        String cc = "1234";
        String carrera = "Ingenieria Inf";
        String NombreN = "LUMO";
        String TipoN = "tecnologia";
        
        Emprendedor emp = new Emprendedor(nombre, apellido, telefono, correo, cc, carrera, NombreN, TipoN);
        GetListaUsuarios().AdicionarFinal(emp);
        
    }
    
    
    
     
    
}


