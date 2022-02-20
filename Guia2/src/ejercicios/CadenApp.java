package ejercicios;

import ejercicios.entidades.Cadena;
import java.util.Scanner;

public class CadenApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase");
        c1.setFrase(sc.next());
    }

}
