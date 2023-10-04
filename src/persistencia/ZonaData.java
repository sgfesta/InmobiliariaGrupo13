
package persistencia;

import java.sql.Connection;


public class ZonaData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ZonaData() {
        con = Conexion.getConexion();
    }   
    
}
