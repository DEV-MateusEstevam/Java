package sobreposicao301124;

public class Peixe extends Animal{
    private String corEscama;
    
    public Peixe(double _peso, int _idade, int _membros, String _corEscama){
        super(_peso, _idade, _membros);
        this.setCorEscama(_corEscama);
    }
    
    public Peixe(){
        super();
        this.setCorEscama(null);
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando ...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias ...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som !");
    }
    
    public void soltandoBolha(){
        System.out.println("Soltando Bolhas!");
    }
    
    public String getCorEscama(){return corEscama;}
    
    public final void setCorEscama(String corEscama){this.corEscama = corEscama;}
    
    @Override
    public String toString(){
        return "Peixe { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor da Escama: "+corEscama+"}";
    }
}
