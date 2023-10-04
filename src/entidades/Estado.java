
package entidades;


public class Estado {
    
    //Declaro las variables
  
    private int idEstado;
    private String nombre;
    private boolean activo;
    
    //Declaro los Constructores

    public Estado() {
    }

    public Estado(int idEstado, String nombre, boolean activo) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.activo = activo;
    }
    
    //Declaro Setter y Getter

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  idEstado + " " + nombre + " " + activo;
    }
   
    
}
