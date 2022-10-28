package entradavalores;

import javax.swing.JOptionPane;

public class ValoresJOptionPane {
    
    public static void main(String [] args){
        
        float qtdValores = -1;
        float soma = 0;
        float totPares = -1;
        float totImpares = 0;
        float acimaCem = 0;
        float media;
        int valor;
        
        do{
            
             valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor\nDigite 0 para interromper", "Entrada de valores", JOptionPane.INFORMATION_MESSAGE));
            soma = soma + valor;
             qtdValores += 1;
             
             
             if(valor%2 == 0){
                 totPares++;
             }else if(valor%2 != 0){
                 totImpares++;
             }
             if(valor > 100){
                 acimaCem++;
             }
             
             media = soma/qtdValores;
             
            
        }while(valor!=0);
        
        JOptionPane.showMessageDialog(null, ("Resultado: "
                + "\nTotal de valores: " + qtdValores
                + "\nTotal de pares: " + totPares
                + "\nTotal de ímpares: " + totImpares
                + "\nAcima de 100: " + acimaCem
                + "\nMédia dos valores: " + media), "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
