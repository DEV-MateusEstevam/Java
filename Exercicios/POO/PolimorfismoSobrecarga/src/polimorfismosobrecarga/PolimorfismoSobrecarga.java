package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        System.out.println("Animal Mamifero emitindo som: ");
        m.emitirSom();
        System.out.println("Animal Lobo emitindo som: ");
        l.emitirSom();
        System.out.println("Animal Cachorro emitindo som: ");
        c.emitirSom();
        System.out.println();
        System.out.println("Dono diz 'Olá', cachorro reage: ");
        c.reagir("Olá"); //Abanar e Latir
        System.out.println();
        System.out.println("Dono diz 'Vai apanhar', cachorro reage: ");
        c.reagir("Vai apanhar"); //Rosnar
        System.out.println();
        System.out.println("Dono diz 'Cheguei', cachorro reage: ");
        c.reagir("Cheguei"); //Abanar e Latir
         System.out.println();
        System.out.println("Dono diz 'Não!', cachorro reage: ");
        c.reagir("Não!");//Rosnar
         System.out.println();
        System.out.println("Dono diz 'Toma comida', cachorro reage: ");
        c.reagir("Toma comida");//Abanar e Latir
         System.out.println();
        System.out.println("Horário '11:45' da manhã,reação do cachorro: ");
        c.reagir(11, 45);//Abanar
         System.out.println();
        System.out.println("Horário '21:00',reação do cachorro: ");
        c.reagir(21, 00);//Ignorar
         System.out.println();
        System.out.println("Horário '14:20', reação do cachorro: ");
        c.reagir(14, 20);//Abanar e Latir
         System.out.println();
        System.out.println("Cachorro vê o Dono, reação do cachorro: ");
        c.reagir(true);//Abanar
         System.out.println();
        System.out.println("Cachorro vê um Carteiro, reação do cachorro: ");
        c.reagir(false);//Rosnar e Latir
         System.out.println();
        System.out.println("Cachorro com menos de 5 anos de idade e com peso maior de 10KG, reação do cachorro: ");
        c.reagir(2, 12.5f);//Latir
         System.out.println();
        System.out.println("Cachorro com mais de 5 anos de idade e com peso menor de 10KG, reação do cachorro: ");
        c.reagir(17, 4.5f);//Rosnar
        
    }
}