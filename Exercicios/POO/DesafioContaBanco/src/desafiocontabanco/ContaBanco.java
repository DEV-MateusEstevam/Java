package desafiocontabanco;

public class ContaBanco {
    public int numeroConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco(){
        //this.numeroConta = 0;
        //this.tipoConta = "";
        //this.dono = "";
        this.saldo = 0;
        this.status = false;
    }
    
    public ContaBanco(int _numeroConta, String _tipoConta, String _dono, double _saldo, boolean _status){
        this.numeroConta = _numeroConta;
        this.tipoConta = _tipoConta;
        this.dono = _dono;
        this.saldo = _saldo;
        this.status = _status;
    }
    
    public void situacaoConta(){
        System.out.println();
        System.out.println("Número da conta: "+this.getNumeroConta());
        System.out.println("Tipo da conta: "+this.getTipoConta());
        System.out.println("Nome do dono da conta: "+this.getDono());
        System.out.println("Saldo da conta: R$"+this.getSaldo());
        System.out.println("A conta esta aberta? "+this.getStatus());
        System.out.println();
    }
    
    public void abrirConta(String tc){
        this.setTipoConta(tc);
        this.setStatus(true);
        if(tc == "CC"){
            this.setSaldo(50); 
            System.out.println("Conta Corrente 'CC' aberta com sucesso!");
        }else if(tc == "CP"){
            this.setSaldo(150);
            System.out.println("Conta Poupança 'CP' aberta com sucesso!");
        }else{
            System.out.println("[ERRO]Tipo de conta ("+this.getTipoConta()+") não é válido!\nDigite CC para Conta Corrente ou CP para Conta Poupança.");
        }
        
        
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("[ERRO]Impossível fechar conta pois a mesma tem um saldo positivo de R$"+this.getSaldo()+"\nRealize o saque desta quantia para conseguir fechar a conta!");
        }else if(this.getSaldo() < 0){
            System.out.println("[ERRO]Impossível fechar conta pois a mesma tem um saldo negativo de R$"+this.getSaldo()+"\nRealize o deposito desta quantia para conseguir fechar a conta!");
        }else{
            this.setStatus(false);
            System.out.println("Conta "+getTipoConta()+" fechada com sucesso!");
        }
    }
    
    public void depositar(double valor){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de R$"+valor+" realizado com sucesso!");
        }else{
            System.out.println("[ERRO]Impossivel realizar o depósito pois a conta esta com status de FECHADA!");
        }
    }
    
    public void sacar(double valor){
        if((this.getStatus() == true) && (this.getSaldo() >= valor)){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$"+valor+" realizado com sucesso!");
        }else if((this.getStatus() == true) && (this.getSaldo() < valor)){
            System.out.println("[ERRO]Impossível realizar o saque de R$"+valor+".Verifique seu saldo e realize um saque com o valor menor ou igual ao seu saldo!");
        }else{
            System.out.println("[ERRO]Impossivel realizar o saque pois a conta esta com status de FECHADA!");
        }
    }
    
    public void pagarMensalidade(){
        int valor = 0;
        
        if(this.getTipoConta() == "CC"){
            valor = 12;
        }else if(this.getTipoConta() == "CP"){
            valor = 20;
        }else{
            System.out.println("[ERRO]Tipo de conta ("+this.getTipoConta()+") não é válido!\nDigite CC para Conta Corrente ou CP para Conta Poupança.");
        }
        
        if((this.getStatus() == true) && (this.getSaldo() >= valor)){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade de R$"+valor+" subtraida do saldo da sua conta.");
        }else if((this.getStatus() == true) && (this.getSaldo() < valor)){
            System.out.println("[ERRO]Impossível cobrar mensalidade de R$"+valor+" pois o valor da sua conta é menor.\n Realize um depósito!");
        }else{
            System.out.println("[ERRO]Impossivel cobrar mensalidade pois a conta esta com status de FECHADA!");
        }
    }
    
    public int getNumeroConta(){return numeroConta;}
    
    public void setNumeroConta(int numeroConta){this.numeroConta = numeroConta;}
    
    public String getTipoConta(){return tipoConta;}
    
    public void setTipoConta(String tipoConta){this.tipoConta = tipoConta;}
    
    public String getDono(){return dono;}
    
    public void setDono(String dono){this.dono = dono;}
    
    public double getSaldo(){return saldo;}
    
    public void setSaldo(double saldo){this.saldo = saldo;}
    
    public boolean getStatus(){return status;}
    
    public void setStatus(boolean status){this.status = status;}
    
}
