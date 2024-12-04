 package projetolivro;

public class Pessoa {
     private String nome;
     private int idade;
     private String sexo;
     
     public void fazerAniversario(){
         this.idade += 1;
     }
     
     //construtor
     public Pessoa(String _nome, int _idade, String _sexo){
         this.nome = _nome;
         this.idade = _idade;
         this.sexo = _sexo;
     }
     
     public Pessoa(){
         this.nome = nome;
         this.idade = idade;
         this.sexo = sexo;
     }
     
     //metodos especias
     public String getNome(){
         return nome;
     }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public int getIdade(){
      return idade;
     }
     
     public void setIdade(int idade){
         this.idade = idade;
     }
     
     public String getSexo(){
         return sexo;
     }
     
     public void setSexo(String sexo){
         this.sexo = sexo;
     }
}
