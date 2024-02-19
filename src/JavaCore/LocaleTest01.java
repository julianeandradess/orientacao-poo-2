package JavaCore;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //pt-Br
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japao " + df4.format(calendar.getTime()));

        //ou

        System.out.println(localeItaly.getDisplayCountry());
    }
}
