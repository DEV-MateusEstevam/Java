package mostrarcontas;

public class MostrarContas {
    
    public static void main(String[] args) {
        BankAccount cliente1 = new BankAccount("Mateus Estevam",1200.89);
        //cliente1.nome = "Maria da Silva";
        System.out.printf("Nome do cliente01: %s\n ",cliente1.nome);
        System.out.printf("Saldo do cliente01: %.2f\n ",cliente1.saldo);
        System.out.printf("Número da conta do cliente01: %d\n ",
                cliente1.numeroConta);
        
        System.out.println();
        
        BankAccount cliente2 = new BankAccount("Mauro Bonilha",8458.30);
        System.out.printf("Nome do cliente02: %s\n ",cliente2.nome);
        System.out.printf("Saldo do cliente02: %.2f\n ",cliente2.saldo);
        System.out.printf("Número da conta do cliente02: %d\n ",
                cliente2.numeroConta);
        
        System.out.println();
        
        BankAccount cliente3 = new BankAccount("Gabriel Figueiredo",3229.56);    
        System.out.printf("Nome do cliente03: %s\n ",cliente3.nome);
        System.out.printf("Saldo do cliente03: %.2f\n ",cliente3.saldo);
        System.out.printf("Número da conta do cliente03: %d\n ",
                cliente3.numeroConta);
        
        System.out.println();
    }
}
