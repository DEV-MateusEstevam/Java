package desafioproflucio;

public class FuncionarioMeioPeriodo extends Funcionario{
    public int horasTrabalhadas;
    public double salarioPorHora;
    
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public final void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getSalarioPorHora(){
        return salarioPorHora;
    }
    
    public final void setSalarioPorHora(double salarioPorHora){
        this.salarioPorHora = salarioPorHora;
    }
    
    //metodo construtor sem parametros
    public FuncionarioMeioPeriodo(){
        super();
        this.setHorasTrabalhadas(0);
        this.setSalarioPorHora(0);
    }
    
    //metodo construtor com parametros
    public FuncionarioMeioPeriodo(String _nome, int _id, double _salarioBase, int _horasTrabalhadas, double _salarioPorHora){
        super(_nome, _id, _salarioBase);
        this.setHorasTrabalhadas(_horasTrabalhadas);
        this.setSalarioPorHora(_salarioPorHora);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Id: "+this.getId());
        System.out.println("Salário Base: R$"+this.getSalarioBase());
        System.out.println("Horas Trabalhadas: "+this.getHorasTrabalhadas()+" horas");
        System.out.println("Salario por Hora: R$"+this.getSalarioPorHora());
        
        double salarioAtual = this.getSalarioBase()+(this.getSalarioPorHora() * this.getHorasTrabalhadas());
        
        System.out.println("Salario Atual: R$"+ salarioAtual);
    }
}
