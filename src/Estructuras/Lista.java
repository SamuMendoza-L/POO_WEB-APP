package Estructuras;
import Templates.DashboardEmprendedor;
import Templates.DashboardCliente;
import Templates.Login;
import javax.swing.JOptionPane;
import models.Usuario;
import models.Cliente;
import models.Producto;
import models.Main;


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
    
    public void Eliminar(Object data) {
        if (esVacia()) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        // Caso 1: el primer nodo es el que queremos eliminar
        if (primero.getDato().equals(data)) {
            primero = primero.getEnlace();
            return;
        }

        // Caso 2: buscar el nodo anterior al que queremos eliminar
        Nodo anterior = primero;
        Nodo actual = primero.getEnlace();

        while (actual != null && !actual.getDato().equals(data)) {
            anterior = actual;
            actual = actual.getEnlace();
        }

        // Si encontramos el nodo
        if (actual != null) {
            anterior.setEnlace(actual.getEnlace()); // desconectamos el nodo
        } else {
            System.out.println("El elemento no se encontró en la lista.");
        }
    }

    
    public Usuario BuscarUsuario(String email, String Pass, Login loginFrame){
        Nodo aux = primero;
        while(aux!=null && !((Usuario)aux.getDato()).getEmail().equals(email))
            aux = aux.getEnlace();
        
        if(aux!=null && ((Usuario)aux.getDato()).getEmail().equals(email) && ((Usuario)aux.getDato()).getPassword().equals(Pass)) {
            Usuario usuarioEncontrado = (Usuario)aux.getDato();
            
            if(usuarioEncontrado.getRole().equals("Cliente")){
                new DashboardCliente().setVisible(true);
                loginFrame.dispose();
            }
            else if(usuarioEncontrado.getRole().equals("Emprendedor")){
                new DashboardEmprendedor(usuarioEncontrado).setVisible(true);
                loginFrame.dispose();
            }
            
            return usuarioEncontrado;
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            return null;
        }
    }
    
//    public int codigoProducto(){
//        Nodo aux = primero;
//        while(aux!=null){
//            ((Producto)aux.getDato()).getCodigo()
//            
//        }
//    }
    
    
    public Producto BuscarProducto(int codigo){
        
        
        Nodo aux = primero;
        while(aux != null && ((Producto)aux.getDato()).getCodigo() != codigo)
            aux = aux.getEnlace();
        
        if(aux!=null && ((Producto)aux.getDato()).getCodigo() == codigo){
            Producto ProductoEncontrado = (Producto)aux.getDato();
            
            return ProductoEncontrado;
        }
        else{
            JOptionPane.showMessageDialog(null, "Producto no encontrado o el codigo es incrrecto");
            return null;
        }
        
    }
    
    public void EliminarProducto(Object data){
        if (esVacia()) {
            System.out.println("La lista de productos está vacía, no se pueden hacer cambios.");
            return;
        }
        
        if(primero.getDato().equals(data)){
            primero = primero.getEnlace();
            return;
        }
        
        Nodo anterior = primero;
        Nodo actual = primero.getEnlace();

        while (actual != null && !actual.getDato().equals(data)) {
            anterior = actual;
            actual = actual.getEnlace();
        }
        
        // Si encontramos el nodo
        if (actual != null) {
            anterior.setEnlace(actual.getEnlace()); // desconectamos el nodo
        } else {
            System.out.println("El elemento no se encontró en la lista.");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
           
     
        
        
    
    
}
