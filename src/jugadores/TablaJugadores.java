package src.jugadores;
import java.util.Scanner;

public class TablaJugadores {
    private int maximoJugadores = 10;
    private Jugador[] jugadores = new Jugador[maximoJugadores];
    Scanner scanner = new Scanner(System.in);
    private int ultimoJugador = 0;

    public void ingresarJugador(){

        if (ultimoJugador<maximoJugadores) {
            System.out.println("Escriba el nombre del jugador");
            jugadores[ultimoJugador] = new Jugador(scanner.nextLine());
            ultimoJugador++;
            
        }
        else{
            System.out.println("No se puede ingresar, ya ha alcanzado el numero maximo de jugadores permitidos");
        }
    }

    public void mostrarJugadores(){
        if (ultimoJugador == 0) {
            System.out.println("No hay jugadores ingresados");
            
        }
        else {
            System.out.println(" Lista de jugadores ");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jugadores[i].getNombre());
            }

            
        }
    }
    public void mostrarTablaPosiciones () {

        if (ultimoJugador == 0) {
            System.out.println("\n    No hay jugadores ingresados.");
        } 
        else {
            ordenarTabla();
            System.out.println("\n   - Tabla de Posiciones -\n");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jugadores[i].mostrarDatosJugador());
            }
        }
    }
    
    public void ordenarTabla() {

        for (int i = 0; i < ultimoJugador; i++) {
            for (int j = 0; j < ultimoJugador-1; j++) {

                if (jugadores[j].getPuntuacion() < jugadores[j+1].getPuntuacion()) {
                    Jugador aux = jugadores[j];
                    jugadores[j] = jugadores[j+1];
                    jugadores[j+1] = aux;
                }
            }
        }

    }

    public Jugador seleccionarJugador() {

        mostrarJugadores();

        System.out.print("\n  Escriba el numero del jugador: ");
        int num = Integer.parseInt(scanner.nextLine());

        return jugadores[num-1];
    }

    public int getUltimoJugador() {
        return ultimoJugador;
    }

    public void setUltimoJugador(int ultimoJugador) {
        this.ultimoJugador = ultimoJugador;
    }
           
}
