package Heranca.Dominio;

public class Funcionario extends Pessoas{
    private double salario;

    static {
        System.out.println("Dentro do bloco de iniciação estático de Funcionario");
    }
    //bloco não estático, de iniciação
    {
        System.out.println("Dentro do bloco de iniciação de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de iniciação de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimeH(){
        /*toda vez que usamos o super, estamos nos referindo ao objeto de uma forma mais generica
         como se fosse uma super classe, que está sendo importada.
         Ex: execute o imprime da forma que foi criado primeiramente e depois o imprime que coloquei */
        super.imprimeH();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + "recebi o salario de " + this.salario);
    }
}
