package polimorfismosobreposicao;

public class Canguru extends Mamifero{
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Canguru");
    }
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
    
}
