package modificadores;

public class Modificadores {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("BIC Cristal");
        c1.setCor("Azul");
        c1.setPonta(1.0);
        c1.setCarga(80);
        c1.setTampada(true);
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        System.out.println();
        
        Caneta c2 = new Caneta("Compacta", "Verde", 1.5, 90, true);
        c2.status();
        c2.destampar();
        c2.pintar(); 
    }
}
