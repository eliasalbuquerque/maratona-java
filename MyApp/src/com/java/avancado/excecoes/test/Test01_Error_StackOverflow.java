package com.java.avancado.excecoes.test;

/**
 * Error e Exception sao subclasses de Throwable, conforme o diagrama abaixo:
 * MyApp\src\com\java\avancado\excecoes\domain\UML-Throwable.uxf
 */

public class Test01_Error_StackOverflow {
    public static void main(String[] args) {
        recursivo();
    }

    /**
     * Metodo criado para simular o Erro "Stack Overflow", que é quando o 
     * programa estoura a memoria e o programa para de funcionar;
     * Erro é algo que acontece na JVM e que nao será possível recuperar em 
     * tempo de execuçao de máquina;
     */
    public static void recursivo() {
        recursivo();
    }
}
