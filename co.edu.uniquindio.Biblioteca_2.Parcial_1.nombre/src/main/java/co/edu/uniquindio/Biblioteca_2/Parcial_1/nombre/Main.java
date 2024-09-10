package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory.ModelFactory;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;
import java.time.LocalDateTime;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        modelFactory.inicializarDatos();
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
        buscarLibroIsbn(modelFactory);
        mostrarGenerosLiterarios(modelFactory);
    }
    private static void gestionarMiembros(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        verMiembro(modelFactory);
        actualizarMiembro(modelFactory);
        eliminarMiembro(modelFactory);
        verMiembros(modelFactory);
    }
    // Métodos para CRUD de préstamos
    private static void crearPrestamo(ModelFactory modelFactory) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez","Realismo magico", 12345);
        Miembro miembro = new Miembro("Juan Pérez", 9876);
        LocalDateTime fechaPrestamo = LocalDateTime.now();
        LocalDateTime fechaDevolucion = null;
        boolean resultado = modelFactory.crearPrestamo(libro, miembro, "Activo", fechaPrestamo, fechaDevolucion);
        notificacion(resultado, "\nPrestamo creado: ");
    }
    private static void verPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1;
        Prestamo prestamo = modelFactory.verPrestamo(idPrestamo);
        if (prestamo != null) {
            System.out.println("Detalle del préstamo: " + prestamo);
        } else {
            System.out.println("No se encontró el préstamo con ID: " + idPrestamo);
        }
    }
    private static void actualizarPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1;
        Libro nuevoLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes","Novela", 6789);
        boolean resultado = modelFactory.actualizarPrestamo(idPrestamo, nuevoLibro);
        notificacion(resultado, "Prestamo actualizado: "+ nuevoLibro);
    }

    private static void eliminarPrestamo(ModelFactory modelFactory) {
        int idPrestamo = 1;
        Libro eliminarLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes","Novela", 6789);
        boolean resultado = modelFactory.eliminarPrestamo(idPrestamo);
        notificacion(resultado, "Prestamo eliminado: " + eliminarLibro );
    }
    // Métodos para CRUD de libros
    private static void crearLibro(ModelFactory modelFactory) {
        String titulo = " 1984";
        String autor =  " George Orwell";
        String genero= " Distopia";
        int isbn = 11223;
        boolean resultado = modelFactory.crearLibro(titulo, autor,genero, isbn);
        notificacion(resultado, "Libro creado: " + titulo + " de " + autor + " del genero "+ genero);
    }
    private static void verLibro(ModelFactory modelFactory) {
        String titulo = "1984";
        String autor = "George Orwell";
        String genero= "Distopia";
        int isbn = 11223;
        String libro = modelFactory.verLibro(titulo, autor, genero,isbn);
        System.out.println("Detalle del libro: " + libro);
    }
    private static void actualizarLibro(ModelFactory modelFactory) {
        int isbn = 11223;
        String nuevoTitulo = "Rebelión en la Granja";
        String nuevoAutor = "George Orwell";
        boolean resultado = modelFactory.actualizarLibro(isbn, nuevoTitulo, nuevoAutor);
        notificacion(resultado, "Libro actualizado: "+  nuevoTitulo + "de" +nuevoAutor);
    }
    private static void eliminarLibro(ModelFactory modelFactory) {
        int isbn = 11223;
        boolean resultado = modelFactory.eliminarLibro(isbn);
        notificacion(resultado, "Libro eliminado: " +isbn);
    }
    private static void mostrarGenerosLiterarios(ModelFactory modelFactory) {
        List<String> generos = modelFactory.mostrarGenerosLiterarios();
        if (generos.isEmpty()) {
            System.out.println("No hay géneros literarios disponibles.");
        } else {
            System.out.println("Géneros literarios disponibles:");
            for (String genero : generos) {
                System.out.println("- " + genero);
            }
        }
    }

    // Métodos para CRUD de miembros
    private static void crearMiembro(ModelFactory modelFactory) {
        String nombre = "Ana López";
        int cedula = 5678;
        boolean resultado = modelFactory.crearMiembro(nombre, cedula);
        notificacion(resultado, "Miembro creado:  " +nombre + cedula +"  correctamente");
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
        notificacion(resultado, "Miembro actualizado: " + nombre + cedulaNueva );
    }
    private static void eliminarMiembro(ModelFactory modelFactory) {
        int cedula = 5678;
        boolean resultado = modelFactory.eliminarMiembro(cedula);
        notificacion(resultado, "Miembro eliminado: " + cedula);
    }
    private static void verMiembros(ModelFactory modelFactory) {
        String resultado = modelFactory.verMiembros();
        System.out.println("Lista de Miembros:\n" + resultado);
    }
    private static void buscarLibroIsbn(ModelFactory modelFactory) {
        int isbn = 4589;
        String resultado = modelFactory.buscarLibroIsbn(isbn);
        System.out.println(resultado);
    }
    // Método para mostrar notificaciones
    private static void notificacion(boolean resultado, String mensaje) {
        if (resultado) {
            System.out.println(mensaje );
        } else {
            System.out.println("No se pudo " + mensaje);
        }
    }
}

