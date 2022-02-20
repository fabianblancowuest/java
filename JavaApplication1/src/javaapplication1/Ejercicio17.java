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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int ancho, alto;
        
        alto = leer.nextInt();
        ancho = leer.nextInt();

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((i == 1) || (i == alto) || (j % ancho == 0) || (j-1) % ancho == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println("");
        }
    }
    
}
