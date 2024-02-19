package JavaCore;

public class StringTest01 {
    public static void main(String[] args) {
        //string no java são mutaveis
        String nome = "William"; //string constant pool
        String nome2 = "William";
        System.out.println(nome);
        System.out.println(nome == nome2);

        nome = nome.concat(" Suane"); //junção
        System.out.println(nome);

        String nome3 = new String("William"); //objeto, então se eu conferir com o 2 dará false
        System.out.println(nome2 == nome3.intern());
        //se eu quiser pegar o valor do 3 e confere pra ver se é a mesma coisa independente dele ser um objeto ai dará true



    }
}
