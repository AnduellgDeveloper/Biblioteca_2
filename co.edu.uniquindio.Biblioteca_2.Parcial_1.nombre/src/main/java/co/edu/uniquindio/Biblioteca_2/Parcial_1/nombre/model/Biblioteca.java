package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IGestionInventario;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IMiembroCrud;


public class Biblioteca implements IGestionInventario, IMiembroCrud {


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
    public void mostrarInventario() {

    }

    @Override
    public void mostrarLibroPorTitulo() {

    }

    @Override
    public boolean crearMiembro(String nombre, int cedula) {
        return false;
    }

    @Override
    public boolean eliminarMiembro(int cedula) {
        return false;
    }

    @Override
    public boolean actualizarMiembro(String nombre, String cedulaActual, String cedulaNueva) {
        return false;
    }

    @Override
    public String obtenerDatosMiembro(String cedula) {
        return "";
    }
}
