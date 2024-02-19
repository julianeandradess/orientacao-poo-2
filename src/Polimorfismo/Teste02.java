package Polimorfismo;

import java.util.Locale;

public class Teste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Samsung", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
