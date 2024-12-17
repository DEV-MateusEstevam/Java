package horadosistema2;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class HoraDoSistema2 {

    public static void main(String[] args) {
        //Hora do sistema
        Date relogio = new Date();
        
        System.out.println("A hora do sistema é " +relogio.toString());
        System.out.println();
        
        //Idioma do Sistema
        Locale idioma = Locale.getDefault();
        System.out.println("O sistema do computador esta no idioma : "+ idioma.getDisplayLanguage(idioma));
        System.out.println();
        
        //Resolução de Tela
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dimensao = tool.getScreenSize();
        
        System.out.println("A resolução de Tela desse computador é de "+dimensao.width+" de lagura por "+dimensao.height+" de altura.");
        System.out.println();
    }
}