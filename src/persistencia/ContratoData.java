
package persistencia;

import entidades.Contrato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
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
        String sql = "INSERT INTO Contrato(idPropiedad, idPropietario, idInquilino, idGarante, idVendedor, fechaInicio, fechaFin, fechaContrato, activo)" + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            ps.setBoolean(9, contrato.isActivo());
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
        String sql = "UPDATE Contrato SET idPropiedad = ?, idPropietario = ?, idInquilino = ?, idGarante = ?, idVendedor = ?, fechaInicio = ?, fechaFin = ?, fechaContrato = ?, activo = ? WHERE idContrato = ?";
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
            ps.setBoolean(9, contrato.isActivo());
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
    
    
    
    
}//fin
