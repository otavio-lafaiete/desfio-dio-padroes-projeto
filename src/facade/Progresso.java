package facade;

public class Progresso {
    public void progredir(){
        AumentarDificuldadeDosInimigos aumentarDificuldadeDosInimigos = new AumentarDificuldadeDosInimigos();
        ReceberArmaPremio receberArmaPremio = new ReceberArmaPremio();
        UparDeNivel uparDeNivel = new UparDeNivel();

        uparDeNivel.executar();
        receberArmaPremio.executar();
        aumentarDificuldadeDosInimigos.executar();
    }
}
