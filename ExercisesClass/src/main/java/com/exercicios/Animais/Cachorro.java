package com.exercicios.Animais;

//classe filha

public class Cachorro extends Animal {

    private String raca;

    public  Cachorro(String nome , int idade ,String som ,String raca) {
        super(nome, idade, som);
        this.raca = raca;
    }
    public Cachorro() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
        ;
    }
}