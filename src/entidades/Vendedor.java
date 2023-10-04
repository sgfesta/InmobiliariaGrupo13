
package entidades;


public class Vendedor {
    
    //Declaro las variables
    
    private int idVendedor;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private boolean activo;
    
    //Declaro los Constructores

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String nombre, String apellido, int dni, int telefono, boolean activo) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Vendedor(String nombre, String apellido, int dni, int telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    //Declaro Setter y Getter

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idVendedor + " " + nombre + " " + apellido + " " + dni + " " + telefono + " " + activo;
    }
    
    
    
}
