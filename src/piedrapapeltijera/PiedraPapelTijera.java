package src.piedrapapeltijera;

import java.util.Scanner;

/*import src.jugadores.Jugador;
import src.jugadores.TablaJugadores;
import src.tablero.Tablero;
import java.util.*;*/
 
public class PiedraPapelTijera{   

    public void Partida(){
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Juego piedra-papel-tijera");
        

        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("el primer jugador  escogio: ");

        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
        int seleccionUsuario = scanner.nextInt();

    System.out.print("el segundo jugador habia escogido: ");
    switch ( seleccionCompu )
    {
       case 1:
          System.out.println("Piedra");
          switch ( seleccionUsuario )
          {
             case 1: System.out.println("Empate!"); break;
             case 2: System.out.println("Usted gana!"); break;
             case 3: System.out.println("El segundo jugador gana!"); break;
          }
          break;

       case 2:
          System.out.println("Papel");
          switch ( seleccionUsuario )
          {
             case 1: System.out.println("El segundo jugador gana!"); break;
             case 2: System.out.println("Empate!"); break;
             case 3: System.out.println("Usted gana!"); break;
          }
          break;

       case 3:
          System.out.println("Tijera");
          switch ( seleccionUsuario )
          {
             case 1: System.out.println("Usted gana!"); break;
             case 2: System.out.println("El segundo jugador gana!"); break;
             case 3: System.out.println("Empate!"); break;
          }
          break;
    }

    }
              
    

}


