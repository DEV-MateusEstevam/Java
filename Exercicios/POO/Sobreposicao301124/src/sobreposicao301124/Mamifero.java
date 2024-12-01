package sobreposicao301124;

public class Mamifero extends Animal{
    private String corPelo;
    
    public Mamifero(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros);
        this.setCorPelo(_corPelo);
    }
    
    public Mamifero(){
        super();
        this.setCorPelo(null);
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero...");
    }
    
    public String getCorPelo(){return corPelo;}
    
    public final void setCorPelo(String corPelo){this.corPelo = corPelo;}
    
    @Override
    public String toString(){
        return "Mamifero { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+corPelo+"}";
    }
}
