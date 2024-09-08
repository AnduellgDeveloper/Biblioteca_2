package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IBibliotecarioCrud;
import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado implements IBibliotecarioCrud {
    public List<ItemBiblioteca> inventario = new ArrayList<>();
    public Bibliotecario(String nombre, int idEmpleado) {
        super(nombre, idEmpleado);
    }
    @Override
    public boolean crearBibliotecario(String nombre, int idEmpleado) {
        return false;
    }
    @Override
    public boolean verBibliotecario(String nombre) {
        return false;
    }
    @Override
    public boolean actualizarBibliotecario(int idEmpleadoActual, int idEmpleadoNueva) {
        return false;
    }
    @Override
    public boolean eliminarBibliotecario(int idEmpleado) {
        return false;
    }
}
