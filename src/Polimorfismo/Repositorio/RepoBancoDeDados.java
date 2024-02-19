package Polimorfismo.Repositorio;

public class RepoBancoDeDados implements Repositorios{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
