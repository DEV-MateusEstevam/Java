package modificadores;

public class Caneta {
    
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;
    
    public Caneta(){
        this.modelo = "";
        this.cor = "";
        this.ponta = 0;
        this.carga = 0;
        this.tampada = false;
    }
    
    public Caneta(String _modelo, String _cor, double _ponta, int _carga, boolean _tampada){
        this.setModelo(_modelo);
        this.setCor(_cor);
        this.setPonta(_ponta);
        this.setCarga(_carga);
        this.setTampada(_tampada);
    }
    
    public void escrever(){
        if(getTampada() == true){
            System.out.println("[ERRO]Não é possivel ESCREVER pois a caneta está TAMPADA!");
        }else{
            System.out.println("ESCREVENDO...");
        }
    }
    
    public void rabiscar(){
        if(getTampada() == true){
            System.out.println("[ERRO]Não é possivel RABISCAR pois a caneta está TAMPADA!");
        }else{
            System.out.println("RABISCANDO...");
        }
    }
    
    public void pintar(){
        if(getTampada() == true){
            System.out.println("[ERRO]Não é possivel PINTAR pois a caneta está TAMPADA!");
        }else{
            System.out.println("PINTANDO...");
        }
    }
    
    protected  void tampar(){
        this.setTampada(true);
    
    }
    
    protected void destampar(){
        this.setTampada(false);
    }
    
    public void status(){
        System.out.println("Modelo da caneta: "+this.getModelo());
        System.out.println("Cor da caneta: "+this.getCor());
        System.out.println("Ponta da caneta: "+this.getPonta());
        System.out.println("Carga da caneta: "+this.getCarga());
        System.out.println("A caneta está Tampada? "+ this.getTampada());
    }
    
    public String getModelo(){return modelo;}
    
    public final void setModelo(String modelo){ this.modelo = modelo;}
    
    public String getCor(){return cor;}
    
    public final void setCor(String cor){this.cor = cor;}
    
    public double getPonta(){return ponta;}
    
    public final void setPonta(double ponta){this.ponta = ponta;}
    
    public int getCarga(){return carga;}
    
    public final void setCarga(int carga){this.carga = carga;}
    
    public boolean getTampada(){return tampada;}
    
    public final void setTampada(boolean tampada){this.tampada = tampada;}
}
