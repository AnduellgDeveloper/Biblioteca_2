package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    public static Prestamo builder;
    private Libro libro;
    private Miembro miembro;
    private String estado;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static List<Prestamo> prestamosActivos = new ArrayList<>();
    private static List<Prestamo> historialPrestamos = new ArrayList<>();

    public Prestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion) {
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = LocalDateTime.now();
        this.fechaDevolucion = null;
        this.estado = "activo";
        libro.setEstado("prestado");
        prestamosActivos.add(this);
    }

    public String getEstado() {return estado;}
    public static List<Prestamo> getPrestamosActivos() {return prestamosActivos;}
    public static List<Prestamo> getHistorialPrestamos() {return historialPrestamos;}
    public Libro getLibro() {
        return libro;
    }
    public Miembro getMiembro() {
        return miembro;
    }
    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }
    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }
}
