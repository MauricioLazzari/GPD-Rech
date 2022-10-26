import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a nota 1:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a nota 2:");
        float n2 = teclado.nextFloat();
        
        float media = (n1+n2)/2;
        
        if(media > 7){
            System.out.println("Parabens! Voce foi aprovado! Sua media e: " + media);
        }else{
            System.out.println("Voce foi reprovado! Sua media e: " + media);
        }
        
    }
    
}
