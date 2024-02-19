package Polimorfismo;

import Polimorfismo.Servico.CalculadoraImposto;

public class Teste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Samsung", 4000);

        Tomate tomate = new Tomate("Brasileiro", 7);
        tomate.setDataValidade("11/11/25");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
