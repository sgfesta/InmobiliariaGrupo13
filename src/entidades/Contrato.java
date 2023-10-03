
package entidades;

import java.time.LocalDate;


public class Contrato {
    private int idContrato;
    private Propietario propietario;
    private Propiedad propiedad;
    private Inquilino inquilino;
    private Garante garante;
    private Vendedor vendedor;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaContrato;

    public Contrato(int idContrato, Propietario propietario, Propiedad propiedad, Inquilino inquilino, Garante garante, Vendedor vendedor, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaContrato) {
        this.idContrato = idContrato;
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.garante = garante;
        this.vendedor = vendedor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaContrato = fechaContrato;
    }

    public Contrato(Propietario propietario, Propiedad propiedad, Inquilino inquilino, Garante garante, Vendedor vendedor, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaContrato) {
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.garante = garante;
        this.vendedor = vendedor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaContrato = fechaContrato;
    }

    public Contrato() {
    }

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
    
    
}
