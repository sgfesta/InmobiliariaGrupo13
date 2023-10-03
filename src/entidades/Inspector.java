package entidades;

public class Inspector {

    private int idInspector;

    private String nombre;

    private String apellido;

    private int dni;

    private int telefono;

    private String domicilio;

    public Inspector(int idInspector, String nombre, String apellido, int dni, int telefono, String domicilio) {
        this.idInspector = idInspector;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Inspector(String nombre, String apellido, int dni, int telefono, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

 

    public Inspector() {
    }

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Inspector{" + "idInspector=" + idInspector + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", domicilio=" + domicilio + '}';
    }
    
    
    
    
}
