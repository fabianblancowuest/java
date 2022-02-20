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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un programa que pida dos números enteros positivos por teclado y 
        muestre por pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int option;
        String sino = "N";

        do {
            System.out.println("Ingrese dos números");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("Ingrese que operación desea realizar" + "\n"
                    + "1 SUMA" + "\n" + "2 RESTA" + "\n" + "3 MULTIPLICACIÓN" + "\n" + "4 DIVISIÓN" + "\n" + "5 SALIR");

            option = leer.nextInt();
            switch (option) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa");
                    System.out.println("S/N");
                    sino = leer.next().toUpperCase();
                    if (sino.equals("S")) {
                        System.out.println("!HASTA LUEGO!");
                    }

            }

        } while (!sino.equals("S"));

    }

}
