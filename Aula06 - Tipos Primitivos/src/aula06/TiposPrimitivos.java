package aula06;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        //Declarando float com typecast e sem typecast.
        float valor = (float)8.5;
        float valor2 = 8.5f;
        String nome = "Mauricio";
        
        //Imprimindo na tela o valor.
        System.out.println("O valor e: " + valor);
        
        //Imprimindo na tela nome e valor usando printf.
        //Também é possível usar format que chega no mesmo resultado.
        System.out.printf("A nota de %s e %.2f! \n", nome, valor);
        
        
        //Criando objeto da classe Scanner para poder ler os dados do teclado.
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String aluno = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        
        System.out.println("O nome do alunos e: " + aluno + " e sua nota e: " + nota);
       
    }
    
}
