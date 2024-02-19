package automobolistico;

public class Carro {
    private String nome;
    private Moto moto;

    private double velocidadeMaxima;

    // o uso do static significa que ele é da classe e não do objeto(instancia).
    private static double velocidadeLimite = 250;

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public Carro(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome " + this.nome);
        if (moto != null){
            System.out.println(moto.getNome());
        }

    }

    /* static faz o atributo pertences a classe e não ao objeto e todas as instancias terão o mesmo valor.
    métodos estáticos/static podem começar com static public ou public static.
    staticos são criados primeiro, antes dos não estáticos.
    não usamos o this no método static, porque se refere a objeto e não uma classe.
    usamos o nome da mesma para se referir.

    blocos static:
    precisamos que o bloco de iniciação seja iniciado somente uma vez
    e é isso que o bloco static fará.
    Vimos que o método e atributos static colocamos depois do modificador de acesso(public)
    ex:

    static{
    system.out.println("dentro do bloco de iniciação");
    episodios = new episodios[100];
        for (int i = 0; episodios.lenght; i++) {
        episodios[i] = i+1
        }
    }

    */
}
