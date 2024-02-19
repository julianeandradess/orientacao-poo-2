package JavaCore;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);//of data especifica. Só ate 23h
        System.out.println(time);
        LocalTime timeNow = LocalTime.now(); //hora de agora
        System.out.println(timeNow);
        System.out.println(time.getHour()); //pegar a hora
        System.out.println(time.getMinute()); //minuto
        System.out.println(time.getSecond()); //segundo
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIDNIGHT); //meia noite ou começo do dia MIN, muito usado para inicio do dia em casos de pesquisas
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX); //maximo
    }
}
