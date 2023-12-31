package persistencia;

import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public UsuarioData() {
        con = Conexion.getConexion();
    }

    //Guardo Usuario de forma individual
    public boolean guardarUsuario(Usuario usuario) {
        //Consulta slq 
        String sql = "INSERT INTO  usuario (nombre, email, password, activo, nivelAcceso) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getPassword());
            ps.setBoolean(4, usuario.isActivo());
            ps.setInt(5, usuario.getNivelAcceso());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            //Cierro la Conexion
            ps.close();
            return true; // Usuario guardado exitosamente            
      
        } catch (SQLException ex) {
          //  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");
          return false; // Error al guardar el usuario
        }

    }

    //Modifico Usuario de forma individual
    public void modificarUsuario(Usuario usuario) {
        //Sentencia SQL
        String sql = "UPDATE usuario SET nombre = ?, email = ?, password = ?, activo = ?, nivelAcceso = ? WHERE idUsuario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getPassword());
            ps.setBoolean(4, usuario.isActivo());
            ps.setInt(5, usuario.getNivelAcceso());
            ps.setInt(6, usuario.getIdUsuario());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
//                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");
        }
    }

    //Elimino de forma logica Usuario
    public void eliminarUsuario(int idUsuario) {
        //borrado logico
        String sql = "UPDATE usuario SET activo=0 WHERE idUsuario= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            int exito = ps.executeUpdate();

            if (exito == 1) {
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");
        }

    }
    
        public Usuario buscarUsuario(int idUsuario) {
        String sql = "SELECT idUsuario, nombre,email, password, activo, nivelAcceso FROM usuario WHERE idUsuario=?";
        Usuario usuario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString("password"));
                usuario.setActivo(rs.getBoolean("activo"));
                usuario.setNivelAcceso(rs.getInt("nivelAcceso"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un usuario con ese ID o  en Estado activo");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario");
        }
        return usuario;
    }
        
    public List<Usuario> listarUsuario() {
        String sql = "SELECT idUsuario, nombre, email, password, activo, nivelAcceso FROM usuario";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString("password"));
                usuario.setActivo(rs.getBoolean("activo"));
                usuario.setNivelAcceso(rs.getInt("nivelAcceso"));                
                usuarios.add(usuario);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios ");

        }
        return usuarios;
    }

}
