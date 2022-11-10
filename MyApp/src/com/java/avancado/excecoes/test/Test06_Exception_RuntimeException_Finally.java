package com.java.avancado.excecoes.test;

/**
 * O bloco "finally" sempre será executado, independente da condição;
 */

public class Test06_Exception_RuntimeException_Finally {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Try: Abrindo arquivo");
            System.out.println("Try: Escrevendo dados no arquivo");
            // System.out.println("Try: Fechando recurso liberado pelo SO");
            // throw new RuntimeException();
            return "conexao aberta";
        } catch (Exception e) {
            System.out.println("Catch: Simulando ReuntimeException");
            e.printStackTrace();
        } finally {
            System.out.println("Finally: Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
