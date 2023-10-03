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
public class Propiedad {
    private int idPropiedad;
    private Propietario propietario;
    private String direccion;
    private int altura;
    private tipoPropiedad tipo;
    private int superficieTotal;
    private double precioTasado;
    private int antiguedad;
    private Servicios servicios;
    private Inspector inspector;
    private Zona zona;
    private Estado estado;
    private String observaciones;
    private boolean vigente;

    public Propiedad(int idPropiedad, Propietario propietario, String direccion, int altura, tipoPropiedad tipo, int superficieTotal, double precioTasado, int antiguedad, Servicios servicios, Inspector inspector, Zona zona, Estado estado, String observaciones, boolean vigente) {
        this.idPropiedad = idPropiedad;
        this.propietario = propietario;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficieTotal = superficieTotal;
        this.precioTasado = precioTasado;
        this.antiguedad = antiguedad;
        this.servicios = servicios;
        this.inspector = inspector;
        this.zona = zona;
        this.estado = estado;
        this.observaciones = observaciones;
        this.vigente = vigente;
    }

    public Propiedad(Propietario propietario, String direccion, int altura, tipoPropiedad tipo, int superficieTotal, double precioTasado, int antiguedad, Servicios servicios, Inspector inspector, Zona zona, Estado estado, String observaciones, boolean vigente) {
        this.propietario = propietario;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficieTotal = superficieTotal;
        this.precioTasado = precioTasado;
        this.antiguedad = antiguedad;
        this.servicios = servicios;
        this.inspector = inspector;
        this.zona = zona;
        this.estado = estado;
        this.observaciones = observaciones;
        this.vigente = vigente;
    }

    public Propiedad() {
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public tipoPropiedad getTipo() {
        return tipo;
    }

    public void setTipo(tipoPropiedad tipo) {
        this.tipo = tipo;
    }

    public int getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(int superficieTotal) {
        this.superficieTotal = superficieTotal;
    }

    public double getPrecioTasado() {
        return precioTasado;
    }

    public void setPrecioTasado(double precioTasado) {
        this.precioTasado = precioTasado;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    
    
}
