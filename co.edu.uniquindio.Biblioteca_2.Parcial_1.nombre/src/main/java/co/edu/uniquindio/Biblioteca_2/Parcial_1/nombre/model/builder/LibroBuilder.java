package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;

public class LibroBuilder {
    protected String titulo;
    protected String autor;
    protected int isbn;
    protected String estado = "disponible";  //Valor por defecto

    public Libro build(){
        return new Libro(titulo, autor, isbn);
    }
    public LibroBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    public LibroBuilder autor(String autor) {
        this.autor = autor;
        return this;
    }
    public LibroBuilder isbn(int isbn) {
        this.isbn = isbn;
        return this;
    }
    public LibroBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }
}
