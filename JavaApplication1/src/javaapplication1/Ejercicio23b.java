/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Fabián
 */
public class Ejercicio23b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y muestre 
        la traspuesta de la matriz.*/
        int matriz[][] = new int[4][4];

        System.out.println("Matriz Original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }

}
