package singleton.e.strategy;

public class Guerreiro implements Movimento{

    private static final Guerreiro guerreiro = new Guerreiro();

    private Guerreiro(){
        super();
    }

    @Override
    public void movimentar() {
        System.out.println("Guerreiro andou uma casa!");
    }

    public static Guerreiro getInstance(){
        return guerreiro;
    }
}
