package src.tablero;

public class Tablero {
    
    String caracterSinDestapar;
    String caracterDestapado;
    String tablero[][];
    String [] abc = {"a","b","c","d","e","f","g","h","i","j"};

  

    public Tablero(String caracterSinDestapar, String caracterDestapado) {
       
        this.caracterSinDestapar = caracterSinDestapar;
        this.caracterDestapado = caracterDestapado;

        tablero = new String[9][9];

        for(int i = 1; i < 9; i++)
            for(int j=1; j < 9; j++)
                tablero[i][j] = caracterSinDestapar;

        for(int i = 1; i < 9; i++)
            tablero[i][0] = String.valueOf(i);

        for(int j = 1; j < 9; j++)
            tablero[0][j] = abc[j-1];
           
        tablero[0][0] = " ";

    }

    public void imprimeTablero()
    {
        for(int i=0; i < 9; i++)
        {
            for(int j=0; j < 9; j++)
            {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public String getCaracterSinDestapar() {
        return caracterSinDestapar;
    }

    public void setCaracterSinDestapar(String caracterSinDestapar) {
        this.caracterSinDestapar = caracterSinDestapar;
    }

    public String getCaracterDestapado() {
        return caracterDestapado;
    }

    public void setCaracterDestapado(String caracterDestapado) {
        this.caracterDestapado = caracterDestapado;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public String[] getAbc() {
        return abc;
    }

    public void setAbc(String[] abc) {
        this.abc = abc;
    }

}
