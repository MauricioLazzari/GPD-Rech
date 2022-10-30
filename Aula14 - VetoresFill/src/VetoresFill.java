
import java.util.Arrays;

public class VetoresFill {

    public static void main(String[] args) {
       
        //Declarando um vetor de 5 posições.
        int v[] = new int[5];
        
        //Usando a classe array para preencher todas posições do array com conteúdo 0.
        Arrays.fill(v, 0);
        
        //Usando foreach para imprimir o conteúdo das posições do vetor.
        for(int i : v){
            System.out.println(i);
        }
    }
    
}
