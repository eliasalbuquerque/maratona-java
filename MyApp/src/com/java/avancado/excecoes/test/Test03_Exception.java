package com.java.avancado.excecoes.test;

import java.io.File;
import java.io.IOException;

/**
 * Todo Exception checked (subclasses de Exception), impossibilita a compilacao
 * do codigo;
 */

public class Test03_Exception {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("MyApp\\arquivo\\Test03_Exception-Criando-arquivo02.txt");
        

        /**
         * Teste 01
         * boolean java.io.File.createNewFile() throws IOException
         * o Java nem compila o programa;
         */
        // file.createNewFile();



        /**
         * Teste 02 e 03
         * nesse caso o Java exige uma tratativa para a exception:
         */
        try {
            boolean isCriado = file.createNewFile();  
            System.out.println("Arquivo criado "+isCriado);          
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Nunca deixar o catch vazio;
         * Evitar colocar lógica de negócio no `catch`, caso isso esteja ocorrendo,
         * seu código esta mau desenvolvido 
         */
    }
}
