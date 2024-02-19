package JavaCore;

import Exercicios.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {

    public static void main(String[] args) {
        //ajuste temporal
        //como estavamos usando:
        LocalDate now = LocalDate.now();
        now = now.plusDays(3);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now1 = LocalDate.now();
        now1 = now1.withDayOfMonth(20); //vai ser dia 20 daquele mes que solicitou
        // now = now.withMonth(4); mes
        System.out.println(now1);

        //substituir dia do mes com ChronoField:
        LocalDate now3 = LocalDate.now();
        now3 = now3.with(ChronoField.DAY_OF_MONTH, 2);
        System.out.println(now3);


        //proximo dia na semana, ex: quinta feira

        LocalDate now2 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)); //MESMA SEMANA
        LocalDate now4 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)); //PROXIMA SEMANA
        System.out.println(now2);
        System.out.println(now4);

        LocalDate now5 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); //qual foi a ultima sexta, nesse caso.
        System.out.println(now5);

        LocalDate now6 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate now7 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(now6);
        System.out.println(now7);

        LocalDate now8 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        LocalDate now9 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now8);


    }
}
