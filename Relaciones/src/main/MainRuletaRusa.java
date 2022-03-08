package main;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRuletaRusa {
/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        RevolverDeAgua r1 = new RevolverDeAgua();
        
        r1.llenarRevolver();
        
        System.out.println(r1);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.println("¿Cuantos jugadores son?");
        int num = sc.nextInt();
        
        if(num > 6 || num < 1) {
            num = 6;
        }
        
        for (int i = 0; i < num; i++) {
            Jugador j1 = new Jugador();
            j1.setId(i + 1);
            j1.setNombre("Jugador " + j1.getId());
            jugadores.add(j1);
        }
        
        Juego ju1 = new Juego();
        
        ju1.llenarJuego(jugadores, r1);
        ju1.ronda();
        
    }

}
