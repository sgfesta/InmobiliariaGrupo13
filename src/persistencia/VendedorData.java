
package persistencia;

import entidades.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class VendedorData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public VendedorData() {
        con = Conexion.getConexion();
    }
    
    //Guardo vendedor de forma individual
    public void guardarVendedor(Vendedor vendedor) {
        //Consulta slq 
        String sql = "INSERT INTO vendedor (apellido, nombre, dni, telefono, activo) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, vendedor.getApellido());
            ps.setString(2, vendedor.getNombre());
            ps.setInt(3, vendedor.getDni());
            ps.setInt(4, vendedor.getTelefono());            
            ps.setBoolean(5, vendedor.isActivo());
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                vendedor.setIdVendedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Vendedor guardado exitosamente");
            }
            //Cierro la Conexion
            ps.close();          

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor");
           
        }

    }

    //Modifico Vendedor de forma individual
    public void modificarVendedor(Vendedor vendedor) {
        //Sentencia SQL
        String sql = "UPDATE vendedor SET apellido = ?, nombre = ?, dni = ?, telefono = ? activa = ? WHERE idVendedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vendedor.getApellido());
            ps.setString(2, vendedor.getNombre());
            ps.setInt(3, vendedor.getDni());
            ps.setInt(4, vendedor.getTelefono());            
            ps.setBoolean(5, vendedor.isActivo());
            ps.setInt(6, vendedor.getIdVendedor());
            int exito = ps.executeUpdate();

           if (exito == 1) {//para avisar de que funciono correctamente.
                JOptionPane.showMessageDialog(null, "Vendedor modificado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor");
            
        }

    }
    
    //Elimino de forma logica Vendedor
    public void eliminarVendedor(int idVendedor) {
        //borrado logico
        String sql = "UPDATE vendedor SET activo=0 WHERE idVendedor= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVendedor);
            int exito = ps.executeUpdate();

           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vendedor eliminado exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Vendedor");
        }

    }
}
