package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;


import java.util.ArrayList;
import java.util.List;

public class Libro extends ItemBiblioteca {
    private String autor;
    private int isbn;
    private String estado;
    private List<Libro> listaLibros = new ArrayList<>();

    public Libro(String titulo, String autor, int isbn) {
        super(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.estado = "disponible";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public void mostrarItem() {

    }

    @Override
    public void mostrarArchivo() {

    }
}
