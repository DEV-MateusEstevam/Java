package expoo03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void escrever(){
        if(this.tampada == false){
            System.out.println("Escrevendo...");
        } else {
            System.out.println("ERRO! Não consigo escrever, a caneta esta TAMPADA.");
        }
    }
    
    public void rabiscar(){
        if(this.tampada == false){
            System.out.println("Rabiscando...");
        } else{
            System.out.println("ERRO! Não consigo rabiscar, a caneta esta TAMPADA.");
        }
    }
    
    public void pintar(){
        if(this.tampada == false){
            System.out.println("Pintando...");
        } else {
            System.out.println("ERRO! Não consigo pintar, a caneta esta TAMPADA.");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Modelo da Caneta: "+this.modelo);
        System.out.println("Cor da Caneta: "+this.cor);
        System.out.println("Ponta da Caneta: "+this.ponta);
        System.out.println("Porcentagem da carga: "+this.carga+"%");
        System.out.println("A caneta esta tampada? "+this.tampada);
    }
}
