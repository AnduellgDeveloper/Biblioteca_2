package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
public class Libro  {
    private String titulo;
    private String autor;
    private String genero;
    private int isbn;
    private String estado;

    public Libro(String titulo, String autor, String genero, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero= genero;
        this.isbn = isbn;
        this.estado = "disponible";
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    @Override
    public String toString() {
        return String.format(
                "Título: %s%n" +
                        "Autor: %s%n" +
                        "Género: %s%n" +
                        "ISBN: %d%n",
                titulo, autor, genero, isbn
        );
    }
}
