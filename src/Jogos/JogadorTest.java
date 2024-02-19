package Jogos;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Alemanha");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador.impresso();

        System.out.println("---Time---");
        time.impresso();
    }
}
