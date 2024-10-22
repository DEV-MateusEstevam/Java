package Exercicio1;

public class Principal {
    public static void main(String[] args){
    //Criando um objeto (instancia) da class Veiculo
    
        //Criando um objeto através do construtor
        Veiculo carro01 = new Veiculo();
        
        carro01.setMarca("Volkswagem");
        carro01.setModelo("Fusca");
        carro01.setCor("Azul");
        carro01.setAno(2014);
        
        carro01.mostrarDados();
    }
}
