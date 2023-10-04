
package entidades;


public class Servicios {

    private int idServicios;
    private boolean agua_corriente;
    private boolean gas_natural;
    private boolean luz;
    private boolean cable;
    private boolean internet;
    private boolean calefaccion;
    private boolean amoblado;
    private boolean activo;

    public Servicios() {
    }

    public Servicios(int idServicios, boolean agua_corriente, boolean gas_natural, boolean luz, boolean cable, boolean internet, boolean calefaccion, boolean amoblado, boolean activo) {
        this.idServicios = idServicios;
        this.agua_corriente = agua_corriente;
        this.gas_natural = gas_natural;
        this.luz = luz;
        this.cable = cable;
        this.internet = internet;
        this.calefaccion = calefaccion;
        this.amoblado = amoblado;
        this.activo = activo;
    }

    public Servicios(boolean agua_corriente, boolean gas_natural, boolean luz, boolean cable, boolean internet, boolean calefaccion, boolean amoblado, boolean activo) {
        this.agua_corriente = agua_corriente;
        this.gas_natural = gas_natural;
        this.luz = luz;
        this.cable = cable;
        this.internet = internet;
        this.calefaccion = calefaccion;
        this.amoblado = amoblado;
        this.activo = activo;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public boolean isAgua_corriente() {
        return agua_corriente;
    }

    public void setAgua_corriente(boolean agua_corriente) {
        this.agua_corriente = agua_corriente;
    }

    public boolean isGas_natural() {
        return gas_natural;
    }

    public void setGas_natural(boolean gas_natural) {
        this.gas_natural = gas_natural;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    public boolean isCable() {
        return cable;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isAmoblado() {
        return amoblado;
    }

    public void setAmoblado(boolean amoblado) {
        this.amoblado = amoblado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idServicios + " " + agua_corriente + " " + gas_natural + " " + luz + " " + cable + " " + internet + " " + calefaccion + " " + amoblado + " " + activo;
    }
    
    
    
}
