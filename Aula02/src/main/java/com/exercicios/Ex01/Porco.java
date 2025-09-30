package com.exercicios.Ex01;

//classe filha

public class Porco extends Animal {

    public Porco(String nome, int idade, String som) {
        super(nome, idade, som);

    }
    public Porco() {
    }

    @Override
    public void emitirSom(){
        System.out.println("Oink Oink Oink");
    }
}
