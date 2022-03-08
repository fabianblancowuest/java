package servicios;

import entidades.Persona;
import java.util.Scanner;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

public class ServicioPersona {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona");
        p1.setApellido(sc.next());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(sc.nextInt());
      
        
        return p1;
    }
}
