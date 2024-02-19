package JavaCore;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        //number format é abstrata, não pode ser instaciada
        //NumberFormat.getNumberInstance();

        Locale LocalePT = new Locale("pt", "BR");
        Locale LocaleJP = new Locale("jp", "JP");
        Locale LocaleIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getNumberInstance(LocalePT);
        nfa[1] = NumberFormat.getNumberInstance(LocaleJP);
        nfa[2] = NumberFormat.getNumberInstance(LocaleIT);
        nfa[3] = NumberFormat.getNumberInstance();

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumFractionDigits()); //digitos fracionarios
            System.out.println(numberFormat.format(valor)) ;
        }

        String valorString = "1_000.2130";
        try {
            System.out.println(nfa[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
