
package persistencia;

import java.sql.Connection;


public class ServiciosData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ServiciosData() {
        con = Conexion.getConexion();
    } 
    
}
