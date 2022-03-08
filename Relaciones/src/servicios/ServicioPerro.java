package servicios;

import entidades.Perro;
import java.util.Scanner;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

public class ServicioPerro {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        Perro p1 = new Perro();
        
        System.out.println("Ingrese el nombre del perro");
        p1.setNombre(sc.next());
        System.out.println("Ingrese la raza del perro");
        p1.setRaza(sc.next());
        System.out.println("Ingrese la edad del perro");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        p1.setTamanio(sc.nextDouble());
        
        return p1;
    }
}
