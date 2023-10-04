
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
        //Consulta slq 
        String sql = "INSERT INTO inspector (matricula, apellido, nombre, telefono, activo) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inspector.getMatricula());
            ps.setString(2, inspector.getApellido());
            ps.setString(3, inspector.getNombre());
            ps.setInt(4, inspector.getTelefono());            
            ps.setBoolean(5, inspector.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inspector.setIdInspector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inspector guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();          

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inspector");
           
        }

    }

    //Modifico Inspector de forma individual
    public void modificarInspector(Inspector inspector) {
        //Sentencia SQL
        String sql = "UPDATE inspector SET matricula = ?, apellido = ?, nombre = ?, telefono = ?, activa = ? WHERE idInspector = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, inspector.getMatricula());
            ps.setString(2, inspector.getApellido());
            ps.setString(3, inspector.getNombre());
            ps.setInt(4, inspector.getTelefono());            
            ps.setBoolean(5, inspector.isActivo());
            ps.setInt(6, inspector.getIdInspector());
            int exito = ps.executeUpdate();

           if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Inspector modificada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inspector");
            
        }

    }
    
    //Elimino de forma logica Inspector
    public void eliminarMateria(int idInspector) {
        //borrado logico
        String sql = "UPDATE inspector SET activo=0 WHERE idInspector= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInspector);
            int exito = ps.executeUpdate();

           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inspector eliminada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inspector");
        }

    }
    
    
}//fin
