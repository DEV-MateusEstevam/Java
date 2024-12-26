package vetor02;
//import java.time.LocalDate;
import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        Scanner touch = new Scanner(System.in);
        
        System.out.println("Descubra se um ano é, foi ou será BISSEXTO:");
        System.out.println();
        System.out.print("Digite um ano [XXXX]: ");
        int ano = touch.nextInt();
        System.out.println();
        
        //int anoAtual = LocalDate.now().getYear();
        
        if(ano % 4 == 0){
            System.out.println(ano +" é considerado um ano BISSEXTO com 366 dias!");
            System.out.println();
            System.out.println("CALENDÁRIO "+ano);
            System.out.println();
            
            String mes[]={"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
            int dias[]={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
                for(int contador = 0; contador < mes.length; contador++ ){
                    if(contador == 11){
                    System.out.println("Em "+mes[contador]+" tem "+dias[contador]+" DIAS ao todo.");
                }else{
                    System.out.println("Em "+mes[contador]+" tem "+dias[contador]+" DIAS ao todo;");
                    }
                }
                System.out.println();
            
        }else{
            System.out.println(ano +" Não é considerado um ano BISSEXTO, consequentemente só tem com 365 dias!");
            System.out.println();
            System.out.println("CALENDÁRIO "+ano);
            System.out.println();
            
            String mes[]={"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
            int dias[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
                for(int contador = 0; contador < mes.length; contador++ ){
                    if(contador == 11){
                    System.out.println("Em "+mes[contador]+" tem "+dias[contador]+" DIAS ao todo.");
                }else{
                    System.out.println("Em "+mes[contador]+" tem "+dias[contador]+" DIAS ao todo;");
                    }
                }
                System.out.println();
        } 
    }
}
