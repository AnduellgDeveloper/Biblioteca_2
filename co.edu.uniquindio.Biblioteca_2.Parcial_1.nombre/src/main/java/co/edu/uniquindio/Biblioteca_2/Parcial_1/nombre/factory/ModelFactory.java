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
    private static List<Miembro> listaMiembros = new ArrayList<>();

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
        Libro libro1 = new Libro("La Divina Comedia", "Dante Alighieri","Poesía épica", 4589);
        Libro libro2 = new Libro("Boulevard", "Flor M. Salvador", "Romance juvenil", 89021);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Realismo magico", 12345);
        Libro libro4 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", "Romance", 67890);
        Libro libro5 = new Libro("1984", "George Orwell","Distopia", 11223);
        Libro libro6 = new Libro("Orgullo y Prejuicio", "Jane Austen","Romance clasico", 44556);
        Libro libro7 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela",77889);
        Libro libro8 = new Libro("El Principito", "Antoine de Saint-Exupéry","Fabula", 99887);
        Libro libro9 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", "Misterio",66554);
        Libro libro10 = new Libro("Ficciones", "Jorge Luis Borges","Ficcion", 54321);

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        listaLibros.add(libro6);
        listaLibros.add(libro7);
        listaLibros.add(libro8);
        listaLibros.add(libro9);
        listaLibros.add(libro10);
        System.out.println("Total libros agregados: " + listaLibros.size());

        biblioteca.setListaLibros(listaLibros);

        Miembro miembro1 = new Miembro("Duvan Felipe", 1);
        Miembro miembro2 = new Miembro("Nicol Marin", 2);
        Miembro miembro3 = new Miembro("Majo Tovar", 3);

        listaMiembros.add(miembro1);
        listaMiembros.add(miembro2);
        listaMiembros.add(miembro3);
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
    public void agregarItem() {
        biblioteca.agregarItem();
    }

    @Override
    public void removerItem() {
        biblioteca.removerItem();
    }

    @Override
    public void mostrarInventario() {
        biblioteca.mostrarInventario();
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
}