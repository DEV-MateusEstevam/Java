package somadordowhile;
import java.util.Scanner;

public class SomadorDoWhile {

    public static void main(String[] args) {
        Scanner touch = new Scanner(System.in);
        
        int contadorVezes = 1;
        int soma = 0;
        int numeros = 0;
        
        System.out.println("Somador DO WHILE");
        System.out.println();
        System.out.print("Digite o "+contadorVezes+"° número:");
        int numero1 = touch.nextInt();
        contadorVezes++;
        System.out.println();
        
        System.out.print("Digite o "+contadorVezes+"° número:");
        int numero2 = touch.nextInt();
        contadorVezes++;
        soma = numero1 + numero2;
        System.out.println();
        
        String decisao = "";
        
        do{
            System.out.print("Digite 'S' para SIM ou 'N' para NÃ0. Deseja continuar a inserir números? ");
            decisao = touch.next();
            System.out.println();
            
            if(decisao.equals("S")){
                System.out.print("Digite o "+contadorVezes+"° número: ");
                numeros = touch.nextInt();
                soma += numeros;
                contadorVezes++;
                System.out.println();
            }else{
                break;
            }
        }while(decisao.equals("S"));
        
        System.out.println("A soma dos números digitados é igual a "+soma);
        System.out.println();   
    }
}