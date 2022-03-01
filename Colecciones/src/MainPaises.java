
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MainPaises {

    /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        HashSet<String> paises = new HashSet();
        String buleano = "";
        do {
            System.out.println("Ingrese un país");
            paises.add(sc.next());

            System.out.println("Desea guardar otro país");
            buleano = sc.next();

        } while (buleano.equalsIgnoreCase("si"));

        for (String paise : paises) {
            System.out.println(paise);
        }

        ArrayList<String> lista = new ArrayList(paises);
        Collections.sort(lista);

        System.out.println("Países ordenados alfabéticamente");
        for (String string : lista) {
            System.out.println(string);
        }

        System.out.println("Ingrese el país que desea borrar");
        String paisBorrar = sc.next();
        
        boolean encontrado = false;
        
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisBorrar)) { // Borramos si está el numero 3
                it.remove();
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No se encontró el país ingresado");
        }
        
        System.out.println("Lista actualizada");
        for (String paise : paises) {
            System.out.println(paise);
            
        }
    }

}
