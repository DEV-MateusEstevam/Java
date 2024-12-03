package herança30112024;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public Pessoa(){
        this.setNome(null);
        this.setIdade(0);
        this.setSexo(null);
    }
    
    public Pessoa(String _nome, int _idade, String _sexo){
        this.setNome(_nome);
        this.setIdade(_idade);
        this.setSexo(_sexo);
    }
    
    public String getNome(){return nome;}
    
    public final void setNome(String nome){this.nome = nome;}
    
    public int getIdade(){return idade;}
    
    public final void setIdade(int idade){this.idade = idade;}
    
    public String getSexo(){return sexo;}
    
    public final void setSexo(String sexo){this.sexo = sexo;}
    
    @Override
    public String toString(){
        return "Pessoa{ Nome: "+nome+", Idade: "+idade+", Sexo: "+sexo+"}";
    }
}
