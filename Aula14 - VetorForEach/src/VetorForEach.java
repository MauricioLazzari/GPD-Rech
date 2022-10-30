
import java.util.Arrays;

public class VetorForEach {

    public static void main(String[] args) {
        
        int num[] = {8,5,6,8,9,7,4,2,1,5};
        
        //Colocando vetor em ordem utilizando a classe arrays.
        Arrays.sort(num);
        
        //Utilizando for "para cada" valor valor de num será gravado em i.
        for(int i : num){
            System.out.println(i + " ");
        }
        
        
        
    }
    
}
