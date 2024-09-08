package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder;
public class BibliotecarioBuilder {
    protected String nombre;
    protected int idEmpleado;

    public BibliotecarioBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public BibliotecarioBuilder idEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
        return this;
    }
}

