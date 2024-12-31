package desafiofuncao;

public class DesafioFuncao {

    public static void main(String[] args) {
        Fatorial fatorial1 = new Fatorial();
        
        fatorial1.setFatorial(5);
        System.out.print(fatorial1.getCalculo());
        System.out.println(fatorial1.getFatorial());
    }
}