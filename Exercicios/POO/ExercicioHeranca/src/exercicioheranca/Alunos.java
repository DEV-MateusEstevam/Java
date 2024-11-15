package exercicioheranca;

public class Alunos extends DadosPessoais{
    public int ra;
    public String curso;
    
    //metodos especiais
    public int getRa(){
        return ra;
    }
    
    public void setRa(int ra){
        this.ra = ra;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    //construtores
    public Alunos(){
        super();//chama o metodo construtor da classe DaddosPessoais
        this.setRa(0);
        this.setCurso("");
    }
    
    public Alunos(int idPessoa, String nome, String cpf, int ra, String curso){
        super(idPessoa, nome, cpf);
        this.setRa(ra);
        this.setCurso(curso);
    }
}
