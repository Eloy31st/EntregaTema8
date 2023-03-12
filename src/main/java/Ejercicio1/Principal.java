package Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del primer jugador");
        String nombre1 = sc.nextLine();
        System.out.println("Introduce el nombre del segundo jugador");
        String nombre2 = sc.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(nombre1);
        JugadorGuerra jugador2 = new JugadorGuerra(nombre2);

        while (jugador1.quedanFichas() && jugador2.quedanFichas()) {
            int tirada1 = jugador1.tirarDado();
            int tirada2 = jugador2.tirarDado();
            System.out.println(jugador1.getNombre() + " ha sacado " + tirada1);
            System.out.println(jugador2.getNombre() + " ha sacado " + tirada2);
            if (tirada1 > tirada2) {
                jugador1.ganarFicha();
                jugador2.perderFicha();
            } else if (tirada1 < tirada2) {
                jugador1.perderFicha();
                jugador2.ganarFicha();
            }else{
                System.out.println("Empate");
            }
            System.out.println("Marcador: " + jugador1.getNombre() + " " + jugador1.getFichas() + " - " + jugador2.getNombre() + " " + jugador2.getFichas());
        }

        if (jugador1.quedanFichas()) {
            System.out.println(jugador1.getNombre() + " ha ganado");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado");
        }
    }
}
