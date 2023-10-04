
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class PropiedadData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropiedadData() {
        con = Conexion.getConexion();
    } 
    
}
