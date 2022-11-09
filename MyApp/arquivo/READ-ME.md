# Teste Classes Exceptions

Diretório criado para teste de _Exception_.

- Package: `{} com.java.avancado.excecoes.test`;
- Teste: `Test03_Exception.java`;
- Método `criarNovoArquivo()` gera um arquivo `.txt` dentro do diretório `arquivo`.
- Objeto `File file = new File(pathname:);`


## Teste 01

`file.createNewFile();` = Java não compila.

```powershell
boolean java.io.File.createNewFile() throws IOException
```


## Teste 02

Criado uma tratativa `try` / `catch`:

```java
try {
    boolean isCriado = file.createNewFile();  
    System.out.println("Arquivo criado "+isCriado);          
} catch (IOException e) {
    e.printStackTrace();
}
```

`Test03_Exception-Criando-arquivo.txt` arquivo gerado pela classe _File_ e com tratamento de _Exceptions_.


## Teste 03

Bloquear pasta `arquivo` para criaçao de novos arquivos.

```powershell
java.io.IOException: Access is denied
        at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
        at java.base/java.io.File.createNewFile(File.java:1043)
        at com.java.avancado.excecoes.test.Test03_Exception.criarNovoArquivo(Test03_Exception.java:27)
        at com.java.avancado.excecoes.test.Test03_Exception.main(Test03_Exception.java:13)
```
