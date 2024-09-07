package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre;

import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.factory.ModelFactory;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Bibliotecario;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;

public class Main {
    public static void main(String[] args){
        ModelFactory modelFactory = ModelFactory.getInstance();
    }
    private static void ejemplo1() {
        Miembro cliente1 = Miembro.builder()
                .nombre("juan")
                .cedula(1077722942)
                .build();
        Miembro cliente2 = Miembro.builder()
                .nombre("juan")
                .cedula(1077722942)
                .build();




    }
}