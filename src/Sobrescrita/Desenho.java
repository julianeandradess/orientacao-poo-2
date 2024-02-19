package Sobrescrita;

public class Desenho {

    private String nome;


    public Desenho(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Desenho" + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
