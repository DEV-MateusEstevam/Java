package dowhileswing;
import javax.swing.JOptionPane;

public class DoWhileSwing {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "OLá MUNDO!", "Seja Bem Vindo!", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Seja Bem Vindo!", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Seja Bem Vindo!", JOptionPane.ERROR_MESSAGE);
        int numero, soma = 0;
        int contadorValores = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        int acimaCem = 0;
        double media = 0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número: <br><en>(Número 0 encerra o programa)</en></html>>"));
            
            //Pares e Impares
            if(numero != 0 && numero % 2 == 0){
                contadorPar++;
            }else if(numero != 0 && numero % 2 != 0){
                contadorImpar++;
            }
            
            //Acima de 100
            if(numero > 100){
                acimaCem++;
            }
            
            //soma dos valores
            soma += numero;
            
            if(numero != 0){
                contadorValores++;
            }
            
        }while(numero != 0);
        
        //media dos valores
        media = soma / contadorValores;
        
        JOptionPane.showMessageDialog(null,"<html>RESULTADOS<br><br>TOTAL DE VALORES DIGITADOS: "+contadorValores+"<br><br>SOMA DE TODOS "
                + "OS VALORES: "+soma+"<br><br>TOTAL DE VALORES PARES: "+contadorPar+"<br><br>TOTAL DE VALORES IMPARES: "+contadorImpar+"<br><br>"
                + "TOTAL ACIMA DE 100: "+acimaCem+"<br><br>MÉDIA DOS VALORES: "+media+"</html>");
    }
}
