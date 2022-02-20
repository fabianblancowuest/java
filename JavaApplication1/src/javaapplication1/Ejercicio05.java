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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        . Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        System.out.println("Doble: " + numero * 2);
        System.out.println("Triple: " + numero * 3);
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("Raíz cuadrada: " + raizCuadrada);

    }

}
