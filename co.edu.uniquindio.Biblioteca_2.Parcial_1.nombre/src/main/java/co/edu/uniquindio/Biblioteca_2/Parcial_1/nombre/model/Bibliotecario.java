package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado {
    public List<ItemBiblioteca> inventario = new ArrayList<>();

    public Bibliotecario(String nombre, int idEmpleado) {
        super(nombre, idEmpleado);

    }
}
