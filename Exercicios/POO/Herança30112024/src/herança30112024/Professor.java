package herança30112024;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Com o aumento de R$"+aumento+" , o salário do professor passa a ser de R$"+this.getSalario());
    }
    
    public Professor(String _nome, int _idade, String _sexo, String _especialidade, double _salario){
        super(_nome, _idade, _sexo);
        this.setEspecialidade(_especialidade);
        this.setSalario(_salario);
    }
    
    public Professor(){
        super();
        this.setEspecialidade(null);
        this.setSalario(0);
    }
    
    public String getEspecialidade(){return especialidade;}
    
    public final void setEspecialidade(String especialidade){this.especialidade = especialidade;}
   
    public double getSalario(){return salario;}
    
    public final void setSalario(double salario){this.salario = salario;}
    
    @Override
    public String toString(){
        return "Professor { Nome: "+this.getNome()+", Idade: "+this.getIdade()+", Sexo: "+this.getSexo()+", Especialidade: "+especialidade+", Salário R$:"+salario+"}";
    }
}
