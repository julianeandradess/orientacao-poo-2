package JavaCore;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Lufa";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //retorna o indice, zero é o primeiro
        System.out.println(nome.length());
        //saber o tamanho das strings, diferente dos usados em arrays porque neles não são atributos, sem ()
        System.out.println(nome.replace("f", "p")); //troca letras
        System.out.println(nome.toLowerCase()); //minusculo
        System.out.println(nome.toUpperCase()); //maiusculo
        System.out.println(numeros.length()); //quantidade de caracteres
        System.out.println(numeros.substring(3)); //no segundo indice, conta-se -1, ex:
        System.out.println(numeros.substring(0, numeros.length())); //irá retornar tudo
        System.out.println(nome.trim()); //remove os espaços em branco, colocados antes ou dps.
    }
}
