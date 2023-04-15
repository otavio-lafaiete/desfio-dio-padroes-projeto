package singleton.e.strategy;

public class Personagem {
    private final Movimento movimento;

    public Personagem(Movimento movimento){
        this.movimento = movimento;
    }

    public void movimentar(){
        movimento.movimentar();
    }
}
