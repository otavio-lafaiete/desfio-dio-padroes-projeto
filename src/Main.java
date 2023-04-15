import facade.Progresso;
import singleton.e.strategy.Guerreiro;
import singleton.e.strategy.Ladino;
import singleton.e.strategy.Mago;
import singleton.e.strategy.Personagem;

public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro = Guerreiro.getInstance();
        Ladino ladino = Ladino.getInstance();
        Mago mago = Mago.getInstance();

        Personagem personagem1 = new Personagem(guerreiro);
        Personagem personagem2 = new Personagem(ladino);
        Personagem personagem3 = new Personagem(mago);

        System.out.println("------------------------------------------------------");
        System.out.println("Utilizando a padrão strategy para movimentar os personagens: ");
        personagem1.movimentar();
        personagem2.movimentar();
        personagem3.movimentar();

        System.out.println("------------------------------------------------------");
        System.out.println("Verificando que o padrão singleton funcionou:");
        Mago mago2 = Mago.getInstance();
        System.out.println("Referência Mago1: " + mago);
        System.out.println("Referência Mago2: " + mago2);

        System.out.println("------------------------------------------------------");
        System.out.println("Utilizando o padrão facade:");
        Progresso progresso = new Progresso();
        progresso.progredir();
    }
}
