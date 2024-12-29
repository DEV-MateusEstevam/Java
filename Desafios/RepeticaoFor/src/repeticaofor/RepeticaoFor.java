package repeticaofor;
import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {
        Scanner touch = new Scanner(System.in);
        
        System.out.print("Digite o número que deseja realizar Cambalhotas: ");
        int numero = touch.nextInt();
        System.out.println();
        //for(int contador = 0; contador < numero; contador++)
        for(int contador = 1; contador <= numero; contador++){
            System.out.println("Realizando a "+contador+"° Camabalhota;");
        }
        System.out.println();
        
        for(int contador = 0; contador <= 100; contador+=10){
            if(contador == 100){
                System.out.print(contador+" ");
            }else{
                System.out.print(contador+", ");
            }
        }
    }
}
