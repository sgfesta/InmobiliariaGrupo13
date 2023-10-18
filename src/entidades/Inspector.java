
package entidades;

public class Inspector {
    
    //Declaro las variables

    private int idInspector;
    private String matricula;    
    private String nombre;  
    private String apellido;
    private String telefono;
    private boolean activo;
    
    //Declaro los Constructores

    public Inspector() {
    }

    public Inspector(int idInspector, String matricula, String nombre, String apellido, String telefono, boolean activo) {
        this.idInspector = idInspector;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Inspector(String matricula, String nombre, String apellido, String telefono, boolean activo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        return matricula + " - " + apellido + ", " + nombre;
    }
    
    
    
    
}
    
    
    

