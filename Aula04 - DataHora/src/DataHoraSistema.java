import java.util.Date;

public class DataHoraSistema {

    public static void main(String[] args) {
        
        //Usando classe Data.
        Date data = new Date();
        
        //Chamando objeto data da classe locale para trazer a data e horário do sistema.
        System.out.println("Data do sistema: " + data.toString());
        
    }
    
}
