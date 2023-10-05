package persistencia;


import entidades.TipoPropiedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TipoPropiedadData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public TipoPropiedadData() {
        con = Conexion.getConexion();
    }

    public void guardarTipoPropiedad(TipoPropiedad tipo) {
        String sql = "INSERT INTO tipo(nombre, activo)" + "VALUES ( ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tipo.getNombre());
            ps.setBoolean(2, tipo.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tipo.setIdTipo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tipo de propriedad guardada correctamente");
            }

            //Cierro la Conexion
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El tipo de propiedad ya existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de propiedad");
        }

    }

    public void modificarTipoPropiedad(TipoPropiedad tipo) {

        String sql = "UPDATE tipo SET idTipo= ?,nombre= ?,activo= ? WHERE idTipo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipo.getIdTipo());
            ps.setString(2, tipo.getNombre());
            ps.setBoolean(3, tipo.isActivo());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inquilino modificado con Exito");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la tabla inquilino " + ex);

        }
    }

    public void eliminarTipoPropiedad(String nombre) {
        String sql = "UPDATE tipo SET activo = 0 WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Tipo de propiedad eliminada");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el tipo de propiedad");
        }

    }

    public TipoPropiedad buscarTipoPropiedad(String nombre) {
        String sql = "SELECT nombre, activo FROM tipo WHERE nombre = ?  AND activo = 1";
        TipoPropiedad tipoPropiedad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoPropiedad = new TipoPropiedad();
                tipoPropiedad.setIdTipo(rs.getInt("idTipo"));
                tipoPropiedad.setNombre(nombre);
                tipoPropiedad.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "Tipo de propiedad inexistente con ese nombre");
            }

            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de propiedad");
        }
        return tipoPropiedad;
    }

    public TipoPropiedad buscarTipoPropiedadPorId(int idTipo, boolean activo) {

        String sql = "SELECT idTipo, nombre, activo FROM tipo WHERE idTipo = ?  AND activo = ?";

        TipoPropiedad tipoPropiedad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipo);
            ps.setBoolean(2, activo); // Establecer el valor de activo
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoPropiedad = new TipoPropiedad();
                tipoPropiedad.setIdTipo(idTipo);
                tipoPropiedad.setNombre(rs.getString("nombre"));
                tipoPropiedad.setActivo(activo);

            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de propiedad ");
        }
        return tipoPropiedad;
    }

    public List<TipoPropiedad> listarTipoPropiedades() {

        String sql = "SELECT * FROM tipo";
        ArrayList<TipoPropiedad> tipos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoPropiedad tipoPropiedad = new TipoPropiedad();
                tipoPropiedad.setIdTipo(rs.getInt("idTipo"));
                tipoPropiedad.setNombre(rs.getString("nombre"));
                tipoPropiedad.setActivo(rs.getBoolean("activo"));
                tipos.add(tipoPropiedad);
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de propiedad " + ex);

        }
        return tipos;
    }

    public List<TipoPropiedad> listarTipoPropiedadesActivas() {

        String sql = "SELECT * FROM tipo WHERE activo=1";
        ArrayList<TipoPropiedad> tipos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoPropiedad tipoPropiedad = new TipoPropiedad();
                tipoPropiedad.setIdTipo(rs.getInt("idTipo"));
                tipoPropiedad.setNombre(rs.getString("nombre"));
                tipoPropiedad.setActivo(rs.getBoolean("activo"));
                tipos.add(tipoPropiedad);
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de propiedad " + ex);

        }
        return tipos;
    }
}
