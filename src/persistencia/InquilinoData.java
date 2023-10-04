
package persistencia;

import java.sql.Connection;


public class InquilinoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public InquilinoData() {
        con = Conexion.getConexion();
    } 
    
}
