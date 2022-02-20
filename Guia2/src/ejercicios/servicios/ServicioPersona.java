package ejercicios.servicios;

import ejercicios.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();

        System.out.println("Ingrese nombre");
        p1.setNombre(sc.next());
        System.out.println("Ingrese edad");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese sexo - M o F u O");
        p1.setSexo(sc.next());
        System.out.println("Ingrese peso");
        p1.setPeso(sc.nextDouble());
        System.out.println("Ingrese altura");
        p1.setAltura(sc.nextDouble());

        return p1;
    }

    public Integer calcularIMC(Persona p1) {

        Double IMC = p1.getPeso() / Math.pow(p1.getAltura(), 2);

        if (IMC < 20) {
            System.out.println("Está por debajo de su peso ideal");
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("Está en su peso ideal");
            return 0;
        } else if (IMC > 25) {
            System.out.println("Tiene sobrepeso");
            return 1;
        }
        return null;
       
        
    }

    public Boolean mayorEdad(Persona p1) {
        if (p1.getEdad() > 18) {
            System.out.println("Es mayor de edad");
            
        }
        return true;
    }

    public void calcular() {

    }

}
