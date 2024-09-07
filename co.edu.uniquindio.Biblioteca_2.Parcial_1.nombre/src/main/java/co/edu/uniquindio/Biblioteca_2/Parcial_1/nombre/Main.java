package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Libro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Miembro;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder.LibroBuilder;

public class Main {
    public static void main(String[] args){
        // Creación de miembros con el builder
        Miembro cliente1 = Miembro.builder()
                .nombre("Juan")
                .cedula(1077722942)
                .build();

        Miembro cliente2 = Miembro.builder()
                .nombre("Maria")
                .cedula(1234567890)
                .build();
        // Creación de libros con el builder
        Libro libro = new LibroBuilder()
                .titulo("Cien años de soledad")
                .autor("Gabriel García Márquez")
                .isbn(123456789)
                .estado("prestado")
                .build();
        System.out.println("Miembro creado: " + cliente1.getNombre() + " con cédula " + cliente1.getCedula());
        System.out.println("Miembro creado: " + cliente2.getNombre() + " con cédula " + cliente2.getCedula());
        System.out.println("Libro creado: " + libro.getTitulo() + " por " + libro.getAutor());
    }
}
