package JavaCore;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //mostra a nacionalidade do programa do note

        //avisos que são suportados
        String[] isoCountries = Locale.getISOCountries(); //alt + enter
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) { //palavra isoLanguage dps alt + enter
            System.out.print(isoLanguage + " ");
        }
        System.out.println("------------");

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }


    }
}
