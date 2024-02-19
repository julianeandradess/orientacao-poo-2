package EnumDominio;

import Heranca.Dominio.TipoPagamento;

import static Heranca.Dominio.TipoPagamento.*;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nuno", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Nino", TipoCliente.PESSOA_JURIDICA, CREDITO);


        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(DEBITO.calcularDesconto(180));
        System.out.println(CREDITO .calcularDesconto(180));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente1);
    }
}
