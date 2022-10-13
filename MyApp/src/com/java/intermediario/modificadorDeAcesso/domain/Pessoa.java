package com.java.intermediario.modificadorDeAcesso.domain;

public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }    

    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("Idade invalida!");
            return;
        }
        this.idade = idade;
    }
}
