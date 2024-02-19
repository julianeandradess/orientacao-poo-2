package Abstratas;

public abstract class Funcionarios extends Pessoas {
    //não podemos usar nwe em uma classe abstrata.
    //pode ter construtor porque entra no caso de herança. É uma classe criada para ser extendida.
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprimeAbs() {
        System.out.println("imprimindo...");
    }

    public abstract void calcularBonus();
    //serve para forçar o dev a lembrar de implementar cada bonus nas classes.
}
