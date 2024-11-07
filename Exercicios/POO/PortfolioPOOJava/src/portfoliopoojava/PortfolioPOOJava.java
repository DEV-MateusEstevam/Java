package portfoliopoojava;

public class PortfolioPOOJava {
   
    public static void main(String[] args) {
        ControleRemoto cTelevisao = new ControleRemoto();
        cTelevisao.ligar();
        cTelevisao.abrirMenu();
        cTelevisao.setMarca("AOC");
        cTelevisao.abrirMenu();
        cTelevisao.play();
        cTelevisao.abrirMenu();
        cTelevisao.maisVolume();
        cTelevisao.abrirMenu();
        cTelevisao.maisVolume();
        cTelevisao.abrirMenu();
        cTelevisao.pause();
        cTelevisao.abrirMenu();
        cTelevisao.menosVolume();
        cTelevisao.abrirMenu();
        cTelevisao.ligarMudo();
        cTelevisao.abrirMenu();
        cTelevisao.desligarMudo();
        cTelevisao.abrirMenu();
        cTelevisao.fecharMenu();
        cTelevisao.desligar();
        cTelevisao.abrirMenu();
        
        /*ControleRemoto cDVD = new ControleRemoto();
        cDVD.ligar();
        cDVD.abrirMenu();
        cDVD.setMarca("Panasonic");
        cDVD.abrirMenu();
        cDVD.play();
        cDVD.abrirMenu();
        cDVD.maisVolume();
        cDVD.abrirMenu();
        cDVD.maisVolume();
        cDVD.abrirMenu();
        cDVD.pause();
        cDVD.abrirMenu();
        cDVD.menosVolume();
        cDVD.abrirMenu();
        cDVD.ligarMudo();
        cDVD.abrirMenu();
        cDVD.desligarMudo();
        cDVD.abrirMenu();
        cDVD.fecharMenu();
        cDVD.desligar();
        cDVD.abrirMenu();*/
    }
}
