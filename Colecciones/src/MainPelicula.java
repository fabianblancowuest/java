
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainPelicula {

    /*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList();

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String seguir = "";

        do {
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el título de la película");
            p1.setTitulo(sc.next());
            System.out.println("Ingrese el director de la película");
            p1.setDirector(sc.next());
            System.out.println("Ingrese la duración de la película");
            p1.setHora(sc.nextDouble());

            peliculas.add(p1);

            System.out.println("¿Desea agregar otra película?");
            seguir = sc.next();

        } while (seguir.equalsIgnoreCase("si"));

        mostrarPelicula(peliculas);

        System.out.println("Películas con duración mayor a 1 hora");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getHora() > 1) {
                System.out.println(pelicula);
            }
        }

        System.out.println("Peliculas ordenadas de mayor a menor");
        peliculas.sort(Pelicula.compararDuracion);

        mostrarPelicula(peliculas);

        System.out.println("Películas ordenadas de menor a mayor");
        Collections.reverse(peliculas);

        mostrarPelicula(peliculas);

        System.out.println("Peliculas ordenadas por titulo");

        peliculas.sort(Pelicula.compararTitulo);
        mostrarPelicula(peliculas);

        System.out.println("Películas ordenadas por director");

        peliculas.sort(Pelicula.compararDirector);
        mostrarPelicula(peliculas);

    }

    public static void mostrarPelicula(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

}
