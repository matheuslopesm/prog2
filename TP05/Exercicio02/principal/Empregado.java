package Exercicio02.principal;

public class Empregado extends Pessoa {

    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String matricula, double salario) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
    }

    public Empregado(String nome, int idade) {
        super(nome, idade);
    }

    public double getValorInss() {
        double valorInss = (salario * 0.11);
        return valorInss;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}