package desafioproflucio;

public abstract class Funcionario {
    public String nome;
    public int id;
    public double salarioBase;
    
    public String getNome(){
        return nome;
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public int getId(){
        return id;
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public final void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    //metodo construtor sem parametros
    public Funcionario(){
        this.setNome("");
        this.setId(0);
        this.setSalarioBase(0);
    }
    
    //metodo construtor com parametros
    public Funcionario(String _nome, int _id, double _salarioBase){
        this.setNome(_nome);
        this.setId(_id);
        this.setSalarioBase(_salarioBase);
    }
    
    public void exibirInfo(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Id: "+this.getId());
        System.out.println("Salário Base: R$"+this.getSalarioBase());
    }
}