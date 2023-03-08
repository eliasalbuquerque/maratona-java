/* 
 * DevDojo
 * Maratona Java Virado no Jiraya
 * 97 - Exceções pt 03 - Exception
 * https://www.youtube.com/watch?v=iNlGgh0s_F8&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=98&ab_channel=DevDojo
 */

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
        File file = new File("C:\\workspace\\maratona-java\\MyApp\\arquivo\\arquivoTest03_Exception-Criando-arquivo.txt");        
        
        /**
         * Teste 01 - Criando um arquivo sem tratativa de erro:
         * O Java apresenta erro de compilacao e nem compila o programa, pois 
         * exige um tratamento para o metodo createNewFile():
         * - boolean java.io.File.createNewFile() throws IOException
         * - Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
         *      Unhandled exception type IOException
         */
        // file.createNewFile();

        /**
         * Teste 02 - Tratativa para a exception:
         * Nunca deixar o catch vazio;
         * Evitar colocar lógica de negócio no `catch`, caso isso esteja ocorrendo,
         * seu código esta mau desenvolvido;
         */
        try {
            boolean isCriado = file.createNewFile();  
            System.out.println("Arquivo criado "+isCriado);          
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Teste 03 - Configurar pasta 'arquivo' para nao aceitar a criaçao de
         * novos arquivos:
         * -> Properties > Security > SYSTEM
         *      -> Permissions for SYSTEM > Write => uncheck Allow
         * 
         * Nesse caso, "Arquivo criado" nao foi executado e o programa pulou 
         * direto para o IOException; 
         * - java.io.IOExcepition: Access is denied
         */

    }
}
