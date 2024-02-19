package Heranca.Dominio;

public class Pessoas {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de iniciação estático de Pessoas");
    }
    //bloco não estático, de iniciação
    {
        System.out.println("Dentro do bloco de iniciação de Pessoas 1");
    }
    {
        System.out.println("Dentro do bloco de iniciação de Pessoas 2");
    }


    public Pessoas(String nome){
        System.out.println("Dentro do construtor de Pessoas");
        this.nome = nome;
    }
    public Pessoas(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimeH(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + this.endereco.getCep());
    }
}
