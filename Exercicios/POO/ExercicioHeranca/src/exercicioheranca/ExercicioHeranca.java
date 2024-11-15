package exercicioheranca;

public class ExercicioHeranca {

    public static void main(String[] args) {
        // Objetos
        Alunos aluno1 = new Alunos();
        
        System.out.println("Id. da Pessoa: "+ aluno1.getIdPessoa());
        System.out.println("Nome: "+ aluno1.getNome());
        System.out.println("CPF: "+ aluno1.getCpf());
        System.out.println("RA: "+ aluno1.getRa());
        System.out.println("Curso: "+ aluno1.getCurso());
        System.out.println("");
        
        Alunos aluno2 = new Alunos(10, " Micael", "123.876.543-09", 141152024, "Gestão de TI");
        
        System.out.println("Id. da Pessoa: "+ aluno2.getIdPessoa());
        System.out.println("Nome: "+ aluno2.getNome());
        System.out.println("CPF: "+ aluno2.getCpf());
        System.out.println("RA: "+ aluno2.getRa());
        System.out.println("Curso: "+ aluno2.getCurso());
        System.out.println("");
        
    }
}
