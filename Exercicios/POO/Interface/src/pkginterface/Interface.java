package pkginterface;

public class Interface {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario colaborador1 = new Funcionario();
        
        colaborador1.Clausula_A();
        colaborador1.Clausula_B();
        colaborador1.Clausula_C();
        
        System.out.println();
        
        Terceirizado colaborador2 = new Terceirizado();
        
        colaborador2.Clausula_A();
        colaborador2.Clausula_B();
        colaborador2.Clausula_C();
    }
    
}