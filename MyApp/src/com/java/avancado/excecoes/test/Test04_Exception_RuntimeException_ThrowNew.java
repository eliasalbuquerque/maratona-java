package com.java.avancado.excecoes.test;


public class Test04_Exception_RuntimeException_ThrowNew {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     * "throws IllegalArgumentException"
     * flag: "esxiste a possibilidade de uma exception"
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        /**
         * Teste 01 Gerando RuntimeException: Exception in thread "main"
         * java.lang.ArithmeticException: / by zero
         * 
         * ..nesse caso, poderiamos fazer um tratamento de erro (Teste 02);
         */
        // return a / b;


        /**
         * Teste 02 Mesmo com o tratamento, ainda persiste o
         * java.lang.ArithmeticException: / by zero porém, o código não para e retorna
         * valor 0;
         */
        // try {
        // return a / b;
        // } catch (RuntimeException e) {
        // e.printStackTrace();
        // }
        // return 0;


        /**
         * Teste 03 Dá para fazer o tratamento sem precisar fazer o "try / catch"
         */
        if (b == 0) {
            /**
             * "Lança uma nova RuntimeException";
             * Não é obrigatorio para tipos de Exceptions Unchecked (RuntimeExceptions);
             */
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }

}
