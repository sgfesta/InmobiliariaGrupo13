
package persistencia;

import entidades.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class EstadoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public EstadoData() {
        con = Conexion.getConexion();
    } 
    
   public void darAlta(Estado estado) {
        String sql = "INSERT INTO estado(nombre, activo)" + "VALUES ( ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, estado.getNombre());
            ps.setBoolean(2, estado.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
                  if (rs.next()) {
                estado.setIdEstado(rs.getInt(1));
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta inscripcion
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Estado en darAlta "+ex.getMessage());
        }
      
}
   
     public void modificarEstado(Estado estado) {
        String sql = "UPDATE estado SET nombre = ?, activo = ? WHERE idEstado = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estado.getNombre());
            ps.setBoolean(2, estado.isActivo());
            ps.setInt(3, estado.getIdEstado());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta modificacion
            }
             //Cierro la Conexion
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar la tabla Estado al modificar "+ex.getMessage());
           
        }
        }
      

   
     public void darBaja(Estado estado) {
       String sql = "UPDATE estado SET activo = 0 WHERE idEstado = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado.getIdEstado());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta eliminacion
            }
             //Cierro la Conexion
            ps.close();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Estado en darBaja "+ex.getMessage());
            
        }
      
}
   
   
}