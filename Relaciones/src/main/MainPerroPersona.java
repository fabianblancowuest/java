package main;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioPerro;
import servicios.ServicioPersona;

public class MainPerroPersona {

    /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ServicioPersona sp1 = new ServicioPersona();
        ServicioPerro spe1 = new ServicioPerro();

        Persona p1 = sp1.crearPersona();
        Persona p2 = sp1.crearPersona();

        Perro pe1 = spe1.crearPerro();
        Perro pe2 = spe1.crearPerro();

        ArrayList<Perro> perros = new ArrayList();

        perros.add(pe1);
        perros.add(pe2);
        
        System.out.println("¿Qué perro deseas adoptar " + p1.getNombre() + "? Indique el nombre del perro");

        for (Perro perro : perros) {

            System.out.println(perro);

        }

        String nombre = sc.next();

        for (Perro perro : perros) {
            if (nombre.equalsIgnoreCase(perro.getNombre())) {

                p1.setPerro(perro);
                perros.remove(perro);
                break;

            }
        }

        System.out.println("¿Qué perro deseas adoptar " + p2.getNombre() + "? Indique el nombre del perro");

        for (Perro perro : perros) {

            System.out.println(perro);

        }

        nombre = sc.next();

        for (Perro perro : perros) {
            if (nombre.equalsIgnoreCase(perro.getNombre())) {

                p2.setPerro(perro);
                perros.remove(perro);
                break;

            }
        }
        
        System.out.println("La persona " + p1.getNombre() + " adoptó al perro " + p1.getPerro().getNombre());
        
        System.out.println("La persona " + p2.getNombre() + " adoptó al perro " + p2.getPerro().getNombre());
        
        

    }

}
