package ultracursovideo;

public class UltraCursoVideo {
    
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Java", "França", 31, 1.75, 68.9, 11, 2, 1);
        
        l[1] = new Lutador("Python", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[1].status();
        
        l[2] = new Lutador("GoLang", "Estados Unidos", 35, 1.65, 80.9, 12, 2, 1);
        
        l[3] = new Lutador("TypeScript", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        //l[3].perderLuta();
        //l[3].setPeso(40);
        //l[3].status();
        
        l[4] = new Lutador("Ruby", "Jamaica", 37, 1.70, 119.3, 5, 4, 3);
        
        l[5] = new Lutador("VBA", "Holanda", 30, 1.81, 105.7, 12, 2, 4);
        l[5].status();
        
        Luta UCV01 = new Luta();
        UCV01.marcarLuta(l[4], l[5]);
        UCV01.lutar();
      
    }
    
}
