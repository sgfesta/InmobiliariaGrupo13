
package persistencia;

import entidades.Contrato;
import entidades.Garante;
import entidades.Inquilino;
import entidades.Propiedad;
import entidades.Propietario;
import entidades.Usuario;
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


public class ContratoData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ContratoData() {
        con = Conexion.getConexion();
    } 
    
    //Guardo Contrato de manera individual
    public void guardarContrato(Contrato contrato){
        //Sentencia Sql
        String sql = "UPDATE Contrato SET idPropiedad =?, idPropietario=?, idInquilino=?, idGarante=?, idUsuario=?, fechaInicio=?, fechaFin=?, fechaContrato=?, vigente=?, activo=? VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, contrato.getPropiedad().getIdPropiedad());
            ps.setInt(2,  contrato.getPropietario().getIdPropietario());
            ps.setInt(3,  contrato.getInquilino().getIdInquilino());
            ps.setInt(4,  contrato.getGarante().getIdGarante());
            ps.setInt(5,  contrato.getUsuario().getIdUsuario());
            ps.setDate(6, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(7, Date.valueOf(contrato.getFechaFin()));
            ps.setDate(8, Date.valueOf(contrato.getFechaContrato()));
            ps.setBoolean(9, contrato.isVigente());
            ps.setBoolean(10, contrato.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                contrato.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato guardado correctamente");
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El Contrato ya existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato");
        }
    }    
    
    //Modifico Contrato de manera individual
    public void modificarContrato(Contrato contrato) {
    // Sentencia SQL
    String sql = "UPDATE Contrato SET idPropiedad =?, idPropietario=?, idInquilino=?, idGarante=?, idUsuario=?, fechaInicio=?, fechaFin=?, fechaContrato=?, vigente=?, activo=? WHERE idContrato =?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, contrato.getPropiedad().getIdPropiedad());
        ps.setInt(2, contrato.getPropietario().getIdPropietario());
        ps.setInt(3, contrato.getInquilino().getIdInquilino());
        ps.setInt(4, contrato.getGarante().getIdGarante());
        ps.setInt(5, contrato.getUsuario().getIdUsuario());
        ps.setDate(6, Date.valueOf(contrato.getFechaInicio()));
        ps.setDate(7, Date.valueOf(contrato.getFechaFin()));
        ps.setDate(8, Date.valueOf(contrato.getFechaContrato()));
        ps.setBoolean(9, contrato.isVigente());
        ps.setBoolean(10, contrato.isActivo());
        ps.setInt(11, contrato.getIdContrato()); // Asegúrate de configurar este parámetro correctamente
        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Contrato actualizado correctamente");
        // Cierra la conexión
        ps.close();
    } catch (SQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "El Contrato ya existe");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato");
    }
}
    
    //Borrado Logico de Contrato
    public void eliminarContrato(int idContrato) {
        String sql = "UPDATE contrato SET activo = 0 WHERE idContrato = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contrato eliminado");
            }
             //Cierro la Conexion
            ps.close();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Contrato");
            
        }

    }
    
     public void renovarContrato(Contrato contrato){
        String sql = "UPDATE contrato,propiedad p SET fechaInicio = ?, fechaFin = ?, p.precioTasado = ? WHERE idContrato = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFin()));
            ps.setDouble(3, contrato.getPropiedad().getPrecioTasado());
            ps.setInt(4, contrato.getIdContrato());
            int exito = ps.executeUpdate();
            if(exito == 1){
                //Mensaje renovacion de contrato 
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la renovacion de contrato "+ex.getMessage());
        }
    }
    
     public List<Contrato> listarContratosVigentes() {
    String sql = "SELECT * FROM contrato WHERE vigente=1";
    ArrayList<Contrato> contratosVigentes = new ArrayList<>();
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contrato c1 = new Contrato();
            c1.setIdContrato(rs.getInt("idContrato"));
            int idInquilino = rs.getInt("idInquilino");
            int idPropietario = rs.getInt("idPropietario");
            int idPropiedad = rs.getInt("idPropiedad");
            int idUsuario = rs.getInt("idUsuario");
            
            
            InquilinoData id= new InquilinoData();
            Inquilino inquilino = id.buscarInquilino(idInquilino);
            c1.setInquilino(inquilino);
            
            PropietarioData pd = new PropietarioData();
            Propietario propietario = pd.buscarPropietario(idPropietario);
            c1.setPropietario(propietario);
            
            PropiedadData pdd= new PropiedadData();
            Propiedad propiedad = pdd.buscarPropiedad(idPropiedad);
            c1.setPropiedad(propiedad);
            
            GaranteData gd= new GaranteData();
            Garante garante= gd.buscarGarante(idPropiedad);
            c1.setGarante(garante);
            
            UsuarioData ud= new UsuarioData();
            Usuario usuario= ud.buscarUsuario(idUsuario);
            c1.setUsuario(usuario);
            
            c1.setFechaContrato(rs.getDate("fechaContrato").toLocalDate());
            c1.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            c1.setFechaFin(rs.getDate("fechaFin").toLocalDate());  
            c1.setActivo(rs.getBoolean("activo"));
            c1.setVigente(rs.getBoolean("vigente"));
            contratosVigentes.add(c1);
        }
         //Cierro la Conexion
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedades "+ex.getMessage());
    }
    return contratosVigentes;
}

 public Contrato buscarContrato(int idContrato) {
        String sql = "SELECT * FROM contrato WHERE idContrato = ?";
        Contrato contrato = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            contrato = new Contrato();
            contrato.setIdContrato(rs.getInt("idContrato"));
            int idInquilino = rs.getInt("idInquilino");
            int idPropietario = rs.getInt("idPropietario");
            int idPropiedad = rs.getInt("idPropiedad");
            int idUsuario = rs.getInt("idUsuario");
            
            InquilinoData id= new InquilinoData();
            Inquilino inquilino = id.buscarInquilino(idInquilino);
            contrato.setInquilino(inquilino);
            
            PropietarioData pd = new PropietarioData();
            Propietario propietario = pd.buscarPropietario(idPropietario);
            contrato.setPropietario(propietario);
            
            PropiedadData pdd= new PropiedadData();
            Propiedad propiedad = pdd.buscarPropiedad(idPropiedad);
            contrato.setPropiedad(propiedad);
            
            GaranteData gd= new GaranteData();
            Garante garante= gd.buscarGarante(idPropiedad);
            contrato.setGarante(garante);
            
            UsuarioData ud= new UsuarioData();
            Usuario usuario= ud.buscarUsuario(idUsuario);
            contrato.setUsuario(usuario);
            
            contrato.setFechaContrato(rs.getDate("fechaContrato").toLocalDate());
            contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());  
            contrato.setActivo(rs.getBoolean("activo"));
            contrato.setVigente(rs.getBoolean("vigente"));
            

            } else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese ID o Estado");
            }

            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
        }
        return contrato;
}

  public List<Contrato> listarContratos() {
    String sql = "SELECT * FROM contrato ";
    ArrayList<Contrato> contratosVigentes = new ArrayList<>();
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contrato c1 = new Contrato();
            c1.setIdContrato(rs.getInt("idContrato"));
            int idInquilino = rs.getInt("idInquilino");
            int idPropietario = rs.getInt("idPropietario");
            int idPropiedad = rs.getInt("idPropiedad");
            int idUsuario = rs.getInt("idUsuario");
            
            
            InquilinoData id= new InquilinoData();
            Inquilino inquilino = id.buscarInquilino(idInquilino);
            c1.setInquilino(inquilino);
            
            PropietarioData pd = new PropietarioData();
            Propietario propietario = pd.buscarPropietario(idPropietario);
            c1.setPropietario(propietario);
            
            PropiedadData pdd= new PropiedadData();
            Propiedad propiedad = pdd.buscarPropiedad(idPropiedad);
            c1.setPropiedad(propiedad);
            
            GaranteData gd= new GaranteData();
            Garante garante= gd.buscarGarante(idPropiedad);
            c1.setGarante(garante);
            
            UsuarioData ud= new UsuarioData();
            Usuario usuario= ud.buscarUsuario(idUsuario);
            c1.setUsuario(usuario);
            
            c1.setFechaContrato(rs.getDate("fechaContrato").toLocalDate());
            c1.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            c1.setFechaFin(rs.getDate("fechaFin").toLocalDate());  
            c1.setActivo(rs.getBoolean("activo"));
            c1.setVigente(rs.getBoolean("vigente"));
            contratosVigentes.add(c1);
        }
         //Cierro la Conexion
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedades "+ex.getMessage());
    }
    return contratosVigentes;
}//fin
}