package src.tablero;

public class Tablero {

    private Celda[][] tablero;
    private final int x,y;

    public Tablero(int x, int y){
        this.x = x;
        this.y = y;

        tablero = new Celda[x][y];
        inicializarTablero();

        tablero [0][1].setFicha(new Ficha(true));
        tablero [0][1].setFicha(new Ficha(false));
        tablero [1][0].setFicha(new Ficha(true));
        tablero [1][0].setFicha(new Ficha(false));


    }

    private void inicializarTablero(){
        boolean conColorInicio = false;
        boolean conColorIteracion = false;

        for (int i = 0; i < y; i++) {
            conColorIteracion = !conColorIteracion;
           for (int j = 0; j < x; j++) {
               tablero[j][i] = new Celda(conColorIteracion);
               conColorIteracion = !conColorIteracion;
           }
           conColorInicio = !conColorInicio; 
        }
    }

    public void pintarTablero(){
       
        for (int i = 0; i < y; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(tablero[j][i].pintarCelda(k));
                 }
                 System.out.println("");   
            }
           
        }
    }
    
}
