
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class InquilinoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public InquilinoData() {
        con = Conexion.getConexion();
    } 
    
}
