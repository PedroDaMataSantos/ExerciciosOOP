package com.exercicios.Animais;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];


        //Exercicio 1 poliformismo e hierarquia com animais

        Porco porco = new Porco();


        porco.setNome("Jaozin");
        System.out.println(porco.getNome());

        porco.setIdade(2);
        System.out.println(porco.getIdade());

        porco.emitirSom();


        animais[0] = porco;

        Gato gato = new Gato();
        gato.setNome("Mingau");
        System.out.println(gato.getNome());

        gato.setIdade(3);
        System.out.println(gato.getIdade());

        gato.setRaca("Siamês");
        System.out.println(gato.getRaca());

        gato.emitirSom();

        animais[1] = gato;


        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        System.out.println(cachorro.getNome());

        cachorro.setIdade(5);
        System.out.println(cachorro.getIdade());

        cachorro.setRaca("Pastor Alemão");
        System.out.println(cachorro.getRaca());

        cachorro.emitirSom();

        animais[2] = cachorro;


        }
    }
