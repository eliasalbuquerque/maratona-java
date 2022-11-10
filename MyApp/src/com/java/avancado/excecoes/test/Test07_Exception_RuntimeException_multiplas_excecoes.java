package com.java.avancado.excecoes.test;

public class Test07_Exception_RuntimeException_multiplas_excecoes {
    public static void main(String[] args) {
        multiplasExcecoes();
    }

    public static String multiplasExcecoes() {
        try {
            // throw new ArrayIndexOutOfBoundsException();
            throw new IndexOutOfBoundsException();
            // } catch (RuntimeException e) { // excecoes mais genericas, sempre tem que vir
            // no final;
            // System.out.println("Dentro do RuntimeException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) { // excecoes mais genericas, sempre tem que vir no final;
            System.out.println("Dentro do RuntimeException");
        }
        return null;
    }
}
