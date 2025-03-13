package condicionalcomposta;
import java.util.Scanner;
import java.time.LocalDate;

public class CondicionalComposta {
    
    public static void main(String[] args) {
        int anoAtual = LocalDate.now().getYear();
        
        Scanner touch = new Scanner(System.in);
        
        System.out.println("Descubra se você é MAIOR ou MENOR de idade: ");
        System.out.println();
        
        System.out.print("Digite seu ano de nascimento: ");
        int nascimento = touch.nextInt();
        
        System.out.println();
        int idade = anoAtual - nascimento;
        
        System.out.print("A sua idade atual é "+ idade +", consequentemente você é ");
        
        if(idade >= 18){
            System.out.println("MAIOR DE IDADE!");
        } else{
            System.out.println("MENOR DE IDADE!");
        }
        System.out.println();
    }
}
