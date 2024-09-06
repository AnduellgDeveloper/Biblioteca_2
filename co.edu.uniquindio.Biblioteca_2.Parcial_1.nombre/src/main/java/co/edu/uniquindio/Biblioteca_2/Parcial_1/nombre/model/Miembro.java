package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

public class Miembro {
    private String nombre;
    private int cedula;
    public Miembro(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}