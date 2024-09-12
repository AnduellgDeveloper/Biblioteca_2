package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.Revista;
public class RevistaBuilder {
    protected int idRevista;
    protected String editorial;
    protected int numeroPaginas;
    protected String estado;
    protected String descripcion;

    public Revista build(){
        return new Revista(idRevista, editorial, numeroPaginas,estado,descripcion);
    }
    public RevistaBuilder idRevista(int idRevista) {
        this.idRevista = idRevista;
        return this;
    }
    public RevistaBuilder editorial(String editorial){
        this.editorial = editorial;
        return this;
    }
    public RevistaBuilder numeroPaginas (int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
        return this;
    }
    public RevistaBuilder estado(String estado){
        this.estado = estado;
        return this;
    }
    public RevistaBuilder descripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }
}
