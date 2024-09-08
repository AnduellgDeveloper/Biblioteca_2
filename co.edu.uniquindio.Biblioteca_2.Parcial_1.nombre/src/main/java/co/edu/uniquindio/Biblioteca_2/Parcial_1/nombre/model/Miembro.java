package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder.MiembroBuilder;

public class Miembro  {
    private String nombre;
    private int cedula;
    public Miembro(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public static MiembroBuilder builder() {return new MiembroBuilder();}
    public int getCedula() {return cedula;}
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "Nombre='" + nombre + '\'' +
                ", Cédula=" + cedula +
                '}';
    }
}