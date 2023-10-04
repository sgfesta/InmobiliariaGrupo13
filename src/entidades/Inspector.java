package entidades;

public class Inspector {
    
    //Declaro las variables

    private int idInspector;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String domicilio;   
    private boolean activo;
    
    //Declaro los Constructores

    public Inspector(int idInspector, String nombre, String apellido, int dni, int telefono, String domicilio, boolean activo) {
        this.idInspector = idInspector;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.activo = activo;
    }

    public Inspector(String nombre, String apellido, int dni, int telefono, String domicilio, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.activo = activo;
    }

    public Inspector() {
    }
    
    //Declaro Setter y Getter

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    @Override
    public String toString() {
        return idInspector + " " + nombre + " " + apellido + " " + dni + " " + telefono + " " + domicilio;
    }
    
    
    
    
}
