package desafioproflucio;

public class FuncionarioTempoIntegral extends Funcionario{
    public double bonus;
    
    public double getBonus(){
        return bonus;
    }
    
    public final void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    //metodo construtor sem parametros
    public FuncionarioTempoIntegral(){
        super(); //carrega o método construtor da superClasse
        this.setBonus(0);
    }
    
    //metodo construtor com parametros
    public FuncionarioTempoIntegral(String _nome, int _id, double _salarioBase, double _bonus){
        super(_nome, _id, _salarioBase); //carrega o método construtor da superClasse
        this.setBonus(_bonus);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Id: "+this.getId());
        System.out.println("Salário Base: R$"+this.getSalarioBase());
        System.out.println("Bonus: "+this.getBonus());
        
        double salarioAtual = this.getSalarioBase() + this.getBonus();
        //salarioAtual é uma variavel
        
        System.out.println("Salario Atual: R$"+ salarioAtual);
    }
}
