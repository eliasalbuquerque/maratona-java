package com.java.intermediario.blocosDeInicializacao.domain;

public class Serie {
    private String nome;
    private int[] episodios;
    {
        System.out.println("dentro do bloco de inicializacao");
    }


    public Serie(String nome, int quantidadeEpisodios) {
        episodios = new int[quantidadeEpisodios];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println(nome);
        for(int episodio: this.episodios) {
            System.out.print(episodio+" ");
        }
        System.out.println();
    }  
}
