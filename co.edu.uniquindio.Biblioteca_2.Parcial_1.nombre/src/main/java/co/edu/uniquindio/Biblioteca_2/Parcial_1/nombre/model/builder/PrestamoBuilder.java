package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Prestamo;

import java.time.LocalDateTime;

public class PrestamoBuilder {
    protected Libro libro;
    protected Miembro miembro;
    protected String estado;
    protected LocalDateTime fechaPrestamo;
    protected LocalDateTime fechaDevolucion;

    public Prestamo build(){
        return new Prestamo(libro, miembro, estado, fechaPrestamo, fechaDevolucion);
    }
    public PrestamoBuilder libro(Libro libro) {
        this.libro = libro;
        return this; //Instancia actual de ClienteBuilder
    }
    public PrestamoBuilder miembro (Miembro miembro){
        this.miembro = miembro;
        return this; //Instancia actual de ClienteBuilder
    }
    public PrestamoBuilder estado(String estado) {
        this.estado = estado;
        return this; //Instancia actual de ClienteBuilder
    }
    public PrestamoBuilder fechaPrestamo (LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        return this; //Instancia actual de ClienteBuilder
    }
    public PrestamoBuilder fechaDevolucion (LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        return this; //Instancia actual de ClienteBuilder
    }

}