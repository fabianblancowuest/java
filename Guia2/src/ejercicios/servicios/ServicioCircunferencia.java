package ejercicios.servicios;

import ejercicios.entidades.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/


public class ServicioCircunferencia {
    
    public Circunferencia crearCircunferencia() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Circunferencia radio1 = new Circunferencia();
        
        System.out.println("Ingrese el radio");
        radio1.setRadio(sc.nextDouble());
        
        return radio1;
        
    }
    
    public void area(Circunferencia r1) {
        
        Double area = Math.PI * Math.pow(r1.getRadio(), 2);
        System.out.println("El área es: " + area);
        
    }
    
    public void perimetro(Circunferencia r1) {
        Double perimetro = 2 * Math.PI * r1.getRadio();
        System.out.println("El perímetro es: " + perimetro);
    }

}
