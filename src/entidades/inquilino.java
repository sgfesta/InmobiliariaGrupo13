/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Raven
 */
public class inquilino {

    private int idInquilino;
    private String name;
    private String apellido;
    private int dni;
    private int cuit;
    private String lugarTrabajo;
    private boolean activo;

    public inquilino() {
    }

    public inquilino(int idInquilino, String name, String apellido, int dni, int cuit, String lugarTrabajo, boolean activo) {
        this.idInquilino = idInquilino;
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }

    public inquilino(String name, String apellido, int dni, int cuit, String lugarTrabajo, boolean activo) {
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.activo = activo;
    }

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
