package src.principal;

import java.util.Scanner;

import src.jugadores.TablaJugadores;

public class Juego {

    Scanner scan = new Scanner(System.in);
    TablaJugadores tJugadores = new TablaJugadores();
    Partida partida;


    public Juego() {

        int opcion = 0;

        do {
            System.out.println("\n\n       JUEGO DE DAMAS");
            System.out.println("\n  Menu:");
            System.out.println("   1. Iniciar Partida.");
            System.out.println("   2. Ingresar un Jugador.");
            System.out.println("   3. Mostrar Jugadores.");
            System.out.println("   4. Tabla de Posiciones.");
            System.out.println("   5. Salir");
            System.out.print("\n   Escriba el numero de la opcion que elige: ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    partida = new Partida(tJugadores);
                    break;
                case 2:
                    tJugadores.ingresarJugador();
                    break;
                case 3:
                    tJugadores.mostrarJugadores();
                    break;
                case 4:
                    tJugadores.mostrarTablaPosiciones();
                    break;
                case 5:
                    System.out.println("\n  Vuelve pronto!\n\n");
                    break;

                default:
                    System.out.println("\n  Error. Opcion incorrecta.\n\n");
                    break;
            }

        } while (opcion != 5);

    }

    
}
