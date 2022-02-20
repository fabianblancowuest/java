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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
        número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        Scanner leer = new Scanner(System.in);
        int num;
        int arreglo [] = new int[4];
        
        //Bucle para capturar los valores del arreglo
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num >= 1 && num <= 20) {
                arreglo[i] = num;
            } else {
                System.out.println("Debe ingresar números comprendidos entre 1 y 20");
                i--;
            }
        }
        //Bucle para mostrar el arreglo
        for (int i = 0; i < 4; i++) {
            System.out.print(arreglo[i]);
            
            for (int j = 0; j < arreglo[i]; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }
    
}
