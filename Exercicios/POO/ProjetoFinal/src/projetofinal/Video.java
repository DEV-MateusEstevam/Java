package projetofinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String _titulo, /*int _avaliacao*/int _views, int _curtidas, boolean _reproduzindo){
        //após ter add os metodos de avaliar, não é mais necessario passar a nota de avaliacao pelo construtor
        this.setTitulo(_titulo);
        //this.setAvaliacao(_avaliacao);
        this.setViews(_views);
        this.setCurtidas(_curtidas);
        this.setReproduzindo(_reproduzindo);
    }
    
    public Video(){
        this.setTitulo(null);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    @Override
    public void play(){
        if(this.getReproduzindo() == false){
            this.setReproduzindo(true);
            System.out.println("Botão PLAY foi clicado: O video COMEÇARA a ser REPRODUZIDO!");
        }else{
            System.out.println("Botão PLAY foi clicado:O video JA ESTA sendo REPRODUZIDO!");
        }
        
    }
    
    @Override
    public void pause(){
        if(this.getReproduzindo() == true){
            this.setReproduzindo(false);
            System.out.println("Botão PAUSE foi clicado: O video IRA ser PAUSADO!");
        }else{
            System.out.println("Botão PAUSE foi clicado: O video JA ESTA PAUSADO!");
        }
    }
    
    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas() + 1);
        System.out.println("Video Curtido com sucesso!");
    }
    
    public String getTitulo(){return titulo;}
    
    public final void setTitulo(String titulo){this.titulo = titulo;}
    
    public int getAvaliacao(){return avaliacao;}
    
    public final void setAvaliacao(int avaliacao){
        int novaAvaliacao;
        novaAvaliacao =/*parametro int para retornar um valor inteirdo da divisao a frente*/(int)((this.avaliacao + avaliacao)/this.views);
        //a novaAvaliacao dos videos sera a MEDIA das Avaliações que ele ja possui
        this.avaliacao = novaAvaliacao;
    }
    
    public int getViews(){return views;}
    
    public final void setViews(int views){this.views = views;}
    
    public int getCurtidas(){return curtidas;}

    public final void setCurtidas(int curtidas){this.curtidas = curtidas;}
    
    public boolean getReproduzindo(){return reproduzindo;}
    
    public final void setReproduzindo(boolean reproduzindo){this.reproduzindo = reproduzindo;}
    
    @Override
    public String toString(){
        return"Video { Titulo: "+titulo+",\nQuantidade de Avaliações: "+avaliacao+" estrela(s),\nQuantidade de Views: "+views+"\nQuantidade de Curtidas: "+curtidas+"\nVideo esta sendo reproduzido? "+reproduzindo+"}";
    }    
}
