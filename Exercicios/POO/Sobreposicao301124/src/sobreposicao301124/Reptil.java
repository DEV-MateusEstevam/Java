package sobreposicao301124;

public class Reptil extends Animal{
    private String corEscama;
    
    public Reptil(double _peso, int _idade, int _membros, String _corEscama){
        super(_peso, _idade, _membros);
        this.setCorEscama(_corEscama);
    }
    
    public Reptil(){
        super();
        this.setCorEscama(null);
    }
    
    @Override
    public void locomover(){
        System.out.println("Rastejando ...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais ...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil ...");
    }
    
    public String getCorEscama(){return corEscama;}
    
    public final void setCorEscama(String corEscama){this.corEscama = corEscama;}
    
    @Override
    public String toString(){
        return "Reptil { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor da Escama: "+corEscama+"}";
    }
}
