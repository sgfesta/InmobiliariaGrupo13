
package logica;

import java.sql.Connection;
import persistencia.Conexion;


public class VendedorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public VendedorData() {
        con = Conexion.getConexion();
    }
    
}
