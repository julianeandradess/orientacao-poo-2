package RunTime;

public class TestException02 {
    public static void main(String[] args) {
        divisao(64, 0);

        System.out.println("Código finalizado.");

        /*try {
            divisao(64, 8);
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Código finalizado.");
        código com exception tratada
        */
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new RuntimeException("Argumento ilegal, não pode ser zero.");
        }
        return a/b;
        /* ao contrario de usar o try catch, dá para notificar o erro com o codigo acima, porem,
          pode usar o codigo abaixo tbm.
          senão, pode tratar a exception dentro do próprio código main
          outra exception que poderá usar é a IlegalArgumentException

          throw new - criando uma excessão do zero
        try {
            return a/b;
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;*/

     }
}
