package JavaCore;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(100); //date trabalha com os segundo, desde janeiro de 1970, usa long. Boa parte dessa classe está obsoleta
        System.out.println(date);
    }
}
