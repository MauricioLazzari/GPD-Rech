
import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        //Utilizando classe Locale.
        Locale loc = Locale.getDefault();
        
        //Chamando objeto loc da classe Locale para trazer o idioma do sistema.
        System.out.println("Idioma do sistema e: " + loc.getDisplayLanguage());
        
    }
    
}
