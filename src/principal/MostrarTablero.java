package src.principal;

import src.tablero.Tablero;

public class MostrarTablero {
    public static void main(String[] args) {
        String ANSI_BLANCO = "176 ";
        String ANSI_NEGRO = "178";
        
        Tablero tablero = new Tablero(ANSI_BLANCO,ANSI_NEGRO);
        
        tablero.imprimeTablero();
    }
    
}
