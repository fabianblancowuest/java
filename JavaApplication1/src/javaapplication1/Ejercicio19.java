/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/*
 * @author Fabián
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Crea una aplicación que a través de una función nos convierta una cantidad de 
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
        converir que será una cadena, este no devolverá ningún valor y mostrará un 
        mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 € */
        Scanner leer = new Scanner(System.in);
        String moneda;
        double cantidad;

        System.out.println("--BIENVENIDO AL CONVERSOR DE EUROS A OTRAS MONEDAS--");
        System.out.println("--INGRESE LA CANTIDAD DE EUROS--");
        cantidad = leer.nextDouble();
        System.out.println("--INGRESE LA MONEDA A CONVERTIR--");
        moneda = leer.next().toUpperCase();

        //Se llama a la función
        conversorMoneda(cantidad, moneda);
    }

    //Se crea una función que no retorna un resultado
    public static void conversorMoneda(double cantidad, String moneda) {
        double euro = 1;
        switch (moneda) {
            case "DOLAR":
            case "DOLARES":
                euro = cantidad * 1.28611;
                System.out.println("Con €" + cantidad + " obtiene $" + euro);
                break;
            case "YEN":
            case "YENES":
                euro = cantidad * 129.282;
                System.out.println("Con €" + cantidad + " obtiene ¥" + euro);
                break;
            case "LIBRA":
            case "LIBRAS":
                euro = cantidad * 0.86;
                System.out.println("Con €" + cantidad + " obtiene £" + euro);
                break;
            default:
                break;
        }
    }

}
