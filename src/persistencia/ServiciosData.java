package persistencia;

import entidades.Servicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ServiciosData {

    //Declaro variable
    private Connection con = null;

    //Declaro constructor
    public ServiciosData() {
        con = Conexion.getConexion();
    }

    //Guardo Inspector de forma individual
    public void guardarServicios(Servicios servicios) {
        //Consulta slq 
        String sql = "INSERT INTO servicios (agua_corriente, gas_natural, luz, cable, internet, calefaccion, amoblado, activo) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, servicios.isAgua_corriente());
            ps.setBoolean(2, servicios.isGas_natural());
            ps.setBoolean(3, servicios.isLuz());
            ps.setBoolean(4, servicios.isCable());
            ps.setBoolean(5, servicios.isInternet());
            ps.setBoolean(6, servicios.isCalefaccion());
            ps.setBoolean(7, servicios.isAmoblado());
            ps.setBoolean(8, servicios.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                servicios.setIdServicios(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Servicios guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Servicios");

        }

    }

    //Modifico Inspector de forma individual
    public void modificarInspector(Servicios servicios) {
        //Sentencia SQL
        String sql = "UPDATE servicios SET agua_corriente = ?, gas_natural = ?, luz = ?, cable = ?, internet = ?, calefaccion = ?, amoblado = ?, activo = ? WHERE idServicios = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, servicios.isAgua_corriente());
            ps.setBoolean(2, servicios.isGas_natural());
            ps.setBoolean(3, servicios.isLuz());
            ps.setBoolean(4, servicios.isCable());
            ps.setBoolean(5, servicios.isInternet());
            ps.setBoolean(6, servicios.isCalefaccion());
            ps.setBoolean(7, servicios.isAmoblado());
            ps.setBoolean(8, servicios.isActivo());
            ps.setInt(9, servicios.getIdServicios());
            int exito = ps.executeUpdate();

            if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Servicios modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Servicios");

        }

    }

    //Elimino de forma logica Inspector
    public void eliminarMateria(int idServicios) {
        //borrado logico
        String sql = "UPDATE servicios SET activo=0 WHERE idServicios= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idServicios);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Servicios eliminado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Servicos");
        }

    }

}//fin
