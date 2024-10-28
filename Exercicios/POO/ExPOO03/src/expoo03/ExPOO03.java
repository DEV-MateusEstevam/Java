package expoo03;

public class ExPOO03 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "ARTCoat";
        c1.cor = "Vermelho";
        c1.carga = 65;
        //c1.tampada = false;
        //c1.ponta = 0.8f; // atributo privado
        c1.tampar();
        //c1.destampar();
        c1.rabiscar();
        c1.escrever();
        c1.pintar();
        c1.status();
    }
}
