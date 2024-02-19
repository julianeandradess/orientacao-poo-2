package JavaCore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); //atual
        LocalDate date = LocalDate.of(2024, Month.AUGUST, 6);
        //ou podemos fazer assim, assim como da hora, basta usar o parse
        LocalDate date1 = LocalDate.parse("2024-08-06");
        LocalTime time = LocalTime.of(9,45,21);

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(date1);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time); //variavel.atTime()
        System.out.println(localDateTime1);
    }
}
