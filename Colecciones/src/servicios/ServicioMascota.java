package servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
 /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/
public class ServicioMascota {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {
        Mascota m1 = new Mascota();

        System.out.println("Ingrese nombre del perro");
        m1.setNombre(sc.next());
        System.out.println("Ingrese la raza del perro");
        m1.setRaza(sc.next());

        return m1;
    }

    public void mostraLista(ArrayList<Mascota> lista) {

        for (Mascota mascota : lista) {
            System.out.println(mascota.toString());
        }
    }

    public void eliminarLista(ArrayList<Mascota> mascota) {

        System.out.println("¿Qué perro desea buscar?");
        String aux = sc.next();

        Iterator<Mascota> it = mascota.iterator(); //creo y duplico la lista de modificacion
        Boolean buleano = false;

        while (it.hasNext()) { // iTERA SI HAY MAS ELEMENTOS

            if (it.next().getNombre().equals(aux)) { // 
                it.remove();
                buleano = true;

                System.out.println("Elimininamos a " + aux.toString());
            }
        }
        if (!buleano) {
            System.out.println("No encontramos al perrro");
        }
        
    }
    
    public void ordenarLista(ArrayList<Mascota>mascota) {
        mascota.sort(Mascota.compararNombre);
    }

}
