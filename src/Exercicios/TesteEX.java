package Exercicios;

public class TesteEX {
    public static void main(String[] args) {
        Local local = new Local("Rio de Janeiro");
        Alunos alunos = new Alunos("Lila", 21);
        Professor professor = new Professor("Bob", "medicina");

        Alunos[] alunosParaSeminario = {alunos};

        Seminario seminario = new Seminario("MEDICINAS", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);

        professor.imprimeEx();
    }
}
