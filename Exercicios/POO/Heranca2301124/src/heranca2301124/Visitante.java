
package heranca2301124;

public class Visitante extends Pessoa{
    
    public Visitante(String _nome, int _idade, String _sexo){
        super(_nome, _idade, _sexo);
    }
    
    public Visitante(){
        super();
    }
    
    @Override
    public String toString(){
        return "Visitante { Nome: "+this.getNome()+", Idade: "+this.getIdade()+", Sexo: "+this.getSexo()+"}";
    }
}
