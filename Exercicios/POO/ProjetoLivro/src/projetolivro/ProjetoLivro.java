package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        
        pessoas[0] = new Pessoa("Yan", 26, "Masculino");
        pessoas[1] = new Pessoa("Jamily", 23, "Feminino");
        pessoas[2] = new Pessoa("Evandro", 34, "Masculino");
        
        Livro[] livros = new Livro[3];
        
        livros[0] = new Livro("Clean Code", "Mano Deivyn", 250, pessoas[0]);
        livros[1] = new Livro("As 48 leis do Poder", "Erick Castro", 600, pessoas[1]);
        livros[2] = new Livro("Aprendendo POO", "Gustavo Guanabara", 180, pessoas[2]);
        
        livros[0].abrir();
        livros[0].folhear(250);
        livros[0].avancarPag();
        System.out.println();
        System.out.println(livros[0].detalhes());
        System.out.println();
        System.out.println(livros[1].detalhes());
        System.out.println();
        System.out.println(livros[2].detalhes());
    }
}
