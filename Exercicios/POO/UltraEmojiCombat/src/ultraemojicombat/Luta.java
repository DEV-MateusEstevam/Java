package ultraemojicombat;

import java.util.Random;

public class Luta {
   //atributos
    private Lutador desafiado;//tipo abstrato
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos da classe
    public void marcarLuta(Lutador l1, Lutador l2){
    
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.aprovada = true;// setAprovada(true);
            this.desafiado = l1; // setDesafiado(l1);
            this.desafiante = l2;// setDesafiante(l2);
        }else{
            this.aprovada = false; //setAprovada(false);
            this.desafiado = null; //setDesafiado(null);
            this.desafiante = null; //setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovada() == true){
            System.out.println(" ### DESAFIADO ### ");
            this.desafiado.apresentar();
            System.out.println(" ### DESAFIANTE ### ");
            this.desafiante.apresentar();
            
            Random sorteio = new Random();
            int vencedor = sorteio.nextInt(3);//0,1,2
            
            System.out.println("===== RESULTADO =====");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Vitoria do Desafiado
                    System.out.println("Vitória do desafiador "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://Vitoria Desafiante
                    System.out.println("Vitória do desafiante "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer...");
        }
    }
    
    //metodos especiais
    public Lutador getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante(){
        return desafiante;
    }
    
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiado;
    }
    
    public int getRounds(){
        return rounds;
    }
    
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    
    public boolean getAprovada(){
        return aprovada;
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}


