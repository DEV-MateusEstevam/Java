package expoo3b;

public class ExPOO3B {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Clarissima");
        c1.setPonta(0.8f);
        c1.setCarga(50);
        c1.destampar();
        c1.escrever();
        c1.rabiscar();
        c1.pintar();
        c1.Status();
    }
    
}
