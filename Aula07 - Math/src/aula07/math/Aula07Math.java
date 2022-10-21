package aula07.math;


public class Aula07Math {

   
    public static void main(String[] args) {
        
        //Utilizando classe math.
        //Floor para arredondar para baixo.
        float valor = 8.5f;
        int cvalor = (int)Math.floor(valor);
        System.out.println(cvalor);
        
        //Ceil para arredondar para cima.
        int cvalor2 = (int)Math.ceil(valor);
        System.out.println(cvalor2);
        
        //Random para gerar um número aleatório.
        //Neste caso gera um número aleatório de 5 a 15.
        double ale = Math.random();
        int random = (int) (5 + ale *(15-5));
        System.out.println(random);
        
    }
    
}
