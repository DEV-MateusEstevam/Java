package portfoliopoojava;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //método especiais:construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    //metodos especiais
    private int getVolume(){
        return volume;
    }
    
    private void setVolume(int vol){
        this.volume = vol;
    }
    
    private boolean getLigado(){
        return ligado;
    }
    
    private void setLigado(boolean lig){
        this.ligado = lig;
    }
   
    private boolean getTocando(){
        return tocando;
    }
    
    private void setTocando(boolean toc){
        this.tocando = toc;
    }
    
    //metodos abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0); 
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("");
        System.out.println("----------MENU----------");
        System.out.println("Controle está ligado? " + this.getLigado());
        System.out.println("Aparelho de som está tocando? "+ this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i=0;i <= this.getVolume(); i+=10){
            System.out.print(" | ");
        } 
        System.out.println("");
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume(){
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("[ERRO] Impossível AUMENTAR VOLUME pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void menosVolume(){
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("[ERRO] Impossível DIMINUIR VOLUME pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void ligarMudo(){
        if ((this.getLigado() == true) && (this.getVolume() > 0)){
            this.setVolume(0);
        }else if((this.getLigado() == true) && (this.getVolume() == 0)){
            System.out.println("Função Mudo já estava ativada!");
        }else{
            System.out.println("[ERRO] Impossível LIGAR O MUDO pois o controle está DESLIGADO!");
        }
    }
    
    @Override
    public void desligarMudo(){
        if ((this.getLigado() == true) && (this.getVolume() == 0)){
            this.setVolume(50);
        } else {
            System.out.println("[ERRO] Impossível DESLIGAR O MUDO pois o controle está DESLIGADO!");
        }
    }
    
    @Override
    public void play(){
        if ((this.getLigado() == true) && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("[ERRO] Impossível dar PLAY pois o controle está DESLIGADO!");
        }
    }
    
    @Override
    public void pause(){
        if((this.getLigado() == true) && (this.getTocando() == true)){
            this.setTocando(false);
        }else{
            System.out.println("[ERRO] Impossível dar PAUSE pois o controle está DESLIGADO!");
        } 
    }
}
