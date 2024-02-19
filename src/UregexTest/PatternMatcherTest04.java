package UregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
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

        vamos procurar o que está alem do quantitativo, no test03 podemos ver que a pesquisa só funciona em alguns
        ? significa zero-0 ou 1-uma ocorrencia
        * significa zero ou mais
        + significa uma ou mais ocorrencias
        {} significa valor mais especifico. Ex: {n,m} de n ate m
        () significa metacaracter de agrupamento
         | significa ou, ex: o(v|c)o vai dar a ocorrencia ovo ou oco, vai usar uma das duas letras de dentro do ()
         $ significa o fim da linha
         . significa que é coringa, tudo que tiver entre os numeros separados por ponto. Ex: 1.3 = 123, 1@3
         \\. significa a procura do ponto no texto. Ex: email.
        */
        String regex = "0[xX]([0-9a-fA-F])+\\s"; //antes estava: 0[xX][0-9a-fA-F]
        String texto = "12 0x 0X 0XFFABC 0X10G 0X1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);  //pattern.Matcher(texto) alt + enter

        System.out.println("texto: " + texto);
        System.out.println("indice: 123456");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.print(matcher.start() + "  " + matcher.group()+"\n");
        }//matcher.start - posição       matcher.group() + "\n" - o que ele encontrou

    }
}
