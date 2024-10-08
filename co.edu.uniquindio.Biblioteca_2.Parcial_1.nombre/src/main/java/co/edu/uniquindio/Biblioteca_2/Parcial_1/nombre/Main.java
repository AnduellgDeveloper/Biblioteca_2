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
        gestionarRevistas(modelFactory);
    }
    //Se aplica Open/Closed, interface Segregation y single responsability

    private static void gestionarPrestamos(ModelFactory modelFactory) {
        crearPrestamo(modelFactory);
        verPrestamo(modelFactory);
        actualizarPrestamo(modelFactory);
        eliminarPrestamo(modelFactory);
        //mostrarPrestamosActivos(modelFactory);
    }
    private static void gestionarLibros(ModelFactory modelFactory) {
        crearLibro(modelFactory);
        verLibro(modelFactory);
        actualizarLibro(modelFactory);
        eliminarLibro(modelFactory);
        buscarLibroIsbn(modelFactory);
        buscarLibroTitulo(modelFactory);
        buscarLibroAutor(modelFactory);
        mostrarGenerosLiterarios(modelFactory);
    }
    private static void gestionarMiembros(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        verMiembro(modelFactory);
        actualizarMiembro(modelFactory);
        eliminarMiembro(modelFactory);
        verMiembros(modelFactory);
    }
    private static void gestionarRevistas(ModelFactory modelFactory){
        crearRevista(modelFactory);
        verRevista(modelFactory);
        actualizarRevista(modelFactory);
        eliminarRevista(modelFactory);

    }
    //------------------------------ Métodos para CRUD de Revista ------------------------------
    private static void crearRevista(ModelFactory modelFactory){
        int idRevista = 1;
        String editorial = " 1984";
        int numeroPaginas = 100;
        String estado = " Distopia";
        String descripcion = "HOLA MUNDO!";
        boolean resultado = modelFactory.crearRevista(idRevista, editorial, numeroPaginas, estado, descripcion);
        notificacion(resultado, "Revista creada:\n"+"Revista: "+idRevista+" Editorial: " +editorial+ "Numero de Paginas: "+numeroPaginas+
                "Estado: "+estado+" Descripcion: "+descripcion);
    }
    private static void verRevista(ModelFactory modelFactory) {
        int idRevista = 1;
        String editorial = " 1984";
        int numeroPaginas = 1;
        String estado = " Distopia";
        String descripcion = "";
        String revista = modelFactory.verRevista(idRevista, editorial, numeroPaginas, estado, descripcion);
        System.out.println("Detalle de Revista: " + revista);
    }
    private static void actualizarRevista(ModelFactory modelFactory){
        int idRevista = 11223;
        String nuevaEditorial = "Rebelión en la Granja";
        int nuevoNumeroPaginas = 200;
        boolean resultado = modelFactory.actualizarRevista(idRevista, nuevaEditorial,nuevoNumeroPaginas);
        notificacion(resultado, "Revista actualizada: "+  nuevaEditorial + "de" +nuevoNumeroPaginas);
    }
    private static void eliminarRevista(ModelFactory modelFactory) {
        int idRevista = 1;
        boolean resultado = modelFactory.eliminarRevista(idRevista);
        notificacion(resultado, "Revista eliminada: " + idRevista);
    }
    //------------------------------ Métodos para CRUD de préstamos ------------------------------
    private static void crearPrestamo(ModelFactory modelFactory) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez","Realismo magico", 12345);
        Miembro miembro = new Miembro("Juan Pérez", 9876);
        LocalDateTime fechaPrestamo = LocalDateTime.now();
        LocalDateTime fechaDevolucion = null;
        int idPrestamo=2;
        boolean resultado = modelFactory.crearPrestamo(libro, miembro, "Activo", fechaPrestamo, fechaDevolucion,idPrestamo);
        notificacion(resultado, "\nPrestamo creado: ");
    }
    private static void verPrestamo(ModelFactory modelFactory) {
        int idPrestamo =2 ;
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
    //private static void mostrarPrestamosActivos(ModelFactory modelFactory) {
       // List<Prestamo> listaPrestamos = modelFactory.obtenerListaPrestamosActivos();
        //modelFactory.mostrarPrestamosActivos(listaPrestamos);
    //}

    //------------------------------ Métodos para CRUD de libros ------------------------------
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
    private static void buscarLibroIsbn(ModelFactory modelFactory) {
        int isbn = 4589;
        String resultado = modelFactory.buscarLibroIsbn(isbn);
        System.out.println(resultado);
    }
    private static void buscarLibroTitulo(ModelFactory modelFactory) {
        String Titulo = "Boulevard";
        String resultado = modelFactory.buscarLibroTitulo(Titulo);
        System.out.println(resultado);
    }
    private static void buscarLibroAutor(ModelFactory modelFactory) {
        String Autor = "Jane Austen";
        String resultado = modelFactory.buscarLibroAutor(Autor);
        System.out.println(resultado);
    }
    private static void mostrarGenerosLiterarios(ModelFactory modelFactory) {
        List<String> generos = modelFactory.mostrarGenerosLiterarios();
        System.out.println("Géneros literarios disponibles:");
        generos.forEach(genero -> System.out.println("- " + genero));
    }
    //------------------------------ Métodos para CRUD de miembros ------------------------------
    private static void crearMiembro(ModelFactory modelFactory) {
        String nombre = "Ana López";
        int cedula = 5678;
        boolean resultado = modelFactory.crearMiembro(nombre, cedula);
        notificacion(resultado, "Miembro creado: Nombre: " +nombre +", Cedula: "+ cedula);
    }
    private static void verMiembro(ModelFactory modelFactory) {
        String cedula = "5678";
        String miembro = modelFactory.obtenerDatosMiembro(cedula);
        System.out.println("Detalle del miembro: " + miembro);
    }
    private static void verMiembros(ModelFactory modelFactory) {
        String resultado = modelFactory.verMiembros();
        System.out.println("Lista de Miembros:\n" + resultado);
    }
    private static void actualizarMiembro(ModelFactory modelFactory) {
        String nombre = "Ana María López";
        String cedulaActual = "5678";
        String cedulaNueva = "5679";
        boolean resultado = modelFactory.actualizarMiembro(nombre, cedulaActual, cedulaNueva);
        notificacion(resultado, "Miembro actualizado: " + nombre +", Cedula Nueva: "+ cedulaNueva );
    }
    private static void eliminarMiembro(ModelFactory modelFactory) {
        int cedula = 5678;
        boolean resultado = modelFactory.eliminarMiembro(cedula);
        notificacion(resultado, "Miembro eliminado: " + cedula);
    }

    //------------------------------ Método para mostrar notificaciones ------------------------------
    private static void notificacion(boolean resultado, String mensaje) {
        if (resultado) {
            System.out.println(mensaje );
        } else {
            System.out.println(" " + mensaje);
        }
    }
}

