package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;

public abstract class  ItemBiblioteca {
    public String titulo;
    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo; 
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}


