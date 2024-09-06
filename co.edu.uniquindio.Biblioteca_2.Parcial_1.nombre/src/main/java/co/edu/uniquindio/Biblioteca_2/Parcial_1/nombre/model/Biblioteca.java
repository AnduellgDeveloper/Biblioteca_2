package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IGestionInventario;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.services.IMiembroCrud;

import java.util.List;


public class Biblioteca implements IGestionInventario, IMiembroCrud {
    private  List<Prestamo> listaPrestamos;
    private List<Libro> listaLibros;
    private List<Miembro> listaMiembros;




    @Override
    public void agregarItem(Libro libro) {
        if(libro != null) {
            listaLibros.add(libro);
            System.out.println("El libro " + libro.getTitulo() + " ha sido agregado.");
        } else {
            System.out.println("No se puede agregar un libro nulo.");
        }
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
        Miembro MiembroExistente = obtenerMiembro(cedula);
        if(MiembroExistente != null){
            return MiembroExistente.toString();
        }

        return "";
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }
    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    private Miembro obtenerMiembro(String cedula) {
        Miembro miembroExistente = null;
        for (Miembro miembro: getListaMiembros()) {
            if(miembro.getCedula().equals(cedula)){
                miembroExistente = miembro;
                break;
            }
        }

        return  miembroExistente;
    }
}

