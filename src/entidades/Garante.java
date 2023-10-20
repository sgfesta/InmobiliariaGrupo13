
package entidades;

public class Garante {

    private int idGarante;
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private String telefono;
    private boolean activo;

    public Garante() {
    }

    public Garante(int idGarante, String nombre, String apellido, String dni, String domicilio, String telefono, boolean activo) {
        this.idGarante = idGarante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Garante(String nombre, String apellido, String dni, String domicilio, String telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdGarante() {
        return idGarante;
    }

    public void setIdGarante(int idGarante) {
        this.idGarante = idGarante;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
        return idGarante + ") " + apellido + ", " + nombre;
    }
    
    
  
}
