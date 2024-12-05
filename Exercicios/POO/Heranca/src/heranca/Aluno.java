package heranca;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        this.setMatricula(0);
        System.out.print("Matricula cancelada com sucesso!");
    }
    
    //Construtor
    public Aluno(){
        super();
        this.matricula = 0;
        this.curso = "";
    }
    
    //Construtor
    public Aluno(String _nome, String _sexo, int _idade, int _matricula, String _curso){
        super(_nome, _sexo, _idade);
        this.setMatricula(_matricula);
        this.setCurso(_curso);
    }
    
    //metodos especiais
    public int getMatricula(){return matricula;}
    
    public final void setMatricula(int matricula){this.matricula = matricula;}
    
    public String getCurso(){return curso;}
    
    public final void setCurso(String curso){this.curso = curso;}
}
