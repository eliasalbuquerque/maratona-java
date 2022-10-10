package com.java.intermediarioPooClasses.test;

import com.java.intermediarioPooClasses.domain.Estudante;
import com.java.intermediarioPooClasses.domain.Professor;

/**
 * Classes:
 * 
 * Estudante;
 * Professor;
 */
public class Test01introducaoClasses {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Joao";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println();

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 45;
        professor.sexo = 'F';

        System.out.println( "Nome: "+ professor.nome +"; Idade: "+ professor.idade +"; Sexo: "+ professor.sexo);
    }
}
