package com.java.intermediario.metodos.test;

import com.java.intermediario.metodos.domain.Calculadora;

/**
 * Executando os Metodos
 */
public class Test01calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        /**
         * Utilizando métodos "void" (vazio)
         * 
         * - o método será executado e não retorna nenhum valor
         */
        calculadora.somaDoisNumeros();
        calculadora.subtriDoisNumeros();
        calculadora.multiplicaDoisNumeros(9,2);


        /**
         * Utilizando o "return"
         * 
         * - maneiras diferentes de resolver divisoes
         */
        
        System.out.println("Divisoes utilizando o 'return':");
        
        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);
        
        double result2 = calculadora.divideDoisNumeros2(20, 0);
        System.out.println(result2);

        calculadora.divideDoisNumeros3(20, 0); // já tem o print no metodo


        /**
         * Passagem de paramentros
         * Tipos Primitivos
         */

        // variaveis de tipos primitivos
        int num1 = 1;
        int num2 = 2;

        // enviando cópia dos valores para o método
        calculadora.alteraDoisNumeros(num1, num2);

        // imprime valor das variaveis 
        System.out.println("Fora do método");
        System.out.println(num1);
        System.out.println(num2);

        // a passagem de parametros com tipos primitivos garante
        // que o valor das variáveis não serão alterados dentro
        // do método, pq o que é passado é somente uma cópia dos
        // valores e não a referência desses valores.
    }
}
