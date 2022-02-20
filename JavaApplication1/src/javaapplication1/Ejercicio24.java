///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication1;
//
//import java.util.Scanner;
//
///**
// *
// * @author Fabián
// */
//public class Ejercicio24 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
//        que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
//        cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de 
//        una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
//        viceversa)*/
//
//        Scanner leer = new Scanner(System.in);
//        int matriz[][] = new int[3][3];
//        int matrizT[][] = new int[3][3];
//        int matrizTN[][] = new int[3][3];
//
//        System.out.println("Ingrese números a la matriz");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matriz[i][j] = leer.nextInt();
//
//            }
//        }
//
//        System.out.println("Matriz");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matriz[i][j] + " ");
//
//            }
//            System.out.println("");
//        }
//
//        System.out.println("Matriz Transpuesta");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrizT[j][i] = matriz[i][j];
//                System.out.print(matriz[j][i] + " ");
//            }
//            System.out.println("");
//        }
//        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(matriz[i][j] == matrizT[i][j] * -1 && matriz[i][j]  != matrizT[i][j])
//            }
//        }
//
//        /*System.out.println("Matriz Transpuesta Negativa");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                matrizTN[i][j] = matrizT[i][j];
//
//                if (matrizT[i] != matrizT[j]) {
//                    matrizTN[i][j] = matrizT[i][j] * (-1);
//                }
//
//                System.out.print(matrizTN[i][j] + " ");
//            }
//            System.out.println("");
//        }*/
//        if (matriz == matrizT) {
//            System.out.println("La matriz es antisimétrica");
//        } else {
//            System.out.println("La matriz NO es antisimétrica");
//        }
//    }
//
//}
