package pkginterface;

public class Funcionario implements Contrato, Contrato2{
    @Override
    public void Clausula_A(){
        System.out.println("Clausula A do Contrato do Funcionario");
    }
    
    @Override
    public void Clausula_B(){
        System.out.println("Clausula B do Contrato do Funcionario");
    }
    
    @Override
    public void Clausula_C(){
        System.out.println("Clausula C do Contrato 2 do Funcionario");
    }
}