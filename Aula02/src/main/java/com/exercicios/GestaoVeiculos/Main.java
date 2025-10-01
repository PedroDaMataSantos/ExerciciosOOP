package com.exercicios.GestaoVeiculos;

public class Main {
    public static void main(String[] args) {
      Veiculo[] frota = {
              new Carro("Toyota", "Corolla", 2020, 4, true),
              new Moto("Honda", "CB500", 2019, 500, true),
              new Carro("Ford", "Mustang", 2021, 2, true),
      };


      for(Veiculo veiculo : frota) {
          veiculo.exibirInfo();
          veiculo.acelerar(60);;
          System.out.println("-------------------");

    }
    }
}
