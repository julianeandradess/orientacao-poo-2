package JavaCore;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Wiliam Suane";
        nome.concat(" DevDojo"); // só funcionaria assim: nome = nome.concat
        System.out.println(nome);

        /*StringBuilder não é a mesma coisa que uma string comum
        coisas que não podem ser feitas sb = nome; e nome sendo uma string comum
        As string builder voce não adiciona ela de forma comum "...", voce adiciona dessa forma:
        sb.append() que ele vai transformar em string builder, tbm funciona como concat
         */

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo"); //podendo fazer a extensão assim sb.append(...).append(...);
        sb.reverse(); //inverte a ordem da palavra
        sb.delete(0,3); //deleta caracteres
        System.out.println(sb);
    }
}
