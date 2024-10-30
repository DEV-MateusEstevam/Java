package mostrarcontas;
/**
 * utilizar atributo estático: static
 * Um atributo estático ás vezes é chamado atributo de classe porque
 * há um único campo para toda a classe.
 */
public class BankAccount {
    // atributos de instancia não encapsulado com modificar public
    public String nome;
    public double saldo;
    public int numeroConta;
    // atributo da classe
    public static int numeroCliente = 33000;
    
    //criar um construtor para inicializar os dados
    public BankAccount(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        numeroConta = numeroCliente++;             
    }            
}
