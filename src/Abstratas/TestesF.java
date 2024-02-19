package Abstratas;

public class TestesF {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nani", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Ju", 12000);
        System.out.println(desenvolvedor);

        gerente.imprimeAbs();
        desenvolvedor.imprimeAbs();
    }
}
