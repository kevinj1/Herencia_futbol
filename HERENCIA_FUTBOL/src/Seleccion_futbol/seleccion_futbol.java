
package Seleccion_futbol;


public class seleccion_futbol {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public seleccion_futbol(String id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
    public void viajar(){
        System.out.println("Viajar");
    }
            
}
