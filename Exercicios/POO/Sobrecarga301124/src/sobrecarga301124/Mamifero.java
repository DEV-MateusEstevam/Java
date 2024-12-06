package sobrecarga301124;

public class Mamifero extends Animal{
    protected String corPelo;
    
    public Mamifero(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros);
        this.setCorPelo(_corPelo);
    }
    
    public Mamifero(){
        super();
        this.setCorPelo(null);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero!");
    }
    
    public String getCorPelo(){return corPelo;}
    
    public final void setCorPelo(String corPelo){this.corPelo = corPelo;}
    
    @Override
    public String toString(){
        return"Mamifero { Peso: "+peso+"KG, Idade: "+idade+", Quantidade de membros: "+membros+", Cor do Pelo: "+corPelo+"}";
    }
}