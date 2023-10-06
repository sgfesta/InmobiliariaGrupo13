package persistencia;

import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public UsuarioData() {
        con = Conexion.getConexion();
    }

    //Guardo vendedor de forma individual
    public void guardarUsuario(Usuario usuario) {
        //Consulta slq 
        String sql = "INSERT INTO  usuario (nombre, email, password, activo, idNivelAcceso) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getPassword());
            ps.setBoolean(4, usuario.isActivo());
            ps.setInt(5, usuario.getIdNivelAcceso());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");

        }

    }

    //Modifico Vendedor de forma individual
    public void modificarUsuario(Usuario usuario) {
        //Sentencia SQL
        String sql = "UPDATE usuario SET nombre = ?, email = ?, password = ?, activo = ? idNivelAcceso = ? WHERE idUsuario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getPassword());
            ps.setBoolean(4, usuario.isActivo());
            ps.setInt(5, usuario.getIdNivelAcceso());
            ps.setInt(6, usuario.getIdUsuario());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");

        }

    }

    //Elimino de forma logica Vendedor
    public void eliminarJUsuario(int idUsuario) {
        //borrado logico
        String sql = "UPDATE usuario SET activo=0 WHERE idVendedor= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");
        }

    }

}
