/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Chico
 */
public class Conexion {
  
private static Conexion conexion=null;
        
        private Conexion(){
    // CARGAR DRIVER DE CONEXION
        try {
        Class.forName("org.mariadb.jdbc.Driver");
    
         }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Debe agregar los drivers al proyecto");
        
         }     
}
public static Connection getConexion(){
    Connection con = null;
    if(conexion  == null){
        conexion = new Conexion();
    }
    try{
    //CONEXION A LA BASE DE DATOS
         con = DriverManager.getConnection("jdbc:mariadb://localhost/inmobiliariagrupo13","root",""); //cambie el nombre de la tabla a la que creamos para este grupo
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos"+ex.getMessage());    
      
}
    return con;
}
}

