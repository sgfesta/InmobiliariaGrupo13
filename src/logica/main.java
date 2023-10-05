
package logica;

import entidades.Estado;
import entidades.Garante;
import entidades.Inquilino;
import entidades.Inspector;
import entidades.Propietario;
import persistencia.EstadoData;
import persistencia.GaranteData;
import persistencia.InquilinoData;
import persistencia.InspectorData;
import persistencia.PropietarioData;

public class main {


    public static void main(String[] args) {
//        Inspector inspec = new Inspector("D-51657", "Jose", "Ramirez", 638, 156784576, "Casita 123", true);
//        InspectorData ins = new InspectorData();
//        ins.guardarInspector(inspec);
        
//        Inquilino i1 = new Inquilino("Pedro", "Perez", 111, 1654, "Fabrica", true);
//        InquilinoData In = new InquilinoData();
//        In.guardarInquilino(i1);
    
    
//    Garante garante = new Garante("Luis", "Medina", 987, "No tiene casa", 168496874, true);
//    GaranteData g1 = new GaranteData();
//    g1.guardarGarante(garante);

      Estado estado = new Estado("Bueno", true);
      EstadoData e1 = new EstadoData();
      e1.darAlta(estado);
      
      Propietario propietario = new Propietario("Luciana", "Juarez", 712, 2348458, "Su casa", true);
      PropietarioData p1 = new PropietarioData();
      p1.guardarPropietario(propietario);
}
}