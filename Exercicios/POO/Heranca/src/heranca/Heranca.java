package heranca;

public class Heranca { 
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Mateus");
        p1.setSexo("Masculino");
        p1.setIdade(28);
        
        System.out.println(p1.toString());
        
        Aluno p2 = new Aluno();
        p2.setNome("Maria");
        p2.setSexo("Feminino");
        p2.setIdade(26);
        p2.setCurso("Sistemas de Informação");
        System.out.println(p2.toString());
        
        Professor p3 = new Professor();
        p3.setNome("Lucio");
        p3.setSexo("Masculino");
        p3.setIdade(45);
        p3.setSalario(2190.34);
        System.out.println(p3.toString());
        
        Funcionario p4 = new Funcionario();
        p4.setNome("Eduardo");
        p4.setSexo("Não-Binario");
        p4.setIdade(19);
        p4.setSetor("Almoxarifado");
        System.out.println(p4.toString());
    }
    
}
