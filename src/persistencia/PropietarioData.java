
package persistencia;

import entidades.Propietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropietarioData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropietarioData() {
        con = Conexion.getConexion();
    } 
    
    
    public void guardarPropietario(Propietario propietario) {
         String sql = "INSERT INTO propietario(nombre, apellido, dni,telefono, domicilio, activo)" + "VALUES ( ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setInt(3, propietario.getDni());
            ps.setInt(4, propietario.getTelefono());
            ps.setString(5, propietario.getDomicilio());
            ps.setBoolean(6, propietario.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                propietario.setIdPropietario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propietario guardado correctamente");
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El Propietario ya existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }

    }

    public void modificarPropietario(Propietario propietario) {
        
        String sql = "UPDATE propietario SET nombre = ?, apellido = ?, dni = ?, telefono= ?,  domicilio = ?, activo = ? WHERE idPropietario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setInt(3, propietario.getDni());
            ps.setInt(5, propietario.getTelefono());
            ps.setString(4, propietario.getDomicilio());
            ps.setBoolean(6, propietario.isActivo());
            ps.setInt(7, propietario.getIdPropietario());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario modificado con Exito");
            }
             //Cierro la Conexion
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar la tabla propietario ");
           
        }
    }

    public void eliminarPropietario(int dni) {
        String sql = "UPDATE propietario SET activo = 0 WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario eliminado");
            }
             //Cierro la Conexion
            ps.close();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar propietario");
            
        }

    }

    public Propietario buscarPropietario(int idPropietario) {
        String sql = "SELECT nombre, apellido, dni, telefono, domicilio FROM alumno WHERE idPropietario = ?  AND activo = 1";
        Propietario propietario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPropietario);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                propietario= new Propietario();
                propietario.setIdPropietario(idPropietario);
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe un propietario con ese ID o con estado Activo");
            }
            
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }
        return propietario;
    }

    public Propietario buscarPropietarioPorDni(int dni, boolean activo) {
        
        String sql = "SELECT idPropietario, nombre, apellido, dni, telefono, domicilio, activo FROM propietario WHERE dni = ?  AND activo = ?";
    
        Propietario propietario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setBoolean(2, activo); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setActivo(rs.getBoolean("activo"));
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }
        return propietario;
    }

    public List<Propietario> listarPropietarios() {
        String sql = "SELECT idPropietario,nombre, apellido, dni, telefono, domicilio, activo FROM alumno";
        ArrayList<Propietario> propietarios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setActivo(rs.getBoolean("activo"));
                propietarios.add(propietario);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario ");

        }
        return propietarios;
    }
    
    public List<Propietario> listarPropietariosActivos() {
        String sql = "SELECT idPropietario, nombre, apellido, dni, telefono, domicilio, activo FROM propietario WHERE activo = 1";
        ArrayList<Propietario> propietariosAc = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propietario propietario = new Propietario();
               propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTelefono(rs.getInt("telefono"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setActivo(true);
                propietariosAc.add(propietario);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");

        }
        return propietariosAc;
    }
    
    
    
}
