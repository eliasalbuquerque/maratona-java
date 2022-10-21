package com.java.intermediario.classesAbstratas.domain;

public class Contabilidade extends Funcionario {

    public Contabilidade(String nome, double salario) {
        super(nome, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calculaBonus() {
        // TODO Auto-generated method stub
        this.salarioBonus = salario * 1.07;
    }
    
}
