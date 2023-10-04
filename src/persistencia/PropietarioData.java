
package persistencia;

import java.sql.Connection;


public class PropietarioData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropietarioData() {
        con = Conexion.getConexion();
    } 
    
}
