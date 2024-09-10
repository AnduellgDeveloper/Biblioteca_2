package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    public static Prestamo builder;
    private static int idCounter = 1;
    private int idPrestamo;
    private Libro libro;
    private Miembro miembro;
    private String estado;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Prestamo(Libro libro, Miembro miembro, String estado, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion) {
        this.idPrestamo = idCounter++; // Asigna un ID único y lo incrementa.
        this.libro = libro;
        this.miembro = miembro;
        this.estado = estado;
        this.fechaPrestamo = fechaPrestamo != null ? fechaPrestamo : LocalDateTime.now();
        this.fechaDevolucion = fechaDevolucion;
        this.libro.setEstado("prestado");
    }

    // Getters y setters
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return String.format(
                "ID de Préstamo: %d%n" +
                        "Libro: %s%n" +
                        "Miembro: %s%n" +
                        "Estado: %s%n" +
                        "Fecha de Préstamo: %s%n" +
                        "Fecha de Devolución: %s%n",
                idPrestamo,
                libro.getTitulo(),
                miembro.getNombre(),
                estado,
                fechaPrestamo.format(FORMATTER),
                (fechaDevolucion != null ? fechaDevolucion.format(FORMATTER) : "No devuelto")
        );
    }

}
