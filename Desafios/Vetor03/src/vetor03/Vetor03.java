package vetor03;

import java.util.Arrays;

public class Vetor03 {
    
    public static void main(String[] args) {
        
        double numero1[] = {1.2, 4.6, 6.7, 4.5, 2.5, -9.8, 10.5, -0.2};
        //FOR EACH, para cada elemento, utilizado somente com vetores
        Arrays.sort(numero1);//Arrays.sort coloca os valores em ordem dentro do Vetor
        
        for(double valor : numero1){
            System.out.print(valor+", ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("O vetor Numero1 ocupa "+numero1.length+" Casas ao todo!");
        System.out.println();
    }
}
