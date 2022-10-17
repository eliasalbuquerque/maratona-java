package com.java.intermediario.associacaoArrayComObjetos.test;

import com.java.intermediario.associacaoArrayComObjetos.domain.Jogador;
import com.java.intermediario.associacaoArrayComObjetos.domain.Time;


/**
 * Associacao bidirecional
 * Jogador N -- 1 Time
 */

public class Test02_associacaoJogadorTime {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Time time1 = new Time("Selecao Brasileira");
        Time time2 = new Time("PSG");

        Jogador[] jogadores = {jogador1, jogador2};
        Jogador[] ney = {jogador1};
        // Jogador[] mes = {jogador2};
        Time[] times = {time1, time2};
        // Time[] bra = {time1};
        Time[] psg = {time2};

        jogador1.setTime(times);
        jogador2.setTime(psg);
        time1.setJogadores(ney);
        time2.setJogadores(jogadores);


        System.out.println("---jogador---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println();

        System.out.println("---time---");
        time1.imprime();
        time2.imprime();
    }
}