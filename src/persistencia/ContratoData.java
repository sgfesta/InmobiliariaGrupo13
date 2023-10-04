
package persistencia;

import java.sql.Connection;


public class ContratoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ContratoData() {
        con = Conexion.getConexion();
    } 
    
}
