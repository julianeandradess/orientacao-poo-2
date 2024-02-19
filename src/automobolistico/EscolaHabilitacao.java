package automobolistico;

public class EscolaHabilitacao {

    //relacionamento de muitos para um
    private String nome;
    private Instrutor [] instrutores;

    public EscolaHabilitacao(String nome, Instrutor[] instrutores) {

        this.nome = nome;
        this.instrutores = instrutores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instrutor[] getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Instrutor[] instrutores) {
        this.instrutores = instrutores;
    }

    public void imprimes(){
        System.out.println(this.nome);
        if (instrutores == null) return;
        for(Instrutor instrutor : instrutores){
            System.out.println(instrutor.getNome());
        }
    }
}
