package dowhile;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String [] args){
        Scanner c = new Scanner(System.in);
        int i = 0, r = 0, soma = 0;
        String numeros = "";

        System.out.println("Quantos numeros voce quer digitar? ");
        int numero = c.nextInt();
        
        do{
            i++;
            System.out.printf("\nDigite o numero %d: ", i);
            int numero2 = c.nextInt();
            numeros += numero2 + " ";
            soma += numero2;
            
        }while(i < numero);
        
        System.out.println("Os numeros digitados sao: " + numeros);
        System.out.println("A soma dos numeros sao: " + soma);
    
}
    
}
