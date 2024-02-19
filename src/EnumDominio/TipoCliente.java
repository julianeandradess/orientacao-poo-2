package EnumDominio;

public enum TipoCliente {
    //não tem tipo, é uma enumeração.
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Júridica");
    public final int valor;
    private String nomeRelatorio;
    //construtor abaixo:
    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public int getValor(){
        return valor;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
       for(TipoCliente tipoCliente : values()) {
          if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
              return tipoCliente;
          }
       } return null;
    }
}
