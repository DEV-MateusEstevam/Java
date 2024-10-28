package expoo02;

public class ArCondicionado {
    String Modelo;
    String Marca;
    String Cor;
    float Altura;
    float Comprimento;
    boolean Logo;
    boolean MgsVisor;
    int Temperatura;
    
    void Ligado(){
        this.MgsVisor = true;
    }
    
    void Desligado(){
        this.MgsVisor = false;
    }
    
    void AumentarTemperatura(){
        this.Temperatura = Temperatura + 1;
    }
    
    void DiminuirTemperatura(){
        this.Temperatura = Temperatura - 1;
    }
    
    void Turbo(){
        this.Temperatura = 18;
        System.out.println("Com "+this.Temperatura+"° de temperatura, o Modo turbo foi ativado!");
    }
}
