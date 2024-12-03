package heranca2301124;

public class AlunoBolsista extends Aluno{
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso do Aluno "+this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade do(a) Aluno(a) Bolsista "+this.getNome()+" foi paga com sucesso!");
    }
    
    public AlunoBolsista(String _nome, int _idade, String _sexo, int _matricula, String _curso ,double _bolsa){
        super(_nome, _idade, _sexo, _matricula, _curso);
        this.setBolsa(_bolsa);
    }
    
    public AlunoBolsista(){
        super();
        this.setBolsa(0);
    }
    
    public double getBolsa(){return bolsa;}
    
    public final void setBolsa(double bolsa){this.bolsa = bolsa;}
    
    @Override
    public String toString(){
        return "Aluno Bolsista {\nNome: "+this.getNome()+",\nIdade: "+this.getIdade()+",\nSexo: "+this.getSexo()+",\nMatricula: "+this.getMatricula()+",\nCurso: "+this.getCurso()+"\nValor da Bolsa: R$"+bolsa+"}";
    }
}
