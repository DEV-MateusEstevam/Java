package ultracursovideo;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //construtor
    public Lutador(){
        this.setNome("");
        this.setNacionalidade("");
        this.setIdade(0);
        this.setAltura(0);
        this.setPeso(0);
        this.setVitorias(0);
        this.setDerrotas(0);
        this.setEmpates(0);
    }
    
    //construtor
    public Lutador(String _nome, String _nacionalidade, int _idade, double _altura, double _peso, int _vitoria, int _derrota, int _empate){
        this.setNome(_nome);
        this.setNacionalidade(_nacionalidade);
        this.setIdade(_idade);
        this.setAltura(_altura);
        this.setPeso(_peso);
        this.setVitorias(_vitoria);
        this.setDerrotas(_derrota);
        this.setEmpates(_empate);
    }
    
    
    //metodos da classe
    public void apresentar(){
        System.out.println();
        System.out.println("APRESENTAÇÃO DO LUTADOR");
        System.out.println("Nome do Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos.");
        System.out.println("Altura: "+this.getAltura()+" metros");
        System.out.println("Peso: "+this.getPeso()+"KG.");
        System.out.println("Total Vitórias: "+this.getVitorias());
        System.out.println("Total Derrotas: "+this.getDerrotas());
        System.out.println("Total Empates: "+this.getEmpates());
        System.out.println();
    }
    
    public void status(){
        System.out.println();
        System.out.println("STATUS DO LUTADOR");
        System.out.print("Lutador: "+this.getNome());
        System.out.println(" da categoria peso "+this.getCategoria()+" tem:");
        System.out.println(this.getVitorias()+" vitórias;");
        System.out.println(this.getDerrotas()+" derrotas;");
        System.out.println(this.getEmpates()+" empates.");
        System.out.println();
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
    
    //metodos especiais
    public String getNome(){return nome;}
    
    public final void setNome(String nome){this.nome = nome;}
    
    public String getNacionalidade(){return nacionalidade;}
    
    public final void setNacionalidade(String nacionalidade){this.nacionalidade = nacionalidade;}
    
    public int getIdade(){return idade;}
    
    public final void setIdade(int idade){this.idade = idade;}
    
    public double getAltura(){return altura;}
    
    public final void setAltura(double altura){this.altura = altura;}
    
    public double getPeso(){return peso;}
    
    public final void setPeso(double peso){
        this.peso = peso; 
        this.setCategoria();
    }
    
    public String getCategoria(){return categoria;}
    
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Categoria INVALIDA!Peso muito leve!";
        }else if((this.peso>=52.2)&&(this.peso<70.3)){
            this.categoria = "LEVE";
        }else if((this.peso>=70.3)&&(this.peso<83.9)){
            this.categoria = "MÉDIO";
        }else if((this.peso>=83.9)&&(this.peso<120.2)){
            this.categoria = "PESADO";
        }else{
            this.categoria = "Categoria INVALIDA!Peso muito pesado!";
        }
    }
    
    public int getVitorias(){return vitorias;}
    
    public final void setVitorias(int vitorias){this.vitorias = vitorias;}
    
    public int getDerrotas(){return derrotas;}
    
    public final void setDerrotas(int derrotas){this.derrotas = derrotas;}
    
    public int getEmpates(){return empates;}
    
    public final void setEmpates(int empates){this.empates = empates;}

}
