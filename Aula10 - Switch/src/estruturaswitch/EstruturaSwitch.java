package estruturaswitch;

import java.util.Scanner;


public class EstruturaSwitch {

   
    public static void main(String[] args) {
        
        System.out.println("Quantas pernas?");
        
        String tipo;
        
        Scanner teclado = new Scanner(System.in);
        
        int pernas = teclado.nextInt();
        
        switch(pernas){
            case 1:
               tipo = "Saci";
               break;
            case 2:
               tipo = "Bipede";
               break;
            case 3:
               tipo = "Tripede";
               break;
            case 4:
               tipo = "Quadripede";
               break;
            case 5, 8:
               tipo = "Aranha";
               break;
            default:
               tipo = "ET";
        }
        
        System.out.println(tipo);
    }
    
}
