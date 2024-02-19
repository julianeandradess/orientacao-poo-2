package Exercicios;

public class Seminario {

    private String titulo;

    private Alunos[] alunos;

    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }


    public Seminario(String titulo, Alunos[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }


    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
