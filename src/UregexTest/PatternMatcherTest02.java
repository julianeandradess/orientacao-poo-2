package UregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {


        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);  //pattern.matcher(texto) alt + enter

        System.out.println("texto: " + texto2);
        System.out.println("indice: 123456");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.print(matcher.start() + "  " + matcher.group() + "\n");
        }//matcher.start - posição       matcher.group() + "\n" - o que ele encontrou



        /*para fazer pesquisas de numero e não somente de palavras:
        \d = retorna todos os digitos numericos daquele texto. Ex de como ficará: String regex = "\\d"
        \D = tudo o que não for digito, retorna letras, caracteres especiais
        \s \t \n \f \r = todos os espaços em branco
        \S = exclui todos os espaços em branco
        \w = tudo de A a Z ou a a z, digitos e _
        \W = tudo o que não for incluido no \w
        */

        String regex2 = "\\s";
        String texto3 = "abaaba";
        String texto4 = "@fr45ghy6";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern.matcher(texto4);  //pattern.matcher(texto) alt + enter

        System.out.println("texto: " + texto4);
        System.out.println("indice: 123456");
        System.out.println("regex: " + regex2);
        System.out.println("Posições encontradas:");

        while (matcher2.find()) {
            System.out.print(matcher2.start() + "  " + matcher2.group() + "\n");
        }
    }
}
