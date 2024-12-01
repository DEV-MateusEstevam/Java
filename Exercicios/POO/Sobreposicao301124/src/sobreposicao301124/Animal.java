package sobreposicao301124;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public Animal(double _peso, int _idade, int _membros){
        this.setPeso(_peso);
        this.setIdade(_idade);
        this.setMembros(_membros);
    }
    
    public Animal(){
        this.setPeso(0);
        this.setIdade(0);
        this.setMembros(0);
    }
    
    public double getPeso(){return peso;}
    
    public final void setPeso(double peso){this.peso = peso;}
    
    public int getIdade(){return idade;}
    
    public final void setIdade(int idade){this.idade = idade;}
    
    public int getMembros(){return membros;}
    
    public final void setMembros(int membros){this.membros = membros;}
    
    @Override
    public String toString(){
        return "Animal { Peso: "+peso+"KG, Idade: "+idade+", Quantidade de membros: "+membros+"}";
    }
    
}
