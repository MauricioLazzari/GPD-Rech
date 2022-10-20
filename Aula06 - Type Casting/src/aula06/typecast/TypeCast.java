package aula06.typecast;


public class TypeCast {

    public static void main(String[] args) {
        
        int idade = 25;
        String valor = "25";
        float salario = 2.5f;
        
        //Convertendo o valor inteiro "idade" em um tipo de dado string através da classe Integer.
        String idadeConvert = Integer.toString(idade);
        System.out.println(idadeConvert + " / Inteiro para String");
        
        //Convertendo a string valor em inteiro através da classe Integer.
        int valorConvert = Integer.parseInt(valor);
        System.out.println(valorConvert + " / String para Inteiro");
        
        //Usando typecast para transformar o salario em inteiro.
        int salarioConvert = (int)salario;
        System.out.println(salarioConvert + " / Float para Inteiro");
    }
    
}
