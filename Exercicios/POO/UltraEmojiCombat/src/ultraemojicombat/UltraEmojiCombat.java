package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador m[] = new Lutador[6];
        m[0] = new Lutador("Alex Poatan", "Brasil", 31, 1.75f, 68.9f, 11, 2, 1);
        m[1] = new Lutador("Charles DuBronx", "Brasil", 29, 1.68f, 57.8f, 14, 3, 2);
        m[2] = new Lutador("Minotauro", "Chile", 35, 1.65f, 80.9f, 12, 2, 1);
        m[3] = new Lutador("Adesanya", "Nigéria", 28, 1.93f, 81.6f, 13, 0, 2);
        m[4] = new Lutador("Jhow Jones", "EUA", 37, 1.70f, 119.3f, 5, 4, 3);
        m[5] = new Lutador("Anderson Silva", "Brasil", 30, 1.81f, 105.7f, 12, 2, 4);
        /* m[0].apresentar();
        m[1].apresentar();
        m[2].apresentar();
        m[3].apresentar();
        m[4].apresentar();
        m[5].apresentar(); */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(m[4], m[5]);
        UEC01.lutar();
        //m[0].status();
        //m[1].status();
        
    }
    
}
