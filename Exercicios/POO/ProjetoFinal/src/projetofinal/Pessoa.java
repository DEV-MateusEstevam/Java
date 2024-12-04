package projetofinal;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;
    
    public void ganharExperiencia(){
        this.setExperiencia(this.getExperiencia() + 1.0);
        System.out.println("Parabéns "+nome+", você acaba de ganhar mais 1 ponto de experiencia!");
    }
    
    public Pessoa(String _nome, int _idade, String _sexo, double _experiencia){
        this.setNome(_nome);
        this.setIdade(_idade);
        this.setSexo(_sexo);
        this.setExperiencia(_experiencia);
    }
    
    public Pessoa(){
        this.setNome(null);
        this.setIdade(0);
        this.setSexo(null);
        this.setExperiencia(0);
    }
    
    public String getNome(){return nome;}
    
    public final void setNome(String nome){this.nome = nome;}
    
    public int getIdade(){return idade;}
    
    public final void setIdade(int idade){this.idade = idade;}
    
    public String getSexo(){return sexo;}
    
    public final void setSexo(String sexo){this.sexo = sexo;}
    
    public double getExperiencia(){return experiencia;}
    
    public final void setExperiencia(double experiencia){this.experiencia = experiencia;}
    
    @Override
    public String toString(){
        return"Pessoas { Nome: "+nome+", Idade: "+idade+", Sexo: "+sexo+", Experiencia: "+experiencia+"}";
    }
}