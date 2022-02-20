package ejercicios.entidades;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/

public class Libro {

    private Integer ISBN;
    private String titulo;
    private String Autor;
    private Integer numPaginas;

    public Libro() {
    }

    public Libro(Integer ISBN, String titulo, String Autor, Integer numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", Autor=" + Autor + ", numPaginas=" + numPaginas + '}';
    }

}
