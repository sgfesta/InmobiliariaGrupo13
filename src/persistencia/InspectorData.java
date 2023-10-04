
package persistencia;

import java.sql.Connection;


public class InspectorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public InspectorData() {
        con = Conexion.getConexion();
    } 
    
}
