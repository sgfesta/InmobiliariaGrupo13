
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class GaranteData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public GaranteData() {
        con = Conexion.getConexion();
    } 
    
}
