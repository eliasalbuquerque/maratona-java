package com.java.intermediario.interfaces.test;

import com.java.intermediario.interfaces.domain.DataBaseLoader;
import com.java.intermediario.interfaces.domain.FileLoader;

public class Test01_inteface {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader01 = new DataBaseLoader();
        dataBaseLoader01.load();

        FileLoader fileLoader01 = new FileLoader();
        fileLoader01.load();
    }
}
