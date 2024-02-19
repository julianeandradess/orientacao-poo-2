package Exceptions;

import java.io.File;
import java.io.IOException;


public class Test02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    //exemplo de como fazer de outra forma
    // sem realizar o tratamento desse novo arquivo e chamar a responsabilidade pra quem ta chamando.
    //pode deixar com try catch ou não, a excessão no main fará o tratamento.
    //try catch é muito usado para métodos privados, em métodos públicos como não fazemos ideia de quem chamará
    //usamos mais o throws
    /* try {
        boolean iscriando = file.createNewFile();
        System.out.println("Arquivo criado " + iscriando);
    } catch (IOException e) {
       e.printStackTrace();
    }
    sem try
    File file = new File("arquivo\\ test02.txt");
        boolean iscriando = file.createNewFile();
        System.out.println("Arquivo criado " + iscriando);*/
    public static void criarNovoArquivo() throws IOException {
        //try: tentar     catch: pega

        File file = new File("arquivo\\ test02.txt");
        try {
            boolean iscriando = file.createNewFile();
            System.out.println("Arquivo criado " + iscriando);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            //significa que pode ter dado merda e é pra ser lançado novamente
            // parecerá que deu errado mas é só o throw pedindo para incluir na assinatura do método.
        }
    }
}
