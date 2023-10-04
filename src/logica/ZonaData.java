
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class ZonaData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ZonaData() {
        con = Conexion.getConexion();
    }   
    
}
