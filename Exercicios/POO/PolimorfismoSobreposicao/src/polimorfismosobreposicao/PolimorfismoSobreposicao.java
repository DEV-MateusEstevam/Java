package polimorfismosobreposicao;

public class PolimorfismoSobreposicao {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru joe = new Canguru();
        Cachorro caramelo = new Cachorro();
        Cobra python = new Cobra();
        Tartaruga heitor = new Tartaruga();
        Tilapia tilapia = new Tilapia();
        Arara jhow = new Arara();
        
       /* m.setCorPelo("Marrom");
        m.setPeso(55.2f);
        m.setIdade(8);
        m.setMembros(4);
        System.out.println("CARCTERISTICAS DO MAMIFERO");
        System.out.println("Idade do Mamifero: "+ m.getIdade());
        System.out.println("Peso do Mamifero: "+ m.getPeso());
        System.out.println("Quantidade de membros: "+ m.getMembros());
        System.out.println("Cor do pelo: "+ m.getCorPelo());
        m.locomover();
        m.alimentar();
        m.emitirSom();*/
       
       joe.setIdade(7);
       joe.setPeso(88.6f);
       joe.setMembros(4);
       joe.setCorPelo("Caramelo");
       System.out.println("CARACTERISTICAS DO CANGURU"); 
       System.out.println("Idade do Canguru Joe: "+ joe.getIdade()+" anos");
       System.out.println("Peso do canguru Joe: "+ joe.getPeso()+"KG");
       System.out.println("Quantidades de membros do canguru Joe: "+ joe.getMembros()+" patas");
       System.out.println("Cor do pelo do canguru Joe : "+ joe.getCorPelo());
       System.out.println("Canguru Joe esta :");
       joe.locomover();
       System.out.println("Canguru Joe esta :");
       joe.alimentar();
       System.out.println("Canguru Joe diz :");
       joe.emitirSom();
       System.out.println("Canguru Joe esta :");
       joe.usarBolsa();
       System.out.println("");
       
       caramelo.setIdade(4);
       caramelo.setPeso(46.8f);
       caramelo.setMembros(4);
       caramelo.setCorPelo("Branco");
       System.out.println("CARACTERISTICAS DO CACHORRO"); 
       System.out.println("Idade do cachorro caramelo : "+ caramelo.getIdade()+" anos");
       System.out.println("Peso do cachorro caramelo : "+ caramelo.getPeso()+"KG");
       System.out.println("Quantidades de membros do cachorro caramelo : "+ caramelo.getMembros()+" patas");
       System.out.println("Cor do pelo do cachorro caramelo : "+ caramelo.getCorPelo());
       System.out.println("Cachorro caramelo esta :");
       caramelo.locomover();
       System.out.println("Cachorro caramelo esta :");
       caramelo.alimentar();
       System.out.println("Cachorro caramelo diz :");
       caramelo.emitirSom();
       System.out.println("");
       
       python.setIdade(2);
       python.setPeso(10.7f);
       python.setMembros(0);
       python.setCorEscama("Verde");
       System.out.println("CARACTERISTICAS DA COBRA"); 
       System.out.println("Idade da cobra python : "+ python.getIdade()+" anos");
       System.out.println("Peso da cobra python : "+ python.getPeso()+"KG");
       System.out.println("Quantidades de membros da cobra python : "+ python.getMembros()+" patas");
       System.out.println("Cor das escamas da cobra python : "+ python.getCorEscama());
       System.out.println("Cobra Python esta :");
       python.locomover();
       System.out.println("Cobra Python esta :");
       python.alimentar();
       System.out.println("Cobra Python diz :");
       python.emitirSom();
       System.out.println("");
       
       heitor.setIdade(9);
       heitor.setPeso(32.8f);
       heitor.setMembros(4);
       heitor.setCorEscama("Tartaruga não tem escamas");
       heitor.setCorCasco("Salmão");
       System.out.println("CARACTERISTICAS DA TARTARUGA"); 
       System.out.println("Idade da tartaruga heitor : "+ heitor.getIdade()+" anos");
       System.out.println("Peso da tartaruga : "+ heitor.getPeso()+"KG");
       System.out.println("Quantidades de membros da tartaruga : "+ heitor.getMembros()+" patas");
       System.out.println("Cor das escamas da tartaruga heitor : "+ heitor.getCorEscama());
       System.out.println("Cor do Casco da tartaruga Heitor : "+ heitor.getCorCasco());
       System.out.println("Tartaruga Heitor esta :");
       heitor.locomover();
       System.out.println("Tartaruga Heitor esta :");
       heitor.alimentar();
       System.out.println("Tartaruga Heitor diz :");
       heitor.emitirSom();
       System.out.println("");
       
       
       tilapia.setIdade(3);
       tilapia.setPeso(12.8f);
       tilapia.setMembros(0);
       tilapia.setNadadeira(2);
       tilapia.setCorEscama("Azul Royal");
       System.out.println("CARACTERISTICAS DO PEIXE"); 
       System.out.println("Idade do peixe tilapia : "+ tilapia.getIdade()+" anos");
       System.out.println("Peso do peixe tilapia : "+ tilapia.getPeso()+"KG");
       System.out.println("Quantidades de membros do peixe tilapia : "+ tilapia.getMembros()+" patas");
       System.out.println("Quantidade de nadadeirs do peixe tilapia : "+ tilapia.getNadadeira()+" nadadeiras");
       System.out.println("Cor das escamas do peixe tilapia : "+ tilapia.getCorEscama());
       System.out.println("Peixe Tilapia esta :");
       tilapia.locomover();
       System.out.println("Peixe Tilapia esta :");
       tilapia.alimentar();
       System.out.println("Peixe Tilapia diz :");
       tilapia.emitirSom();
       System.out.println("Peixe Tilapia esta :");
       tilapia.soltarBolha();
       System.out.println("");
       
       
       jhow.setIdade(6);
       jhow.setPeso(28.5f);
       jhow.setMembros(2);
       jhow.setCorPena("Vermelho");
       System.out.println("CARACTERISTICAS DA ARARA"); 
       System.out.println("Idade da arara Jhow : "+ jhow.getIdade()+" anos");
       System.out.println("Peso da arara Jhow : "+ jhow.getPeso()+"KG");
       System.out.println("Quantidades de membros da Arara Jhow : "+ jhow.getMembros()+" asas");
       System.out.println("Cor das penas da arara Jhow : "+ jhow.getCorPena());
       System.out.println("Arara Jhow esta :");
       jhow.locomover();
       System.out.println("Arara Jhow esta :");
       jhow.alimentar();
       System.out.println("Arara Jhow diz :");
       jhow.emitirSom();
       System.out.println("Arara Jhow :");
       jhow.fazerNinho();
       System.out.println("");
       
    }
    
}
