package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder.MiembroBuilder;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IMiembroCrud;

public class Miembro implements IMiembroCrud {
    private String nombre;
    private int cedula;
    public Miembro(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public static MiembroBuilder builder() {return new MiembroBuilder();}
    public int getCedula() {return cedula;}
    public String getNombre() {return nombre;}
    @Override
    public boolean crearMiembro(String nombre, int cedula) {
        return false;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    @Override
    public boolean eliminarMiembro(int cedula) {
        return false;
    }
    @Override
    public boolean actualizarMiembro(String nombre, String cedulaActual, String cedulaNueva) {
        return false;
    }
    @Override
    public String obtenerDatosMiembro(String cedula) {
        return "";
    }
    @Override
    public String toString() {
        return "Miembro{" +
                "Nombre='" + nombre + '\'' +
                ", Cédula=" + cedula +
                '}';
    }
}