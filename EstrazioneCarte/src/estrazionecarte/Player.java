package estrazionecarte;

public class Player implements Runnable {
    private String nome;
    private int carta;

    public Player(String nome) {
        this.nome = nome;
        this.carta = (int)(10*Math.random())+1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }
    
    @Override
    public void run() {
        System.out.println(this.carta);
    }
    
}
