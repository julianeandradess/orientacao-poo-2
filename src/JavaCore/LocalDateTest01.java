package JavaCore;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2024, Month.JULY, 28); //Só trabalha a data em si, não tem hora. Se quiser data específica é LocalDate.off
        LocalDate agora = LocalDate.now(); // data de agora
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); //total de dias no mes
        System.out.println(date.isLeapYear()); //mostra se o ano é bissexto
        System.out.println(ChronoField.YEAR);
        System.out.println(ChronoField.DAY_OF_MONTH);
        System.out.println(date);
        System.out.println(agora);

    }
}
