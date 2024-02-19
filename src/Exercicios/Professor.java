package Exercicios;

public class Professor {
    private String nome;

    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome){
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprimeEx(){
        System.out.println("---------");
        System.out.println("Professor: " + this.nome);
        if (this.seminario == null) return;
        System.out.println("## Seminario Cadastrados ##");
        for (Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue; //continue pq se não tiver um seminario, voltará até ter e depois seguir para aluno.
            System.out.println("*** Alunos ***");
            for (Alunos aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getNome() + " idade: " + aluno.getIdade());
            }

        }

    }

}

