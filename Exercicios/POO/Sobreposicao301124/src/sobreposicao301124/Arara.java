package sobreposicao301124;

public class Arara extends Ave{
  
    public Arara(double _peso, int _idade, int _membros,String _corPena){
        super(_peso, _idade, _membros, _corPena);
    }
    
    public Arara(){
        super();
    }
    
    @Override
    public String toString(){
        return "Arara { Peso: "+this.getPeso()+"KG, Idade: "+this.getIdade()+", Quantidade de membros: "+this.getMembros()+", Cor do Pelo: "+this.getCorPena()+"}";
    }
}
