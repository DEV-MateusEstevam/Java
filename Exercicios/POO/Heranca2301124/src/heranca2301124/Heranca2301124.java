package heranca2301124;

public class Heranca2301124 {
    
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Alex");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        System.out.println();
        
        Aluno a1 = new Aluno("Micaela", 19, "Feminino", 226592024, "Gestão de TI");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println();
        
        AlunoBolsista b1 = new AlunoBolsista("Mateus", 28, "Masculino", 277392024, "Sistemas de Informação", 699.99);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println();
        
        Professor p1 = new Professor();
        p1.setNome("Nelson");
        p1.setIdade(47);
        p1.setSexo("Masculino");
        p1.setEspecialidade("Linguaguem C#");
        p1.setSalario(5234.90);
        System.out.println(p1.toString());
        p1.receberAumento(350.00);
        System.out.println();
        
        AlunoTecnico t1 = new AlunoTecnico();
        t1.setNome("Renato");
        t1.setIdade(25);
        t1.setSexo("Masculino");
        t1.setMatricula(277252024);
        t1.setCurso("Mecanico e Usinagem");
        t1.setRegistroCarteira("Jovem Aprendiz");
        System.out.println(t1.toString());
        t1.pagarMensalidade();
        t1.praticar();
        System.out.println();
    }
}
