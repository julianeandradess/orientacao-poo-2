package Interfaces;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    } //agora está a nivel da classe e não somente da interface.
}
