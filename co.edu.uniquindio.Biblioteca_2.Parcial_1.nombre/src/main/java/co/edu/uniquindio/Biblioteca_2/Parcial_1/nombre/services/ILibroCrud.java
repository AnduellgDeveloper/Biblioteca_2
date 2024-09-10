package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;

import java.util.List;
public interface ILibroCrud {
    boolean crearLibro(String titulo, String autor, String genero, int isbn);
    String verLibro (String titulo, String autor,String genero,  int isbn);
    boolean actualizarLibro(int isbn, String nuevoTitulo, String nuevoAutor);
    boolean eliminarLibro(int isbn);
    String buscarLibroIsbn(int isbn);
    String buscarLibroTitulo(String Titulo);
    String buscarLibroAutor(String Autor);
    List<String> mostrarGenerosLiterarios();

}