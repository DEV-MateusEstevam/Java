package heranca2301124;

public class AlunoTecnico extends Aluno{
    private String registroCarteira;
    
    public void praticar(){
        System.out.println("Aluno(a) do Técnico "+this.getNome()+" está realizando as aulas práticas!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade do(a) Aluno(a) do Técnico "+this.getNome()+" foi paga com sucesso!");
    }
    
    public AlunoTecnico(String _nome, int _idade, String _sexo, int _matricula, String _curso, String _registroCarteira){
        super(_nome, _idade, _sexo, _matricula, _curso);
        this.setRegistroCarteira(_registroCarteira);
    }
    
    public AlunoTecnico(){
        super();
        this.setRegistroCarteira(null);
    }
    
    
    public String getRegistroCarteira(){return registroCarteira;}
    
    public final void setRegistroCarteira(String registroCarteira){this.registroCarteira = registroCarteira;}
    
    @Override
    public String toString(){
        return "Aluno Técnico {\nNome: "+this.getNome()+",\nIdade: "+this.getIdade()+",\nSexo: "+this.getSexo()+",\nMatricula: "+this.getMatricula()+"\nCurso: "+this.getCurso()+"\nRegistro Profissional: "+registroCarteira+"}";
    }
}
