
package Seleccion_futbol;


public class Masajista extends seleccion_futbol{
    protected String Titulacion;
    protected String Anio_experiencia;

    public Masajista(String Titulacion, String Anio_experiencia, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.Titulacion = Titulacion;
        this.Anio_experiencia = Anio_experiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public String getAnio_experiencia() {
        return Anio_experiencia;
    }

    public void setAnio_experiencia(String Anio_experiencia) {
        this.Anio_experiencia = Anio_experiencia;
    }
    public void dar_masaje(){
        System.out.println("Dar masaje");
    }
}
