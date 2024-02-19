package JavaCore;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //trabalha com nanos segundos, ponto instantaneo dentro de uma time-line

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //ex: 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,0));
    }
}
