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
public class NivelAcceso {
    
    //Declaro variables
    private int idNivelAcceso;
    private String nombre;
    
    //Genero Constructores

    public NivelAcceso() {
    }

    public NivelAcceso(int idNivelAcceso, String nombre) {
        this.idNivelAcceso = idNivelAcceso;
        this.nombre = nombre;
    }
    
    //Genero Setter y getters

    public int getIdNivelAcceso() {
        return idNivelAcceso;
    }

    public void setIdNivelAcceso(int idNivelAcceso) {
        this.idNivelAcceso = idNivelAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  idNivelAcceso + " " + nombre;
    }
    
    
    
    
}
