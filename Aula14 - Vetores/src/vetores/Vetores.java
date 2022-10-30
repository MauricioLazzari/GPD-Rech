package vetores;

public class Vetores {

    public static void main(String[] args) {
        //Declarando vetor n do tipo inteiro.
        int n[] = {5,8,9,11,15};
        //Outra seria criando um objeto.
        //int v[] = new int[5];
        
        int i;
        //Laço for para percorrer os valores do vetor.
        for(i = 0; i <5; i++){
            System.out.println("Na posicao: " + i + " temos o valor " + n[i]);
        }
        
        System.out.println("\n");
        
        //Outra maneira de percorrer o vetor é usando seu atributo length, que corresponde ao comprimento do vetor.
        for(i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }
        
    }
    
}
