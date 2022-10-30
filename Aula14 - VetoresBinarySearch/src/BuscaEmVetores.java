
import java.util.Arrays;

public class BuscaEmVetores {

    public static void main(String[] args) {
        
        int n[] = {8,5,6,9,4,7,2,3,1};
        //Ordenando o vetor antes de realizar busca binária.
        Arrays.sort(n);
        
        //Usando a classe arrays para realizar uma busca binária dentro do vetor n.
        int pos = Arrays.binarySearch(n, 7);
        
        System.out.println(pos);
    }
    
}
