package UregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0XFFABC 0X109 0X1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);  //pattern.Matcher(texto) alt + enter

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
        [] = forma um conjunto de reng. Muito usado para localizar uma palavra dentro dos colchetes.Ex [abc]
        ele irá procurar ou por a, b ou c
        da para fazer assim tbm: [a-z] (significa que pesquisarão minusculas) ou [A-Z]
        */

        String regex2 = "[abcABC]"; //podemos fazer assim tbm: [a-zA-C]
        //String texto3 = "abaaba";
        String texto4 = "cafeBABE";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto4);  //pattern.matcher(texto) alt + enter

        System.out.println("texto: " + texto4);
        System.out.println("indice: 123456");
        System.out.println("regex: " + regex2);
        System.out.println("Posições encontradas:");

        while (matcher2.find()) {
            System.out.print(matcher2.start() + "  " + matcher2.group() + "\n");
        }
        System.out.println("--------------------");
        //imprimindo numeros hexadecimal: antes do numero escrito como hexadecimal usamos o 0x ou 0X sempre
        int numeroHex = 0x8FDF2;
        System.out.println(numeroHex);
    }
}
