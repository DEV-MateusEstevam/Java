package projetolivro;

public final class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    public String detalhes(){
        return "Livro(" + "\nTítulo = " + titulo + ",\nAutor = "+ autor 
                + ",\nTotal de Paginas = "+ totPaginas +",\nPagina Atual = "
                + pagAtual + ",\nLivro esta aberto? "+ aberto + ",\nLeitor = "+ leitor.getNome()+",\nIdade = "
                +leitor.getIdade()+",\nSexo = "+leitor.getSexo()+")";
    
    }
    
    //construtor
    
    public Livro(String _titulo, String _autor, int _totPaginas, Pessoa _leitor){
        this.setTitulo(_titulo);
        this.setAutor(_autor);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setTotPaginas(_totPaginas);
        this.setLeitor(_leitor);
    }
    
    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    
    //metodos especiais
    public String getTitulo(){
        return titulo;
    }
    
    public final void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public final void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getTotPaginas(){
        return totPaginas;
    }
    
    public final void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual(){return pagAtual;}
    
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    
    public boolean getAberto(){
        return aberto;
    }
    
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    public Pessoa getLeitor(){
        return leitor;
    }
    
    public final void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
    
    //metodos abstratos
    @Override
    public void abrir(){
        this.setAberto(true);
    }
    
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    
    @Override
    public void folhear(int pagina){
        if(this.getAberto()==true){
            if(pagina > this.getTotPaginas()){
                System.out.println("[ERRO]Impossivel folhear até a pagina "+ pagina +" pois o livro '"+this.getTitulo()+"' tem somente "+this.getTotPaginas()+" paginas");
            }else{
                this.setPagAtual(pagina);
            }
        }else{
            System.out.println("[ERRO]Impossivel folhear paginas do livro '"+this.getTitulo()+"' pois o mesmo se encontra FECHADO!");
        }
        
        
    }
    
    @Override
    public void avancarPag(){
        this.setTotPaginas(this.getTotPaginas() + 1);
    }
    
    @Override
    public void voltarPag(){
        this.setTotPaginas(this.getTotPaginas() - 1);
    }
}
