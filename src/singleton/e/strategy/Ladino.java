package singleton.e.strategy;

public class Ladino implements Movimento{

    private static final Ladino ladino = new Ladino();

    private Ladino(){
        super();
    }

    @Override
    public void movimentar() {
        System.out.println("Ladino andou três casas!");
    }

    public static Ladino getInstance(){
        return ladino;
    }
}
