package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;

import java.util.List;

public interface IMiembroCrud {
    boolean crearMiembro (String nombre, int cedula);
    boolean eliminarMiembro (int cedula);
    boolean actualizarMiembro (String nombre, String cedulaActual, String cedulaNueva);
    String obtenerDatosMiembro (String cedula);
    String verMiembros();
    List<Miembro> buscarMiembrosPorEdad(int edad);
}
