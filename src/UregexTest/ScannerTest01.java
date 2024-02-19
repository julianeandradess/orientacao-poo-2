package UregexTest;

public class ScannerTest01 {
    public static void main(String[] args) {
        //pegar os valores que quer. texto.split(",") alt+enter. Abaixo: nomes alt+enter
        //trim remove os espaços, não necessariamente a virgula
        //token vai ser a palavra em si e o delimitador a virgula, nesse caso.
        //podemos usar numeeros como delimitadores, ex:Levi9Eren, podemos delimitar pelo digito \\d, vai retirar os digitos
        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
