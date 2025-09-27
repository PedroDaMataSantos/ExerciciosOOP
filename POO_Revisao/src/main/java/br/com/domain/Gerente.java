package br.com.domain;
import br.com.domain.Gerente;

public class Gerente extends Funcionario {

   
    private double bonusPerformance;
    private double comissao;

   
    public Gerente(String nome, String matricula, double bonusPerformance,double salarioBase, double comissao) {
        super(nome, matricula, 0.0);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }
    public Double getBonusPerfomance() {
        return bonusPerformance;

    }
    public double getComissao() {
        return comissao;
    }
    public void setBonusPerformance(Double bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformance + comissao;
    }
}

