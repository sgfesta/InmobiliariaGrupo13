
package persistencia;

import java.sql.Connection;


public class TipoPropiedadData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public TipoPropiedadData() {
        con = Conexion.getConexion();
    }   
    
}
