package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        int numero[] ={1,3,5,7,9,11};
        
        //numero.length = esse atributo mostra quantas casas tem o vetor numero
        System.out.println("Quantidade de casas do Vetor Número: "+numero.length);
        System.out.println();
        
        for(int contador = 0; contador<numero.length; contador++){
            System.out.println("Na "+contador+"° posição esta o número "+numero[contador]);
        }
    }
}
