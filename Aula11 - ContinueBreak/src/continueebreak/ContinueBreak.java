/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package continueebreak;

/**
 *
 * @author mauri
 */
public class ContinueBreak {

    public static void main(String[]args){
    
        int cc = 0;
        //Estrutura de repetição while ou enquanto.
        //Enquando cc for menor que 10.
        while(cc < 10){
            cc++;
            //Após encontrar o valor no laço, o continue faz com que este valor seja removido.
            if(cc == 5 || cc == 7){
                continue;          
            }
            //Após encontrar o valor no laço, o break interrompe o mesmo no número 8.
            if(cc == 8){
                break;
            }
            System.out.println("O número e: " + cc); 
        }
        
    }
    
}
