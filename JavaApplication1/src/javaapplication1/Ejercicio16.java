/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
        tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
        con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
        carácter tiene que ser X y el último tiene que ser una O. 
        Las secuencias leídas que respeten el formato se consideran correctas, la 
        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
        secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
        se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

        Scanner leer = new Scanner(System.in);
        String FDE = "&&&&&";
        String palabra = "";
        int sumaCorrectas = 0, sumaIncorrectas = 0;

        System.out.println("Bienvenido al dispositivo RS232".toUpperCase());

        do {
            System.out.println("Ingrese una palabra con el siguiente formato:".toUpperCase());
            System.out.println("X###0");
            System.out.println("Si desea salir ingrese &&&&&".toUpperCase());
            palabra = leer.next().toUpperCase();
            
            if (palabra.length() > 5) {
                System.out.println("La palabra no deber tener mas de 5 caracteres".toUpperCase());
            } else if (palabra.substring(0, 1).equalsIgnoreCase("X") && palabra.substring(palabra.length() - 1).equalsIgnoreCase("O")) {
                System.out.println("Correcto".toUpperCase());
                sumaCorrectas = sumaCorrectas + 1;
            } else if (!palabra.equals(FDE)) {
                System.out.println("No respeta el formato".toUpperCase());
                sumaIncorrectas = sumaIncorrectas + 1;
            }
            
        } while (!palabra.equals(FDE));
       
        System.out.println("Cantidad de lecturas correctas ".toUpperCase() + sumaCorrectas);
        System.out.println("Cantidad de lecturas incorrectas ".toUpperCase() + sumaIncorrectas);
        System.out.println("¡Adiós!".toUpperCase());
    }

}
