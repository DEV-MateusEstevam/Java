package resolucaodatela;
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDaTela {
    
    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimensao = kit.getScreenSize();
        System.out.println("A resolução da Tela deste computador é de "+dimensao.width+" de largura por "+dimensao.height+" de altura.");       
    }
}
