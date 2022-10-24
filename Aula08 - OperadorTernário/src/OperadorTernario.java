public class OperadorTernario {

    public static void main(String[] args) {
        
        int x = 10;
        int y = 9;
        
        //Utilização do operador ternário e gravando o resultado em uma String.
        String r = (x > y)?"X e maior":"Y e menor";
        System.out.println(r);
        
        //-----------------------------------------------------------------------
        
        //Utilizando operador ternário e usando operadores relacionais.
        String nome = "Lazzari";
        String nome1 = new String("Lazzari");
        
        //Validando se nome é igual a nome1.
        //Neste caso será diferente, pois a estrutura dos dois são diferentes, nome é variável e nome1 é um objeto.
        String n = (nome == nome1)?"Igual":"Diferente";
        System.out.println(n);
        
        //Para que sejam iguais, é necessário usar equals, assim é possível validar se o conteúdo de nome é igual ao conteúdo de nome1.
        String n1 = (nome.equals(nome1))?"Igual":"Diferente";
        System.out.println(n1);
        
            
        
        
    }
    
}
