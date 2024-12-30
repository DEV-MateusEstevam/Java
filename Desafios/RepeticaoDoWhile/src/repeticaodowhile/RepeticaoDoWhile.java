package repeticaodowhile;
import java.util.Scanner;

public class RepeticaoDoWhile {

    public static void main(String[] args) {
        Scanner touch = new Scanner(System.in);
        
        System.out.print("Digite o número de vezes que deseja realizar a Cambalhota: ");
        int numero = touch.nextInt();
        System.out.println();
        
        int contador = 1;
        
        do{
            System.out.println("Realizando a "+contador+"° Cambalhota;");
            contador++;
        }while(numero >= contador);
        
        System.out.println();
        System.out.println("Ao todo foram realizadas "+numero+" Cambalhotas!");
        System.out.println();
    }
}