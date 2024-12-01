package sobreposicao301124;

public class Ave extends Animal{
    private String corPena;
    
    public Ave(double _peso, int _idade, int _membros, String _corPena){
        super(_peso, _idade, _membros);
        this.setCorPena(_corPena);
    }
    
    public Ave(){
        super();
        this.setCorPena(null);
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando ...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas ...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave ...");
    }
    
    public void fazerNinho(){
        System.out.println("Construindo um ninho ...");
    }
    
    public String getCorPena(){return corPena;}
    
    public final void setCorPena(String corPena){this.corPena = corPena;}
    
    @Override
    public String toString(){
        return "Ave { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor das Penas: "+corPena+"}";
    }
    
}