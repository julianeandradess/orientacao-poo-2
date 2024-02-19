package Interfaces;

public class TesteInterfaces {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.carregar();
        fileLoader.carregar();
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();

    }
}
