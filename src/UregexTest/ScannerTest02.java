package UregexTest;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Lili,Lolo,Loly";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){ //enquanto existir o proximo, quero que pegue o proximo
            System.out.println(scanner.next());
        }

        //vamos supor que voce quer pegar a string de acordo com o tipo dela:
        String texto2 = "Lili,2000,Loly,true";
        Scanner scanner2 = new Scanner(texto2);
        scanner2.useDelimiter(",");
        while(scanner2.hasNext()){
            if(scanner2.hasNextInt()){
                boolean i = scanner2.hasNextInt(); //erro
                System.out.println("Int "+ i);
            }else if (scanner2.hasNextBoolean()){
                boolean boo = scanner2.hasNextBoolean();
                System.out.println("Boolean" + boo);
            }else {
                System.out.println(scanner2.hasNext());
            }
        }

    }

}
