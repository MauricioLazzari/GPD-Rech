
import java.awt.Toolkit;

public class ResolucaoSistema {

    public static void main(String[] args) {
       
        //Usando a classe Toolkit.
        Toolkit tool = Toolkit.getDefaultToolkit();
        
        //Chamando objeto tool da classe Toolkit e seus métodos para trazer os tamanhos da resolução.
        System.out.println("A resolucao do sistema e: " + tool.getScreenSize().width + " X " + tool.getScreenSize().height);
        
    }
    
}
