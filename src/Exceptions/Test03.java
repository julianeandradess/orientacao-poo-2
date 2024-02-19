package Exceptions;

public class Test03 {
    public static void main(String[] args) {
       abreConexao();

    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SQ");
        }
        return null;
    }
    // o try não é usado sozinho, ou é com catch ou finally

    private static void abreConexão2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo");
        }finally {
            System.out.println("Fechando arquivo");
        }
    }
}
