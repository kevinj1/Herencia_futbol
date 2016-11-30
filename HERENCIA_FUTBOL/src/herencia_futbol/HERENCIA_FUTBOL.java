
package herencia_futbol;

import Seleccion_futbol.Futbolista;


public class HERENCIA_FUTBOL {

   
    public static void main(String[] args) {
        
       Futbolista objeto = new Futbolista(20, "centrocampista", "1105", "Jose", "Martinez", 20);
       
       
        System.out.println(objeto.getNombre()+" "+objeto.getApellido()+" "+objeto.getEdad() );
        
        objeto.entrenar();
        objeto.jugar_partido();
        objeto.concentrarse();
        objeto.viajar();
        
    }
    
}
