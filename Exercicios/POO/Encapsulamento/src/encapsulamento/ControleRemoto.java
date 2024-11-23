package encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    //construtor
    public ControleRemoto(int _volume, boolean _ligado, boolean _tocando){
        this.setVolume(_volume);
        this.setLigado(_ligado);
        this.setTocando(_tocando);
    }
    
    //metodos especiais
    private int getVolume(){return volume;}
    
    private final void setVolume(int volume){this.volume = volume;}
    
    private boolean getLigado(){return ligado;}
    
    private final void setLigado(boolean ligado){this.ligado = ligado;}
    
    private boolean getTocando(){return tocando;}
    
    private final void setTocando(boolean tocando){this.tocando = tocando;}
    
    //metodos abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){      
        if(this.getLigado()==true){
            System.out.println("Controle Remoto esta ligado? "+this.getLigado());
            System.out.println("Controle Remoto esta tocando? "+this.getTocando());
            System.out.println("Volume do controle Remoto: "+this.getVolume());
       
            int i;
            for (i=0;i <= this.getVolume();i+=10){
                System.out.print("  |  ");
            }
            System.out.println();
            System.out.println();
        } else{
            System.out.println("[ERRO]Impossível ABRIR MENU pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu do controle remoto...");
    }
    
    @Override
    public void maisVolume(){
        if((this.getLigado() == true) && (this.getVolume()>=0)){
            this.desligarMudo();
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("[ERRO]Impossível AUMENTAR VOLUME pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void menosVolume(){
        if((this.getLigado() == true) && (this.getVolume()>0)){
            this.setVolume(this.getVolume() - 5);
        }else if(this.getVolume()<=0){
            this.ligarMudo();
            System.out.println("[ERRO]Impossível DIMINUIR VOLUME pois o controle esta no MUDO!");
        }else{
            System.out.println("[ERRO]Impossível DIMINUIR VOLUME pois o controle esta no DESLIGADO!");
        }
    }
    
    @Override
    public void ligarMudo(){
        if((this.getLigado() == true) && (this.getVolume()>0)){
            this.setVolume(0);
        }else if(this.getVolume()<=0){
            System.out.println("[ALERT] O volume ja esta no MUDO");
        }else{
            System.out.println("[ERRO]Impossivel LIGAR O MUDO pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void desligarMudo(){
        if((this.getLigado() == true) && (this.getVolume()<=0)){
            this.setVolume(50);
        }else if(this.getVolume()>0){
            System.out.println("[ALERT] O modo MUDO ja esta DESLIGADO");
        }else{
            System.out.println("[ERRO]Impossivel DESLIGAR O MUDO pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void play(){
        if((this.getLigado() == true) && (this.getTocando() == false)){
            this.setTocando(true);
        }else if(this.getTocando() == true){
            System.out.println("[ALERT] O som já esta TOCANDO");
        }else{
            System.out.println("[ERRO]Impossivel dar PLAY pois o controle esta DESLIGADO!");
        }
    }
    
    @Override
    public void pause(){
        if((this.getLigado()==true) && (this.getTocando() == true)){
            this.setTocando(false);
        }else if(this.getTocando() == false){
            System.out.println("[ALERT] O som ja esta PAUSADO");
        }else{
            System.out.println("[ERRO]Impossivel dar PAUSE pois o controle esta DESLIGADO!");
        }
    }
}
