package Exception.Dominio.Test;

//Excessão custumizada geralmente levam Exception no nome
public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido.");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
    //mensagem custumizada usamos esse acima.
}
