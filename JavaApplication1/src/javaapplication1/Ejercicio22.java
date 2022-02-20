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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

        Scanner leer = new Scanner(System.in);
        int numeros[] = new int[10];
        int cont;
        cont = 0;
        int suma1, suma2, suma3, suma4, suma5;
        suma1 = 0;
        suma2 = 0;
        suma3 = 0;
        suma4 = 0;
        suma5 = 0;

        System.out.println("Ingrese los números al vector");

        for (int i = 0; i < 5; i++) {
            numeros[i] = leer.nextInt();

            while (numeros[i] != 0) {
                numeros[i] = numeros[i] / 10;
                cont++;
                if (cont > 5) {
                    System.out.println("Solo se permiten números de hasta 5 dígitos");
                }

            }

            System.out.println("El número tiene " + cont + " dígitos");
            switch (cont) {
                case 1:
                    suma1++;
                    break;
                case 2:
                    suma2++;
                    break;
                case 3:
                    suma3++;
                    break;
                case 4:
                    suma4++;
                    break;
                case 5:
                    suma5++;
                    break;
            }

            cont = 0;

        }
        System.out.println("Números con 1 dígito " + suma1);
        System.out.println("Números con 2 dígitos " + suma2);
        System.out.println("Números con 3 dígitos " + suma3);
        System.out.println("Números con 4 dígitos " + suma4);
        System.out.println("Números con 5 dígitos " + suma5);

    }

}
