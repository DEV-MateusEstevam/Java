package sobreposicao301124;

public class Cobra extends Reptil{
    
    public Cobra(double _peso, int _idade, int _membros, String _corEscama){
        super(_peso, _idade, _membros, _corEscama);
    }
    
    public Cobra(){
        super();
    }
    
    @Override
    public String toString(){
        return "Cobra { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorEscama()+"}";
    }
}
