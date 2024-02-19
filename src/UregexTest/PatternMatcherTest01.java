package UregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        /*trazem o valor que estamos procurando em um texto, site
        começamos com uma expressao regular, botamos dentro dela o que precisa ser procurado
        Pattern = padrão. Precisam ser compiladas para validar essa regulaguem.
        Matcher = encontra o padrão
        */
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);  //pattern.atcher(texto) alt + enter

        System.out.println("texto: " + texto2);
        System.out.println("indice: 123456" );
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()){
            System.out.print(matcher.start() + "  ");
        }
    }
}
