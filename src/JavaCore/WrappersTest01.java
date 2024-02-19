package JavaCore;

public class WrappersTest01 {
    public static void main(StringTest01[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;

        char charP = 'W';
        boolean booleanP = false;

        //wrappers basicamente é um tipo primitivo com a letra maiuscula, são objetos.
        //muito usado em formações de list, coleções.
        //temos dois tipos: auto/boxing e unboxing

        //autoboxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;

        Character charW = 'W';
        Boolean booleanW = false;

        //unboxing: é pegar uma variável primitiva e referenciar ela com uma wrappers
        //transformando ela basicamente em "primitiva"
        //podemos referenciar valores

        int i = intW;
        int it = (int) intW.longValue();

        //pegando um objeto Integer e referenciando uma string que mesmo sendo um numero
        //está sendo usado como string. Podendo ser usado como Float, Byte.Porem não da pra fazer com Char

        Integer intW2 = Integer.parseInt("2");
        Integer intW3 = Integer.parseInt("22");
        boolean verdadeiro = Boolean.parseBoolean( "TruE");
        System.out.println(verdadeiro);

        //para saber se a variavel está se referenciando a um digito:

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
    }
}
