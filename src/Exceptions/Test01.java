package Exceptions;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
    criarNovoArquivo();
    }

    private static void criarNovoArquivo(){

        //try: tentar     catch: pega
        File file = new File("arquivo\\ test01.txt");
        try {
            boolean iscriando = file.createNewFile();
            System.out.println("Arquivo criado "+ iscriando);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//não é recomendado deixar o bloco catch em branco
}
