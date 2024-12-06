package questao;

public class Funcionario {
    public String nome;
	public String idade;
	public Funcionario(){
	}
	public void logar(){
		System.out.println("Logado - Funcionário");
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getIdade(){
		return idade;
	}
	public void setIdade(String Idade){
		this.idade = idade;
	}
	public String toString(){
		return "Funcionario [nome="+nome+", idade="+idade+"]";
	}
}
