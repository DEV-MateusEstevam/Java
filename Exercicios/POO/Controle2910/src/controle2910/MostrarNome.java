package controle2910;

import javax.swing.JOptionPane;

public class MostrarNome {
    // Os atributos com modificador private 
    private String Nome;
    private String SobreNome;
    
    public void showNome(String Nome, String SobreNome){
        Nome = JOptionPane.showInputDialog("Informe seu nome: ");
        SobreNome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
        this.Nome = Nome;
        this.SobreNome = SobreNome;
        //chamar o método privado 
        mensagem(this.Nome,this.SobreNome); 
    }
    //O método privado somente pode ser acessado pelo o método do propria class.
    private void mensagem(String Nome, String SobreNome){        
        JOptionPane.showMessageDialog(null, Nome + " " + SobreNome);
    }
}
