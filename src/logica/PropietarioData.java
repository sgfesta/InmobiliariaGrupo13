
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class PropietarioData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropietarioData() {
        con = Conexion.getConexion();
    } 
    
}
