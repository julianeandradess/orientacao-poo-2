package Polimorfismo.Repositorio;

public class RepoMemoria implements Repositorios{
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
