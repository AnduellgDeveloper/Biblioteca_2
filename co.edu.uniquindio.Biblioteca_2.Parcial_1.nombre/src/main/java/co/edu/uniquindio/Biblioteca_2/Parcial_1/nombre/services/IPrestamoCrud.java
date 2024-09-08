package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;
import java.time.LocalDateTime;
public interface IPrestamoCrud {
    boolean crearPrestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion);
    Prestamo verPrestamo(int idPrestamo);
    boolean actualizarPrestamo(int idPrestamo, Libro nuevoLibro);
    boolean eliminarPrestamo(int idPrestamo);
}
