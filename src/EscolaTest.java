import automobolistico.EscolaHabilitacao;
import automobolistico.Instrutor;

public class EscolaTest {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Saboia");
        Instrutor instrutor2 = new Instrutor("Seboia");
        Instrutor[] instrutores = {instrutor1, instrutor2};
        EscolaHabilitacao escola = new EscolaHabilitacao("Quenia", instrutores);

        escola.imprimes();

    }
}
