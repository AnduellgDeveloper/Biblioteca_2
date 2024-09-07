package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;

public class MiembroBuilder {
    protected String nombre;
    protected int cedula;
    public Miembro build(){
        return new Miembro(nombre,cedula);
    }
    public MiembroBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this; //Instancia actual de ClienteBuilder
    }
    public MiembroBuilder cedula(int cedula) {
        this.cedula = cedula;
        return this;
    }
}
