package Exception.Dominio.Test;

public class FuncionarioEx extends Pessoa{
    //não adicione exception main genéricas ex: IOException
    //se usar uma excessão em uma classe que extende, precisa usar as mesmas.
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionário");
    }
}
