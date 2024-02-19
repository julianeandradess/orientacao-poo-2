package JavaCore;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest01 {
    public static void main(String[] args) {
        //calendar é uma classe abstrata, não pode usar o new
        //data atual:
        Calendar c = Calendar.getInstance(); //chamar classei
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){  //primeiro dia da semana
            System.out.println("Domingo é o primeiro dia da semana");
        }
        c.add(Calendar.DAY_OF_MONTH, 2); //caso queira adicionar uma data, ex + 2 dias
        c.add(Calendar.HOUR, 2); //adicionar horas
        Date date = c.getTime(); //tempo atual
        System.out.println(date);


    }
}
