package JavaCore;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //zonas:

        Map<String, String> shortIds = ZoneId.SHORT_IDS; //ZoneId.SHORT_IDS alt+enter
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());//mostra a zona que voce tá

        System.out.println("--------------------");

        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);

        System.out.println("--------------------");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //mudando a zona
        System.out.println("--------------------");

        ZonedDateTime zonedDateTime = now.atZone(zoneTokyo); //now.atZone(nome da variavel)
        System.out.println(zonedDateTime);

        System.out.println("--------------------");

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        System.out.println("--------------------");

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zoneTokyo);
        System.out.println(zonedDateTime1);

        System.out.println("--------------------");

        //zoneofset: usamos para quando sabemos o horário mas não sabemos a zona. Ex: Manaus
        System.out.println(ZoneOffset.MIN); //minimo que pode ser adicionado
        System.out.println(ZoneOffset.MAX); //maximo
        ZoneOffset zoneOffsetM = ZoneOffset.of("-04:00");//Ref: Manaus. Não pode ser colocado assim: "-4:00", dps: alt+enter
        System.out.println(zoneOffsetM);
        System.out.println("-------------------------");

        //mostrar o horario da sua localidade porem com a ref de outro lugar
        //ex: Rj, com ref no final de como seria em Manaus -04:oo no final. SEM A ZONA
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetM);
        System.out.println(offsetDateTime);

        System.out.println("-------------------------");

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetM);
        System.out.println(offsetDateTime1); //mesmo resultado, jeito diferente de ser feito

        System.out.println("-------------------------");

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetM);
        System.out.println(offsetDateTime2); //mesmo resultado
        System.out.println("-------------------------");

        //diferentes calendários, outras habilidades de trabalhar com eles:
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        System.out.println("-------------------------");
        //outra era alem do Reiwa
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
