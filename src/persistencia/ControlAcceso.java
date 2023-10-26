package persistencia;

import entidades.Usuario;
import igu.MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

public class ControlAcceso {

    // Declaro Variables
    private Usuario usuarioActual = null;
    private Connection con = null;

    // Variable para almacenar la única instancia de ControlAcceso
    private static ControlAcceso instancia = null;
    // Variable del jLabel que vamos a cambiar en MenuPrincipal
    private JLabel jLUsuarioactual;
    private JLabel jLbarraAcesso;
    private MenuPrincipal menuPrincipal;

//    //Declaro Ocnstructor con Jlabel
    public ControlAcceso(JLabel jLUsuarioactual, JLabel jLbarraAcesso) {
        this.jLUsuarioactual = jLUsuarioactual;
        this.jLbarraAcesso = jLbarraAcesso;
        // this.menuPrincipal = menuPrincipal;
        con = Conexion.getConexion();
    }

    public static ControlAcceso getInstance(JLabel jLUsuarioactual, JLabel jLbarraAcesso) {
        if (instancia == null) {
            instancia = new ControlAcceso(jLUsuarioactual, jLbarraAcesso);
        }
        return instancia;
    }

    public Usuario iniciarSesion(String email, String password) {
        String consulta = "SELECT idUsuario, nombre, activo, nivelAcceso FROM usuario WHERE email = ? AND password = ?";
        try {
            //verifico que la conexion a la base de datos no este cerrada
            if (con == null || con.isClosed()) {
                con = Conexion.getConexion();
            }
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

                    Usuario usuario = new Usuario(idUsuario, nombre, email, password, activo, nivelAcceso);
                    usuarioActual = usuario;
                    notificarObservadora();
                    menusprincipales();
                    return usuario;
                } else {
                    notificarObservadora();
                    System.out.println("El usuario no está activo. No se puede iniciar sesión.");
                }
            } else {
                notificarObservadora();
                System.out.println("Credenciales incorrectas. No se puede iniciar sesión.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al autenticar al usuario.");
        }
        return null;
    }

    public boolean haIniciadoSesion() {
        return usuarioActual != null;
    }

    public void cerrarSesion() {
        usuarioActual = null;
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

    public void notificarObservadora() {

        if (jLUsuarioactual != null && usuarioActual != null) {
            menuPrincipal.actualizarJLabel(usuarioActual.getNombre(), String.valueOf(usuarioActual.getNivelAcceso()));

        } else {

            menuPrincipal.actualizarJLabel("Desconectado", "");
        }

    }

    public void setMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public void menusprincipales() {
        if (jLUsuarioactual != null && usuarioActual != null) {
            menuPrincipal.cargarmenu(usuarioActual.getNivelAcceso());
        } else {

            menuPrincipal.barraLateralOFF();
        }

    }
    public Usuario getUsuarioActual() {
    
        return usuarioActual;
    
    }

}
