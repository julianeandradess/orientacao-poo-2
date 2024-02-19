package Interfaces;

public class FileLoader implements DataLoader, DataRemover{
    //só usamos implements em interfaces.
    @Override
    public void carregar() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo.");
    }
}
