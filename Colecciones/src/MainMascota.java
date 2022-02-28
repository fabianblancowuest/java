
import entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioMascota;

public class MainMascota {

    /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
    /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ServicioMascota sm = new ServicioMascota();

        ArrayList<Mascota> mascotas = new ArrayList();

        String aux = "";

        do {

            Mascota m1 = sm.crearMascota();
            mascotas.add(m1);
            System.out.println("¿Desea ingresar otra mascota?");
            aux = sc.next();
            
        } while (aux.equalsIgnoreCase("si"));
        
        sm.mostraLista(mascotas);
        sm.eliminarLista(mascotas);
        sm.ordenarLista(mascotas);

    }

}
