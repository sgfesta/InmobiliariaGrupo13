package persistencia;

import entidades.NivelAcceso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class NivelAccesoData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public NivelAccesoData() {
        con = Conexion.getConexion();
    }

    //Guardo Nivel Acceso de forma individual
    public void guardarNAcceso(NivelAcceso nAcceso) {
        //Consulta slq 
        String sql = "INSERT INTO  usuario (nombre) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nAcceso.getNombre());

            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                nAcceso.setIdNivelAcceso(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Nivel Acceso guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Nivel Acceso");

        }

    }

    //Modifico Usuario de forma individual
    public void modificarNAcceso(NivelAcceso nAcceso) {
        //Sentencia SQL
        String sql = "UPDATE usuario SET nombre = ? WHERE idNivelAcceso = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nAcceso.getNombre());
            ps.setInt(2, nAcceso.getIdNivelAcceso());

            //Sentencia SQL.getIdUsuario());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Nivel Acceso modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Nivel Acceso");

        }

    }

    //Elimino de forma logica Usuario
    public void eliminarNAccesoo(int idNivelAcceso) {
        //borrado logico
        String sql = "UPDATE usuario SET activo=0 WHERE idNivelAcceso= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idNivelAcceso);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nivel Acceso eliminado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Nivel Acceso");
        }

    }
}
