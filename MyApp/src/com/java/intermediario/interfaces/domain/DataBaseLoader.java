package com.java.intermediario.interfaces.domain;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Metodo carrega dados");        
    }    
}