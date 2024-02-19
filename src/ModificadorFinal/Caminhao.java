package ModificadorFinal;

public class Caminhao {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //constante, não poderá ser mudada.

    //se colocarmos a classe como final, nenhuma outra poderá usa-lá.
    public final Comprador COMPRADOR = new Comprador(); //a referencia nunca poderá ser mudada, porém os dados sim


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprima(){
        System.out.println(this.nome);
    }
}
