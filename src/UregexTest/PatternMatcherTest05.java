package UregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        // o ponto procurado nesse caso é no texto email, tem que usar a contrabarra \\
        //(\.([a-zA-Z])+)+ usado para o br, só .com é \\.([a-zA-Z])+
        //para validar uma string, nesse caso email: "string ou email, etc".matches():

        String regeX = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@gmail.com, jotaro123@hotmail.com, #!@zoro@yahoo.com.br, teste@email";
        System.out.println("Email válido:");
        System.out.println("#!@zoro@yahoo.com.br".matches(regeX));

        Pattern pattern = Pattern.compile(regeX);
        Matcher matcher = pattern.matcher(texto);  //pattern.Matcher(texto) alt + enter

        System.out.println("texto: " + texto);
        System.out.println("indice: 123456");
        System.out.println("regex: " + regeX);
        System.out.println("Posições encontradas:");

        while (matcher.find()) {
            System.out.print(matcher.start() + "  " + matcher.group()+"\n");
        }//matcher.start - posição       matcher.group() + "\n" - o que ele encontrou

    }
}
