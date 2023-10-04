
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class InspectorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public InspectorData() {
        con = Conexion.getConexion();
    } 
    
}
