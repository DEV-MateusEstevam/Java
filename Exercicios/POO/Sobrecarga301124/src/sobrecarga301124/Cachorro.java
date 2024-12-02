package sobrecarga301124;

public class Cachorro extends Lobo{
    
    public Cachorro(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros, _corPelo);
    }
    
    public Cachorro(){
        super();
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Cachorro Latindo!");
    }
    
    @Override
    public String toString(){
        return"Cachorro { Peso: "+peso+"KG, Idade: "+idade+", Quantidade de membros: "+membros+", Cor do Pelo: "+corPelo+"}";
    }
}
