
package questao;

public class Questao {

    public static void main(String[] args) {
                Funcionario f1 = new Funcionario();
                Funcionario g1 = new Gerente();
                Gerente g2 = new Gerente();
		f1.logar();
		g1.logar();
		g2.logar();
		g2.logar("01");
    }
    
}
