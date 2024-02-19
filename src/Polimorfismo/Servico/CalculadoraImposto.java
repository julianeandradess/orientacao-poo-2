package Polimorfismo.Servico;

import Polimorfismo.Computador;
import Polimorfismo.Produto;
import Polimorfismo.Tomate;

public class CalculadoraImposto {
    /*public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Imposto do computador: " + imposto);
    }

    public static void calcularImposoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double impostoT = tomate.calcularImposto();
        System.out.println("Computador: " + tomate.getNome());
        System.out.println("Valor do computador: " + tomate.getValor());
        System.out.println("Imposto do computador: " + impostoT);
    }*/

    //simplificação dos métodos acima:

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Produto: "+ produto.getValor());
        System.out.println("Produto: "+ imposto);

        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }

    //quando criamos um método static não precisamos mais criar um new calculando imposto, chamamos a classe
}
