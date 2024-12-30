
package preenchendovetor;
import java.util.Arrays;

public class PreenchendoVetor {

    public static void main(String[] args) {
        int conjunto[] = new int[20];
        Arrays.fill(conjunto, 100);//preenche o  vetor Conjunto com o valor 100 em cada um das suas 20 posições
    
        for(int preenche : conjunto){
            System.out.print(preenche+" | ");
        }
        System.out.println();
        System.out.println();
    }
    
}
