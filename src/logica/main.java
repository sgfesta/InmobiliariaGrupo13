
package logica;

import entidades.Inquilino;
import persistencia.InquilinoData;


public class main {


    public static void main(String[] args) {
        Inquilino i1 = new Inquilino("Pedro", "Perez", 111, 1654, "Fabrica", true);
        InquilinoData In = new InquilinoData();
        In.guardarInquilino(i1);
        
        
    }
    
}
