package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Biblioteca implements IBibliotecarioCrud, IGestionInventario, ILibroCrud, IMiembroCrud, IPrestamoCrud, IRevistaCrud {
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Comic> listaComics = new ArrayList<>();
    private List<Revista> listaRevistas = new ArrayList<>();
    private List<Dvd> listaDvds = new ArrayList<>();
    private List<List<?>> listaItems = new ArrayList<>();
    private List<Miembro> listaMiembros = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();

    //---------------------------- Getters y Setters ------------------------------
    public List<Comic> getListaComics() {
        return listaComics;
    }

    public void setListaComics(List<Comic> listaComics) {
        this.listaComics = listaComics;
    }

    public List<Revista> getListaRevistas() {
        return listaRevistas;
    }

    public void setListaRevistas(List<Revista> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }

    public List<Dvd> getListaDvds() {
        return listaDvds;
    }

    public void setListaDvds(List<Dvd> listaDvds) {
        this.listaDvds = listaDvds;
    }

    public List<List<?>> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<List<?>> listaItems) {
        this.listaItems = listaItems;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public List<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public Biblioteca() {
        listaItems.add(listaLibros);
        listaItems.add(listaComics);
        listaItems.add(listaRevistas);
        listaItems.add(listaDvds);
    }

    //------------------------------ Métodos de IGestionInventario ------------------------------
    @Override
    public void gestionarItem() {
    }

    @Override
    public void agregarItem() {
    }

    @Override
    public void removerItem() {
    }

    @Override
    public void mostrarItem() {
        listaLibros.forEach(System.out::println);
    }

    @Override
    public void mostrarLibroPorTitulo() {
    }

    //------------------------------ Métodos de IMiembroCrud ------------------------------
    public List<Miembro> buscarMiembrosPorEdad(int edad) {
        List<Miembro> resultado = new ArrayList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() > edadMinima) {
                resultado.add(miembro);

                System.out.println("Miembro encontrado: " + miembro);
            }
        }
        return resultado;
    }
        @Override
    public boolean crearMiembro(String nombre, int cedula) {
        if (obtenerMiembro(String.valueOf(cedula)) == null) {
            Miembro nuevoMiembro = new Miembro(nombre, cedula);
            listaMiembros.add(nuevoMiembro);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarMiembro(int cedula) {
        Miembro miembro = obtenerMiembro(String.valueOf(cedula));
        if (miembro != null) {
            listaMiembros.remove(miembro);
            return true;
        }
        return true;
    }
    @Override
    public boolean actualizarMiembro(String nombre, String cedulaActual, String cedulaNueva) {
        Miembro miembro = obtenerMiembro(cedulaActual);
        if (miembro != null) {
            miembro.setNombre(nombre);
            miembro.setCedula(Integer.parseInt(cedulaNueva));
            return true;
        }
        return false;
    }
    @Override
    public String obtenerDatosMiembro(String cedula) {
        Miembro miembroExistente = obtenerMiembro(cedula);
        if (miembroExistente != null) {
            return miembroExistente.toString();
        }
        return "";
    }
    @Override
    public String verMiembros() {
        StringBuilder miembrosInfo = new StringBuilder();
        if (listaMiembros.isEmpty()) {
            return "No hay miembros.";
        }
        for (Miembro miembro : listaMiembros) {
            miembrosInfo.append("Nombre: ").append(miembro.getNombre())
                    .append(", Cédula: ").append(miembro.getCedula()).append("\n");
        }

        return miembrosInfo.toString();
    }

    private Miembro obtenerMiembro(String cedula) {
        for (Miembro miembro : listaMiembros) {
            if (Objects.equals(String.valueOf(miembro.getCedula()), cedula)) {
                return miembro;
            }
        }
        return null;
    }
    //------------------------------ Métodos de IBibliotecarioCrud ------------------------------
    @Override
    public boolean crearBibliotecario(String nombre, int idEmpleado) {
        if (obtenerBibliotecario(idEmpleado) == null) {
            Bibliotecario nuevoBibliotecario = new Bibliotecario(nombre, idEmpleado);
            listaBibliotecarios.add(nuevoBibliotecario);
            return true;
        }
        return false;
    }
    @Override
    public boolean verBibliotecario(String nombre) {
        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (Objects.equals(bibliotecario.getNombre(), nombre)) {
                System.out.println(bibliotecario);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean actualizarBibliotecario(int idEmpleadoActual, int idEmpleadoNuevo) {
        Bibliotecario bibliotecario = obtenerBibliotecario(idEmpleadoActual);
        if (bibliotecario != null) {
            bibliotecario.setIdEmpleado(idEmpleadoNuevo);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarBibliotecario(int idEmpleado) {
        Bibliotecario bibliotecario = obtenerBibliotecario(idEmpleado);
        if (bibliotecario != null) {
            listaBibliotecarios.remove(bibliotecario);
            return true;
        }
        return false;
    }
    private Bibliotecario obtenerBibliotecario(int idEmpleado) {
        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (bibliotecario.getIdEmpleado() == idEmpleado) {
                return bibliotecario;
            }
        }
        return null;
    }
    //------------------------------ Métodos de ILibroCrud ------------------------------
    @Override
    public boolean crearLibro(String titulo, String autor, String genero,int isbn) {
        if (obtenerLibro(isbn) == null) {
            Libro nuevoLibro = new Libro(titulo, autor, genero,isbn);
            listaLibros.add(nuevoLibro);
            return true;
        }
        return false;
    }
    @Override
    public String verLibro(String titulo, String autor,String genero, int isbn) {
        Libro libro = obtenerLibro(isbn);
        if (libro != null) {
            return libro.toString();
        }
        return "Libro no encontrado";
    }
    @Override
    public boolean actualizarLibro(int isbn, String nuevoTitulo, String nuevoAutor) {
        Libro libro = obtenerLibro(isbn);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarLibro(int isbn) {
        Libro libro = obtenerLibro(isbn);
        if (libro != null) {
            listaLibros.remove(libro);
            return true;
        }
        return false;
    }
    @Override
    public String buscarLibroIsbn(int isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == isbn) {
                return "El libro encontrado por isbn "+isbn+" es: " + libro;
            }
        }
        return "No se encontró un libro con el ISBN: " + isbn;
    }
    @Override
    public String buscarLibroTitulo(String Titulo ) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(Titulo)) {
                return "El libro encontrado por Titulo "+Titulo +" es: " + libro;
            }
        }
        return "No se encontró un libro con el Titulo : " + Titulo;
    }

    @Override
    public String buscarLibroAutor(String Autor ) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equals(Autor)) {
                return "El libro encontrado por Autor "+ Autor +" es: " + libro;
            }
        }
        return "No se encontró un libro con el Autor : " + Autor;
    }
    @Override
    public List<String> mostrarGenerosLiterarios() {
        List<String> generos = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (!generos.contains(libro.getGenero())) {
                generos.add(libro.getGenero());
            }
        }
        return generos;
    }

    public List<String> obtenerGenerosLiterarios() {
        List<String> generos = mostrarGenerosLiterarios();
        if (generos.isEmpty()) {
            generos.add("No hay géneros literarios disponibles.");
        }
        return generos;
    }


    private Libro obtenerLibro(int isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == isbn) {
                return libro;
            }
        }
        return null;
    }
    //------------------------------ Métodos de IPrestamoCrud ------------------------------
    @Override
    public boolean crearPrestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion,int idPrestamo) {
        Prestamo nuevoPrestamo = new Prestamo(libro, miembro, estado, fechaPrestamo, fechaDevolucion,idPrestamo);
        listaPrestamos.add(nuevoPrestamo);
        return true;
    }



    @Override
    public Prestamo verPrestamo(int idPrestamo) {
        return obtenerPrestamo(idPrestamo);
    }
    @Override
    public boolean actualizarPrestamo(int idPrestamo, Libro nuevoLibro) {
        Prestamo prestamo = obtenerPrestamo(idPrestamo);
        if (prestamo != null) {
            prestamo.setLibro(nuevoLibro);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarPrestamo(int idPrestamo) {
        Prestamo prestamo = obtenerPrestamo(idPrestamo);
        if (prestamo != null) {
            listaPrestamos.remove(prestamo);
            return true;
        }
        return false;
    }

    @Override
    public void mostrarPrestamos(List<Prestamo> listaPrestamos) {
        if (listaPrestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
        } else {
            for (Prestamo prestamo : listaPrestamos) {
                System.out.println(prestamo.toString());
            }
        }
    }
    private Prestamo obtenerPrestamo(int idPrestamo) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getIdPrestamo() == idPrestamo) {
                return prestamo;
            }
        }
        return null;
    }
    @Override
    public List<Prestamo> obtenerListaPrestamosActivos() {
        List<Prestamo> prestamosActivos = new ArrayList<>();
        for (Prestamo prestamo : listaPrestamos) {
            if ("activo".equals(prestamo.getEstado())) {
                prestamosActivos.add(prestamo);
            }
        }
        return prestamosActivos;
    }


    //------------------------------ Métodos del Parcial(Revista)------------------------------
    @Override
    public boolean crearRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion) {
        if (obtenerRevista(idRevista) == null) {
            Revista nuevaRevista = new Revista(idRevista, editorial, numeroPaginas, estado, descripcion);
            listaRevistas.add(nuevaRevista);
            return true;
        }
        return false;
    }
    @Override
    public String verRevista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion) {
        Revista revista = obtenerRevista(idRevista);
        if (revista != null) {
            return revista.toString();
        }
        return "Revista no encontrada";
    }
    @Override
    public boolean actualizarRevista(int idRevista, String nuevaEditorial, int nuevoNumeroPaginas) {
        Revista revista = obtenerRevista(idRevista);
        if (revista != null) {
            revista.setEditorial(nuevaEditorial);
            revista.setNumeroPaginas(nuevoNumeroPaginas);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarRevista(int idRevista) {
        Revista revista = obtenerRevista(idRevista);
        if (revista != null) {
            listaRevistas.remove(revista);
            return true;
        }
        return false;
    }
    private Revista obtenerRevista(int idRevista) {
        for (Revista revista : listaRevistas) {
            if (revista.getIdRevista() == idRevista) {
                return revista;
            }
        }
        return null;
    }
    }
