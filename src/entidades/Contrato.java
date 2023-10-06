
package entidades;

import java.time.LocalDate;


public class Contrato {
    
    //Declaro las variables
    
    private int idContrato;
    private Propietario propietario;
    private Propiedad propiedad;
    private Inquilino inquilino;
    private Garante garante;
    private Vendedor vendedor;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaContrato;
    private boolean vigente;
    private boolean activo;
    
    //Declaro los Constructores

    public Contrato(int idContrato, Propietario propietario, Propiedad propiedad, Inquilino inquilino, Garante garante, Vendedor vendedor, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaContrato, boolean vigente, boolean activo) {
        this.idContrato = idContrato;
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.garante = garante;
        this.vendedor = vendedor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaContrato = fechaContrato;
        this.vigente = vigente;
        this.activo = activo;
    }

    public Contrato(Propietario propietario, Propiedad propiedad, Inquilino inquilino, Garante garante, Vendedor vendedor, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaContrato, boolean vigente, boolean activo) {
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.garante = garante;
        this.vendedor = vendedor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaContrato = fechaContrato;
        this.activo = activo;
    }

  
    public Contrato() {
    }
    
    //Declaro Setter y Getter

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
      public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idContrato + " " + propietario + " " + propiedad + " " + inquilino + " " + garante + " " + vendedor + " " + fechaInicio + " " + fechaFin + " " + fechaContrato + " " + vigente + " " +activo;
    }
    
    
}
