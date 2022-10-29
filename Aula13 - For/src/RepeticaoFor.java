public class RepeticaoFor {

    public static void main(String[] args) {
        int i;
        //Laço for iterando de 0 a 5 de 1 em 1.
        for(i = 0; i <= 5; i++){
            System.out.print(i + " ");
        }
        
        System.out.println("\n");
        
        int y;
        //Laço for iterando de 0 a 9 de 2 em 2.
        for(y = 0; y < 10; y+=2){
            System.out.print(y + " ");
        }
        
        System.out.println("\n");
        
        //Laço for iterando de 10 a 0, decrementando 1 e m 1.
        int t;
        for(t = 10; t > 0; t--){
            System.out.print(t + " ");
        }
        
        System.out.println("\n");
    }
    
}
