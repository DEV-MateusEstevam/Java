package ultraemojicombat;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //metodos especiais: construtor
    public Lutador(String no, String na, int id,float al, float pe, int vi, int de, int em){
        this.nome=no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //metodos especiais
    public String getNome(){
        return nome;
    }
    
    public void setNome(String no){
        this.nome = no;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public float getAltura(){
        return altura;
    } 
    
    public void setAltura(float al){
        this.altura = al;
    }
    
    public float getPeso(){
        return peso;
    }
    

   public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    private void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido! Muito abaixo do peso";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido! Muito acima do peso";
        }
    }
    
    public int getVitorias(){
        return vitorias;
    }
    
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public void setEmpates(int em){
        this.empates = em;
    }
    
    //metodos da classe
    public void apresentar(){
        System.out.println("");
        System.out.println("----------APRESENTAÇÃ0----------");
        System.out.println("LUTADOR: "+this.getNome());
        System.out.println("ORIGEM: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" metros de altura");
        System.out.println("PESANDO "+this.getPeso());
        System.out.println("GANHOU: "+this.getVitorias()+" lutas;");
        System.out.println("EMPATOU: "+this.getEmpates()+" lutas;");
        System.out.println("PERDEU: "+this.getDerrotas()+" lutas");
        System.out.println("");
    }
    
    public void status(){
        System.out.println("");
        System.out.println("----------STATUS----------");
        System.out.println("Lutador "+this.getNome());
        System.out.println("é um peso "+this.getCategoria()+" com ");
        System.out.println(this.getVitorias()+" vitórias ");
        System.out.println(this.getEmpates()+" empates e ");
        System.out.println(this.getDerrotas()+" derrotas.");
        System.out.println("");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}
