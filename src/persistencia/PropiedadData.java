
package persistencia;

import entidades.Estado;
import entidades.Inspector;
import entidades.Propiedad;
import entidades.TipoPropiedad;
import entidades.Zona;
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
         String sql = "INSERT INTO propiedad (idPropietario, direccion, altura, idTipo, superficieTotal, precioTasado, antiguedad, idInspector, idZona, idEstado, observaciones, disponible, activo) " +
             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getAltura());
            ps.setInt(4, propiedad.getTipo().getIdTipo());
            ps.setInt(5,propiedad.getSuperficieTotal());
            ps.setDouble(6, propiedad.getPrecioTasado());
            ps.setInt(7, propiedad.getAntiguedad());
          //  ps.setInt(8, propiedad.getServicios().getIdServicios());
            ps.setInt(8, propiedad.getInspector().getIdInspector());
            ps.setInt(9, propiedad.getZona().getIdZona());
            ps.setInt(10, propiedad.getEstado().getIdEstado());
            ps.setString(11, propiedad.getObservaciones());
            ps.setBoolean(12, propiedad.isDisponible());
            ps.setBoolean(13, propiedad.isActivo());
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
         String sql = "UPDATE propiedad SET idPropietario = ?, direccion = ?, altura = ?, idTipo = ?, superficieTotal = ?, precioTasado = ?, antiguedad = ?, idInspector = ?, idZona = ?, idEstado = ?, observaciones = ?, disponible = ?, activo = ? WHERE idPropiedad = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getAltura());
            ps.setInt(4, propiedad.getTipo().getIdTipo());
            ps.setInt(5,propiedad.getSuperficieTotal());
            ps.setDouble(6, propiedad.getPrecioTasado());
            ps.setInt(7, propiedad.getAntiguedad());
         //   ps.setInt(8, propiedad.getServicios().getIdServicios());
            ps.setInt(8, propiedad.getInspector().getIdInspector());
            ps.setInt(9, propiedad.getZona().getIdZona());
            ps.setInt(10, propiedad.getEstado().getIdEstado());
            ps.setString(11, propiedad.getObservaciones());
            ps.setBoolean(12, propiedad.isDisponible());
            ps.setBoolean(13, propiedad.isActivo());
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
         String sql = "UPDATE propiedad  activo = 0 WHERE idPropiedad = ?";
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
     
      public Propiedad buscarPropiedad(int id, boolean disponible) {
     String sql = "SELECT idPropiedad, direccion, altura, superficieTotal, precioTasado, antiguedad, observaciones, disponible, activo FROM propiedad WHERE idPropiedad = ?  AND disponible = ?";
     Propiedad pr1 = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setBoolean(2, disponible); 
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
                pr1.setDisponible(rs.getBoolean("disponible"));
                pr1.setActivo(rs.getBoolean("activo"));
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en buscarPropiedad "+ex.getMessage());
        }
        return pr1;
    }
     
     
     
     public List<Propiedad> listarPropiedades() {
        String sql = "SELECT idPropiedad, direccion, altura, superficieTotal, precioTasado, antiguedad, observaciones, disponible, activo FROM propiedad";
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
                pr1.setDisponible(rs.getBoolean("disponible"));
                pr1.setDisponible(rs.getBoolean("activo"));
                propiedades.add(pr1);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedades "+ex.getMessage());

        }
        return propiedades;
    }
    
      public List<Propiedad> listarPropiedadesXDueño(int idPropietario) {
         String sql = "SELECT idPropiedad, direccion, altura, idTipo, superficieTotal, precioTasado, antiguedad, idInspector, idZona, idEstado, observaciones, disponible FROM propiedad p1 JOIN propietario p2 on (p1.idPropietario = p2.idPropietario) WHERE p1.idPropietario = ?";
        ArrayList<Propiedad> propiedades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idPropietario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propiedad pr1 = new Propiedad();
               // pr1.getPropietario().getIdPropietario();
                pr1.setIdPropiedad(rs.getInt("idPropiedad"));
                pr1.setDireccion(rs.getString("direccion"));
                pr1.setAltura(rs.getInt("altura"));
                
                TipoPropiedad tipo=new TipoPropiedad();
                tipo.setIdTipo(rs.getInt("idTipo"));
                pr1.setTipo(tipo);
                
                pr1.setSuperficieTotal(rs.getInt("superficieTotal"));
                pr1.setPrecioTasado(rs.getDouble("precioTasado"));
                pr1.setAntiguedad(rs.getInt("antiguedad"));
                
                Inspector inspector=new Inspector();
                inspector.setIdInspector(rs.getInt("idInspector"));
                pr1.setInspector(inspector);
                
                Zona zona=new Zona();
                zona.setIdZona(rs.getInt("idZona"));
                pr1.setZona(zona);
                
                Estado estado=new Estado();
                estado.setIdEstado(rs.getInt("idEstado"));
                pr1.setEstado(estado);
                
                pr1.setObservaciones(rs.getString("observaciones"));
                pr1.setDisponible(rs.getBoolean("disponible"));
                propiedades.add(pr1);
                
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedadesXDueño "+ex.getMessage());

        }
        return propiedades;
    }
      
      public List<Propiedad> listarPropiedadesXDueñoyDisponibles() {
        String sql = "SELECT idPropiedad, direccion, altura, superficieTotal, precioTasado, antiguedad, observaciones, disponible FROM propiedad p1 JOIN propietario p2 on (p1.idPropietario = p2.idPropietario) WHERE activo = 1";
        ArrayList<Propiedad> propiedades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Propiedad pr1 = new Propiedad();
                pr1.getPropietario().getIdPropietario();
                pr1.setIdPropiedad(rs.getInt("idPropiedad"));
                pr1.setDireccion(rs.getString("direccion"));
                pr1.setAltura(rs.getInt("altura"));
                pr1.setSuperficieTotal(rs.getInt("superficieTotal"));
                pr1.setPrecioTasado(rs.getDouble("precioTasado"));
                pr1.setAntiguedad(rs.getInt("antiguedad"));
                pr1.setObservaciones(rs.getString("observaciones"));
                pr1.setDisponible(rs.getBoolean("disponible"));
                propiedades.add(pr1);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedadesXDueñoyDisponibles "+ex.getMessage());

        }
        return propiedades;
    }
    
}
