package ejercicios;

import ejercicios.entidades.Libro;
import ejercicios.servicios.ServicioLibro;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
public class LibroApp {

    public static void main(String[] args) {

        ServicioLibro l1 = new ServicioLibro();

        Libro l = l1.cargarLibro();

        System.out.println(l.toString());

    }

}
