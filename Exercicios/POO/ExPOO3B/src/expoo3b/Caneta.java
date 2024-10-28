package expoo3b;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //metodo Construtor
    public Caneta(){
        this.setCor("Azul");
        this.setTampada(true);
    }
    
    //Metodos especiais
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getCor(){
        return this.cor;  
    }
    
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    
    public void setCarga(int cr){
        this.carga = cr;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    //Metodos personalizados
    public void escrever(){
        if(this.getTampada() == false){
            System.out.println("Escrevendo...");
        }else{
            System.out.println("[ERRO] Impossivel escrever pois a caneta está Tampada.");
        }
    }
    
    public void rabiscar(){
        if(this.getTampada() == false){
            System.out.println("Rabiscando...");
        }else{
            System.out.println("[ERRO] Impossivel rabiscar pois a caneta esta Tampada.");
        }
    }
    
    public void pintar(){
        if(this.getTampada() == false){
            System.out.println("Pintando...");
        }else {
            System.out.println("[ERRO] Impossivel pintar pois a caneta esta Tampada.");
        }
    }
    
    protected void tampar(){
        this.setTampada(true);
    }
    
    protected void destampar(){
        this.setTampada(false);
    }
    
    public void Status(){
        System.out.println();
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Carga: "+ this.getCarga()+"%");
        System.out.println("A caneta está tampada? "+ this.getTampada());
    }
}
