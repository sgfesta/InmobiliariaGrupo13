
package persistencia;

import entidades.Propiedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropiedadData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public PropiedadData() {
        con = Conexion.getConexion();
    } 
    
    public void agregarPropiedad(Propiedad propiedad) {
         String sql = "INSERT INTO propiedad (idPropietario, direccion, altura, idTipo, superficieTotal, precioTasado, antiguedad, idServicios, idInspector, idZona, idEstado, observaciones, vigente)" + 
                 " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getAltura());
            ps.setInt(4, propiedad.getTipo().getIdTipo());
            ps.setInt(5,propiedad.getSuperficieTotal());
            ps.setDouble(6, propiedad.getPrecioTasado());
            ps.setInt(7, propiedad.getAntiguedad());
            ps.setInt(8, propiedad.getServicios().getIdServicios());
            ps.setInt(9, propiedad.getInspector().getIdInspector());
            ps.setInt(10, propiedad.getZona().getIdZona());
            ps.setInt(11, propiedad.getEstado().getIdEstado());
            ps.setString(12, propiedad.getObservaciones());
            ps.setBoolean(13, propiedad.isVigente());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            //cartel para ver si fue hecho exitosamente la inscripcion
            if (rs.next()) {
                propiedad.setIdPropiedad((rs.getInt(1)));
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta inscripcion
            } 
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en agregarPropiedad " + ex.getMessage());
        }
    }
    
     public void modificarPropiedad(Propiedad propiedad) {
         String sql = "UPDATE propiedad SET idPropietario = ?, direccion = ?, altura = ?, idTipo = ?, superficieTotal = ?, precioTasado = ?, antiguedad = ?, idServicios = ?, idInspector = ?, idZona = ?, idEstado = ?, observaciones = ?, vigente = ? WHERE idPropiedad = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getAltura());
            ps.setInt(4, propiedad.getTipo().getIdTipo());
            ps.setInt(5,propiedad.getSuperficieTotal());
            ps.setDouble(6, propiedad.getPrecioTasado());
            ps.setInt(7, propiedad.getAntiguedad());
            ps.setInt(8, propiedad.getServicios().getIdServicios());
            ps.setInt(9, propiedad.getInspector().getIdInspector());
            ps.setInt(10, propiedad.getZona().getIdZona());
            ps.setInt(11, propiedad.getEstado().getIdEstado());
            ps.setString(12, propiedad.getObservaciones());
            ps.setBoolean(13, propiedad.isVigente());
            ps.setInt(14, propiedad.getIdPropiedad());
            
           int exito = ps.executeUpdate();
            if (exito == 1) {
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta modificacion
            }
             //Cierro la Conexion
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar la tabla Propiedad en modificarPropiedad "+ex.getMessage());
           
        }
    }
    
     public void darBajaAPropiedad(Propiedad propiedad) {
         String sql = "UPDATE propiedad  vigente = 0 WHERE idPropiedad = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);         
            ps.setInt(1, propiedad.getIdPropiedad());
            
           int exito = ps.executeUpdate();
            if (exito == 1) {
                //AGREGAR JOptionPane despues, donde se llame al metodo para mensaje de correcta eliminacion
            }
             //Cierro la Conexion
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar la tabla Propiedad en darBajaAPropiedad "+ex.getMessage());
           
        }
    }
     
      public Propiedad buscarPropiedad(int id, boolean vigente) {
     String sql = "SELECT * FROM propiedad WHERE idPropiedad = ?  AND vigente = ?";
     Propiedad pr1 = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setBoolean(2, vigente); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pr1 = new Propiedad();
                pr1.setIdPropiedad(rs.getInt("idPropiedad"));
                pr1.setDireccion(rs.getString("direccion"));
                pr1.setAltura(rs.getInt("altura"));
                pr1.setSuperficieTotal(rs.getInt("superficieTotal"));
                pr1.setPrecioTasado(rs.getDouble("precioTasado"));
                pr1.setAntiguedad(rs.getInt("antiguedad"));
                pr1.setObservaciones(rs.getString("observaciones"));
                pr1.setVigente(rs.getBoolean("vigente"));
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }
        return pr1;
    }
     
     
     
     public List<Propiedad> listarPropiedades() {
        String sql = "SELECT * FROM propiedad";
        ArrayList<Propiedad> propiedades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propiedad pr1 = new Propiedad();
                pr1.setIdPropiedad(rs.getInt("idPropiedad"));
                pr1.setDireccion(rs.getString("direccion"));
                pr1.setAltura(rs.getInt("altura"));
                pr1.setSuperficieTotal(rs.getInt("superficieTotal"));
                pr1.setPrecioTasado(rs.getDouble("precioTasado"));
                pr1.setAntiguedad(rs.getInt("antiguedad"));
                pr1.setObservaciones(rs.getString("observaciones"));
                pr1.setVigente(true);
                propiedades.add(pr1);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedades");

        }
        return propiedades;
    }
    
      public List<Propiedad> listarPropiedadesActivas() {
        String sql = "SELECT * FROM propiedad WHERE vigente = 1";
        ArrayList<Propiedad> propiedades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propiedad pr1 = new Propiedad();
                pr1.setIdPropiedad(rs.getInt("idPropiedad"));
                pr1.setDireccion(rs.getString("direccion"));
                pr1.setAltura(rs.getInt("altura"));
                pr1.setSuperficieTotal(rs.getInt("superficieTotal"));
                pr1.setPrecioTasado(rs.getDouble("precioTasado"));
                pr1.setAntiguedad(rs.getInt("antiguedad"));
                pr1.setObservaciones(rs.getString("observaciones"));
                pr1.setVigente(true);
                propiedades.add(pr1);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedadesActivas");

        }
        return propiedades;
    }
    
}
