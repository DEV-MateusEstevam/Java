package sobreposicao301124;

public class Sobreposicao301124 {

    public static void main(String[] args) {
        Ave a1 =  new Ave(0.89, 2, 2, "Azul-Royal");
        System.out.println(a1.toString());
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();
        a1.fazerNinho();
        System.out.println();
        
        Peixe p1 = new Peixe(0.35, 1, 0, "Lilas");
        System.out.println(p1.toString());
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        p1.soltandoBolha();
        System.out.println();
        
        Mamifero m1 = new Mamifero();
        m1.setPeso(85.3);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.setCorPelo("Bege");
        System.out.println(m1.toString());
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println();
        
        Reptil r1 = new Reptil();
        
        Cachorro ch1 = new Cachorro(3.94, 5, 4, "Cinza");
        System.out.println(ch1.toString());
        ch1.locomover();
        ch1.alimentar();
        ch1.emitirSom();
        ch1.enterrarOsso();
        ch1.abanarRabo();
        System.out.println();
        
        Canguru cg1 = new Canguru(55.30, 5, 4, "Amarelo");
        System.out.println(cg1.toString());
        cg1.locomover();
        cg1.alimentar();
        cg1.emitirSom();
        cg1.usarBolsa();
        System.out.println();
    }
}
