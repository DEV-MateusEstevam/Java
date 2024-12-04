package projetofinal;

public class ProjetoFinal {
    
    public static void main(String[] args) {
        Video v[]= new Video[3];
        
        v[0] = new Video("Aula 1 de POO + Java", 0, 0, false);
        v[0].play();
        v[0].like();
        v[0].pause();
        System.out.println(v[0].toString());
        System.out.println();
        
        v[1] = new Video("Aula 10 de POO + PHP", 0, 0, false);
        System.out.println(v[1].toString());
        System.out.println();
        
        v[2] = new Video("Herança em Java", 0, 0, true);
        System.out.println(v[2].toString());
        System.out.println();
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Yan", 12, "Masculino", 1 , "Yan2024", 0);
        System.out.println(g[0].toString());
        System.out.println();
        
        g[1] = new Gafanhoto();
        g[1].setNome("Julia");
        g[1].setIdade(15);
        g[1].setSexo("Feminino");
        g[1].setLogin("JU@123");
        System.out.println(g[1].toString());
        System.out.println();
        
        Visualizacao vz[] = new Visualizacao[3];
        vz[0] = new Visualizacao(g[1], v[0]);
        vz[0].avaliar();
        System.out.println(vz[0].toString());
        System.out.println();
        
        vz[1] = new Visualizacao(g[1], v[1]);
        vz[1].avaliar(7);
        System.out.println(vz[1].toString());
        System.out.println();
        
        vz[2] = new Visualizacao(g[1], v[2]);
        vz[2].avaliar(81.9);
        System.out.println(vz[2].toString());
        System.out.println();
    }
    
}
