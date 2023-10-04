
package persistencia;

import java.sql.Connection;


public class VendedorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public VendedorData() {
        con = Conexion.getConexion();
    }
    
}
