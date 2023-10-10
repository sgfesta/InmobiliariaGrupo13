
package entidades;


public class Usuario {
    
    //Creo Variables
    private int idUsuario;
    private String nombre;
    private String email;
    private String password;
    private boolean activo;
    private int nivelAcceso;
    
    
    //Creo costructor

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String email, String password, boolean activo, int nivelAcceso) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.activo = activo;
        this.nivelAcceso = nivelAcceso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    

    @Override
    public String toString() {
        return  idUsuario + " " + nombre + " " + email + " " + password + " " + activo + " " + nivelAcceso;
       
    }
    
    
    
    
    
    
    
   
}
