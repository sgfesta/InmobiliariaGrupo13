
package logica;

import entidades.Contrato;
import entidades.Estado;
import entidades.Garante;
import entidades.Inquilino;
import entidades.Inspector;
import entidades.Propiedad;
import entidades.Propietario;
import entidades.Servicios;
import entidades.TipoPropiedad;
import entidades.Vendedor;
import entidades.Zona;
import java.time.LocalDate;
import java.time.Month;
import persistencia.ContratoData;
import persistencia.EstadoData;
import persistencia.GaranteData;
import persistencia.InquilinoData;
import persistencia.InspectorData;
import persistencia.PropiedadData;
import persistencia.PropietarioData;
import persistencia.ServiciosData;
import persistencia.TipoPropiedadData;
import persistencia.VendedorData;
import persistencia.ZonaData;

public class main {


    public static void main(String[] args) {
        //Inspector inspec = new Inspector(1,"D-51657", "Jose", "Ramirez", 638, 156784576, "Casita 123", true);
//        InspectorData ins = new InspectorData();
//        ins.guardarInspector(inspec);
//        
        Inquilino i1 = new Inquilino(1,"Pedro", "Perez", "111", "1654", "Fabrica", true);
//        InquilinoData In = new InquilinoData();
//        In.guardarInquilino(i1);
//    
//    
    Garante garante = new Garante(1,"Luis", "Medina", 987, "No tiene casa", 168496874, true);
//    GaranteData g1 = new GaranteData();
//    g1.guardarGarante(garante);
//
      Vendedor vendedor = new Vendedor(1,"Fulanito", "Cosmo", "64841", "26987546", true);
      
//      VendedorData vd = new VendedorData();
//      vd.guardarVendedor(vendedor);
//
      Estado estado = new Estado(1,"Bueno", true);
//      EstadoData e1 = new EstadoData();
//      e1.darAlta(estado);
//      
      Zona zona = new Zona(1,"Entre Rios", "Parana", "Puerto", true);
//      ZonaData zd = new ZonaData();
//      zd.guardarZona(zona);
//      
      Servicios servi = new Servicios(1,true, true, true, true, true, true, true, true);
//      ServiciosData sd = new ServiciosData();
//      sd.guardarServicios(servi);
//      
      TipoPropiedad tipo = new TipoPropiedad(1,"Casa", true);
//      TipoPropiedadData tpd = new TipoPropiedadData();
//      tpd.guardarTipoPropiedad(tipo);
      
      Propietario propietario = new Propietario(1,"Luciana", "Juarez", "712", "2348458", "Su casa", true);
//      PropietarioData p1 = new PropietarioData();
//      p1.guardarPropietario(propietario);
      
//      Propiedad propi = new Propiedad(1, propietario, "Belgrano", 23, tipo, 1800, 150000, 0, inspec, zona, estado, "Departamento nuevo, a estrenar, bla bla bla", true, true);
//      PropiedadData pd = new PropiedadData();
//      pd.agregarPropiedad(propi);
      
//      Contrato contract = new Contrato(propietario, propi, i1, garante, vendedor, LocalDate.of(2018, Month.MARCH, 05), LocalDate.of(2026, Month.MARCH, 05), LocalDate.of(2018, Month.MARCH, 02), true, true);
      ContratoData cd = new ContratoData();
//      cd.guardarContrato(contract);
}
}