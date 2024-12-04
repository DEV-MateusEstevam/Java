package projetofinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalVideoAssistido;
    
    public void viuMaisUmVideo(){
        this.setTotalVideoAssistido(this.getTotalVideoAssistido() + 1);
        System.out.println("Parabéns "+nome+" por mais video assistido! Continue assim!");
    }
    
    public Gafanhoto(String _nome, int _idade, String _sexo, int _experiencia, String _login, int _totalVideoAssistido){
        super(_nome,_idade, _sexo, _experiencia);
        this.setLogin(_login);
        this.setTotalVideoAssistido(_totalVideoAssistido);
    }
    
    public Gafanhoto(){
        super();
        this.setLogin(null);
        this.setTotalVideoAssistido(0);
    }
    
    public String getLogin(){return login;}
    
    public final void setLogin(String login){this.login = login;}
    
    public int getTotalVideoAssistido(){return totalVideoAssistido;}
    
    public final void setTotalVideoAssistido(int totalVideoAssistido){this.totalVideoAssistido = totalVideoAssistido;}
    
   @Override
    public String toString(){
        return"Gafanhoto { Nome: "+nome+", Idade: "+idade+", Sexo: "+sexo+", Experiencia: "+experiencia+", Login: "+login+", Quantidade de Videos Assistidos: "+totalVideoAssistido+"}";
    }
    /* outro modo de usar o super
    @Override
    public String toString(){
        return"Gafanhoto { "+super.toString()+", Login: "+login+", Quantidade de Videos Assistidos: "+totalVideoAssistido+"}";
    }*/
}
