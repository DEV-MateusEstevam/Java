package ultracursovideo;

import java.util.Random;

public class Luta {
    private Lutador desafiado;//Lutador é um tipo abstrato do atributo desafiado
    private Lutador desafiante;//instancia da Classe Lutador
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador m1, Lutador m2){
        if(m1.getCategoria() == m2.getCategoria() && (m1 != m2)){
            this.setAprovada(true);
            this.setDesafiado(m1);
            this.setDesafiante(m2);
            System.out.println("Status da Luta: "+this.getAprovada());
            System.out.println("Lutador Desafiante: "+desafiante.getNome());
            System.out.println("Lutador Desafiado: "+desafiado.getNome());
        }else if(m1.getCategoria() == m2.getCategoria() && (m1 == m2)){
            this.setAprovada(false);
            this.setDesafiado(m1);
            this.setDesafiante(m2);
            System.out.println("[ERRO]A luta não pode ser marcada pois o lutador desafiante ("+desafiado.getNome()+") e o lutador desafiado ("+desafiante.getNome()+") são a mesma pessoa!");
        }else{
            this.setAprovada(false);
            this.setDesafiado(m1);
            this.setDesafiante(m2);
            System.out.println("[ERRO]A luta não pode ser marcada pois os Lutadores "+desafiado.getNome()+" e "+desafiante.getNome()+" são de categorias diferentes!");
        }
    }
    
    public void lutar(){
        
        if(this.getAprovada() == true){
            System.out.println();
            System.out.println("LUTADOR DESAFIANTE");
            desafiante.apresentar();
            System.out.println("LUTADOR DESAFIADO");
            desafiado.apresentar();
            
            Random numeroAleatorio = new Random();
            int vencedor = numeroAleatorio.nextInt(3);// 0, 1, 2
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Luta Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Ganhou
                    System.out.println(desafiado.getNome()+" é o Vencedor!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Desafiante Ganhou
                    System.out.println(desafiante.getNome()+" é o Vencedor!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                default:
                    System.out.println("[ERRO] Número gerado aleatóriamente é maior que 2.");
                    break;
            }
        }
    }
    
    public Lutador getDesafiado(){return desafiado;}
    
    public void setDesafiado(Lutador desafiado){this.desafiado = desafiado;}
    
    public Lutador getDesafiante(){return desafiante;}
    
    public void setDesafiante(Lutador desafiante){this.desafiante = desafiante;}
    
    public int getRounds(){return rounds;}
    
    public void setRounds(int rounds){this.rounds = rounds;}
    
    public boolean getAprovada(){return aprovada;}
    
    public void setAprovada(boolean aprovada){this.aprovada = aprovada;}
}
