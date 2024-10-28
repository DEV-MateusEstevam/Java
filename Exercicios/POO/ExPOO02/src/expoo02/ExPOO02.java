package expoo02;

public class ExPOO02 {

    public static void main(String[] args) {
        Arvore a1 = new Arvore();
        a1.Nome = "Bananeira";
        a1.Altura = 1.24f;
        a1.DiametroTronco = 0.78f;
        a1.Balancar();
        a1.CairFolha();
        a1.Florescer();
        a1.Frutificar();
        a1.Parada();
        a1.Status();
    }
}
