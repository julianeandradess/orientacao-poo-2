package Heranca.Dominio;

public class TesteH {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("2121213-0");

        Pessoas pessoa = new Pessoas("Tati", "212121");
        pessoa.setCpf("19089077-8");
        pessoa.setEndereco(endereco);

        pessoa.imprimeH();

        Funcionario funcionario = new Funcionario("None");
        funcionario.setCpf("123456");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println("----------------------");
        funcionario.imprimeH();
    }
}
