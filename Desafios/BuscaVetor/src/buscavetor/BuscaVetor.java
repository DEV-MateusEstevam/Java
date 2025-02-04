package buscavetor;

import java.util.Arrays;

public class BuscaVetor {
    
    public static void main(String[] args) {
        int vetor[] = {2,4,6,8,10,12,14,16};
        
        //não existem valores negativos para indices de vetores em java, se ele não encontrar o valor no vetor ele vai retornar um indice negativo
        //int negativo = Arrays.binarySearch(vetor, 7);
        
        int posicao = Arrays.binarySearch(vetor, 8);
        
        for(int vetores : vetor){
            System.out.print(vetores+ ", ");
        }
        
        System.out.println();
        System.out.println("O número 12 ocupa a "+posicao+"° Vetor que contem "+vetor.length+" casas.");
    }
}
