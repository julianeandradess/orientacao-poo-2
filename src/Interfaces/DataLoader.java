package Interfaces;

public interface DataLoader {
    public abstract void carregar();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da retrieveMaxDataSize na interface.");
    }
    /*
    default foi feito para incrementar algo em determinadas intefaces sem que eu obriga as implements a terem tbm.
    se não for implementado tbm nas outras, na teste ela será usada a nivel da interface
    não precisa colocar public pois o java entende que toda interface é publica, fica redundante.
    ficaria assim: public abstract void carregar/load.
    criada para implementar.
    Interfaces não podem ser criadas como objeto (ex: new DataLoader)
    por padrão são publicas
    podem criar atributos, criar métodos static, não podem ser subescritos, pertence a classe/interface
    private -> default -> protected -> public
    */
}
