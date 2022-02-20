/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicios.servicios;

import ejercicios.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class ServicioCafetera {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera llenarCafetera() {
        Cafetera caf1 = new Cafetera();
        caf1.setCantidadActual(caf1.getCapacidaMaxima());
        System.out.println("La cafetera está en su maxima expresión");
        return caf1;
    }
    
    public Cafetera servirTaza(Cafetera caf){
        System.out.println("Ingrese el tamaño de la taza");
        int tamanio = sc.nextInt();
        if (caf.getCantidadActual() < tamanio) {
            System.out.println("No hay suficiente café para llenar la taza. "
                    + "La taza se cargo hasta " + caf.getCantidadActual());
            caf.setCantidadActual(0);
            
        } else {
            System.out.println("La taza se llenó con éxito");
            caf.setCantidadActual(caf.getCantidadActual() - tamanio);
        }
        return caf;
    }
    
    public void vaciarCafetera(Cafetera cafe1) {
        cafe1.setCantidadActual(0);
    }
    
    public Cafetera agregarCafe(Cafetera cafe2) {
        System.out.println("Ingrese cantidad de café");
        int cantidad = sc.nextInt();
        cafe2.setCantidadActual(cafe2.getCantidadActual() + cantidad);
        return cafe2;
    }
}
