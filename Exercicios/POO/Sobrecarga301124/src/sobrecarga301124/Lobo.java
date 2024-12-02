package sobrecarga301124;

public class Lobo extends Mamifero{
    
    public Lobo(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros, _corPelo);
    }
    
    public Lobo(){
        super();
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Lobo uivando...");
    }
    
    @Override
    public String toString(){
        return"Lobo { Peso: "+peso+"KG, Idade: "+idade+", Quantidade de membros: "+membros+", Cor do Pelo: "+corPelo+"}";
    }
}
