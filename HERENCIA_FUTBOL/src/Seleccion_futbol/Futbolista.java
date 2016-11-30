
package Seleccion_futbol;


public class Futbolista extends seleccion_futbol{

     protected int Dorsal;
     protected String Demarcacion;

    public Futbolista(int Dorsal, String Demarcacion, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.Dorsal = Dorsal;
        this.Demarcacion = Demarcacion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String Demarcacion) {
        this.Demarcacion = Demarcacion;
    }

    
    
    
    
    public void jugar_partido(){
        System.out.println("Jugar partido");
    }
    public void entrenar(){
        System.out.println("Entrenar");
    }
    
}
