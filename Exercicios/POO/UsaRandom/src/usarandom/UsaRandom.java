package usarandom;

// Testar a classe GerNumAleatorio
import javax.swing.JOptionPane;

public class UsaRandom {

   //programa principal
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("A "
                + "quantidade de números para MegaSena:"));
        //chamar método através o nome da classe
        GerNumAleatorio.MegaSena(quantidade);
        
        int numSenha = Integer.parseInt(JOptionPane.showInputDialog("A "
                + "quantidade de números gerados para uma senha:"));
        //chamar método através o nome da classe
        GerNumAleatorio.Senha(numSenha);
    }
}