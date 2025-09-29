package org.OrientaçãoObejto.ClasseFilho;

import org.OrientaçãoObejto.ClasseMãe.Ninja;

public class Uzumaki extends Ninja {

    public boolean temBiju;
    public void chcraInfinito(){
        System.out.println("Você é um Uzumaki, seu chakra é infinito!");
    }
    @Override //sobrescrevendo o metodo da classe mãe
    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma Kunai do elemento vento!");

    }
    }
