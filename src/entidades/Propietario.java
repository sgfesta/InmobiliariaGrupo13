
package entidades;


public class Propietario {
    
    //Declaro las variables
    
    private int idPropietario;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String domicilio;
    private boolean activo;
    
    //Declaro los Constructores

    public Propietario() {
    }

    public Propietario(int idPropietario, String nombre, String apellido, String dni, String telefono, String domicilio, boolean activo) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.activo = activo;
    }

    public Propietario(String nombre, String apellido, String dni, String telefono, String domicilio, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.activo = activo;
    }
    
    //Declaro Setter y Getter

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idPropietario + ") " + apellido + ", " + nombre + " - " + dni;
    }
 
 
}
