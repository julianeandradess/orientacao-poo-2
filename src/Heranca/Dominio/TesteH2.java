package Heranca.Dominio;

public class TesteH2 {
    public static void main(String[] args) {

        /*Regras:
        1- Bloco de iniciação estático do super é carregado quando a JVM carrega a classe pai
        2- Bloco de iniciação estático da sub classe é carregado quando a JVM carrega a classe filha
        3- Alocado espaço na mémoria para o Objeto da classe pai
        4- Cada atributo de classe é criado e inicializado com valores default ou o valor passado pela classe pai
        5- Bloco de iniciação da super classe é executado na ordem que aparecem
        6- Construtor da super classe é executado
        7- Alocado espaço na mémoria para o Objeto da classe filha
        8- Cada atributo de classe é criado e inicializado com valores default ou o valor passado pela classe filha
        9- Bloco de iniciação da sub classe é executado na ordem que aparecem
        10-Construtor da sub classe é executado
         */
        Funcionario funcionario = new Funcionario("Tui tui");

    }
}
