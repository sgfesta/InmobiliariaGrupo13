
package entidades;


public class Zona {
    
    //Declaro las variables
    
    private int idZona;
    private String provincia;
    private String ciudad;
    private String barrio;
    
    //Declaro los Constructores

    public Zona(int idZona, String provincia, String ciudad, String barrio) {
        this.idZona = idZona;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public Zona(String provincia, String ciudad, String barrio) {
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.barrio = barrio;
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

    @Override
    public String toString() {
        return idZona + ", " + provincia + ", " + ciudad + ", " + barrio;
    }
    
    

}
