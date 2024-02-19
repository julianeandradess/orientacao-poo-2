package JavaCore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        //usamos as aspas para tudo que voce quer que ignore, nesse caso o a significa tudo que é AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try {
            sdf.parse("yyyy.MM.dd G 'at' HH:mm:ss z"); //sdf.parce(frase) alt+enter
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
