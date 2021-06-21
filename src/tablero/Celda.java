package src.tablero;

public class Celda {
    private boolean conColor;
    private Ficha ficha;
    
    private char celdaColor = '▓';


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void setFicha(Ficha f){
        this.ficha = f;
    }
    
    public Celda(boolean conColor){
        this.conColor = conColor;
        this.ficha = null;
    }

    public String pintarCelda(int linea){
        String res = "";
        if (conColor) {
            
            if (ficha!=null) {       
                if (linea == 0 || (linea == 2) ) 
                    res = ""+ANSI_WHITE+celdaColor+celdaColor+ficha.getCaracter()+ficha.getCaracter()+ANSI_WHITE+celdaColor+celdaColor;
                if (linea == 1) 
                    res = ""+ANSI_WHITE+celdaColor+ficha.getCaracter()+ficha.getCaracter()+ficha.getCaracter()+ficha.getCaracter()+ANSI_WHITE+celdaColor;         
            }
            else{
                res = ""+ANSI_WHITE+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor;
            }

        }
        else {
            if (ficha!=null) {       
                if (linea == 0 || (linea == 2) ) 
                    res = ""+ANSI_GREEN+celdaColor+celdaColor+ficha.getCaracter()+ficha.getCaracter()+ANSI_GREEN+celdaColor+celdaColor;
                if (linea == 1) 
                    res = ""+ANSI_GREEN+celdaColor+ficha.getCaracter()+ficha.getCaracter()+ficha.getCaracter()+ficha.getCaracter()+ANSI_GREEN+celdaColor;         
            }
            else{
                res = ""+ANSI_GREEN+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor;
            }
        }
        return res;

    }
    
}
