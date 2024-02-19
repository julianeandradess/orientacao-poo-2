package JavaCore;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        //classe baseado na data

        LocalDate now = LocalDate.now();
        LocalDate nowAfterYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusYears(p3.getDays())).getMonths()); //nesse caso não funciona getMonths, retorna 1
        System.out.println(now.until(now.plusYears(p3.getDays()), ChronoUnit.DAYS));
    }
}
