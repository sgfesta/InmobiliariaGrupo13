
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class EstadoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public EstadoData() {
        con = Conexion.getConexion();
    } 
    
}
