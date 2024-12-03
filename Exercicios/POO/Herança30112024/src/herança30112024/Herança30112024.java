
package herança30112024;
public class Herança30112024 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Mateus");
        p1.setIdade(28);
        p1.setSexo("Masculino");
        System.out.println(p1.toString());
        System.out.println();
        
        Aluno a1 = new Aluno();
        a1.setNome("Estevam");
        a1.setIdade(24);
        a1.setSexo("Masculino");
        a1.setMatricula(400289221);
        a1.setCurso("Sistemas de Informação");
        System.out.println(a1.toString());
        System.out.println();
        
        Professor f1 = new Professor("Larissa", 34, "Feminino", "Matematica", 3200.89);
        System.out.println(f1.toString());
        System.out.println();
          
        Colaborador c1 = new Colaborador("Joana", 45, "Feminino", "Refeitorio", false);
        System.out.println(c1.toString());
        System.out.println();
        
    }
    
}
