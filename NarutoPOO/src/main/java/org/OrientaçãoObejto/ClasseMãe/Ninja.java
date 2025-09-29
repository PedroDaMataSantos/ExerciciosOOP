package org.OrientaçãoObejto.ClasseMãe;


public class Ninja {
    //Aributos
    private String nome;
    private String aldeia;
    private int idade;
    private int nivelDeMissao;

    /*Métodos
    public void sharingan(){
        System.out.println("Ativando o Sharingan!");

     O naruto não pode ativar o sharingan pq ele n é do clã uchiha
     porem esse metodo pode ser usado por qualquer ninja
         */

    /*Todo ninja tem acesso ao ataque base*/

    public void ataqueBase(){
        System.out.println("Eu sou um ninja e taquei uma Kunai!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelDeMissao() {
        return nivelDeMissao;
    }

    public void setNivelDeMissao(int nivelDeMissao) {
        this.nivelDeMissao = nivelDeMissao;
    }
}





