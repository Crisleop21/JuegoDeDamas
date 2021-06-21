package src.tablero;

public class Ficha {
    private boolean esNegra;

    private char celda = '▓';
    private char celdaColor = '▓';
    

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    

    public String getCaracter(){
        String res = (esNegra)?ANSI_PURPLE+celda:ANSI_BLACK+celda;
        
        return res;
    }
    public Ficha(boolean esNegra){
        this.esNegra = esNegra;
    }
    
}
