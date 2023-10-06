
package entidades;

public class TareaPermitida {
    //Declaro Variables
    private int idTareaPermitida;
    private String tarea;
    private int idNivelAcceso;
    private boolean activo;
    
    //Declaro Constructores

    public TareaPermitida() {
    }

    public TareaPermitida(int idTareaPendiente, String tarea, int idNivelAcceso, boolean activo) {
        this.idTareaPermitida = idTareaPendiente;
        this.tarea = tarea;
        this.idNivelAcceso = idNivelAcceso;
        this.activo = activo;
    }
    
    //Declaro Setter y Getters

    public int getIdTareaPermitida() {
        return idTareaPermitida;
    }

    public void setIdTareaPermitida(int idTareaPermitida) {
        this.idTareaPermitida = idTareaPermitida;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public int getIdNivelAcceso() {
        return idNivelAcceso;
    }

    public void setIdNivelAcceso(int idNivelAcceso) {
        this.idNivelAcceso = idNivelAcceso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idTareaPermitida + " " + tarea + " " + idNivelAcceso + " " + activo;
    }
    
    
    
    
    
}
