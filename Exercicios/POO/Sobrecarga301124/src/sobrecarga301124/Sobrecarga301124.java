package sobrecarga301124;

public class Sobrecarga301124 {

    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero(14.90, 8, 4, "Preto");
        System.out.println(m1.toString());
        m1.emitirSom();
        System.out.println();
        
        Lobo l1 = new Lobo();
        l1.setPeso(19.67);
        l1.setIdade(7);
        l1.setMembros(4);
        l1.setCorPelo("Cinza");
        System.out.println(l1.toString());
        l1.emitirSom();
        System.out.println();
        
        Cachorro c1 = new Cachorro(30.20, 10, 4, "Marrom");
        System.out.println(c1.toString());
        c1.emitirSom();
        System.out.println();
        c1.reagir("Olá");
        c1.reagir("Vai apanhar...");
        c1.reagir("Toma comida");
        System.out.println();
        c1.reagir(true);
        c1.reagir(false);
        System.out.println();
        c1.reagir(11, 45);
        c1.reagir(21, 30);
        c1.reagir(14, 45);
        System.out.println();
        c1.reagir(2, 12.5);
        c1.reagir(5, 9.99);
        c1.reagir(17, 4.5);
        c1.reagir(10, 10.01);
        System.out.println();
    }   
}