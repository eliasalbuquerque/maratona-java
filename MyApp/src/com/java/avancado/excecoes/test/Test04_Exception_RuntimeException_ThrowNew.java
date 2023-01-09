/* 
 * DevDojo
 * Maratona Java Virado no Jiraya
 * 98 - Exceções pt 04 - Lançando exceção unchecked
 * https://www.youtube.com/watch?v=M7CU5TOOmTc&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=99&ab_channel=DevDojo
 */

package com.java.avancado.excecoes.test;


public class Test04_Exception_RuntimeException_ThrowNew {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     * "throws IllegalArgumentException"
     * flag: "existe a possibilidade de uma exception"
     */

    /**
     * "throws IllegalArgumentException"
     * é uma flag de aviso que "existe a possibilidade de uma exception"
     * 
     * @param a
     * @param b nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
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
         * "java.lang.ArithmeticException: / by zero" porém, o código não para e 
         * retorna valor 0;
         */
        // try {
        //     return a / b;
        // } catch (RuntimeException e) {
        //     e.printStackTrace();
        // }
        // return 0;


        /**
         * Teste 03 Dá para fazer o tratamento sem precisar fazer o "try/catch"
         */
        if (b == 0) {
            /**
             * "Lança uma nova RuntimeException";
             * Não é obrigatorio para tipos de Exceptions Unchecked (RuntimeExceptions);
             */
            throw new IllegalArgumentException("Argumento ilegal, nao pode dividir por 0");
        }
        return a / b;
    }

}
