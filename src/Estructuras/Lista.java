
package Estructuras;
import Templates.DashboardEmprendedor;
import Templates.DashboardCliente;
import Templates.Login;
import javax.swing.JOptionPane;
import models.Usuario;
import models.Cliente;


public class Lista {
    private Nodo primero;

    public Lista() {
    }

    public Nodo getPrimero() {
        return primero;
    }
    
    public boolean esVacia(){
        return primero == null;
    }
    
    public Nodo Ultimo()
    {
        Nodo aux=primero;
        while(aux!=null & aux.getEnlace()!=null)
            aux=aux.getEnlace();
        
        return aux;
    }
    
    public void AdicionarFinal(Object data)
    {
        if(esVacia())
            primero = new Nodo(data);
        else
        {
            Nodo ult = Ultimo();
            Nodo n = new Nodo(data);
            ult.setEnlace(n);
            //Ultimo().setEnlace(new Nodo(data));
        }
    }
    
    public void BuscarUsuario(String email, String Pass, Login loginFrame){
        Nodo aux = primero;
        while(aux!=null && !((Usuario)aux.getDato()).getEmail().equals(email))
            aux = aux.getEnlace();
        if(aux!=null && ((Usuario)aux.getDato()).getEmail().equals(email) && ((Usuario)aux.getDato()).getPassword().equals(Pass))
            if(((Usuario)aux.getDato()).getRole().equals("Cliente")){
                new DashboardCliente().setVisible(true);
                loginFrame.dispose();
                
            }
            else if(((Usuario)aux.getDato()).getRole().equals("Emprendedor")){
                new DashboardEmprendedor().setVisible(true);
                loginFrame.dispose();
            }
        
        else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
    
    
    
    
    
    
    
    
    
           
     
        
        
    
    
}
