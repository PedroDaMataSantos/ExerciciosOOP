package com.exercicios.Animais;

//classe filha

public class Gato extends Animal {

    private String raca;

    public  Gato(String nome , int idade ,String som ,String raca) {
        super(nome, idade, som);
        this.raca = raca;
    }

    public Gato() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau Miau");
    }
}
