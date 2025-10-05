
package models;
import java.util.Random;

    public class Usuario {
        private int ID_User;
        private String name;
        private String last_name;
        private String Tell;
        private String email;
        private String password;
        private String role;

        public Usuario(String name, String last_name, String Tell, String email, String password, String Role) {
            this.ID_User = generarId(); //Se llama a la funcion para generar el Id
            this.name = name;
            this.last_name = last_name;
            this.Tell = Tell;
            this.email = email;
            this.password = password;
            this.role = Role;
        }

        // Método para generar un ID de 5 dígitos
        private int generarId() {
            Random random = new Random();
            return 10000 + random.nextInt(90000); // Entre 10000 y 99999
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTell() {
        return Tell;
    }

    public void setTell(String Tell) {
        this.Tell = Tell;
    }
    
    

    

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", last_name=" + last_name + ", email=" + email + ", password=" + password + ", role=" + role + '}';
    }
    
    
    
    
    
    
    
}
