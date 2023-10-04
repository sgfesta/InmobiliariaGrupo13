
package persistencia;

import java.sql.Connection;


public class GaranteData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public GaranteData() {
        con = Conexion.getConexion();
    } 
    
}
