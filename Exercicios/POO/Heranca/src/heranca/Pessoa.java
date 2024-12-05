package heranca;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Feliz Aniversário!!!");
    }
    
    //Construtor
    public Pessoa(){
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
    }
    
    public Pessoa(String _nome, String _sexo, int _idade){
        this.setNome(_nome);
        this.setSexo(_sexo);
        this.setIdade(_idade);
    }
    
    //metodos especiais
    public String getNome(){return nome;}
    
    public String getSexo(){return sexo;}
    
    public int getIdade(){return idade;}
    
    public final void setNome(String nome){this.nome = nome;}
    
    public final void setSexo(String sexo){this.sexo = sexo;}
    
    public final void setIdade(int idade){this.idade = idade;}
    
    @Override
    public String toString(){
        return "Pessoa{ " + "nome: "+nome+", sexo: "+sexo+", idade: "+idade+"}";
    }
}
