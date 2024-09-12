package co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model;
import co.edu.uniquindio.Biblioteca_2.Parcial_1.nombre.model.builder.RevistaBuilder;
public class Revista {
    private int idRevista;
    private String editorial;
    private int numeroPaginas;
    private String estado;
    private String descripcion;

    public Revista(int idRevista, String editorial, int numeroPaginas, String estado, String descripcion) {
        this.idRevista = idRevista;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    public static RevistaBuilder builder(){
        return new RevistaBuilder();

    }
    public int getIdRevista() {return idRevista;}
    public void setIdRevista(int idRevista) {this.idRevista = idRevista;}
    public String getEditorial() {return editorial;}
    public void setEditorial(String editorial) {this.editorial = editorial;}
    public int getNumeroPaginas() {return numeroPaginas;}
    public void setNumeroPaginas(int numeroPaginas) {this.numeroPaginas = numeroPaginas;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "idRevista=" + idRevista +
                ", editorial='" + editorial + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    /*2.3 En el proyecto de biblioteca  cree las siguientes funcionalidades
CRUD de revista
Recibiendo como parámetro un valor de edad, obtener la lista de miembros que superan ese valor.
Recibiendo como parámetro el estado(disponible, ocupado, reservado) de una revista, obtener el número de revistas según el estado.
*/
}
