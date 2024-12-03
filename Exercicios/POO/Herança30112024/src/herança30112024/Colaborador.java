
package herança30112024;

public class Colaborador extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.setTrabalhando(true);
        System.out.println("O colaborador está trabalhando? "+this.getTrabalhando());
    }
    
    public Colaborador(String _nome, int _idade, String _sexo, String _setor, boolean _trabalhando){
        super(_nome, _idade, _sexo);
        this.setSetor(_setor);
        this.setTrabalhando(_trabalhando);
    }
    
    public Colaborador(){
        super();
        this.setSetor(null);
        this.setTrabalhando(false);
    }
    
    public String getSetor(){return setor;}
    
    public final void setSetor(String setor){this.setor = setor;}
    
    public boolean getTrabalhando(){return trabalhando;}
    
    public final void setTrabalhando(boolean trabalhando){this.trabalhando = trabalhando;}
    
    @Override
    public String toString(){
        return "Colaborador { Nome: "+this.getNome()+", Idade: "+this.getIdade()+", Sexo: "+this.getSexo()+", Setor: "+setor+", Esta trabalhando? "+trabalhando+"}";
    }
}
