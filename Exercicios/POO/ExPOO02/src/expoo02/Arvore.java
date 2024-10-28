package expoo02;

public class Arvore {
    
    String Nome;
    float Altura;
    float DiametroTronco;
    
    void Florescer(){
        System.out.println("A árvore "+this.Nome+" está Florescendo!");
    }
    
    void Frutificar(){
        System.out.println("A árvore "+this.Nome+" está dando Frutos!");
    }
    
    void CairFolha(){
        System.out.println("As folhas da árvore "+this.Nome+" estão caindo!");
    }
    
    void Balancar(){
        System.out.println("A árvore "+this.Nome+" está Balançando!");
    }
    void Parada(){
        System.out.println("A árvore "+this.Nome+" está Parada!");
    }
    
    void Status(){
        System.out.println("O nome da árvotre é: "+this.Nome);
        
        if (this.Altura > 0.99){
            System.out.println("A altura da árvore é de "+this.Altura+" metros.");
        } else{
            System.out.println("A altura da árvore é de "+this.Altura+" cm.");
        }
        
        System.out.println("O diametro do tronco da árvore é de "+this.DiametroTronco+"cm .");
    }
}
