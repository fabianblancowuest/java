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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Implementar un programa que dado dos números enteros determine cuál es el 
        mayor y lo muestre por pantalla. */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else {
            System.out.println("El número mayor es " + num2);
        }
    }
    
}
