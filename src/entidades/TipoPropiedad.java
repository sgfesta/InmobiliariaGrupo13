/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Pirrupi
 */
public class TipoPropiedad {
    
    //Declaro las variables
    
    private int idTipo;
    private String nombre ;
    private boolean activo;
    
    //Declaro los Constructores

    public TipoPropiedad(int idTipo, String nombre, boolean activo) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.activo = activo;
    }

    public TipoPropiedad() {
    }
    
    //Declaro Setter y Getter

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
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
        return "tipoPropiedad{" + "idTipo=" + idTipo + ", nombre=" + nombre + ", activo=" + activo + '}';
    }
    
    
}
