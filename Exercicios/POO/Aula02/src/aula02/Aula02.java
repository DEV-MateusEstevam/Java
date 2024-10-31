package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
        System.out.println();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compact";
        c2.cor = "Azul";
        c2.ponta = 1.2f;
        c2.carga = 50;
        c2.tampada = false;
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
    
}
