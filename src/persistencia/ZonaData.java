
package persistencia;

import entidades.Zona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ZonaData {
    
    //Declaro variable
    
    private Connection con = null;
    
    //Declaro constructor

    public ZonaData() {
        con = Conexion.getConexion();
    }   
    
      public void guardarZona(Zona zona) {

        String sql = "INSERT INTO zona (provincia, ciudad, barrio) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, zona.getProvincia());
            ps.setString(2,zona.getCiudad());
            ps.setString(3, zona.getBarrio());
            
            int exito = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                zona.setIdZona(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Zona guardada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
           

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Zona");
           
        }

    }

    public void modificarZona(Zona zona) {

        String sql = "UPDATE zona SET provincia=?, ciudad=?, barrio=? WHERE idZona=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, zona.getProvincia());
            ps.setString(2, zona.getCiudad());
            ps.setString(3, zona.getBarrio());
           
            int exito = ps.executeUpdate();

           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Zona modificada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Zona");
            
        }

    }

    public void eliminarZona(int idZona) {
        //borrado logico
        String sql = "UPDATE zona SET activa=0 WHERE idZona= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idZona);

            int exito = ps.executeUpdate();

           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Zona eliminada exitosamente");
            }
            //Cierro la Conexion
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Zona");
        }

    }
    
    
    public Zona buscarZona(int idZona) {

        String sql = "SELECT idZona, provincia, ciudad, barrio FROM zona WHERE idZona = ?";

        Zona zona = null;
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idZona);
            
          ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            zona = new Zona();
                zona.setIdZona(rs.getInt("idZona"));
                zona.setProvincia(rs.getString("provincia"));
                zona.setCiudad(rs.getString("ciudad"));
                zona.setBarrio(rs.getString("barrio"));
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla zona ");
        }
        return zona;
    }

     public List<Zona> listarZona() {
        String sql = "SELECT idZona, provincia, ciudad, barrio FROM zona";
        ArrayList<Zona> Zonas = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Zona zona = new Zona();
                zona.setIdZona(rs.getInt("idZona"));
                zona.setProvincia(rs.getString("provincia"));
                zona.setCiudad(rs.getString("ciudad"));
                zona.setBarrio(rs.getString("barrio"));
                Zonas.add(zona);
            }
            //Cierro la Conexion
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia ");
        }
        return Zonas;
    }
    
    
}
