
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class TipoPropiedadData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public TipoPropiedadData() {
        con = Conexion.getConexion();
    }   
    
}
