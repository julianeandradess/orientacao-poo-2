package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test04 {
    public static void main(String[] args) {
        /*try{
            throw new ArrayIndexOutOfBoundsException();
            //essa excessão achará e fará o tratamento no objeto correspondente
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro da ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro da IndexOutOfBoundsException");
        }catch (IllegalArgumentException e ){
            System.out.println("Dentro da IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro da ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro da RuntimeException ");
        }*/

        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro da ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro da IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro da RuntimeException ");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        //as excessões usadas no try catch seriam SQLEx e FileNot...porém
        //podemos usar as mais genéricas como IOException ou a própria Exception.
        //No java temos uma facilidade de sintaxe, que ficaria assim o código acima:
        /*
        try {
            talvezLanceException();
           } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
            }
         forma comum melhorada, já com algumas motificações:
         try {
            talvezLanceException();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
         */
    }
}
/*
    Excessões mais genéricas como a RuntimeException precisam estar no final, porque senão da ruim com as que também
    estão sendo chamadas.
 */
