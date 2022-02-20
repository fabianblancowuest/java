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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
        pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
        encuentra el numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);
        int n;
        int num;
        boolean encontrado = false;

        System.out.println("Ingrese la dimensión del arreglo");
        n = leer.nextInt();

        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }

        System.out.println("Ingrese el número que desea buscar");
        num = leer.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                System.out.println("El " + num + " se encuentra en la posición " + i);
                encontrado = true;
            }

        }
        if (encontrado == false) {
            System.out.println("El número no se encuentra en el arreglo");
        }

    }

}
