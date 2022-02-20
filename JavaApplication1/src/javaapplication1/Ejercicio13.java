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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
        solicite números al usuario hasta que la suma de los números introducidos supere 
        el límite inicial.*/

        Scanner leer = new Scanner(System.in);
        int limite;
        int num;
        int suma = 0;

        System.out.println("Ingrese un valor límite positivo");
        limite = leer.nextInt();

        while (suma <= limite) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (num > -1) {
                suma = suma + num;
            } else {
                System.out.println("Debe ingresar un valor positivo");
            }
        }
        System.out.println("Límite inicial: " + limite);
        System.out.println("La suma superó el limite inicial, la suma es: " + suma);
        
        
    }

}
