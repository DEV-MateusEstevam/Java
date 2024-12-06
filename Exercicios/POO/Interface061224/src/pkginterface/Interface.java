package pkginterface;

public class Interface {

    public static void main(String[] args) {
        Soma s1 = new Soma();
        Subtracao sb1 = new Subtracao();
        Multiplicacao m1 = new Multiplicacao();
        Divisao d1 = new Divisao();
        
        System.out.println(s1.calcular(10, 10));
        System.out.println(sb1.calcular(10, 10));
        System.out.println(m1.calcular(10, 10));
        System.out.println(d1.calcular(10, 10));
    }
    
}
