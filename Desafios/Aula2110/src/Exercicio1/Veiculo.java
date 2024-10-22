package Exercicio1;

public class Veiculo {
    // definindo os atributos = variaveis
    public String Marca, Modelo, Cor;
    public int Ano;
    
    //metodos sets(colocar): definindo conteudo
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public void setCor(String Cor){
        this.Cor = Cor;
    }
    
    public void setAno(int Ano){
        this.Ano = Ano;
    }
    
    //metodo gets: retornar o conteudo recebido
    public String getMarca(){
        return Marca;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public String getCor(){
        return Cor;
    }
    
    public int getAno(){
        return Ano;
    }
    
    public void mostrarDados(){
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano de Fabricação: "+this.getAno());
    }
}



