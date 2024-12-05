package heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
    
    }
   
    //Construtor
    public Professor(String _nome, String _sexo,int _idade, String _especialidade, double _salario){
        super(_nome, _sexo, _idade);
        this.setEspecialidade(_especialidade);
        this.setSalario(_salario);
    }
    
    //construtor
     public Professor(){
        super();
        this.especialidade = "";
        this.salario = 0;
    }
    
    public String getEspecialidade(){return especialidade;}
    
    public final void setEspecialidade(String especialidade){this.especialidade = especialidade;}
    
    public double getSalario(){return salario;}
    
    public final void setSalario(double salario){this.salario = salario;}
}
