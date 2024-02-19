package Exercicios;

public class Alunos {
    //um aluno só poderá participar de um seminario
    private String nome;

    private int idade;

    private Seminario seminario;

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
