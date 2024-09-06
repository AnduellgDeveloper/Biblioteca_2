package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Biblioteca;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private static Biblioteca biblioteca;
    private static List<Libro> listaLibros = new ArrayList<>();
    private static List<Miembro> listaMiembros = new ArrayList<>();

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    @Override
    public boolean agregarItem() {
        return empresaTransporte.eliminarPropietario(numeroIdentificacion);
    }

    public static void inicializarDatos() {
        biblioteca = new Biblioteca();
        Libro libro1 = new Libro("La Divina Comedia", "Dante Alighieri", 4589);
        Libro libro2 = new Libro("Boulevard", "Flor M. Salvador", 89021);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 12345);
        Libro libro4 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 67890);
        Libro libro5 = new Libro("1984", "George Orwell", 11223);
        Libro libro6 = new Libro("Orgullo y Prejuicio", "Jane Austen", 44556);
        Libro libro7 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 77889);
        Libro libro8 = new Libro("El Principito", "Antoine de Saint-Exupéry", 99887);
        Libro libro9 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 66554);
        Libro libro10 = new Libro("Ficciones", "Jorge Luis Borges", 54321);
        // Lista de Libros
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        listaLibros.add(libro6);
        listaLibros.add(libro7);
        listaLibros.add(libro8);
        listaLibros.add(libro9);
        listaLibros.add(libro10);
        //Lista de instancias
        Miembro miembro1 = new Miembro("Duvan Felipe", 1);
        Miembro miembro2 = new Miembro("Nicol Marin", 2);
        Miembro miembro3 = new Miembro("Majo Tovar", 3);
        // Listado de Miembros
        listaMiembros.add(miembro1);
        listaMiembros.add(miembro2);
        listaMiembros.add(miembro3);
    }



}
