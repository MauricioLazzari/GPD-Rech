package metodosfuncioes;


public class MetodoseFuncoes {
    
    //Podemos usar métodos e funções, porém nos métodos a exibição do resultado já está fixado.
    //E na função podemos apenas retornar o valor e depois manipular a exibição com este valor.
    //Usando métodos podemos deixar o sistema um pouco engessado.
    
    //Declarando um método que não possui retorno.
    static void soma(int v1, int v2){
        int soma = v1 + v2;
        System.out.println("A soma dos valores e: " + soma);
    }
    
    //Declarando uma funcção onde é necessário ter um retorno e seu tipo de retorno especificado.
    static int mult(int v1, int v2){
        int mult = v1 * v2;
        return mult;
    }
            
        public static void main(String [] args){
        soma(5,2);
        System.out.println("A multiplicacao dos vaores resulta em: " + mult(5,2));
    }
    
}
