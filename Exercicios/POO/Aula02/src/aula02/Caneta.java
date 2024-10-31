package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada == false){
            System.out.println("Rabiscando!");
        } else{
            System.out.println("ERRO! Não consigo rabiscar pois caneta esta TAMPADA!");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void status(){
        System.out.println("O modelo da caneta é: "+this.modelo);
        System.out.println("A cor da caneta é: "+this.cor);
        System.out.println("A ponta desta caneta é de: "+this.ponta);
        System.out.println("A porcentagem de carga desta caneta está em :"+this.carga+"% .");
        System.out.println("Esta caneta esta Tampada? "+this.tampada);
    }
}
