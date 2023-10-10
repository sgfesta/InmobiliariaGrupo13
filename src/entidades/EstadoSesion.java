//En esta clase guardo el usuario Actual Logueado
//Para poder usarlo durante todo el funcionamiento del sistema
package entidades;

public class EstadoSesion {

    //Declaro variables
    private static Usuario usuarioActual;

    //get and setter
    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(Usuario usuario) {
        usuarioActual = usuario;
    }

    //Metodos
    public static boolean isUsuarioAutenticado() {
        return usuarioActual != null;
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

}
