package desafioproflucio;

public class DesafioProfLucio {

    public static void main(String[] args) {
        FuncionarioTempoIntegral colaborador1 = new FuncionarioTempoIntegral("Felipe", 1, 1450.89, 232.90);
        
        colaborador1.exibirInfo();
        
        System.out.println("");
        
        FuncionarioMeioPeriodo colaborador2 = new FuncionarioMeioPeriodo("Gabriella", 2, 1200.89, 30, 13.20);
        
        colaborador2.exibirInfo();
    }
}
