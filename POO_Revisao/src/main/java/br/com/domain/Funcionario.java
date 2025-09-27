package br.com.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(final String nome, final String matricula, final Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    //metodo abstrato deve ser implementado deve ser implementado pleas subclasses
    public abstract double calcularSalario();

    //metodo abstrato deve ser implementado deve ser implementado pleas subclasses
    public void exibirDados(){
        System.out.println("Nome :" + nome);
        System.out.println("Matrícula :" + matricula);
        System.out.println("Salario Base :" + salarioBase);
        System.out.println("Slario Final: " + calcularSalario());

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(final Double salarioBase) {
        this.salarioBase = salarioBase;
    }

  
  
    }


