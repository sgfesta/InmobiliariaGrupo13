
package persistencia;

import entidades.TareaPermitida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TareaPermitidaData {
     //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public TareaPermitidaData() {
        con = Conexion.getConexion();
    }

    //Guardo TareaPermitida de forma individual
    public void guardarTPermitida(TareaPermitida tpermitida) {
        //Consulta slq 
        String sql = "INSERT INTO  tarea_permitida (tarea, idNivelAcceso, activo) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tpermitida.getTarea());
            ps.setInt(2, tpermitida.getIdNivelAcceso());
            ps.setBoolean(3, tpermitida.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                tpermitida.setIdTareaPermitida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");

        }

    }

    //Modifico TareaPermitida de forma individual
    public void modificarTPermitida(TareaPermitida tpermitida) {
        //Sentencia SQL
        String sql = "UPDATE tarea_permitida SET tarea = ?, idNivelAcceso = ?, activo = ? WHERE idTareaPermitida = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tpermitida.getTarea());
            ps.setInt(2, tpermitida.getIdNivelAcceso());
            ps.setBoolean(3, tpermitida.isActivo());
            ps.setInt(4, tpermitida.getIdTareaPermitida());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Tarea Permitida modificada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea Permitida");

        }

    }

    //Elimino de forma logica Vendedor
    public void eliminarTPermitida(int idTareaPermitida) {
        //borrado logico
        String sql = "UPDATE tarea_permitida SET activo=0 WHERE idTareaPermitida= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTareaPermitida);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Tarea Permitida eliminada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea Permitida");
        }

    }

}
