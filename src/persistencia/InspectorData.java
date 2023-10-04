
package persistencia;

import entidades.Inspector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InspectorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public InspectorData() {
        con = Conexion.getConexion();
    } 
    
    //Guardo Inspector de forma individual
    public void guardarInspector(Inspector inspector) {

        String sql = "INSERT INTO inspector (matricula, nombre, telefono, activo) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inspector.get());
            ps.setString(1, inspector.getNombre());
            ps.setInt(2, inspector.getAnioMateria());
            
            ps.setBoolean(3, inspector.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
           

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
           
        }

    }

    
}
