package idiomadosistema;
import java.util.Locale;
  
public class IdiomaDoSistema {
    
    public static void main(String[] args) {
       Locale idioma = Locale.getDefault();
       System.out.println("O sistema do computador está no idioma: "+ idioma.getDisplayLanguage());
    }
    
}