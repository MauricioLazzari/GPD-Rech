package estruturarepeticao;

public class EstruturaRepeticao {
    
    public static void main(String [] args){
        int laco = 0;
        //Enquanto laco for menor que 4 irá repetir.
        //Neste caso irá inicializar em 1 pois o laco++ vem antes de ser exibido na tela.
        while(laco < 4){
            laco++;
            System.out.println("Cambalhota: " + laco);  
        }
    }
        
}
