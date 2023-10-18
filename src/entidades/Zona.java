package entidades;

public class Zona {

    //Declaro las variables
    private int idZona;
    private String provincia;
    private String ciudad;
    private String barrio;
    private boolean activo;

    //Declaro los Constructores
    public Zona(int idZona, String provincia, String ciudad, String barrio, boolean activo) {
        this.idZona = idZona;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.activo = activo;
    }

    public Zona(String provincia, String ciudad, String barrio, boolean activo) {
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.activo = activo;
    }

    public Zona() {
    }

    //Declaro Setter y Getter
    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getProvincia() {
        return provincia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idZona + ") " + provincia + ", " + ciudad + ", " + barrio + ", " + activo;
    }
    
    

}
