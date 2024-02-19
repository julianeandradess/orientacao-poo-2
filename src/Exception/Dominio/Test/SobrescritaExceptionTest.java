package Exception.Dominio.Test;

public class SobrescritaExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        FuncionarioEx funcionarioEx = new FuncionarioEx();

        //posso declarar somente uma exception ou 2 ex: FileNotFoundException junto
        try {
            funcionarioEx.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
}
