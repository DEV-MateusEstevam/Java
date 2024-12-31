package desafiofuncao;

public class Fatorial {
    private int numero = 0;
    private int fatorial = 1;
    private String calculo = "";
    
    public void setFatorial(int fat){
        numero = fat;
        int calculaFatorial = 1;
        String mostraCalculo = "";
        for (int contador = numero; contador > 1; contador--){
            calculaFatorial *= contador;
            mostraCalculo += contador + " X ";
        }
        mostraCalculo += "1 = ";
        fatorial = calculaFatorial;
        calculo = mostraCalculo;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getCalculo(){
        return calculo;
    }
}
