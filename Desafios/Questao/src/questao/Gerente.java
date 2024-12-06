
package questao;

public class Gerente extends Funcionario{
    public Gerente(){

	}
	public void logar(){
		System.out.println("Logado - Gerente");
	}
	public void logar(String cod){
		super.logar();
	}
}
