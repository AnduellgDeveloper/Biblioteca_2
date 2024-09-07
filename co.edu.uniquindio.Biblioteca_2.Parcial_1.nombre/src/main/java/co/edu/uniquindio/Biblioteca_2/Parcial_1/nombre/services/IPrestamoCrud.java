package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;


public interface IPrestamoCrud {
    boolean crearPrestamo(int idPrestamo, Miembro miembro, Libro libro);
    boolean verPrestamo (int idPrestamo);
    boolean actualizarPrestamo(int idPrestamo, Libro nuevoLibro);
    boolean eliminarPrestamo(int idPrestamo);
    }

