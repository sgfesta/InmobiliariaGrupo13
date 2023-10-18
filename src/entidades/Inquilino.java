
package entidades;


public class Inquilino {
    
    //Declaro las variables

    private int idInquilino;
    private String nombre;
    private String apellido;
    private String dni;
    private String cuit;
    private String lugarTrabajo;
    private boolean activo;
    
    //Declaro los Constructores

    public Inquilino() {
    }

    public Inquilino(String nombre, String apellido, String dni, String cuit, String lugarTrabajo, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }

    public Inquilino(int idInquilino, String nombre, String apellido, String dni, String cuit, String lugarTrabajo, boolean activo) {
        this.idInquilino = idInquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }

    

    public int getIdInquilino() {    
        return  idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public boolean isActivo() {
        return activo;
    }

    //Declaro Setter y Getter
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  idInquilino + ") " + apellido + ", " + nombre;
    }
    
}
