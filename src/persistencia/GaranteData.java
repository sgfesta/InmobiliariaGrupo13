
package persistencia;

import entidades.Garante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GaranteData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public GaranteData() {
        con = Conexion.getConexion();
    }

    //--------------------------------
    public void guardarGarante(Garante garante) {

        String sql = "INSERT INTO garante(nombre, apellido, dni, domicilio, telefono, activo) VALUES ( ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, garante.getNombre());
            ps.setString(2, garante.getApellido());
            ps.setString(3, garante.getDni());
            ps.setString(4, garante.getDomicilio());
            ps.setString(5, garante.getTelefono());
            ps.setBoolean(6, garante.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            //cartel para ver si fue hecho exitosamente.
            if (rs.next()) {

                garante.setIdGarante(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Garante agregado exitosamente");
            } else {
                System.out.println("Error");
            }

            //Cierro la Conexion
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El Garante ya exite" + e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
    }

    public void modificarGarante(Garante garante) {
        String sql = "UPDATE garante SET nombre = ?, apellido = ?, dni = ?,  domicilio = ?, telefono= ?, activo = ? WHERE idGarante = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, garante.getNombre());
            ps.setString(2, garante.getApellido());
            ps.setString(3, garante.getDni());
            ps.setString(4, garante.getDomicilio());
            ps.setString(5, garante.getTelefono());
            ps.setBoolean(6, garante.isActivo());
            ps.setInt(7, garante.getIdGarante());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Garante modificado con Exito");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la tabla Garante ");

        }

    }

    public void eliminarGarante(String dni) {
        String sql = "UPDATE garante SET activo = 0 WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Garente eliminado");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Garente");

        }

    }

    public Garante buscarGaranteActivo(int idGarante) {
        String sql = "SELECT nombre, apellido, dni,domicilio, telefono FROM garante WHERE idGarante = ?  AND activo = 1";
        Garante garante = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idGarante);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                garante = new Garante();
                garante.setIdGarante(idGarante);
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getString("dni"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setTelefono(rs.getString("telefono"));
                garante.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un Garante con ese ID o  en Estado activo");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
        }
        return garante;
    }
    
        public Garante buscarGarante(int idGarante) {
        String sql = "SELECT nombre, apellido, dni,domicilio, telefono, activo FROM garante WHERE idGarante = ?";
        Garante garante = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idGarante);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                garante = new Garante();
                garante.setIdGarante(idGarante);
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getString("dni"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setTelefono(rs.getString("telefono"));
                garante.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un Garante con ese ID");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
        }
        return garante;
    }
    
    public Garante buscarGarantePorDni(String dni) {
        
        String sql = "SELECT idGarante, nombre, apellido, dni, domicilio, telefono, activo FROM garante WHERE dni = ? ";
    
        Garante garante = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                garante = new Garante();
                garante.setIdGarante(rs.getInt("idGarante"));
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getString("dni"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setTelefono(rs.getString("telefono"));
                garante.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un Garante con ese DNI");
                
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante ");
        }
        return garante;
    }
    
    public List<Garante> listarGarante() {
        String sql = "SELECT idGarante, nombre, apellido, dni, domicilio, telefono, activo FROM garante";
        ArrayList<Garante> garantes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                garante.setIdGarante(rs.getInt("idGarante"));
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getString("dni"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setTelefono(rs.getString("telefono"));
                garante.setActivo(rs.getBoolean("activo"));
                garantes.add(garante);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante ");

        }
        return garantes;
    }
    
    public List<Garante> listarGarantesActivos() {
        
        String sql = "SELECT idGarante, nombre, apellido, dni, domicilio, telefono, activo FROM garante WHERE activo = 1";
        ArrayList<Garante> garantesAc = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante= new Garante();
               garante.setIdGarante(rs.getInt("idGarante"));
                garante.setNombre(rs.getString("nombre"));
                garante.setApellido(rs.getString("apellido"));
                garante.setDni(rs.getString("dni"));
                garante.setDomicilio(rs.getString("domicilio"));
                garante.setTelefono(rs.getString("telefono"));
                garante.setActivo(rs.getBoolean("activo"));
                garantesAc.add(garante);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");

        }
        return garantesAc;
    }

}
