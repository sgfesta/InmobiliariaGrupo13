
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class ContratoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ContratoData() {
        con = Conexion.getConexion();
    } 
    
}
