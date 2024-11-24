package desafiocontabanco;

public class DesafioContaBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(123456);
        p1.setDono("Maria");
        //p1.setTipoConta("CP");
        p1.abrirConta("CP");
        p1.depositar(500);
        p1.situacaoConta();
        p1.sacar(100);
        //p1.sacar(1000);
        p1.situacaoConta();
        p1.fecharConta();
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumeroConta(987654);
        p2.setDono("Ricardo");
        p2.abrirConta("CC");
        p2.depositar(300);
        p2.situacaoConta();
        p2.sacar(50);
        //p2.sacar(1000);
        p2.situacaoConta();
        p2.sacar(300);
        p2.fecharConta();
        p2.situacaoConta();
        
    }
    
}
