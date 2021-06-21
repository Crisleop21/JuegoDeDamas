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

        tablero [3][0].setFicha(new Ficha(true));
        tablero [3][0].setFicha(new Ficha(false));
        tablero [2][1].setFicha(new Ficha(true));
        tablero [2][1].setFicha(new Ficha(false));

        tablero [5][0].setFicha(new Ficha(true));
        tablero [5][0].setFicha(new Ficha(false));
        tablero [4][1].setFicha(new Ficha(true));
        tablero [4][1].setFicha(new Ficha(false));

        tablero [7][0].setFicha(new Ficha(true));
        tablero [7][0].setFicha(new Ficha(false));
        tablero [6][1].setFicha(new Ficha(true));
        tablero [6][1].setFicha(new Ficha(false));

        tablero [1][2].setFicha(new Ficha(true));
        tablero [1][2].setFicha(new Ficha(false));
        tablero [3][2].setFicha(new Ficha(true));
        tablero [3][2].setFicha(new Ficha(false));

        tablero [5][2].setFicha(new Ficha(true));
        tablero [5][2].setFicha(new Ficha(false));
        tablero [7][2].setFicha(new Ficha(true));
        tablero [7][2].setFicha(new Ficha(false));

        //lado de abajo
        tablero [0][7].setFicha(new Ficha(true));
        tablero [0][7].setFicha(new Ficha(false));
        tablero [2][7].setFicha(new Ficha(true));
        tablero [2][7].setFicha(new Ficha(false));

        tablero [4][7].setFicha(new Ficha(true));
        tablero [4][7].setFicha(new Ficha(false));
        tablero [6][7].setFicha(new Ficha(true));
        tablero [6][7].setFicha(new Ficha(false));

        tablero [1][6].setFicha(new Ficha(true));
        tablero [1][6].setFicha(new Ficha(false));
        tablero [3][6].setFicha(new Ficha(true));
        tablero [3][6].setFicha(new Ficha(false));

        tablero [5][6].setFicha(new Ficha(true));
        tablero [5][6].setFicha(new Ficha(false));
        tablero [7][6].setFicha(new Ficha(true));
        tablero [7][6].setFicha(new Ficha(false));

        tablero [0][5].setFicha(new Ficha(true));
        tablero [0][5].setFicha(new Ficha(false));
        tablero [2][5].setFicha(new Ficha(true));
        tablero [2][5].setFicha(new Ficha(false));

        tablero [4][5].setFicha(new Ficha(true));
        tablero [4][5].setFicha(new Ficha(false));
        tablero [6][5].setFicha(new Ficha(true));
        tablero [6][5].setFicha(new Ficha(false));

       
        



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
