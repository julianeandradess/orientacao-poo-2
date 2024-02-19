package JavaCore;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7hours = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(now, nowAfterTwoYears); //Duration.between alt+enter
        Duration duration1 = Duration.between(timeNow, timeMinus7hours);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(10));

        Duration duration3 = Duration.ofDays(20);
        Duration duration4 = Duration.ofMinutes(3);
        //Duration duration5 = Duration.of(3, ChronoUnit.CENTURIES); NÃO TEM SUPORTE

        //Duration não aceita LocalDate porque ela não aceita segundos
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);

    }
}
