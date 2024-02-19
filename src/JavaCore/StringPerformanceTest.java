package JavaCore;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concaString(9); //mostra os segundos para rodar
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuilder(3); //mostra os segundos para rodar
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuildeer " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuffer(3); //mostra os segundos para rodar
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuildeer " + (fim - inicio) + "ms");
    }

    private static void concaString (int tamanho){
        String texto = "";
        for (int i = 0; 1 < tamanho; i++){
            texto += i; // ex vai ser o texto + 1, tipo: 0,01, 012, 0123
        }
    }

    private static void concaStringBuilder (int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; 1 < tamanho; i++) {
            sb.append(i); // append - se torna util quando temos que adicionar mais conteudo ao final.
            // É usado para anexar apresentações de string de algum argumento á sequencia.
        }
    }

    private static void concaStringBuffer (int tamanho){
        StringBuffer sbb = new StringBuffer(tamanho);

        for (int i = 0; 1 < tamanho; i++){
            sbb.append(i);
        } //muito usado em casos de pessoas tentando acessar o mesmo recurso e podendo ter dados inconsistentes.
    }   //a diferença entre Buffer e Builder é que a buffer foi criado para ambiente de multiplas e builder não
}
