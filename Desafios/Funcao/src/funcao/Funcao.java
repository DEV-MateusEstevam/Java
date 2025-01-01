package funcao;

public class Funcao {
    
    //procedimento
    //static é um metodo que serve para classes e não para instancias, apenas funcional dentro da classe
    static void soma (int a, int b){
        int soma = a + b;
        System.out.println("A soma de "+a+" + "+b+" é "+soma);
        System.out.println();
    }
    
    static int somador(int a, int b){
        int somador = a + b;
        return somador;
    }

    public static void main(String[] args) {
        System.out.println("Procedimento SOMA()");
        System.out.println();
        soma(5,2);
        
        System.out.println("Função Somador()");
        System.out.println();
        System.out.println("O resultado da soma é "+ somador(10,5));
        System.out.println();
    }   
}
