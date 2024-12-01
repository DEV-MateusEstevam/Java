package sobreposicao301124;

public class Sardinha extends Peixe{
    public Sardinha(double _peso, int _idade, int _membros, String _corEscama){
        super(_peso, _idade, _membros, _corEscama);
    }
    
    public Sardinha(){
        super();
    }
    
    @Override
    public String toString(){
        return "Sardinha { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorEscama()+"}";
    }
}
