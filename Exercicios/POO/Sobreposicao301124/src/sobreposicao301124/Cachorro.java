package sobreposicao301124;

public class Cachorro extends Mamifero {
    
    public Cachorro(double _peso, int _idade, int _membros, String _corPelo){
        super(_peso, _idade, _membros, _corPelo);
    }
    
    public Cachorro(){
        super();
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando Osso...");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo!");
    }
    
    @Override()
    public void emitirSom(){
        System.out.println("Latindo ...");
    }
    @Override
    public String toString(){
        return "Cachorro { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorPelo()+"}";
    }
}
