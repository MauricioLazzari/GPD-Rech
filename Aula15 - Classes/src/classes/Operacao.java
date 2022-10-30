package classes;

public class Operacao {
    
    public static String contador(int inicio, int fim){
        String contador = "";
        for(inicio = 0; inicio <= fim; inicio++){
            contador += inicio + " ";
        }
        return contador;
    }
    
}
