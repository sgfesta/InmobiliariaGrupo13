
package persistencia;

import entidades.Contrato;
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
        String sql = "INSERT INTO Contrato(idPropiedad, idPropietario, idInquilino, idGarante, idVendedor, fechaInicio, fechaFin, fechaContrato, vigente ,activo)" + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, contrato.getPropiedad().getIdPropiedad());
            ps.setInt(2,  contrato.getPropietario().getIdPropietario());
            ps.setInt(3,  contrato.getInquilino().getIdInquilino());
            ps.setInt(4,  contrato.getGarante().getIdGarante());
            ps.setInt(5,  contrato.getVendedor().getIdVendedor());
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
        //Sentencia Sql
        String sql = "UPDATE Contrato SET idPropiedad = ?, idPropietario = ?, idInquilino = ?, idGarante = ?, idVendedor = ?, fechaInicio = ?, fechaFin = ?, fechaContrato = ?, vigente = ?, activo = ? WHERE idContrato = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, contrato.getPropiedad().getIdPropiedad());
            ps.setInt(2,  contrato.getPropietario().getIdPropietario());
            ps.setInt(3,  contrato.getInquilino().getIdInquilino());
            ps.setInt(4,  contrato.getGarante().getIdGarante());
            ps.setInt(5,  contrato.getVendedor().getIdVendedor());
            ps.setDate(6, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(7, Date.valueOf(contrato.getFechaFin()));
            ps.setDate(8, Date.valueOf(contrato.getFechaContrato()));
            ps.setBoolean(9, contrato.isVigente());
            ps.setBoolean(10, contrato.isActivo());
            ps.executeUpdate();

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contrato modificado con Exito");
            }
             //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar la tabla Contrato "+ex);
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
        String sql = "SELECT * FROM contrato WHERE activo = 1";
        ArrayList<Contrato> contratosVigentes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Contrato c1 = new Contrato();
                c1.setIdContrato(rs.getInt("idContrato"));
                c1.setFechaContrato(rs.getDate("fechaContrato").toLocalDate());
                c1.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                c1.setFechaInicio(rs.getDate("fechaFin").toLocalDate());
                c1.setActivo(true);
           
                contratosVigentes.add(c1);
            }
             //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad en listarPropiedades "+ex.getMessage());

        }
        return contratosVigentes;
    }
    
    
}//fin
