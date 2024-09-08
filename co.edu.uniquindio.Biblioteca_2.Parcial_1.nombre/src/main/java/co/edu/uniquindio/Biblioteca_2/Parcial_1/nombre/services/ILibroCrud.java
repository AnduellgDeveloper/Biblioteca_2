package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;
public interface ILibroCrud {
    boolean crearLibro(String titulo, String autor, int isbn);
    String verLibro (String titulo, String autor, int isbn);
    boolean actualizarLibro(int isbn, String nuevoTitulo, String nuevoAutor);
    boolean eliminarLibro(int isbn);
    String buscarLibroIsbn(int isbn);
}