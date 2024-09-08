package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca implements IBibliotecarioCrud, IGestionInventario, ILibroCrud, IMiembroCrud, IPrestamoCrud {
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Miembro> listaMiembros = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();

    // Métodos de IGestionInventario
    @Override
    public void agregarItem() {
        // Lógica para agregar un ítem al inventario
    }

    @Override
    public void removerItem() {
        // Lógica para remover un ítem del inventario
    }

    @Override
    public void mostrarInventario() {
        // Lógica para mostrar el inventario
        listaLibros.forEach(System.out::println);
    }

    @Override
    public void mostrarLibroPorTitulo() {
        // Lógica para mostrar libros por título
    }

    // Métodos de IMiembroCrud
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
        return false;
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

    private Miembro obtenerMiembro(String cedula) {
        for (Miembro miembro : listaMiembros) {
            if (Objects.equals(String.valueOf(miembro.getCedula()), cedula)) {
                return miembro;
            }
        }
        return null;
    }
    // Métodos de IBibliotecarioCrud
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

    // Métodos de ILibroCrud
    @Override
    public boolean crearLibro(String titulo, String autor, int isbn) {
        if (obtenerLibro(isbn) == null) {
            Libro nuevoLibro = new Libro(titulo, autor, isbn);
            listaLibros.add(nuevoLibro);
            return true;
        }
        return false;
    }

    @Override
    public String verLibro(String titulo, String autor, int isbn) {
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

    private Libro obtenerLibro(int isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == isbn) {
                return libro;
            }
        }
        return null;
    }

}
