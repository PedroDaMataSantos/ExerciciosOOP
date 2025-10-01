package com.exercicios.GestaoVeiculos;

public class Carro extends Veiculo {
    private int numeroDePortas;
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, int numeroDePortas, boolean arCondicionado) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.arCondicionado = arCondicionado;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }
}
