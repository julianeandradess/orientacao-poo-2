package Exception.Dominio.Test;

import java.io.*;

public class TryComRecursos {
    public static void main(String[] args) {
    lerArquivo2();
    }
    public static void lerArquivo1(){
        //reader trabalha com leitura de arquivos, buffer é a versão mais utilizada
        //toda vez que você lê algo através desse método, precisa fechar e vai para o finally
        // só lançar um novo try se for necessário
        //para ter certeza que a variável chegará null no finally, usamos o surround with if
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //a forma na qual mais usam:
    //colocamos o objeto dentro do try, dai ele se encarrega de fechar a conexão da variável de referencia.
    //só podemos colocar objetos dentro do try, implementando a interface Closeable, autoCloseable ou Reader a Readable
   //os objetos abaixo são fechados na ordem inversa de que são colocados ali
    public static void lerArquivo2() {
        try (Leitor01 leitor01 = new Leitor01();
            Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException e){

        }
    }
}
