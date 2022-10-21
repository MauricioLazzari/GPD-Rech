package operadoresUnarios;


public class OperadoresUnarios {
    
    public static void main(String[]args){

        int valor = 5;
        System.out.println("O valor e: " + valor);
        //Variável com 5 + valor incrementado de + 1.
        int numero = 5 + valor++;
        //Será impresso 10, pois a variável numero soma um pós incremento.
        System.out.println("O valor e: " + numero);
        //Se mudarmos para pré-incremento, será impresso 11.
        int valor2 = 5;
        int numero2 = 5 + ++valor2;
        System.out.println("O valor e: " + numero2);
       
        
    }
    
}
