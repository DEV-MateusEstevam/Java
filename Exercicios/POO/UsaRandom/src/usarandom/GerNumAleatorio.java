package usarandom;

// Criar uma classe para gerar números aleatórios
import javax.swing.JOptionPane;

public class GerNumAleatorio {
    // um método estático - método da classe
    public static void MegaSena(int qtde){
        String Sequencia = ""; // uma caractere vazia
        for(int i = 1; i <= qtde; i++){
            // gerar um número aleatório de 1 a 60
            // Math.random()*60 --> gerar um número aleatório entre 0 a 59
            int numMegaSena = (int) (Math.random()*60 + 1);
            Sequencia += numMegaSena + " ";
        }
        JOptionPane.showMessageDialog(null,"Número da MegaSena com " + qtde +
                " números: \n" + Sequencia);
    }
    // um método estático - método da classe
    public static void Senha(int qtde){
        String SeqSenha = ""; // uma caractere vazia
        for(int i = 1; i <= qtde; i++){
            // gerar um núemro de 0 a 9
            int numSenha = (int) (Math.random()*10);
            SeqSenha += numSenha;
        }
        JOptionPane.showMessageDialog(null,"Número gerado com " + qtde +
                " digitos: \n" + SeqSenha);
    }
}