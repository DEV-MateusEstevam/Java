
package sobreposicao301124;

public class Canguru extends Mamifero{
    
    public Canguru(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros, _corPelo);
    }
    
    public Canguru(){
        super();
    }
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa...");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando ...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Canguru!");
    }
    
    @Override
    public String toString(){
        return "Canguru { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorPelo()+"}";
    }
}
