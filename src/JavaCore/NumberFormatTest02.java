package JavaCore;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale LocalePT = new Locale("pt", "BR");
        Locale LocaleJP = new Locale("jp", "JP");
        Locale LocaleIT = Locale.ITALY;

        //simbolo monetario
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(LocalePT);
        nfa[1] = NumberFormat.getCurrencyInstance(LocaleJP);
        nfa[2] = NumberFormat.getCurrencyInstance(LocaleIT);
        nfa[3] = NumberFormat.getCurrencyInstance();

        double valor = 10000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$10.000,21";
        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}