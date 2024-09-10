package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Biblioteca;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ModelFactory implements IBibliotecarioCrud, IGestionInventario, ILibroCrud, IMiembroCrud, IPrestamoCrud {
    private static ModelFactory modelFactory;
    private static Biblioteca biblioteca;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public static void inicializarDatos() {
        biblioteca = new Biblioteca();
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("La Divina Comedia", "Dante Alighieri", "Poesía épica", 4589));
        listaLibros.add(new Libro("Boulevard", "Flor M. Salvador", "Romance juvenil", 89021));
        listaLibros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Realismo mágico", 12345));
        listaLibros.add(new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", "Romance", 67890));
        listaLibros.add(new Libro("1984", "George Orwell", "Distopía", 11223));
        listaLibros.add(new Libro("Orgullo y Prejuicio", "Jane Austen", "Romance clásico", 44556));
        listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", 77889));
        listaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Fábula", 99887));
        listaLibros.add(new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", "Misterio", 66554));
        listaLibros.add(new Libro("Ficciones", "Jorge Luis Borges", "Ficción", 54321));
        System.out.println("Total libros agregados: " + listaLibros.size());
        biblioteca.setListaLibros(listaLibros);
        List<Miembro> listaMiembros = new ArrayList<>();
        listaMiembros.add(new Miembro("Duvan Felipe", 1234));
        listaMiembros.add(new Miembro("Nicol Marin", 5689));
        listaMiembros.add(new Miembro("Majo Tovar", 8910));
        listaMiembros.add(new Miembro("carlos",2345671));
        System.out.println("Total miembros agregados: " + listaMiembros.size());
        biblioteca.setListaMiembros(listaMiembros);
        List<Prestamo> listaPrestamos = new ArrayList<>();
        listaPrestamos.add(new Prestamo(listaLibros.get(0), listaMiembros.get(0), "Activo", LocalDateTime.now(), null));
        listaPrestamos.add(new Prestamo(listaLibros.get(1), listaMiembros.get(1), "Activo", LocalDateTime.now(), null));
        listaPrestamos.add(new Prestamo(listaLibros.get(2), listaMiembros.get(2), "Activo", LocalDateTime.now(), null));
        System.out.println("Total préstamos agregados: " + listaPrestamos.size());
        biblioteca.setListaPrestamos(listaPrestamos);
    }

    @Override
    public boolean crearBibliotecario(String nombre, int idEmpleado) {
        return biblioteca.crearBibliotecario(nombre, idEmpleado);
    }

    @Override
    public boolean verBibliotecario(String nombre) {
        return biblioteca.verBibliotecario(nombre);
    }

    @Override
    public boolean actualizarBibliotecario(int idEmpleadoActual, int idEmpleadoNuevo) {
        return biblioteca.actualizarBibliotecario(idEmpleadoActual, idEmpleadoNuevo);
    }

    @Override
    public boolean eliminarBibliotecario(int idEmpleado) {
        return biblioteca.eliminarBibliotecario(idEmpleado);
    }

    @Override
    public void gestionarItem() {
    }

    @Override
    public void agregarItem() {
        biblioteca.agregarItem();
    }

    @Override
    public void removerItem() {
        biblioteca.removerItem();
    }

    @Override
    public void mostrarItem() {
        biblioteca.mostrarItem();
    }

    @Override
    public void mostrarLibroPorTitulo() {
        biblioteca.mostrarLibroPorTitulo();
    }

    @Override
    public List<String> mostrarGenerosLiterarios() {
        return biblioteca.obtenerGenerosLiterarios();
    }

    @Override
    public boolean crearLibro(String titulo, String autor, String genero, int isbn) {
        return biblioteca.crearLibro(titulo, autor, genero, isbn);
    }

    @Override
    public String verLibro(String titulo, String autor, String genero, int isbn) {
        return biblioteca.verLibro(titulo, autor, genero, isbn);
    }

    @Override
    public boolean actualizarLibro(int isbn, String nuevoTitulo, String nuevoAutor) {
        return biblioteca.actualizarLibro(isbn, nuevoTitulo, nuevoAutor);
    }

    @Override
    public boolean eliminarLibro(int isbn) {
        return biblioteca.eliminarLibro(isbn);
    }

    @Override
    public String buscarLibroIsbn(int isbn) {
        return biblioteca.buscarLibroIsbn(isbn);
    }

    @Override
    public String buscarLibroTitulo(String Titulo) {
        return biblioteca.buscarLibroTitulo(Titulo);
    }


    @Override
    public String buscarLibroAutor(String Autor) {
        return biblioteca.buscarLibroAutor(Autor);
    }


    @Override
    public boolean crearMiembro(String nombre, int cedula) {
        return biblioteca.crearMiembro(nombre, cedula);
    }

    @Override
    public boolean eliminarMiembro(int cedula) {
        return biblioteca.eliminarMiembro(cedula);
    }

    @Override
    public boolean actualizarMiembro(String nombre, String cedulaActual, String cedulaNueva) {
        return biblioteca.actualizarMiembro(nombre, cedulaActual, cedulaNueva);
    }

    @Override
    public String obtenerDatosMiembro(String cedula) {
        return biblioteca.obtenerDatosMiembro(cedula);
    }

    @Override
    public String verMiembros() {
        return biblioteca.verMiembros();
    }

    //------------------------------ Métodos para CRUD de préstamos ModelFactory ------------------------------

    @Override
    public boolean crearPrestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion) {
        return biblioteca.crearPrestamo(libro, miembro, estado, fechaPrestamo, fechaDevolucion);
    }

    @Override
    public Prestamo verPrestamo(int idPrestamo) {
        return biblioteca.verPrestamo(idPrestamo);
    }

    @Override
    public boolean actualizarPrestamo(int idPrestamo, Libro nuevoLibro) {
        return biblioteca.actualizarPrestamo(idPrestamo, nuevoLibro);
    }

    @Override
    public boolean eliminarPrestamo(int idPrestamo) {
        return biblioteca.eliminarPrestamo(idPrestamo);
    }

    @Override
    public void mostrarPrestamos(List<Prestamo> listaPrestamos) {
        biblioteca.mostrarPrestamos(listaPrestamos);
    }
    @Override
    public List<Prestamo> obtenerListaPrestamosActivos() {
        return biblioteca.obtenerListaPrestamosActivos();
    }

}