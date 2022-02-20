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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y muestre 
        la traspuesta de la matriz.*/

        int matriz[][] = new int[4][4];
        int matrizTranspuesta[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
            }
        }
        
        System.out.println("Matriz original");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }

        }
        
        System.out.println("Matriz Transpuesta");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizTranspuesta[i][j]);

            }
            System.out.println("");
        }

    }

}
