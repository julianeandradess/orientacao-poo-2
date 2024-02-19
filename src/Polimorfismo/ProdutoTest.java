package Polimorfismo;

import Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Positivo", 3000);
        Tomate tomate = new Tomate("Italiano", 10);
        Televisao televisao = new Televisao("Semp", 3200);
        CalculadoraImposto.calcularImposto(computador);

        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
