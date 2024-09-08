package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory.ModelFactory;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        gestionarPrestamos(modelFactory);
        gestionarLibros(modelFactory);
        gestionarMiembros(modelFactory);
    }

    private static void gestionarPrestamos(ModelFactory modelFactory) {
        crearPrestamo(modelFactory);
        verPrestamo(modelFactory);
        actualizarPrestamo(modelFactory);
        eliminarPrestamo(modelFactory);
    }

    private static void gestionarLibros(ModelFactory modelFactory) {
        crearLibro(modelFactory);
        verLibro(modelFactory);
        actualizarLibro(modelFactory);
        eliminarLibro(modelFactory);
    }

    private static void gestionarMiembros(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        verMiembro(modelFactory);
        actualizarMiembro(modelFactory);
        eliminarMiembro(modelFactory);
    }

    // Métodos para CRUD de préstamos
    private static void crearPrestamo(ModelFactory modelFactory) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 12345);
        Miembro miembro = new Miembro("Juan Pérez", 9876);
        LocalDateTime fechaPrestamo = LocalDateTime.now();
        LocalDateTime fechaDevolucion = null;
        boolean resultado = modelFactory.crearPrestamo(libro, miembro, "Activo", fechaPrestamo, fechaDevolucion);
        notificacion(resultado, "Prestamo creado");
    }

    private static void verPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1; // Asume que este es un ID válido
        Prestamo prestamo = modelFactory.verPrestamo(idPrestamo);
        if (prestamo != null) {
            System.out.println("Detalle del préstamo: " + prestamo);
        } else {
            System.out.println("No se encontró el préstamo con ID: " + idPrestamo);
        }
    }

    private static void actualizarPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1; // Asume que este es un ID válido
        Libro nuevoLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 6789);
        boolean resultado = modelFactory.actualizarPrestamo(idPrestamo, nuevoLibro);
        notificacion(resultado, "Prestamo actualizado");
    }

    private static void eliminarPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1; // Asume que este es un ID válido
        boolean resultado = modelFactory.eliminarPrestamo(idPrestamo);
        notificacion(resultado, "Prestamo eliminado");
    }

    // Métodos para CRUD de libros
    private static void crearLibro(ModelFactory modelFactory) {
        String titulo = "1984";
        String autor = "George Orwell";
        int isbn = 11223;
        boolean resultado = modelFactory.crearLibro(titulo, autor, isbn);
        notificacion(resultado, "Libro creado");
    }

    private static void verLibro(ModelFactory modelFactory) {
        String titulo = "1984";
        String autor = "George Orwell";
        int isbn = 11223;
        String libro = modelFactory.verLibro(titulo, autor, isbn);
        System.out.println("Detalle del libro: " + libro);
    }

    private static void actualizarLibro(ModelFactory modelFactory) {
        int isbn = 11223; // ISBN del libro a actualizar
        String nuevoTitulo = "Rebelión en la Granja";
        String nuevoAutor = "George Orwell";
        boolean resultado = modelFactory.actualizarLibro(isbn, nuevoTitulo, nuevoAutor);
        notificacion(resultado, "Libro actualizado");
    }

    private static void eliminarLibro(ModelFactory modelFactory) {
        int isbn = 11223; // ISBN del libro a eliminar
        boolean resultado = modelFactory.eliminarLibro(isbn);
        notificacion(resultado, "Libro eliminado");
    }

    // Métodos para CRUD de miembros
    private static void crearMiembro(ModelFactory modelFactory) {
        String nombre = "Ana López";
        int cedula = 5678;
        boolean resultado = modelFactory.crearMiembro(nombre, cedula);
        notificacion(resultado, "Miembro creado");
    }

    private static void verMiembro(ModelFactory modelFactory) {
        String cedula = "5678";
        String miembro = modelFactory.obtenerDatosMiembro(cedula);
        System.out.println("Detalle del miembro: " + miembro);
    }

    private static void actualizarMiembro(ModelFactory modelFactory) {
        String nombre = "Ana María López";
        String cedulaActual = "5678";
        String cedulaNueva = "5679";
        boolean resultado = modelFactory.actualizarMiembro(nombre, cedulaActual, cedulaNueva);
        notificacion(resultado, "Miembro actualizado");
    }

    private static void eliminarMiembro(ModelFactory modelFactory) {
        int cedula = 5678;
        boolean resultado = modelFactory.eliminarMiembro(cedula);
        notificacion(resultado, "Miembro eliminado");
    }

    // Método para mostrar notificaciones
    private static void notificacion(boolean resultado, String mensaje) {
        if (resultado) {
            System.out.println(mensaje + " correctamente");
        } else {
            System.out.println("No se pudo " + mensaje);
        }
    }
}

