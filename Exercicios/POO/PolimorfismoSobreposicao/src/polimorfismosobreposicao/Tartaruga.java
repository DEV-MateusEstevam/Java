package polimorfismosobreposicao;

public class Tartaruga extends Reptil{
    private String corCasco;
    
    public String getCorCasco(){
        return corCasco;
    }
    
    public void setCorCasco(String corCasco){
        this.corCasco = corCasco;
    }
    
    @Override
    public void locomover(){
        System.out.println("Engatinhando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Tartaruga");
    }
}
