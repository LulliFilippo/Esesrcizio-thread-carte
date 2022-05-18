package estrazionecarte;

public class EstrazioneCarte {
    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player("Filippo");
        Player p2 = new Player("Edmard");
        Player p3 = new Player("Dawid");
        
        Thread a = new Thread(p1);
        Thread b = new Thread(p2);
        Thread c = new Thread(p3);
        
        System.out.println("Inizia il gioco!!!");
        
        a.start();
        b.start();
        c.start();
        
        a.join();
        b.join();
        c.join();
        
        if(p1.getCarta() == p2.getCarta() 
                || p1.getCarta() == p3.getCarta()
                || p3.getCarta() == p2.getCarta()){
            System.out.println("PAREGGIO");
        }
        
        if(p1.getCarta() > p2.getCarta() && p1.getCarta() > p3.getCarta()){
            System.out.println("HA VINTO " + p1.getNome() + " con il numro " + p1.getCarta());
        }
        if(p2.getCarta() > p1.getCarta() && p2.getCarta() > p3.getCarta()){
            System.out.println("HA VINTO " + p2.getNome() + " con il numro " + p2.getCarta());
        }
        if(p3.getCarta() > p2.getCarta() && p3.getCarta() > p1.getCarta()){
            System.out.println("HA VINTO " + p3.getNome() + " con il numro " + p3.getCarta());
        }
        
        System.out.println("Gioco finito!!!");
    }
    
}
