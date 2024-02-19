package RunTime;

public class TestException {
    public static void main(String[] args) {
        /*CHECKED E UNCHECKED
        checked: excessões que são checadas, são excessões que são filhas da classes exception diretamente.
        E essas excessões se não tratadas, irão lançar erros de compilações.
        unchecked: são excessões que são filhas ou imprime a classe exception, não são checadas.
        abaixo temos exemplos:
         */
        Object object = null;
        System.out.println(object.toString());

        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
