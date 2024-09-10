package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

public class Comic extends Libro{
    private String ilustrador;
    private int numeroEdicion;

    public Comic(String titulo, String autor, String ilustrador, String genero, int numeroEdicion, int isbn) {
        super(titulo, autor, genero, isbn);
        this.ilustrador = ilustrador;
        this.numeroEdicion = numeroEdicion;
    }
    public String getIlustrador() {return ilustrador;}
    public void setIlustrador(String ilustrador) {this.ilustrador = ilustrador;}
    public int getNumeroEdicion() {return numeroEdicion;}
    public void setNumeroEdicion(int numeroEdicion) {this.numeroEdicion = numeroEdicion;}
}
