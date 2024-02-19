package ModificadorFinal;

public class CaminhaoTest {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        System.out.println(Caminhao.VELOCIDADE_LIMITE);

        caminhao.COMPRADOR.setNome("Split");
        System.out.println(caminhao.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Relampago");
        ferrari.imprima();
    }
}
