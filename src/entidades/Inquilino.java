
package entidades;


public class Inquilino {
    
    //Declaro las variables

    private int idInquilino;
    private String name;
    private String apellido;
    private int dni;
    private int cuit;
    private String lugarTrabajo;
    private boolean activo;
    
    //Declaro los Constructores

    public Inquilino() {
    }

    public Inquilino(int idInquilino, String name, String apellido, int dni, int cuit, String lugarTrabajo, boolean activo) {
        this.idInquilino = idInquilino;
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }

    public Inquilino(String name, String apellido, int dni, int cuit, String lugarTrabajo, boolean activo) {
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }
    
    //Declaro Setter y Getter

    public int getIdInquilino() {
        return idInquilino;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getCuit() {
        return cuit;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return  idInquilino + " " + name + " " + apellido + " " + dni + " " + cuit + " " + lugarTrabajo + " " + activo;
    }
    
    

}
