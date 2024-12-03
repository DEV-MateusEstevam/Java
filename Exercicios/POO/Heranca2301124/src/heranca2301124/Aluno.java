package heranca2301124;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade do(a) Aluno(a) "+this.getNome()+" foi paga com sucesso!");
    }
    
    public Aluno(String _nome, int _idade, String _sexo, int _matricula, String _curso){
        super(_nome, _idade, _sexo);
        this.setMatricula(_matricula);
        this.setCurso(_curso);
    }
    
    public Aluno(){
        super();
        this.setMatricula(0);
        this.setCurso(null);
    }
    
    public int getMatricula(){return matricula;}
    
    public final void setMatricula(int matricula){this.matricula = matricula;}
    
    public String getCurso(){return curso;}
    
    public final void setCurso(String curso){this.curso = curso;}
    
    @Override
    public String toString(){
        return "Aluno { Nome: "+this.getNome()+", Idade: "+this.getIdade()+", Sexo: "+this.getSexo()+", Matricula: "+matricula+", Curso: "+curso+"}";
    }
}
