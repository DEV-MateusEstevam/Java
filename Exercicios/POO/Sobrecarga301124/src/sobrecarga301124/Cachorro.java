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
    
    
    public void reagir(String frase){
        if((frase == "Toma comida") || (frase == "Olá")){
            System.out.println("Cachorro abanando o rabo e Latindo amigavelmente...");
        }else{
            System.out.println("Cachorro Rosnando...");
        }
    }
    
    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("Cachorro abanando o rabo!");
        }else if(hora >= 18){
            System.out.println("Cachorro me ignorando...");
        }else{
            System.out.println("Cachorro abanando o rabo e Latindo amigavelmente...");
        }
    }
    
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Cachorro abanando o rabo!");
        }else{
            System.out.println("Cachorro Rosnando e Latindo agressivamente ...");
        }
    }
    
    public void reagir(int idade, double peso){
        if(idade <= 5){
            if(peso < 10.00){
                System.out.println("Cachorro abanando o rabo!");
            }else{
                System.out.println("Cachorro Latindo ...");
            }
            
        }else {
            if(peso >= 10.00){
                System.out.println("Cachorro rosnando...");
            }else{
                System.out.println("Cachorro me ignorando...");
            }
        }
    }
    
    @Override
    public String toString(){
        return"Cachorro { Peso: "+peso+"KG, Idade: "+idade+", Quantidade de membros: "+membros+", Cor do Pelo: "+corPelo+"}";
    }
}