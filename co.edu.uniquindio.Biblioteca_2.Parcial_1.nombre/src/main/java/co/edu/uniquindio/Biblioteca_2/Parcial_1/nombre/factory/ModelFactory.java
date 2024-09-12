package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Biblioteca;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder.LibroBuilder;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ModelFactory implements IBibliotecarioCrud, IGestionInventario, ILibroCrud, IMiembroCrud, IPrestamoCrud, IRevistaCrud {
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

        // Uso del Builder para crear libros
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new LibroBuilder()
                .titulo("La Divina Comedia")
                .autor("Dante Alighieri")
                .genero("Poesía épica")
                .isbn(4589)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("Boulevard")
                .autor("Flor M. Salvador")
                .genero("Romance juvenil")
                .isbn(89021)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("Cien Años de Soledad")
                .autor("Gabriel García Márquez")
                .genero("Realismo mágico")
                .isbn(12345)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("El Amor en los Tiempos del Cólera")
                .autor("Gabriel García Márquez")
                .genero("Romance")
                .isbn(67890)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("1984")
                .autor("George Orwell")
                .genero("Distopía")
                .isbn(11223)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("Orgullo y Prejuicio")
                .autor("Jane Austen")
                .genero("Romance clásico")
                .isbn(44556)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("Don Quijote de la Mancha")
                .autor("Miguel de Cervantes")
                .genero("Novela")
                .isbn(77889)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("El Principito")
                .autor("Antoine de Saint-Exupéry")
                .genero("Fábula")
                .isbn(99887)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("La Sombra del Viento")
                .autor("Carlos Ruiz Zafón")
                .genero("Misterio")
                .isbn(66554)
                .build());

        listaLibros.add(new LibroBuilder()
                .titulo("Ficciones")
                .autor("Jorge Luis Borges")
                .genero("Ficción")
                .isbn(54321)
                .build());

        System.out.println("Total libros agregados: " + listaLibros.size());
        biblioteca.setListaLibros(listaLibros);

        // Uso del Builder para crear miembros
        List<Miembro> listaMiembros = new ArrayList<>();
        listaMiembros.add(Miembro.builder()
                .nombre("Duvan Felipe")
                .cedula(1234)
                .build());

        listaMiembros.add(Miembro.builder()
                .nombre("Nicol Marin")
                .cedula(5689)
                .build());

        listaMiembros.add( Miembro.builder()
                .nombre("Majo Tovar")
                .cedula(8910)
                .build());

        listaMiembros.add(Miembro.builder()
                .nombre("Carlos")
                .cedula(2345671)
                .build());

        System.out.println("Total miembros agregados: " + listaMiembros.size());
        biblioteca.setListaMiembros(listaMiembros);

        // Uso del Builder para crear préstamos
        List<Prestamo> listaPrestamos = new ArrayList<>();

        listaPrestamos.add(Prestamo.builder()
                .libro(listaLibros.get(0))
                .miembro(listaMiembros.get(0))
                .estado("Activo")
                .fechaPrestamo(LocalDateTime.now())
                .build());

        listaPrestamos.add(Prestamo.builder()
                .libro(listaLibros.get(1))
                .miembro(listaMiembros.get(1))
                .estado("Activo")
                .fechaPrestamo(LocalDateTime.now())
                .build());

        listaPrestamos.add( Prestamo.builder()
                .libro(listaLibros.get(2))
                .miembro(listaMiembros.get(2))
                .estado("Activo")
                .fechaPrestamo(LocalDateTime.now())
                .build());

        System.out.println("Total préstamos agregados: " + listaPrestamos.size());
        biblioteca.setListaPrestamos(listaPrestamos);
    }

    @Override
    public boolean crearRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion) {
        return biblioteca.crearRevista(idRevista, editorial, numeroPaginas, estado, descripcion);
    }

    @Override
    public String verRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion) {
        return biblioteca.verRevista(idRevista, editorial, numeroPaginas, estado, descripcion);
    }

    @Override
    public boolean actualizarRevista(int idRevista, String nuevaEditorial, int nuevoNumeroPaginas) {
        return biblioteca.actualizarRevista(idRevista, nuevaEditorial, nuevoNumeroPaginas);
    }

    @Override
    public boolean eliminarRevista(int idRevista) {
        return biblioteca.eliminarRevista(idRevista);
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
    public boolean crearPrestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion,int idPrestamo) {
        return biblioteca.crearPrestamo(libro, miembro, estado, fechaPrestamo, fechaDevolucion,idPrestamo);
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