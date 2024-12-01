package sobreposicao301124;

public class Tartaruga extends Reptil {
    
    public Tartaruga(double _peso, int _idade, int _membros, String _CorEscama){
        super(_peso, _idade, _membros, _CorEscama);
    }
    
    public Tartaruga(){
        super();
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando beeeeem devagar ...");
    }
    
    @Override
    public String toString(){
        return "Tartaruga { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorEscama()+"}";
    }
}
