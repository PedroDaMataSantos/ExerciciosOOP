package org.example;



public class StrTeste {
    public static void main(java.lang.String[] args) {

        String nome = "Nome";
        //Retorna o caractere na posição 3

        nome.charAt(3);
        //Deixa o testo em caixa alta
        String nomeUpperCase= nome.toUpperCase();

        //Deixa o texto em caixa baixa
       String nomeLowerCase = nome.toLowerCase();
        //Imprime o nome
        System.out.println(nome);
        //Imprime o nome em caixa alta
        System.out.println(nomeUpperCase);
        //Imprime o nome em caixa baixa
        System.out.println(nomeLowerCase);
        //Imprime o caractere na posição 3
        System.out.println(nome.charAt(3));


        //Metodo sem parametro
        mostrarMeuNome();

        //Metodo com parametro
        mostrarMeuNome("Nome");

        }
        //Metodo sem parametro
        private static void mostrarMeuNome(){
            System.out.println("Meu nome é ...");

        }
        //Metodo com parametro
        private static void mostrarMeuNome(String nome){
            System.out.println("Meu nome é " + nome);
        }
    }
