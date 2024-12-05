package heranca;

public final class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    public Funcionario(String _nome, String _sexo, int _idade, String _setor, boolean _trabalhando){
        super(_nome, _sexo, _idade);
        this.setSetor(_setor);
        this.setTrabalhando(_trabalhando);
    }
    
    public Funcionario(){
        super();
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public String getSetor(){return setor;}
    
    public void setSetor(String setor){this.setor = setor;}
    
    public boolean getTrabalhando(){return trabalhando;}
    
    public void setTrabalhando(boolean trabalhando){this.trabalhando = trabalhando;}
}
