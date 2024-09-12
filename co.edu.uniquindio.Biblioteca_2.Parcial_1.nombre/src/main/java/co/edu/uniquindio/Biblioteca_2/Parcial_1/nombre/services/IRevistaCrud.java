package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;
public interface IRevistaCrud {
    boolean crearRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion);
    String verRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion);
    boolean actualizarRevista(int idRevista, String nuevaEditorial, int nuevoNumeroPaginas);
    boolean eliminarRevista(int idRevista);

}
