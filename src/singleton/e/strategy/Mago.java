package singleton.e.strategy;

public class Mago implements Movimento{

    private static final Mago mago = new Mago();

    private Mago(){
        super();
    }

    @Override
    public void movimentar() {
        System.out.println("Mago andou duas casas!");
    }

    public static Mago getInstance(){
        return mago;
    }
}
