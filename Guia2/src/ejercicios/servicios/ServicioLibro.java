package ejercicios.servicios;

import ejercicios.entidades.Libro;
import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/

public class ServicioLibro {
    
    public Libro cargarLibro() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro");
        Integer ISBN = sc.nextInt();
        System.out.println("Ingrese el título del libro");
        String titulo = sc.next();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.next();
        System.out.println("Ingrese el número de páginas del libro");
        Integer numPaginas = sc.nextInt();
        
        return new Libro(ISBN, titulo, autor, numPaginas);
    }
    
    
}
