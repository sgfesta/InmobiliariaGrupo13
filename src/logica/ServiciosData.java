
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class ServiciosData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ServiciosData() {
        con = Conexion.getConexion();
    } 
    
}
