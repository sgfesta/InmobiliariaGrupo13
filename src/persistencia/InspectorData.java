
package persistencia;

import entidades.Inspector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO inspector (matricula, nombre, apellido, telefono, activo) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inspector.getMatricula());
            ps.setString(2, inspector.getNombre());
            ps.setString(3, inspector.getApellido());
            ps.setString(4, inspector.getTelefono());
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
            JOptionPane.showMessageDialog(null, "Ya existe un Inspector con esa matricula");

        }

    }

    //Modifico Inspector de forma individual
    public void modificarInspector(Inspector inspector) {
        //Sentencia SQL
        String sql = "UPDATE inspector SET matricula = ?, nombre = ?, apellido = ?, telefono = ?, activo = ? WHERE idInspector = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inspector.getMatricula());
            ps.setString(2, inspector.getNombre());
            ps.setString(3, inspector.getApellido());
            ps.setString(4, inspector.getTelefono());
            ps.setBoolean(5, inspector.isActivo());
            ps.setInt(6, inspector.getIdInspector());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Inspector modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inspector");

        }
        
    }

    //Elimino de forma logica Inspector
    public void eliminarInspector(int idInspector) {
        //borrado logico
        String sql = "UPDATE inspector SET activo=0 WHERE idInspector= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInspector);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inspector eliminado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inspector");
        }

    }
    public List<Inspector> listarInspectoresActivos() {
        
        String sql = "SELECT idInspector, matricula, nombre, apellido, telefono, activo FROM inspector WHERE activo = 1";
        ArrayList<Inspector> inspectoresA = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inspector inspectorA= new Inspector();
               inspectorA.setIdInspector(rs.getInt("idInspector"));
               inspectorA.setMatricula(rs.getString("matricula"));
                inspectorA.setNombre(rs.getString("nombre"));
                inspectorA.setApellido(rs.getString("apellido"));
                inspectorA.setTelefono(rs.getString("telefono"));
                inspectorA.setActivo(true);
                inspectoresA.add(inspectorA);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inspector");

        }
        return inspectoresA;
    }
    
        public List<Inspector> listarInspectores() {
        
        String sql = "SELECT idInspector, matricula, nombre, apellido, telefono, activo FROM inspector ";
        ArrayList<Inspector> inspectoresA = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inspector inspectorA= new Inspector();
               inspectorA.setIdInspector(rs.getInt("idInspector"));
               inspectorA.setMatricula(rs.getString("matricula"));
                inspectorA.setNombre(rs.getString("nombre"));
                inspectorA.setApellido(rs.getString("apellido"));
                inspectorA.setTelefono(rs.getString("telefono"));
                inspectorA.setActivo(rs.getBoolean("activo"));
                inspectoresA.add(inspectorA);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inspector");

        }
        return inspectoresA;
    }
}//fin