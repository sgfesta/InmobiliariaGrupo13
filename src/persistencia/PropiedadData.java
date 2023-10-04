
package persistencia;

import java.sql.Connection;


public class PropiedadData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropiedadData() {
        con = Conexion.getConexion();
    } 
    
}
