package funcao01;

public class Operacoes {
    public static String contador (int inicio , int fim, int passo ){
        String operacao = "";
        for(int contagem = inicio; contagem <= fim; contagem += passo){
            operacao += contagem + " | ";
        }
        return operacao;
    }
}
