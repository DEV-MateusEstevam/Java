package projetofinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto _espectador, Video _filme){
        this.setEspectador(_espectador);
        this.setFilme(_filme);
        this.espectador.setTotalVideoAssistido(this.espectador.getTotalVideoAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    //Sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
        System.out.println("Filme/Video avaliado com sucesso!");
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        System.out.println("Filme/Video avaliado com sucesso!");
    }
    
    public void avaliar(double porcentagem){
        int totalAssistidoVideo = 0;
        if(porcentagem <= 20.0){
            totalAssistidoVideo = 3;
        }else if((porcentagem > 20.0) && (porcentagem <=50.0)){
            totalAssistidoVideo = 5;
        }else if((porcentagem > 50.0) && (porcentagem <=90.0)){
            totalAssistidoVideo = 8;
        }else{
            totalAssistidoVideo = 10;
        }
        
        this.filme.setAvaliacao(totalAssistidoVideo);
        System.out.println("Filme/Video avaliado com sucesso!");
    }
    
    public Gafanhoto getEspectador(){return espectador;}
    
    private void setEspectador(Gafanhoto espectador){this.espectador = espectador;}
    
    public Video getFilme(){return filme;}
    
    private void setFilme(Video filme){this.filme = filme;}
    
    @Override
    public String toString(){
        return"Visualização { Espectador: "+espectador+",\nFilme: "+filme+"}";
    }
}
