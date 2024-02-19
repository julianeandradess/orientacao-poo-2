package JavaCore;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        /*
        ! Properties é um arquivo onde você tem as propriedades separadas em chave valor
        ! É algo que vai ser único para identificar o valor ex:
          Se eu chamar a chave hello = quero receber Hello, good.morning = Good Morning
          preste bastante atenção
        */
        System.out.println(Locale.getDefault());

        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        /* serve para verificar a chave:
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);
        Porém fica grande, usamos assim: */
        System.out.println(bundleBR.getString("hello"));
        System.out.println(bundleBR.getString("good.morning"));
        System.out.println(bundleBR.getString("hi"));

        ResourceBundle bundleUS = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundleUS.getString("hello"));
        System.out.println(bundleUS.getString("good.morning"));

        /*
        Digamos que queremos intercionalizar todas as mensagens do sistema em português ou inglês:
        criamos um novo arquivo diretamente clicando na pasta src
        no caso de portugues: messages_pt_BR.properties
        ingles: message_en_US.properties
        caso queira englobar algumas linguagens, porque são usadas da mesma forma em todas as linguas, ex: Hi
        messages.properties
         */


    }
}
