package org.OrientaçãoObejto.ClasseFilho;

import org.OrientaçãoObejto.ClasseMãe.Ninja;

public class Uchiha extends Ninja {

    public void sharingan(){
        System.out.println("Ativando o Sharingan!");

        //agora so quem é do clã uchiha pode ativar o sharingan

        }
    @Override //sobrescrevendo o metodo da classe mãe
    public void ataqueBase(){
        System.out.println("Eu sou um ninja e taquei uma Kunai do elemento fogo!");
    }
    //se você passar um parametro o java vai acessar esse metodo
    public void ataqueBase(int niveldeChacra){

        if (niveldeChacra > 2){
            System.out.println("Susano ativado!");
        } else if(niveldeChacra < 1){
            System.out.println("Eu so consegui ativar o sharingan");
        }
        else{
            System.out.println("Eu to sem chacra");
        }
    }
}
