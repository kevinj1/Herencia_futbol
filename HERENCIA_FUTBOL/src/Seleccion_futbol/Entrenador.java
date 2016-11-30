
package Seleccion_futbol;


public class Entrenador extends seleccion_futbol{
    protected String Id_federacion;

    public Entrenador(String Id_federacion, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.Id_federacion = Id_federacion;
    }

    public String getId_federacion() {
        return Id_federacion;
    }

    public void setId_federacion(String Id_federacion) {
        this.Id_federacion = Id_federacion;
    }
    
    public void dirigir_partido(){
        System.out.println("Dirigir partido");
    }
    public void dirigir_entrenamiento(){
        System.out.println("Dirigir entrenamiento");
    }
}
