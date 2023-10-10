
package persistencia;

import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ControlAcceso {
    
    private Usuario usuario;    
    private Connection con = null;
    
    //Declaro constructor

    public ControlAcceso() {
        con = Conexion.getConexion();
    } 
    
    public boolean iniciarSesion(String email, String password) {
        // Simulación de autenticación en la base de datos
        String consulta = "SELECT nombre, nivelAcceso FROM usuario WHERE email = ? AND password = ?";
        try {
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet rS = statement.executeQuery();

            if (rS.next()) {
                int idUsuario = rS.getInt("idUsuario");
                String nombre = rS.getString("nombre");
                boolean activo = rS.getBoolean("activo");
                int nivelAcceso = rS.getInt("nivelAcceso");

                if (activo) {
                    return new Usuario(idUsuario, nombre, email, password, activo, nivelAcceso);
                } else {
                    System.out.println("El usuario no está activo. No se puede iniciar sesión.");
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al autenticar al usuario.");
        }
        return false;
    }
    
    public boolean haIniciadoSesion() {
        return usuario != null;
    }
    
    public boolean accesoAdministrativa() {
        if (haIniciadoSesion()) {
            return usuario.getNivelAcceso() <= 10;
        }
        return false;
    }
    
    public boolean accesoNormal() {
        if (haIniciadoSesion()) {
            return usuario.getNivelAcceso() <= 20;
        }
        return false;
    }
    
    public void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al cerrar la conexión a la base de datos.");
        }
    }
    
    
    
    
    
    
    
    
    
}
