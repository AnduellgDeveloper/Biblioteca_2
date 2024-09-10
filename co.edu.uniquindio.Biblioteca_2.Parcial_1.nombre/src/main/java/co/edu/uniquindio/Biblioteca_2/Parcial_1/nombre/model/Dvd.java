package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

public class Dvd {
    private String nombre;
    private String director;

    public Dvd(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}
}
