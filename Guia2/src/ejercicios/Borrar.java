/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabián
 */
public class Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        int edad = 18;
//        String nombre = "Juan";
//        edad++;
//        
//        System.out.println("Hola " + nombre + ". El año que viene tendrás " + (edad++) + " años");
//        String genero = "";
//        do {
//            genero = JOptionPane.showInputDialog("Introduce tu género (H/M");
//
//        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
//        
//        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm."));
//        
//        int pesoIdeal = 0;
//        
//        if(genero.equalsIgnoreCase("H")) {
//            
//            pesoIdeal = altura - 110;
//            
//        } else if(genero.equalsIgnoreCase("M")) {
//            
//            pesoIdeal = altura -120;
//        }
//        
//        System.out.println("Tu peso ideal es " + pesoIdeal + " kg.");
        System.out.println("Ingresa tu edad");

        String edad = sc.next();
       

        System.out.println("Hola Carolina, hoy tenes " + edad + " años" + " y el año que viene tendrás " + (edad + 1) + " años.");

    }

}
