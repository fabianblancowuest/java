/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicios;

import ejercicios.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rec1 = new Rectangulo();
//        System.out.println("Ingrese base");
//        rec1.setBase(sc.nextDouble());
//        System.out.println(rec1.getBase());
        rec1 = rec1.crearRectangulo();

        System.out.println(rec1.calcularSuperficie());
        System.out.println(rec1.calcularPerimetro());
        rec1.dibujar();

    }

}
