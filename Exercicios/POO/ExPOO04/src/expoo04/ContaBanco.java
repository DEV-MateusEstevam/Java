package expoo04;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void estadoAtual(){
        System.out.println();
        System.out.println("Número da Conta: "+ this.getNumConta());
        System.out.println("Tipo da Conta: "+ this.getTipo());
        System.out.println("Dono da Conta: "+ this.getDono());
        System.out.println("Saldo Atual: R$"+ this.getSaldo());
        System.out.println("Status da Conta: "+ this.getStatus());
        System.out.println();
    }
    
    //metodo Construtor
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
        //this.setStatus(false);
        //this.setSaldo(0);
    }
    
    //metodos especiais
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    //Metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        //this.status = false;
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
            //this.saldo = 50;
        }else if(t == "CP"){
            this.setSaldo(150);
            //this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("[ERRO] Saldo da conta R$"+this.saldo+" . Realize o saque desta quantida para fechar a conta.");
        }else if(this.getSaldo() < 0){
            System.out.println("[ERRO] Saldo da conta R$"+this.saldo+" . Realize o deposito desta quantia para fechar a conta.");
        }else {
            this.setStatus(false);
            //this.status = false;
            System.out.println("Conta Fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if(this.getStatus() == true){
            //this.saldo = saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta do(a) "+this.getDono());
        }else {
            System.out.println("[ERRO] Impossível realizar depósito pois a conta está com status fechada.");
        }
    }
    
    public void sacar(float valor){
        if(this.getStatus() == true){
            if(this.getSaldo() >= valor){
                //this.saldo = saldo - valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado da conta da(o) "+this.getDono());
            }else{
                System.out.println("[ERRO] Saldo insuficiente para realizar saque.");
            }
        } else{
            System.out.println("[ERRO] Impossivel realizar saque pois a conta esta com status fechada.");
        }
    }
    
    public void pagarMensal(){
        float mensal = 0;
        if(this.getTipo() == "CC") {
            mensal = 12;
        } else if (this.getTipo() == "CP"){
            mensal = 20;
        }
        
        if(this.getStatus() == true){
            if(this.getSaldo() >= mensal){
                //this.saldo = saldo - valor;
                this.setSaldo(this.getSaldo() - mensal);
                System.out.println("Mensalidade paga com sucesso pelo(a) "+ this.getDono());
            }else{
                System.out.println("[ERRO] Impossivel cobrar mensalidade pois o saldo é insuficiente.");
            }
        }else{
            System.out.println("[ERRO] Impossivel cobrar mensalidade pois o status da conta é fechada.");
        }
    }
}
