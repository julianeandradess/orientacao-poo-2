package Polimorfismo.Repositorio;

public class RepoArquivo implements Repositorios{
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
