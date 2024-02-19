package JavaCore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormattertTest01 {
    public static void main(String[] args) {
        /*precisamos lembrar que quando estamos trabalhando com formatação
        * que todas as vezes que for usar Formatter, estamos transformando o objeto numa string
        * todas as vezes que vimos a palavra parse, estamos transformando uma string para o seu objeto:
        */

        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); //padrão
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        System.out.println("------------------");
        //transformar a string em um objeto
        //LocalDate parse1 = LocalDate.parse("21240201"); ERRADO
        LocalDate parse1 = LocalDate.parse("21240201", DateTimeFormatter.BASIC_ISO_DATE);  //CERTO
        LocalDate parse2 = LocalDate.parse("2124-02-01", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2124-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("------------------");
        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME); //now.format(DateTimeFormatter.ISO_DATE_TIM alt+enter
        System.out.println(string4);

        //usando da maneira acima com parse
        LocalDateTime parse = LocalDateTime.parse("2024-02-01T18:06:03.8786656"); //pode incluir o ISO DATE TIME
        System.out.println(parse);
        System.out.println("------------------");
        //para seguir o padrão de data que quer nas suas datas
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR); //LocalDate.now().format(formatterBR) alt+enter
        System.out.println(formatBR);

        System.out.println("------------------");
        //para caso já tenhamos uma data formadata em BR
        LocalDate parseBR = LocalDate.parse("01/02/2024", formatterBR);
        System.out.println(parseBR);

        System.out.println("------------------"); //outro padrão, do jeito BR
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);

        System.out.println("------------------");
        LocalDate parseGR = LocalDate.parse("01.Februar.2024", formatterGR);
        System.out.println(parseGR);
    }
}
