
package persistencia;

import java.sql.Connection;


public class EstadoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public EstadoData() {
        con = Conexion.getConexion();
    } 
    
}
