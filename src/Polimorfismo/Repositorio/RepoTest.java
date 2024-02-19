package Polimorfismo.Repositorio;

public class RepoTest {
    public static void main(String[] args) {
        /*RepoBancoDeDados bancoDeDados = new RepoBancoDeDados();
        bancoDeDados.salvar();
        ou podemos deixar de forma generica, não usando o tipo específico como esta acima
        ficaria assim:
        Repositorio repositorio = new RepoBancoDeDados, assim podendo usar qualquer um dos objetos
        pois eles são implementados pela interface.

         */
       Repositorios repositorios = new RepoMemoria()  ;
       repositorios.salvar();
    }
}
