package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
// Al ser una clase abstracta y no poder ser instanciada no se le crea un Builder
public abstract class Empleado  {
    private String nombre;
    private int idEmpleado;
    public Empleado(String nombre, int idEmpleado){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
