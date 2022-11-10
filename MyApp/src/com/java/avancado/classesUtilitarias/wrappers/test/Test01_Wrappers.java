package com.java.avancado.classesUtilitarias.wrappers.test;

/**
 * Wrappers objetos que irão encapsular tipos primitivos;
 * existem 8 tipos primitivos:
 * byte byteP = 1;
 * short shortP = 1;
 * int intP = 1;
 * long longP = 10L;
 * float floatP = 10F;
 * double doubleP = 10D;
 * char charP = 'W';
 * boolean booleanP = false;
 * ---
 * Para ter uma classe Wrapper do tipo primitivo, troca-se a primeira letra
 * por maiúscula;
 * Com excecao do "int" e do "char", que ficam "Integer" e "Character"
 * respectivamente;
 */
public class Test01_Wrappers {
    public static void main(String[] args) {
        /**
         * Autoboxing: tipo primitivo para wrapper
         */
        Byte byteP = 1; // MIN_VALUE = -128; MAX_VALUE = 127;
        Short shortP = 1; // MIN_VALUE = -32768; MAX_VALUE = 32767;
        Integer intP = 1;
        Long longP = 10L; // sem a letra, vira um "int";
        Float floatP = 10F;
        Double doubleP = 10D;
        Character charP = 'W';
        Boolean booleanP = false;

        System.out.println("Autoboxing");
        System.out.println("- byte: " + byteP);
        System.out.println("- short: " + shortP);
        System.out.println("- int: " + intP);
        System.out.println("- long: " + longP);
        System.out.println("- float: " + floatP);
        System.out.println("- double: " + doubleP);
        System.out.println("- char: " + charP);
        System.out.println("- boolean: " + booleanP);
        System.out.println();

        /**
         * Unboxing: wrapper para tipo primitivo;
         */
        System.out.println("Unboxing");
        int i = intP;
        System.out.println("- int: " + i);
        Integer intP2 = Integer.parseInt("1"); // passa a string "1" para "int";
        System.out.println("- int: " + intP2);
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println("- boolean: " + verdadeiro);
        System.out.println();

        System.out.println("Metodos Utilitarios Character");
        System.out.println("- digit (A): " + Character.isDigit('A'));
        System.out.println("- digit (9): " + Character.isDigit('9'));
        System.out.println("- digit (!): " + Character.isDigit('!'));
        System.out.println("- letterOrDigit (A): " + Character.isLetterOrDigit('A'));
        System.out.println("- letterOrDigit (9): " + Character.isLetterOrDigit('9'));
        System.out.println("- letterOrDigit (!): " + Character.isLetterOrDigit('!'));
        System.out.println("- upperCase (A): " + Character.isUpperCase('A'));
        System.out.println("- lowerCase (A): " + Character.isLowerCase('A'));
        System.out.println("- lowerCase (!): " + Character.isLowerCase('!'));
        System.out.println("- toUpperCase (e): " + Character.toUpperCase('e'));
        System.out.println("- toLowerCase (E): " + Character.toLowerCase('E'));
        System.out.println("- toLowerCase (!): " + Character.toLowerCase('!'));
        System.out.println();
    }
}
