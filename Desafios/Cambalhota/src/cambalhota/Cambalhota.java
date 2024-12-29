package cambalhota;

public class Cambalhota {
    
    public static void main(String[] args) {
 
       System.out.println("Contando Cambalhotas:");
       System.out.println();
       int contadorCambalhota = 0;
       
       while(contadorCambalhota < 10){
           contadorCambalhota++;
           if(contadorCambalhota == 1 || contadorCambalhota == 3 || contadorCambalhota == 5){
               continue;//interrompe o fluxo natural de codigo e volta la para cima;
           }
           
           if(contadorCambalhota > 8){
               break;//interrompe o fluxo do programa, finalizando o mesmo;
           }
           System.out.println("Realizando a "+contadorCambalhota+"° Cambalhota");
           System.out.println();
       }          
    }   
}
