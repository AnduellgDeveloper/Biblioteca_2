package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

public class Revista {
    private String marca;
    private int numeroEdicion;

    public Revista(String marca, int numeroEdicion) {
        this.marca = marca;
        this.numeroEdicion = numeroEdicion;
    }

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public int getNumeroEdicion() {return numeroEdicion;}
    public void setNumeroEdicion(int numeroEdicion) {this.numeroEdicion = numeroEdicion;}
}
