package persistencia;

import entidades.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InquilinoData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public InquilinoData() {
        con = Conexion.getConexion();
    }

    public void guardarInquilino(Inquilino inquilino) {
         String sql = "INSERT INTO inquilino (nombre, apellido, dni, cuit, lugarTrabajo, activo)" + "VALUES ( ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inquilino.getNombre());
            ps.setString(2, inquilino.getApellido());
            ps.setInt(3, inquilino.getDni());
            ps.setInt(4, inquilino.getCuit());
            ps.setString(5, inquilino.getLugarTrabajo());
            ps.setBoolean(6, inquilino.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inquilino.setIdInquilino(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inquilino guardado correctamente");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El inquilino ya existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
        }

    }

    public void modificarInquilino(Inquilino inquilino) {

        String sql = "UPDATE inquilino SET nombre= ?, apellido= ?, dni= ?, cuit= ?, lugarTrabajo= ?, activo= ? WHERE idInquilino = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inquilino.getNombre());
            ps.setString(2, inquilino.getApellido());
            ps.setInt(3, inquilino.getDni());
            ps.setInt(4, inquilino.getCuit());
            ps.setString(5, inquilino.getLugarTrabajo());
            ps.setBoolean(6, inquilino.isActivo());
            ps.setInt(7, inquilino.getIdInquilino());
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

    public void eliminarInquilino(int dni) {
        String sql = "UPDATE inquilino SET activo = 0 WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inquilino eliminado");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar inquilino");
        }

    }

    public Inquilino buscarInquilino(int idInquilino) {
        String sql = "SELECT nombre, apellido, dni, cuit, lugarTrabajo, activo FROM inquilino WHERE idinquilino = ?  AND activo = 1";
        Inquilino inquilino = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInquilino);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inquilino = new Inquilino();           
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setActivo(rs.getBoolean("activo"));
                inquilino.setIdInquilino(idInquilino);

            } else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese ID o Estado");
            }

            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
        }
        return inquilino;
    }

    public Inquilino buscarInquilinoPorDni(int dni, boolean activo) {

        String sql = "SELECT idInquilino, nombre, apellido, dni, cuit, lugarTrabajo, activo FROM inquilino WHERE dni = ?  AND activo = ?";
                  
        Inquilino inquilino = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setBoolean(2, activo); // Establecer el valor de activo
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inquilino = new Inquilino(); 
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setDni(dni);
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setActivo(activo);
                
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino ");
        }
        return inquilino;
    }

    public List<Inquilino> listarInquilinos() {
        
        String sql = "SELECT * FROM inquilino";
        ArrayList<Inquilino> inquilinos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {  
               Inquilino inquilino = new Inquilino(); 
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setActivo(rs.getBoolean("activo"));
                inquilinos.add(inquilino);
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino " + ex);

        }
        return inquilinos;
    }

    public List<Inquilino> listarInquilinosActivos() {
        
        String sql = "SELECT * FROM inquilino WHERE activo=1";
        ArrayList<Inquilino> inquilinos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {  
               Inquilino inquilino = new Inquilino(); 
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setActivo(true);
                inquilinos.add(inquilino);
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino " + ex);

        }
        return inquilinos;
    }
}
