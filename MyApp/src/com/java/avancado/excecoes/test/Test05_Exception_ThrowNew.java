package com.java.avancado.excecoes.test;

import java.io.File;
import java.io.IOException;

public class Test05_Exception_ThrowNew {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("MyApp\\arquivo\\Teste04.txt");
        try {
            boolean isCriado = file.createNewFile();  
            System.out.println("Arquivo criado "+isCriado);          
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
