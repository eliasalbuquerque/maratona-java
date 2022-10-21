package com.java.intermediario.interfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Metodo carrega arquivo");        
    }
    
}
