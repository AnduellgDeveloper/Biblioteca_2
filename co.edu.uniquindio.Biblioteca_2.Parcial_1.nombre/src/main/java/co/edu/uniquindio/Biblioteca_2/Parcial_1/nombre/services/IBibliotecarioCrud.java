package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;
public interface IBibliotecarioCrud {
    boolean crearBibliotecario (String nombre, int idEmpleado);
    boolean verBibliotecario(String nombre);
    boolean actualizarBibliotecario(int idEmpleadoActual, int idEmpleadoNueva);
    boolean eliminarBibliotecario(int idEmpleado);

}
