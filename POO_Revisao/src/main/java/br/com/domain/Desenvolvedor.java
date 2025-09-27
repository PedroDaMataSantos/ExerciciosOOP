package br.com.domain;



public class Desenvolvedor extends Funcionario {
    private int horaExtra;
    private Double valorHoraExtra;
    public Desenvolvedor( String nome,
                          String matricula,
                            double salarioBase,
                          int horaExtra,
                            Double valorHoraExtra){
        super(nome, matricula, salarioBase);
        this.horaExtra = horaExtra;
        this.valorHoraExtra = valorHoraExtra;
    }
    public void registrarHorasExtra(int horasExtra){
        this.horaExtra += horasExtra;
    }

    @Override
    public double calcularSalario() {
        // Calcula o salário base mais o valor das horas extras
        return salarioBase + (horaExtra * valorHoraExtra);
    }

    //Get and Set
    public int getHoraExtra() {
        return horaExtra;
    }
    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }
    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }



}
